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
import simulator.model.Watch;

public abstract class Expression {

	public static Expression createFrom(simulator.config.Expression expression) {
		if (expression instanceof IncrementTimeVariable) {
			return new IncrementTimeVariableExpression((IncrementTimeVariable)expression);
		
		} else {
			throw new IllegalArgumentException("Unrecognised expression: " + expression);
		}
	}
	
	public abstract void evaluate(Watch watch);
}
