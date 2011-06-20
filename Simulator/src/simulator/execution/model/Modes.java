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

import simulator.config.Action;
import simulator.config.Button;
import simulator.config.Mode;

public class Modes implements ModeObserver {
	
	private final List<Mode> modes;
	
	public Modes(List<Mode> modes) {
		this.modes = modes;
	}
	
	public Mode getCurrentMode(State state) {
		return modes.get(state.getCurrentModeIndex());
	}
	
	public void pressButton(int buttonIndex, State state) {
		final Button button = getCurrentMode(state).getButtons().get(buttonIndex);
		
		run(button.getBehaviour(), state);
	}
	
	@Override
	public void modeChanged(State state) {
		runEntryActionsOfCurrentMode(state);
	}
	
	private void runEntryActionsOfCurrentMode(State state) {
		runEntryActionsOf(getCurrentMode(state), state);
	}

	private void runEntryActionsOf(Mode mode, State state) {
		for (Action entryAction : mode.getEntryActions()) {
			run(entryAction, state);
		}
	}

	private void run(Action action, State state) {
		new RunnableAction(action).run(state);
	}
}
