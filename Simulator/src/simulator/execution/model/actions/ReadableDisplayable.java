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

import simulator.execution.model.Time;
import simulator.execution.model.TimeFormatter;
import simulator.execution.model.state.State;
import simulator.scl.Displayable;
import simulator.scl.StringConstant;
import simulator.scl.TimeConstant;
import simulator.scl.Variable;

public class ReadableDisplayable {

	private final Displayable displayable;
	private final TimeFormatter timeFormatter = TimeFormatter.twentyFourHourFormatter;
	
	public ReadableDisplayable(Displayable displayable) {
		this.displayable = displayable;
	}
	
	public String extractValue(State state) {
		final String value;
		
		if (displayable instanceof StringConstant) {
			value = extractValue((StringConstant)displayable);
		
		} else if (displayable instanceof TimeConstant) {
			value = extractValue((TimeConstant)displayable);
			
		} else if (displayable instanceof Variable) {
			value = extractValue((Variable)displayable, state);
		
		} else {
			throw new IllegalArgumentException("Unknown type of Displayable: " + displayable);			
		}
		
		return value == null ? "" : value;
	}

	private String extractValue(StringConstant constant) {
		return constant.getValue();
	}
	
	private String extractValue(TimeConstant constant) {
		return new Time(constant).formatWith(timeFormatter);
	}
	
	private String extractValue(Variable variable, State state) {
		final Time variableValue = state.getValueOf(((Variable)variable));
		
		return (variableValue == null ? null : variableValue.formatWith(timeFormatter));
	}
}
