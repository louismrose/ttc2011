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

import static org.junit.Assert.assertNotNull;
import static simulator.test.util.ConfigurationFactory.createConfiguration;
import static simulator.test.util.ConfigurationFactory.createVariable;

import org.junit.Test;

import simulator.config.Variable;

public class SimulationTests {

	@Test
	public void creationIntialisesVariables() throws Exception {
		final Variable firstVariable  = createVariable("foo");
		final Variable secondVariable = createVariable("bar");

		final Simulation simulation = new Simulation(createConfiguration(firstVariable, secondVariable));
		
		assertNotNull(simulation.getValueOf(firstVariable.getName()));
		assertNotNull(simulation.getValueOf(secondVariable.getName()));
	}
}
