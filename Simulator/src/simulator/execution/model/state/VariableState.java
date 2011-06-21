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

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import simulator.config.UnitOfTime;
import simulator.execution.model.Time;
import simulator.execution.model.VariableWithValue;

public class VariableState implements Serializable {
	
	// Generated by Eclipse
	private static final long serialVersionUID = 4468173469341372878L;
	
	private final Map<String, Time> variableValues = new HashMap<String, Time>();

	public Time getValueOf(String variableName) {
		return variableValues.get(variableName);
	}
	
	public Collection<VariableWithValue> getValues(int currentModeIndex) {
		final List<VariableWithValue> variablesWithValues = new LinkedList<VariableWithValue>();
		
		for (Entry<String, Time> variableValue : variableValues.entrySet()) {
			variablesWithValues.add(new VariableWithValue(variableValue.getKey(), variableValue.getValue()));
		}
		
		return variablesWithValues;
	}

	public void setValueOf(String variableName, Time value) {
		variableValues.put(variableName, value);
	}
	
	public void initialiseValueOf(String variableName) {
		if (!variableValues.containsKey(variableName)) variableValues.put(variableName, new Time());
	}

	public void increment(String variableName, UnitOfTime unit) {
		final Time currentValue = getValueOf(variableName);
		final Time newValue     = currentValue.increment(unit);
		
		setValueOf(variableName, newValue);
	}
}