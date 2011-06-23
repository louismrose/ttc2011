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

import simulator.config.Constant;
import simulator.config.Displayable;
import simulator.config.Variable;
import simulator.execution.model.Time;
import simulator.execution.model.TimeFormatter;
import simulator.execution.model.state.State;

public class ReadableDisplayable {

	private final Displayable displayable;
	
	public ReadableDisplayable(Displayable displayable) {
		this.displayable = displayable;
	}
	
	public String extractValue(State state) {
		final String value;
		
		if (displayable instanceof Constant) {
			value = extractValue((Constant)displayable);
		
		} else if (displayable instanceof Variable) {
			value = extractValue((Variable)displayable, state);
		
		} else {
			throw new IllegalArgumentException("Unknown type of Displayable: " + displayable);			
		}
		
		return value == null ? "" : value;
	}

	private String extractValue(Constant constant) {
		return constant.getValue();
	}
	
	private String extractValue(Variable variable, State state) {
		final Time variableValue = state.getValueOf(((Variable)variable));
		
		return (variableValue == null ? null : variableValue.formatWith(TimeFormatter.twentyFourHourFormatter));
	}
}
