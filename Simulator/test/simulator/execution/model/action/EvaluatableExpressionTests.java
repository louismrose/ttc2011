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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static simulator.test.util.ConfigurationFactory.createIncrementTimeVariableExpression;
import static simulator.test.util.ConfigurationFactory.createVariable;

import org.junit.Test;

import simulator.config.Expression;
import simulator.config.UnitOfTime;
import simulator.config.Variable;
import simulator.execution.model.Time;
import simulator.execution.model.actions.EvaluatableExpression;
import simulator.execution.model.state.State;

public class EvaluatableExpressionTests {

	private final State state = mock(State.class);
	private final Variable variable = createVariable("time");
	 
	@Test
	public void incrementTimeVariableByAnHour() throws Exception {
		final Time originalValue = Time.now();		
		when(state.getValueOf(variable)).thenReturn(originalValue);

		final Expression expression = createIncrementTimeVariableExpression(variable, UnitOfTime.HOUR);
		new EvaluatableExpression(expression).evaluate(state);
		
		verify(state).setValueOf(variable, originalValue.increment(UnitOfTime.HOUR));
	}
	
	@Test
	public void incrementTimeVariableByAMinute() throws Exception {
		final Time originalValue = Time.now();		
		when(state.getValueOf(variable)).thenReturn(originalValue);

		final Expression expression = createIncrementTimeVariableExpression(variable, UnitOfTime.MINUTE);
		new EvaluatableExpression(expression).evaluate(state);
		
		verify(state).setValueOf(variable, originalValue.increment(UnitOfTime.MINUTE));
	}
}
