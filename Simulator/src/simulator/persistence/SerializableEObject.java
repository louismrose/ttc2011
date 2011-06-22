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

import java.io.Serializable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public class SerializableEObject<T extends EObject> implements Serializable {

	// Generated by Eclipse
	private static final long serialVersionUID = 4154395016644376798L;
	
	private final EObjectSerializer serializer = new EObjectSerializer();
	
	private final String serialisedObject;
	private transient T object;
	
	public SerializableEObject(T object) {
		this.serialisedObject = serializer.serialize(object);
		this.object = object;
	}
	
	@SuppressWarnings("unchecked")
	public T getEObject(EPackage metamodel) {
		if (object == null) {
			object = (T)serializer.deserialize(metamodel, serialisedObject);
		}
		
		return object;
	}
}
