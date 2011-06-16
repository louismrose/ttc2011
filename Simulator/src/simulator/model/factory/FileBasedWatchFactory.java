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

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import simulator.ControlsServlet;
import simulator.config.ConfigPackage;
import simulator.config.Configuration;
import simulator.model.Watch;
import simulator.util.EmfUtil;

public class FileBasedWatchFactory extends WatchFactory {
	
	public Configuration createConfiguration() {
		final Resource configResource = EmfUtil.createResourceSet(ConfigPackage.eINSTANCE).getResource(URI.createFileURI(getFile("Configuration.xmi", ControlsServlet.class).getAbsolutePath()), true);
		
		return (Configuration)configResource.getContents().get(0);
	}
	
	public Watch createWatch() {
		final Resource configResource = EmfUtil.createResourceSet(ConfigPackage.eINSTANCE).getResource(URI.createFileURI(getFile("Configuration.xmi", ControlsServlet.class).getAbsolutePath()), true);
		
		return configurationToWatch((Configuration)configResource.getContents().get(0));
	}
	
	
	private static File getFile(String name, Class<?> relativeTo) {
		try {
			final File clazz = new File(URLDecoder.decode(relativeTo.getResource(relativeTo.getSimpleName() + ".class").getFile(), "UTF-8"));
			
			return new File(clazz.getParentFile(), name);
		
		} catch (UnsupportedEncodingException e) {
			throw new IllegalArgumentException(name + " could not be located relative to " + relativeTo);
		}
	}
	
}