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
package simulator.execution.model.state;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.verify;

import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;

import simulator.config.ConfigFactory;
import simulator.config.Variable;
import simulator.execution.model.ModeObserver;
import simulator.execution.model.Time;

public class StateTests {

	private final Variable variable = createVariable("time");

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
		
		final Time value = new Time();
		state.setValueOf(variable, value);
		state.nextMode();
		
		assertNull(state.getValueOf(variable));
		
		state.nextMode();
		assertEquals(value, state.getValueOf(variable));
	}
	
	@Test
	public void intialiseVariableShouldUseCurrentTime() throws Exception {
		final State state = new State();
		
		state.initialiseValueOf(variable);
		assertEquals(new Time(), state.getValueOf(variable));
	}
	
	@Test
	public void intialiseVariableShouldNotOverwriteExistingValue() throws Exception {
		final State state = new State();
		
		final Time yesterday = Time.hoursAgo(24);
		state.setValueOf(variable, yesterday);
		
		state.initialiseValueOf(variable);
		assertEquals(yesterday, state.getValueOf(variable));
	}
	
	private static Variable createVariable(String variableName) {
		final Variable variable = ConfigFactory.eINSTANCE.createVariable();
		variable.setName(variableName);
		return variable;
	}
}
