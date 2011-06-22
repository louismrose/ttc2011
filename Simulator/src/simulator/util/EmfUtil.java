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
package simulator.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public final class EmfUtil {
	
	private EmfUtil() {}

	public static ResourceSet createResourceSet(EPackage metamodel) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(metamodel.getNsURI(), metamodel);
		return resourceSet;
	}
	
	public static Resource createResource(EPackage metamodel) {
		return createResourceSet(metamodel).createResource(URI.createURI("http:///My.model"));
	}
	
	public static void serialise(EObject modelElement, OutputStream destination) throws IOException {
		final Resource resource = EmfUtil.createResource(modelElement.eClass().getEPackage());
		resource.getContents().add(modelElement);
		resource.save(destination, null);
	}
	
	public static EObject deserialise(EPackage metamodel, InputStream source) throws IOException {
		final Resource resource = EmfUtil.createResource(metamodel);
		resource.load(source, null);
		return resource.getContents().get(0);
	}
}
