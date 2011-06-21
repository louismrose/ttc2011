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

import java.util.List;

import org.eclipse.emf.common.util.EList;

import simulator.config.Action;
import simulator.config.Button;
import simulator.config.Mode;
import simulator.config.Variable;
import simulator.execution.model.state.State;

public class Modes implements ModeObserver {
	
	private final List<Mode> modes;
	
	public Modes(List<Mode> modes) {
		this.modes = modes;
	}
	
	public Mode getCurrentMode(State state) {
		return modes.get(state.getCurrentModeIndex());
	}
	
	public void pressButton(int buttonIndex, State state) {
		run(getButton(buttonIndex, state).getBehaviour(), state);
	}

	private Button getButton(int buttonIndex, State state) {
		return getCurrentMode(state).getButtons().get(buttonIndex);
	}
	
	@Override
	public void modeChanged(State state) {
		initialiseVariablesOfCurrentMode(state);
		runEntryActionsOfCurrentMode(state);
	}

	private void initialiseVariablesOfCurrentMode(State state) {
		for (Variable variable : getCurrentMode(state).getVariables()) {
			state.initialiseValueOf(variable);
		}
	}
	
	
	private void runEntryActionsOfCurrentMode(State state) {
		run(getCurrentMode(state).getEntryActions(), state);
	}

	private void run(EList<Action> actions, State state) {
		for (Action action : actions) {
			new RunnableAction(action).run(state);
		}
	}
}