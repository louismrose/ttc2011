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
import simulator.config.NextMode;

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
		
		} else {
			throw new IllegalStateException("Unknown type of Action: " + action);
		}
	}
	
	private void run(ChangeDisplay changeDisplayAction, State state) {
		state.setDisplayText(extractValue(changeDisplayAction));
	}
	
	private void run(ChangeIndicator changeIndicatorAction, State state) {
		state.setIndicatorText(extractValue(changeIndicatorAction));
	}
	
	private void run(NextMode nextModeAction, State state) {
		state.nextMode();
	}
	
	private String extractValue(ChangeOutputAction changeOutputAction) {
		final Displayable displayable = changeOutputAction.getNewValue();
		
		if (displayable instanceof Constant) {
			final String value = ((Constant) displayable).getValue();
			return value == null ? "" : value;
		}
		
		throw new IllegalArgumentException("Unknown type of Displayable: " + displayable);
	}
}
