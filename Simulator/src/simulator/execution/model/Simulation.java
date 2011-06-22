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

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

import simulator.config.Configuration;
import simulator.config.Event;
import simulator.config.Mode;
import simulator.config.UnitOfTime;
import simulator.config.Variable;
import simulator.execution.model.state.State;
import simulator.execution.model.state.VariableWithValue;
import simulator.persistence.SerializableConfiguration;
import simulator.persistence.SerializableTrace;
import simulator.trace.Stimulus;
import simulator.trace.Trace;
import simulator.trace.TraceFactory;

public class Simulation implements Serializable {

	// Generated by Eclipse
	private static final long serialVersionUID = 8378817217535302346L;
	
	private final SerializableConfiguration configuration;
	private final SerializableTrace trace = new SerializableTrace();
	private final State state;
	
	private transient Modes modes;
	
	public Simulation(Configuration configuration) throws IOException {
		this.configuration = new SerializableConfiguration(configuration);
		this.state = new State(configuration.getModes().size());
		
		initialiseVariables();
		initialiseEvents();
		initialiseFirstMode();
	}

	private void initialiseVariables() {
		for (Variable variable : configuration.getVariables()) {
			state.initialiseValueOf(variable);
		}
	}
	
	private void initialiseEvents() {
		for (final Event event : configuration.getEvents()) {
			state.addVariableObserver(new SchedulableEvent(event));
		}
	}
	
	private void initialiseFirstMode() {
		getModes().modeChanged(state);
	}

	private Modes getModes() {
		if (modes == null) {
			this.modes = new Modes(configuration.getModes());
			state.addModeObserver(modes);
		}
		
		return modes;
	}
	
	public Mode getCurrentMode() {
		return getModes().getCurrentMode(state);
	}

	public String getDisplayText() {
		return state.getDisplayText();
	}
	
	public String getIndicatorText() {
		return state.getIndicatorText();
	}
	
	public String getAlarmStatus() {
		return state.isAlarmRinging() ? "ringing" : "silent";
	}
	
	public Trace getTrace() {
		return trace;
	}
	
	public void pressButton(int buttonIndex) {
		addButtonPressToTrace(buttonIndex);
		getModes().pressButton(buttonIndex, state);
	}
	
	private void addButtonPressToTrace(int index) {
		final Stimulus stimulus = TraceFactory.eINSTANCE.createStimulus();
		stimulus.setType("button");
		stimulus.getParams().add("" + index);
		trace.getElements().add(stimulus);
	}
	
	public Collection<VariableWithValue> getVariableValues() {
		return state.getVariableValues();
	}

	public void incrementVariable(String variableName, UnitOfTime unit) {
		state.incrementValue(variableName, unit);
	}

	public Time getValueOf(String variableName) {
		return state.getValueOf(variableName);
	}
}