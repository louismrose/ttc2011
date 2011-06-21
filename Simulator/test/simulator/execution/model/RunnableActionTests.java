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

import org.junit.Test;

import simulator.config.Action;
import simulator.config.ChangeDisplay;
import simulator.config.ChangeIndicator;
import simulator.config.ConfigFactory;
import simulator.config.Constant;
import simulator.config.Displayable;
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
	

	private static ChangeDisplay createChangeDisplayAction(Displayable newValue) {
		final ChangeDisplay changeDisplayAction = ConfigFactory.eINSTANCE.createChangeDisplay();
		changeDisplayAction.setNewValue(newValue);
		return changeDisplayAction;
	}
	
	private static ChangeIndicator createChangeIndicatorAction(Displayable newValue) {
		final ChangeIndicator changeIndicatorAction = ConfigFactory.eINSTANCE.createChangeIndicator();
		changeIndicatorAction.setNewValue(newValue);
		return changeIndicatorAction;
	}

	private static Constant createConstant(String value) {
		final Constant constant = ConfigFactory.eINSTANCE.createConstant();
		constant.setValue(value);
		return constant;
	}
	
	private static Variable createVariable(String variableName) {
		final Variable variable = ConfigFactory.eINSTANCE.createVariable();
		variable.setName(variableName);
		return variable;
	}
}
