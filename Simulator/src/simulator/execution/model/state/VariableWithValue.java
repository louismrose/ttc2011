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
package simulator.execution.model.state;

import simulator.execution.model.Time;
import simulator.execution.model.TimeFormatter;


public class VariableWithValue {

	private final String name;
	private final String value;
	
	public VariableWithValue(String name, Time value) {
		this.name  = name;
		this.value = value.formatWith(TimeFormatter.twentyFourHourFormatter);
	}
	
	public String getName() {
		return name;
	}
	
	public String getValue() {
		return value;
	}
}
