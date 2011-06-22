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

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simulator.execution.model.Simulation;
import simulator.util.EmfUtil;

@SuppressWarnings("serial")
public class TraceServlet extends AbstractServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		final Simulation simulation = getOrCreateSimulation(req.getSession());
		resp.setContentType("text/xml");
		EmfUtil.serialise(simulation.getTrace(), resp.getOutputStream());		
	}
}
