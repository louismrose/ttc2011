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

import java.util.Arrays;

import org.junit.Test;

import simulator.config.ConfigFactory;
import simulator.config.Configuration;
import simulator.config.Mode;
import simulator.config.Variable;

public class SimulationTests {

	@Test
	public void creationIntialisesVariables() throws Exception {
		final Variable firstVariable  = createVariable("foo");
		final Variable secondVariable = createVariable("bar");

		final Simulation simulation = new Simulation(createConfiguration(firstVariable, secondVariable));
		
		assertEquals(new Time(), simulation.getValueOf(firstVariable.getName()));
		assertEquals(new Time(), simulation.getValueOf(secondVariable.getName()));
	}
	
	private static Configuration createConfiguration(Variable... variables) {
		final Configuration configuration = ConfigFactory.eINSTANCE.createConfiguration();
		configuration.getModes().add(createMode("default"));
		configuration.getVariables().addAll(Arrays.asList(variables));
		return configuration;
	}

	private static Mode createMode(String name) {
		final Mode mode = ConfigFactory.eINSTANCE.createMode();
		mode.setName(name);
		return mode;
	}
	
	private static Variable createVariable(String variableName) {
		final Variable variable = ConfigFactory.eINSTANCE.createVariable();
		variable.setName(variableName);
		return variable;
	}
}
