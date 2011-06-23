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
import simulator.execution.model.Time;
import simulator.persistence.SerializableTrace;
import simulator.trace.Trace;
import simulator.trace.TraceElement;
import simulator.trace.TraceFactory;

public class State implements Serializable {

	// Generated by Eclipse
	private static final long serialVersionUID = -5877262571868562720L;
	
	private String displayText = "";
	private String indicatorText = "";
	private int currentModeIndex = 0;
	private boolean alarmRinging = false;
	
	private final SerializableTrace trace = new SerializableTrace();
	
	private final VariableState variables = new VariableState();
	private final int totalNumberOfModes;
	
	private transient List<ModeObserver> modeObservers;
	private final List<VariableObserver> variableObservers = new LinkedList<VariableObserver>();

	
	public State() {
		this(1);
	}
	
	public State(int totalNumberOfModes) {
		this.totalNumberOfModes = totalNumberOfModes;
	}
	
	public boolean isAlarmRinging() {
		return alarmRinging;
	}

	public void setAlarmRinging(boolean alarmRinging) {
		this.alarmRinging = alarmRinging;
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
	
	public Trace getTrace() {
		return trace.getTrace();
	}
	
	public void addStimulusToTrace(String type, Object... params) {
		addToTrace(TraceFactory.eINSTANCE.createStimulus(), type, params);
	}
	
	public void addResponseToTrace(String type, Object... params) {
		addToTrace(TraceFactory.eINSTANCE.createResponse(), type, params);
	}
	
	public void addEnvironmetalChangeToTrace(String type, Object... params) {
		addToTrace(TraceFactory.eINSTANCE.createEnvironmentalChange(), type, params);
	}

	private void addToTrace(TraceElement traceElement, String type, Object... params) {
		traceElement.setType(type);
		
		for (Object param : params) {
			traceElement.getParams().add(param.toString());			
		}
		
		trace.getElements().add(traceElement);
	}
	
	public Time getValueOf(String variableName) {
		return variables.getValueOf(variableName);
	}
	
	public Time getValueOf(Variable variable) {
		return getValueOf(variable.getName());
	}

	public void setValueOf(Variable variable, Time value) {
		setValueOf(variable.getName(), value);
	}

	public void setValueOf(String variableName, Time newValue) {
		final Time oldValue = variables.getValueOf(variableName);
		variables.setValueOf(variableName, newValue);
		notifyVariableObservers(new VariableWithValueDelta(variableName, oldValue, newValue));
	}
	
	public Time initialiseValueOf(Variable variable) {
		return initialiseValueOf(variable.getName());
	}
		
	public Time initialiseValueOf(String variableName) {
		return variables.initialiseValueOf(variableName);
	}
	
	private void notifyVariableObservers(VariableWithValueDelta variable) {
		for (VariableObserver observer : variableObservers) {
			observer.variableChanged(variable, this);
		}
	}
	
	public Collection<VariableWithValue> getVariableValues() {
		return variables.getValues(currentModeIndex);
	}
	
	public void incrementValueOf(String variableName, UnitOfTime unit) {
		final Time currentValue = getValueOf(variableName);
		final Time newValue     = currentValue.increment(unit);
		
		addEnvironmetalChangeToTrace("ManualIncrementVariable", currentValue.toString(), newValue.toString());
		setValueOf(variableName, newValue);
	}

	public int getCurrentModeIndex() {
		return currentModeIndex;
	}

	public int getNextModeIndex() {
		return (currentModeIndex + 1) % totalNumberOfModes;
	}
	
	public void addModeObserver(ModeObserver observer) {
		getModeObservers().add(observer);
	}
	
	public void addVariableObserver(VariableObserver observer) {
		variableObservers.add(observer);
	}
	
	public void nextMode() {
		incrementModeIndex();
		notifyModeObservers();
	}

	private void incrementModeIndex() {
		currentModeIndex = getNextModeIndex();
	}
	
	private void notifyModeObservers() {
		for (ModeObserver observer : getModeObservers()) {
			observer.modeChanged(this);
		}
	}
	
	private List<ModeObserver> getModeObservers() {
		if (modeObservers == null) {
			 modeObservers = new LinkedList<ModeObserver>();
		}
		
		return modeObservers;
	}
}
