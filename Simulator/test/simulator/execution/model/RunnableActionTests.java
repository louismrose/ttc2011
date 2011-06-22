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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static simulator.test.util.ConfigurationFactory.createChangeDisplayAction;
import static simulator.test.util.ConfigurationFactory.createChangeIndicatorAction;
import static simulator.test.util.ConfigurationFactory.createConstant;
import static simulator.test.util.ConfigurationFactory.createVariable;

import org.junit.Test;

import simulator.config.Action;
import simulator.config.ConfigFactory;
import simulator.config.Variable;
import simulator.execution.model.state.State;

public class RunnableActionTests {

	private final State state = mock(State.class);
 
	@Test
	public void changeDisplayToConstant() throws Exception {
		final Action action = createChangeDisplayAction(createConstant("foo"));
		
		new RunnableAction(action).run(state);
		
		verify(state).setDisplayText("foo");
	}
	
	@Test
	public void changeIndicatorToConstant() throws Exception {
		final Action action = createChangeIndicatorAction(createConstant("bar"));
		
		new RunnableAction(action).run(state);
		
		verify(state).setIndicatorText("bar");
	}
	
	@Test
	public void changeDisplayToVariable() throws Exception {
		final Variable variable = createVariable("time");
		final Action action = createChangeDisplayAction(variable);
		
		final Time variableValue = new Time();
		when(state.getValueOf(variable)).thenReturn(variableValue);
		
		new RunnableAction(action).run(state);
		
		verify(state).setDisplayText(variableValue.formatWith(TimeFormatter.twentyFourHourFormatter));
	}
	
	@Test
	public void nextMode() throws Exception {
		final Action action = ConfigFactory.eINSTANCE.createNextMode();
		
		new RunnableAction(action).run(state);
		
		verify(state).nextMode();
	}
}
