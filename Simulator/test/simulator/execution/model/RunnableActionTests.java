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

import org.junit.Test;

import simulator.config.Action;
import simulator.config.ChangeDisplay;
import simulator.config.ChangeIndicator;
import simulator.config.ConfigFactory;
import simulator.config.Constant;

public class RunnableActionTests {

	private final State state = mock(State.class);
 
	@Test
	public void changeDisplay() throws Exception {
		final Action action = createChangeDisplayAction("foo");
		
		new RunnableAction(action).run(state);
		
		verify(state).setDisplayText("foo");
	}
	
	@Test
	public void changeIndicator() throws Exception {
		final Action action = createChangeIndicatorAction("bar");
		
		new RunnableAction(action).run(state);
		
		verify(state).setIndicatorText("bar");
	}
	
	@Test
	public void nextMode() throws Exception {
		final Action action = ConfigFactory.eINSTANCE.createNextMode();
		
		new RunnableAction(action).run(state);
		
		verify(state).nextMode();
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
