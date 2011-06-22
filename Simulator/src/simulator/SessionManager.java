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
package simulator;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import simulator.config.Configuration;
import simulator.config.factory.FileBasedConfigurationFactory;
import simulator.execution.model.Simulation;

public class SessionManager {

	private final HttpSession session;
	
	public SessionManager(HttpSession session) {
		this.session = session;
	}
	
	public Simulation getOrCreateSimulation() throws IOException {
		if (session.getAttribute("simulation") == null) {
			final Configuration config = new FileBasedConfigurationFactory().createConfiguration();
			session.setAttribute("simulation", new Simulation(config));
		}
		
		return (Simulation)session.getAttribute("simulation");
	}
	
	public void update(Simulation simulation) {
		session.setAttribute("simulation", simulation);
	}
}
