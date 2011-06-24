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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import simulator.execution.model.actions.EvaluatableExpression;
import simulator.execution.model.actions.RunnableAction;
import simulator.execution.model.state.State;
import simulator.scl.UnitOfTime;
import simulator.srl.EnvironmentalChange;
import simulator.srl.Response;
import simulator.srl.Stimulus;
import simulator.srl.SimulationElement;

public class ResultsTests {

	private final State state = new State(2);
	
	@Test
	public void pressingAButtonGeneratesAStimulusTraceElement() throws Exception {
		final Modes modes = new Modes(createMode("Default", createButton("Foo")));
		modes.pressButton(0, state);
		
		final EList<SimulationElement> elements = state.getResults().getElements();

		final SimulationElement traceElement = elements.get(0);
		
		assertEquals(1, elements.size());
		assertSimulationElementEquals(traceElement, Stimulus.class, "ButtonPress", "0");
	}
	
	@Test
	public void incrementingVariableGeneratesAnEnvironmentalChangeTraceElement() throws Exception {
		state.initialiseValueOf("time");
		
		final Time originalValue = state.getValueOf("time");
		state.incrementValueOf("time", UnitOfTime.HOUR);
		final Time incrementedValue = state.getValueOf("time");
		
		final EList<SimulationElement> elements = state.getResults().getElements();
		
		assertEquals(1, elements.size());
		assertSimulationElementEquals(elements.get(0), EnvironmentalChange.class, "ManualIncrementVariable", originalValue, incrementedValue);
	}
	
	@Test
	public void changingDisplayGeneratesResponseTraceElement() throws Exception {
		state.setDisplayText("foo");
		new RunnableAction(createChangeDisplayAction(createStringConstant("bar"))).run(state);
		
		final EList<SimulationElement> elements = state.getResults().getElements();
		
		assertEquals(1, elements.size());
		assertSimulationElementEquals(elements.get(0), Response.class, "ChangeDisplay", "foo", "bar");
	}
	
	@Test
	public void changingIndicatorGeneratesResponseTraceElement() throws Exception {
		state.setIndicatorText("foo");
		new RunnableAction(createChangeIndicatorAction(createStringConstant("bar"))).run(state);
		
		final EList<SimulationElement> elements = state.getResults().getElements();
		
		assertEquals(1, elements.size());
		assertSimulationElementEquals(elements.get(0), Response.class, "ChangeIndicator", "foo", "bar");
	}
	
	@Test
	public void changingModeGeneratesResponseTraceElement() throws Exception {
		new RunnableAction(createNextModeAction()).run(state);
		
		final EList<SimulationElement> elements = state.getResults().getElements();
		
		assertEquals(1, elements.size());
		assertSimulationElementEquals(elements.get(0), Response.class, "NextMode", "0", "1");
	}
	
	@Test
	public void incrementingVariableGeneratesResponseTraceElement() throws Exception {
		final Time initialValue     = state.initialiseValueOf("time");
		final Time incrementedValue = initialValue.increment(UnitOfTime.MINUTE);
		
		new EvaluatableExpression(createIncrementTimeVariableExpression(createVariable("time"), UnitOfTime.MINUTE)).evaluate(state);
		
		final EList<SimulationElement> elements = state.getResults().getElements();
		
		assertEquals(1, elements.size());
		assertSimulationElementEquals(elements.get(0), Response.class, "IncrementVariable", "time", initialValue, incrementedValue);
	}
	
	

	private static void assertSimulationElementEquals(SimulationElement element, Class<? extends SimulationElement> clazz, String type, Object... params) {
		assertTrue(clazz.isInstance(element));
		assertEquals(type, element.getType());
		assertEquals(asStringList(params), element.getParams());
	}

	private static List<String> asStringList(Object... list) {
		final List<String> stringList = new LinkedList<String>();
		
		for (Object element : list) {
			stringList.add(element.toString());
		}
		
		return stringList;
	}
}
