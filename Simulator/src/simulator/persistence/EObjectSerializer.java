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
package simulator.persistence;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import simulator.util.EmfUtil;

public class EObjectSerializer {

	public String serialize(EObject object) throws SerializationException {
		try {
			final ByteArrayOutputStream os = new ByteArrayOutputStream();
			
			final Resource resource = EmfUtil.createResource(object.eClass().getEPackage());
			resource.getContents().add(object);
			resource.save(os, null);
			
			return new String(os.toByteArray(), "UTF-8");
		
		} catch (IOException e) {
			throw new SerializationException("Error encountered whilst serializing " + object, e);
		}
	}
	
	public EObject deserialize(EPackage metamodel, String serialised) throws SerializationException {
		try {
			final ByteArrayInputStream is = new ByteArrayInputStream(serialised.getBytes("UTF-8"));
			
			final Resource resource = EmfUtil.createResource(metamodel);
			
			resource.load(is, null);

			return resource.getContents().get(0);
		
		} catch (IOException e) {
			throw new SerializationException("Error encountered whilst deserializing: " + serialised, e);
		}
	}
}
