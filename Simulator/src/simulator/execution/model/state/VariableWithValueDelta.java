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


public class VariableWithValueDelta {

	private final String name;
	private final Time oldValue;
	private final Time newValue;
	
	public VariableWithValueDelta(String name, Time oldValue, Time newValue) {
		this.name  = name;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}
	
	public String getName() {
		return name;
	}
	
	public Time getOldValue() {
		return oldValue;
	}
	
	public Time getNewValue() {
		return newValue;
	}
}
