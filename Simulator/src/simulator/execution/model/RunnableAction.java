/*******************************************************************************
 * Copyright (c) 2011 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************/
package simulator.execution.model;

import simulator.config.Action;
import simulator.config.ChangeDisplay;
import simulator.config.ChangeIndicator;
import simulator.config.ChangeOutputAction;
import simulator.config.Constant;
import simulator.config.Displayable;
import simulator.config.EvaluateExpression;
import simulator.config.NextMode;
import simulator.config.Variable;
import simulator.execution.model.state.State;

public class RunnableAction {

	private final Action action;
	
	public RunnableAction(Action action) {
		this.action = action;
	}
	
	public void run(State state) {
		if (action instanceof ChangeDisplay) {
			run((ChangeDisplay)action, state);	
		
		} else if (action instanceof ChangeIndicator) {
			run((ChangeIndicator)action, state);
		
		} else if (action instanceof NextMode) {
			run((NextMode)action, state);
			
		} else if (action instanceof EvaluateExpression) {
			run((EvaluateExpression)action, state);
		
		} else {
			throw new IllegalStateException("Unknown type of Action: " + action);
		}
	}
	
	private void run(ChangeDisplay changeDisplayAction, State state) {
		state.setDisplayText(extractValue(changeDisplayAction, state));
	}
	
	private void run(ChangeIndicator changeIndicatorAction, State state) {
		state.setIndicatorText(extractValue(changeIndicatorAction, state));
	}
	
	private void run(NextMode nextModeAction, State state) {
		state.addEventToTrace("NextMode", state.getCurrentModeIndex(), state.getNextModeIndex());
		state.nextMode();
	}
	
	private void run(EvaluateExpression evaluateExpressionAction, State state) {
		new EvaluatableExpression(evaluateExpressionAction.getExpression()).evaluate(state);
	}
	
	
	private String extractValue(ChangeOutputAction changeOutputAction, State state) {
		final Displayable displayable = changeOutputAction.getNewValue();
		
		final String value;
		
		if (displayable instanceof Constant) {
			value = ((Constant) displayable).getValue();
		
		} else if (displayable instanceof Variable) {
			final Time variableValue = state.getValueOf(((Variable)displayable));
			
			value = (variableValue == null ? null : variableValue.formatWith(TimeFormatter.twentyFourHourFormatter));
		
		} else {
			throw new IllegalArgumentException("Unknown type of Displayable: " + displayable);			
		}
		
		return value == null ? "" : value;
	}
}
