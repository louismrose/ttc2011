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

import java.util.Date;

public class VariableWithValue {

	private final String name;
	private final String value;
	
	public VariableWithValue(String name, Date value) {
		this.name  = name;
		this.value = TimeFormatter.twentyFourHourFormatter.format(value);
	}
	
	public String getName() {
		return name;
	}
	
	public String getValue() {
		return value;
	}
}
