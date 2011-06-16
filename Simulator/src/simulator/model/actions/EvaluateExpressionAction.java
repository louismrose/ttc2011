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
package simulator.model.actions;

import simulator.model.Watch;
import simulator.model.expressions.Expression;

public class EvaluateExpressionAction implements Action {

	private final Expression expression;
	
	public EvaluateExpressionAction(simulator.config.EvaluateExpression action) {
		this.expression = Expression.createFrom(action.getExpression());
	}

	@Override
	public void run(Watch watch) {
		expression.evaluate(watch);
	}

}
