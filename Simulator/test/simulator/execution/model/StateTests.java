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
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.verify;

import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;

public class StateTests {

	@Test
	public void nextModeNotifiesObservers() throws Exception {
		final ModeObserver observer = Mockito.mock(ModeObserver.class);
		
		final State state = new State(2);
		state.addModeObserver(observer);
		state.nextMode();
		
		verify(observer).modeChanged(state);
	}
	
	@Test
	public void variableShouldBeUniqueToMode() throws Exception {
		final State state = new State(2);
		
		final Date value = new Date();
		state.setVariable("time", value);
		state.nextMode();
		
		assertNull(state.getVariable("time"));
		
		state.nextMode();
		assertEquals(value, state.getVariable("time"));
	}
}
