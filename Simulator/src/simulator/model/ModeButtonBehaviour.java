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

import simulator.trace.Event;
import simulator.trace.TraceFactory;

public class ModeButtonBehaviour extends ButtonBehaviour {
	
	// Generated by Eclipse
	private static final long serialVersionUID = 6713210770575261932L;

	public ModeButtonBehaviour() {
		super("Mode");
	}
	
	@Override
	public void run() {
		final String nameOfNewMode = watch.getModes().nextMode();
		
		final Event event = TraceFactory.eINSTANCE.createEvent();
		event.setType("mode");
		event.getParams().add(nameOfNewMode);
		
		watch.getTrace().getElements().add(event);
	}
}
