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
import java.util.LinkedList;
import java.util.List;

import simulator.config.UnitOfTime;
import simulator.config.Variable;
import simulator.execution.model.ModeObserver;
import simulator.execution.model.Time;
import simulator.execution.model.VariableWithValue;

public class State implements Serializable {

	// Generated by Eclipse
	private static final long serialVersionUID = -5877262571868562720L;
	
	private String displayText = "";
	private String indicatorText = "";
	private int currentModeIndex = 0;
	
	private final VariableState variables = new VariableState();
	private final int totalNumberOfModes;
	
	private transient List<ModeObserver> observers;
	
	public State() {
		this(1);
	}
	
	public State(int totalNumberOfModes) {
		this.totalNumberOfModes = totalNumberOfModes;
	}

	public String getDisplayText() {
		return displayText;
	}
	
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
	
	public String getIndicatorText() {
		return indicatorText;
	}
	
	public void setIndicatorText(String indicatorText) {
		this.indicatorText = indicatorText;
	}
	
	public Time getValueOf(String variableName) {
		return variables.getValueOf(variableName);
	}
	
	public Time getValueOf(Variable variable) {
		return getValueOf(variable.getName());
	}

	public void setValueOf(String variableName, Time value) {
		variables.setValueOf(variableName, value);
	}
	
	public void setValueOf(Variable variable, Time value) {
		setValueOf(variable.getName(), value);
	}
	
	public void initialiseValueOf(String variableName) {
		variables.initialiseValueOf(variableName);
	}
	
	public void initialiseValueOf(Variable variable) {
		initialiseValueOf(variable.getName());
	}
	
	public Collection<VariableWithValue> getVariableValues() {
		return variables.getValues(currentModeIndex);
	}
	
	public void incrementValue(String variableName, UnitOfTime unit) {
		variables.increment(variableName, unit);
	}

	public int getCurrentModeIndex() {
		return currentModeIndex;
	}
	
	public void addModeObserver(ModeObserver observer) {
		getObservers().add(observer);
	}
	
	public void nextMode() {
		incrementModeIndex();
		notifyModeObservers();
	}

	private void incrementModeIndex() {
		currentModeIndex = (currentModeIndex + 1) % totalNumberOfModes;
	}
	
	private void notifyModeObservers() {
		for (ModeObserver observer : getObservers()) {
			observer.modeChanged(this);
		}
	}
	
	private List<ModeObserver> getObservers() {
		if (observers == null) {
			 observers = new LinkedList<ModeObserver>();
		}
		
		return observers;
	}
}
