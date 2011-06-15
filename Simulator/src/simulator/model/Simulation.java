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
package simulator.model;

import static simulator.model.util.DateUtils.add;

import java.io.Serializable;
import java.util.Date;

import simulator.trace.EnvironmentalChange;
import simulator.trace.Trace;
import simulator.trace.TraceFactory;

public class Simulation implements Serializable {

	// Generated by Eclipse
	private static final long serialVersionUID = -4985814908819612051L;
	
	private final Trace trace;
	private Date currentTime = new Date(); 
	
	public Simulation(Trace trace) {
		this.trace = trace;
	}
	
	public void advanceTime(int unit) {
		currentTime = add(currentTime, unit, 1);
		addChangeInTimeToTrace();
	}

	private void addChangeInTimeToTrace() {
		final EnvironmentalChange change = TraceFactory.eINSTANCE.createEnvironmentalChange();
		change.setType("time");
		change.getParams().add(currentTime.toString());
		trace.getElements().add(change);
	}

	public Date getCurrentTime() {
		return currentTime;
	}
}
