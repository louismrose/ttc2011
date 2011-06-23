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
package simulator.execution.model.actions;

import simulator.config.Expression;
import simulator.config.IncrementTimeVariable;
import simulator.config.Variable;
import simulator.execution.model.Time;
import simulator.execution.model.state.State;

public class EvaluatableExpression {

	private final Expression expression;
	
	public EvaluatableExpression(Expression expression) {
		this.expression = expression;
	}

	public void evaluate(State state) {
		if (expression instanceof IncrementTimeVariable) {
			run((IncrementTimeVariable)expression, state);	
		
		} else {
			throw new IllegalStateException("Unknown type of Expression: " + expression);
		}
	}

	private void run(IncrementTimeVariable expression, State state) {
		final Variable variable = expression.getVariable();		
		final Time currentValue = state.getValueOf(variable);
		final Time newValue     = currentValue.increment(expression.getUnit());
		
		state.addResponseToTrace("IncrementVariable", variable.getName(), currentValue, newValue);
		state.setValueOf(variable, newValue);
	}
}
