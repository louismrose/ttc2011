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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static simulator.test.util.ConfigurationFactory.*;

import java.util.Arrays;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import simulator.config.UnitOfTime;
import simulator.execution.model.state.State;
import simulator.trace.Event;
import simulator.trace.Stimulus;
import simulator.trace.TraceElement;

public class TracingTests {

	private final State state = new State(2);
	
	@Test
	public void pressingAButtonGeneratesAStimulusTraceElement() throws Exception {
		final Modes modes = new Modes(createMode("Default", createButton("Foo")));
		modes.pressButton(0, state);
		
		final EList<TraceElement> traceElements = state.getTrace().getElements();

		final TraceElement traceElement = traceElements.get(0);
		
		assertEquals(1, traceElements.size());
		assertTraceElementEquals(traceElement, Stimulus.class, "ButtonPress", "0");
	}
	
	@Test
	public void incrementingVariableGeneratesAStimulusTraceElement() throws Exception {
		state.initialiseValueOf("time");
		
		final Time originalValue = state.getValueOf("time");
		state.incrementValueOf("time", UnitOfTime.HOUR);
		final Time incrementedValue = state.getValueOf("time");
		
		final EList<TraceElement> traceElements = state.getTrace().getElements();
		
		assertEquals(1, traceElements.size());
		assertTraceElementEquals(traceElements.get(0), Stimulus.class, "ManualVariableChange", originalValue.toString(), incrementedValue.toString());
	}
	
	@Test
	public void changingModeGeneratesAnEventTraceElement() throws Exception {
		new RunnableAction(createNextModeAction()).run(state);
		
		final EList<TraceElement> traceElements = state.getTrace().getElements();
		
		assertEquals(1,          traceElements.size());
		assertTraceElementEquals(traceElements.get(0), Event.class, "NextMode", "0", "1");
	}
	

	private static void assertTraceElementEquals(TraceElement traceElement, Class<? extends TraceElement> clazz, String type, String... params) {
		assertTrue(clazz.isInstance(traceElement));
		assertEquals(type, traceElement.getType());
		assertEquals(Arrays.asList(params), traceElement.getParams());
	}
}
