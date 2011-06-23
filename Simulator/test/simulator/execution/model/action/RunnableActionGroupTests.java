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
package simulator.execution.model.action;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static simulator.test.util.ConfigurationFactory.createChangeDisplayAction;
import static simulator.test.util.ConfigurationFactory.createConstant;
import static simulator.test.util.ConfigurationFactory.createDisplayMatchesCondition;

import org.junit.Test;

import simulator.config.ChangeDisplay;
import simulator.execution.model.actions.RunnableAction;
import simulator.execution.model.actions.RunnableActionGroup;
import simulator.execution.model.state.State;

public class RunnableActionGroupTests {

	@Test
	public void actionWhoseGuardIsSatifisfiedShouldRun() {
		final State state = mock(State.class);
		final RunnableAction action = mock(RunnableAction.class);
		final RunnableActionGroup group = new RunnableActionGroup(action);
		
		when(action.isSatisified(state)).thenReturn(true);
		
		group.run(state);
		
		verify(action).run(state);
	}
	
	@Test
	public void actionWhoseGuardIsNotSatifisfiedShouldNotBeRun() {
		final State state = mock(State.class);
		final RunnableAction action = mock(RunnableAction.class);
		final RunnableActionGroup group = new RunnableActionGroup(action);
		
		when(action.isSatisified(state)).thenReturn(false);
		
		group.run(state);
		
		verify(action, never()).run(state);
	}
	
	@Test
	public void guardsAreDeterminedByStateBeforeAnyActionHasBeenRun() {
		final State state = new State();
		final RunnableAction foo2bar = createConditionalChangeDisplayAction("foo", "bar");
		final RunnableAction bar2foo = createConditionalChangeDisplayAction("bar", "foo");
		final RunnableActionGroup group = new RunnableActionGroup(foo2bar, bar2foo);
		
		state.setDisplayText("foo");
		group.run(state);
		
		assertEquals("bar", state.getDisplayText());
	}

	private RunnableAction createConditionalChangeDisplayAction(String requiredText, String newText) {
		final ChangeDisplay action = createChangeDisplayAction(createConstant(newText));
		action.setGuard(createDisplayMatchesCondition(createConstant(requiredText)));
		return new RunnableAction(action);
	}
}
