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
package simulator.model.factory;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import simulator.config.Configuration;
import simulator.model.Mode;
import simulator.model.Watch;

public abstract class WatchFactory {
	
	public abstract Watch createWatch() throws IOException; 	
	
	protected static Watch configurationToWatch(Configuration config) {
		final Watch watch = new Watch();
		
		final List<Mode> modes = new LinkedList<Mode>();

		for (simulator.config.Mode mode : config.getModes()) {
			modes.add(new Mode(watch, mode));
		}
		
		watch.addModes(modes);
		
		return watch;
	}
}