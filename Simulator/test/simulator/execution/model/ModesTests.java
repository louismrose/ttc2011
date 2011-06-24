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
import static simulator.test.util.ConfigurationFactory.createChangeDisplayAction;
import static simulator.test.util.ConfigurationFactory.createChangeIndicatorAction;
import static simulator.test.util.ConfigurationFactory.createStringConstant;
import static simulator.test.util.ConfigurationFactory.createMode;

import java.util.Arrays;

import org.junit.Test;

import simulator.execution.model.state.State;
import simulator.scl.Action;
import simulator.scl.Mode;

public class ModesTests {

	@Test
	public void modesRespondsToChangeInModeByRunningEntryActions() throws Exception {
		final Mode firstMode  = createMode("First");
		final Mode secondMode = createMode("Second");
		final Modes modes     = new Modes(Arrays.asList(firstMode, secondMode));
		
		final Action firstAction  = createChangeDisplayAction(createStringConstant("foo"));
		final Action secondAction = createChangeIndicatorAction(createStringConstant("bar"));
		
		secondMode.getEntryActions().add(firstAction);
		secondMode.getEntryActions().add(secondAction);
		
		final State state = new State(2);
		state.nextMode();
		modes.modeChanged(state);
						
		assertEquals("foo", state.getDisplayText());
		assertEquals("bar", state.getIndicatorText());
		
		// TODO rephrase this test so that its outcome is not reliant on the behaviour of the changeDisplay/indicator actions
	}
}
