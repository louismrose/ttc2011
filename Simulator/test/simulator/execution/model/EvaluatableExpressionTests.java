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

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import simulator.config.ConfigFactory;
import simulator.config.Expression;
import simulator.config.IncrementTimeVariable;
import simulator.config.UnitOfTime;
import simulator.config.Variable;
import simulator.execution.model.state.State;
import simulator.model.util.DateUtils;

public class EvaluatableExpressionTests {

	private final State state = mock(State.class);
	private final Variable variable = createVariable("time");
	 
	@Test
	public void incrementTimeVariableByAnHour() throws Exception {
		final Date originalValue = new Date();		
		when(state.getValueOf(variable)).thenReturn(originalValue);

		final Expression expression = createIncrementTimeVariableExpression(variable, UnitOfTime.HOUR);
		new EvaluatableExpression(expression).evaluate(state);
		
		verify(state).setValueOf(variable, DateUtils.add(originalValue, Calendar.HOUR, 1));
	}
	
	@Test
	public void incrementTimeVariableByAMinute() throws Exception {
		final Date originalValue = new Date();		
		when(state.getValueOf(variable)).thenReturn(originalValue);

		final Expression expression = createIncrementTimeVariableExpression(variable, UnitOfTime.MINUTE);
		new EvaluatableExpression(expression).evaluate(state);
		
		verify(state).setValueOf(variable, DateUtils.add(originalValue, Calendar.MINUTE, 1));
	}

	
	private static Expression createIncrementTimeVariableExpression(Variable variable, UnitOfTime increment) {
		final IncrementTimeVariable expression = ConfigFactory.eINSTANCE.createIncrementTimeVariable();
		expression.setUnit(increment);
		expression.setVariable(variable);
		return expression;
	}

	private static Variable createVariable(String name) {
		final Variable variable = ConfigFactory.eINSTANCE.createVariable();
		variable.setName(name);
		return variable;
	}
}
