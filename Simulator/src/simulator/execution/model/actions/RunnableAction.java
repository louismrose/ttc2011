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
package simulator.execution.model.actions;

import simulator.execution.model.state.State;
import simulator.scl.Action;
import simulator.scl.ChangeDisplay;
import simulator.scl.ChangeIndicator;
import simulator.scl.Displayable;
import simulator.scl.EvaluateExpression;
import simulator.scl.NextMode;
import simulator.scl.SilenceAlarm;
import simulator.scl.SoundAlarm;

public class RunnableAction {

	private final Action action;
	private final EvaluatableCondition guard;
	
	public RunnableAction(Action action) {
		this(action, EvaluatableCondition.createFrom(action.getGuard()));
	}
	
	RunnableAction(Action action, EvaluatableCondition guard) {
		this.action = action;
		this.guard  = guard;
	}
	
	public boolean isSatisified(State state) {
		return guard.isSatisfied(state);
	}
	
	public void run(State state) {
		if (isSatisified(state)) {
			runActionSpecificLogic(state);
		}
	}

	private void runActionSpecificLogic(State state) {
		if (action instanceof ChangeDisplay) {
			run((ChangeDisplay)action, state);	
		
		} else if (action instanceof ChangeIndicator) {
			run((ChangeIndicator)action, state);
		
		} else if (action instanceof NextMode) {
			run((NextMode)action, state);
			
		} else if (action instanceof EvaluateExpression) {
			run((EvaluateExpression)action, state);
		
		} else if (action instanceof SoundAlarm) {
			run((SoundAlarm)action, state);
		
		} else if (action instanceof SilenceAlarm) {
			run((SilenceAlarm)action, state);
			
		} else {
			throw new IllegalStateException("Unknown type of Action: " + action);
		}
	}
	
	private void run(ChangeDisplay changeDisplayAction, State state) {
		final String newDisplayText = extractValue(changeDisplayAction.getNewValue(), state);
		state.addResponseToResults("ChangeDisplay", state.getDisplayText(), newDisplayText);
		state.setDisplayText(newDisplayText);
	}
	
	private void run(ChangeIndicator changeIndicatorAction, State state) {
		final String newIndicatorText = extractValue(changeIndicatorAction.getNewValue(), state);
		state.addResponseToResults("ChangeIndicator", state.getIndicatorText(), newIndicatorText);
		state.setIndicatorText(newIndicatorText);
	}
	
	private void run(NextMode nextModeAction, State state) {
		state.addResponseToResults("NextMode", state.getCurrentModeIndex(), state.getNextModeIndex());
		state.nextMode();
	}
	
	private void run(EvaluateExpression evaluateExpressionAction, State state) {
		new EvaluatableExpression(evaluateExpressionAction.getExpression()).evaluate(state);
	}
	
	private void run(SoundAlarm soundAlarrmAction, State state) {
		state.soundAlarm();
	}
	
	private void run(SilenceAlarm silenceAlarmAction, State state) {
		state.silenceAlarm();
	}

	private String extractValue(Displayable newValue, State state) {
		return new ReadableDisplayable(newValue).extractValue(state);
	}
}
