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

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import simulator.config.Action;
import simulator.config.ChangeDisplay;
import simulator.config.ChangeIndicator;
import simulator.config.ConfigFactory;
import simulator.config.Constant;
import simulator.config.Mode;
import simulator.execution.model.state.State;

public class ModesTests {

	@Test
	public void modesRespondsToChangeInModeByRunningEntryActions() throws Exception {
		final Mode firstMode  = createMode("First");
		final Mode secondMode = createMode("Second");
		final Modes modes     = new Modes(Arrays.asList(firstMode, secondMode));
		
		final Action firstAction  = createChangeDisplayAction("foo");
		final Action secondAction = createChangeIndicatorAction("bar");
		
		secondMode.getEntryActions().add(firstAction);
		secondMode.getEntryActions().add(secondAction);
		
		final State state = new State(2);
		state.nextMode();
		modes.modeChanged(state);
						
		assertEquals("foo", state.getDisplayText());
		assertEquals("bar", state.getIndicatorText());
		
		// TODO rephrase this test so that its outcome is not reliant on the behaviour of the changeDisplay/indicator actions
	}
	
	private static Mode createMode(String name) {
		final Mode mode = ConfigFactory.eINSTANCE.createMode();
		mode.setName(name);
		return mode;
	}
	
	private static ChangeDisplay createChangeDisplayAction(String newValue) {
		final ChangeDisplay changeDisplayAction = ConfigFactory.eINSTANCE.createChangeDisplay();
		changeDisplayAction.setNewValue(createConstant(newValue));
		return changeDisplayAction;
	}
	
	private static ChangeIndicator createChangeIndicatorAction(String newValue) {
		final ChangeIndicator changeIndicatorAction = ConfigFactory.eINSTANCE.createChangeIndicator();
		changeIndicatorAction.setNewValue(createConstant(newValue));
		return changeIndicatorAction;
	}
	
	private static Constant createConstant(String value) {
		final Constant constant = ConfigFactory.eINSTANCE.createConstant();
		constant.setValue(value);
		return constant;
	}
}
