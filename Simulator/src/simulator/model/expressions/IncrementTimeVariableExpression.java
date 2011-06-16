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
package simulator.model.expressions;

import simulator.config.IncrementTimeVariable;
import simulator.model.TimeVariable;
import simulator.model.Watch;

public class IncrementTimeVariableExpression extends Expression {

	private final String variableName;
	private final TimeVariable.UnitOfTime unitOfTime;
	
	public IncrementTimeVariableExpression(IncrementTimeVariable expression) {
		this.variableName = expression.getVariable().getName();
		this.unitOfTime   = TimeVariable.UnitOfTime.createFrom(expression.getUnit());
	}

	@Override
	public void evaluate(Watch watch) {
		watch.getTimeVariable(variableName).incrementBy(unitOfTime);
	}
}
