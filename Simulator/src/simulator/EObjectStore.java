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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public class EObjectStore {

	private final HttpSession session;
	private final String attributeName;
	
	public EObjectStore(HttpSession session, String attributeName) {
		this.session = session;
		this.attributeName = attributeName;
	}
	
	public EObject readOrCreate(EClass type) throws IOException {
		if (session.getAttribute(attributeName) == null) {
			final EObject defaultObject = type.getEPackage().getEFactoryInstance().create(type);
			update(defaultObject);
		}

		return read(type.getEPackage());		
	}
	
	public EObject read(EPackage metamodel) throws IOException {
		final Object serialisedValue = session.getAttribute(attributeName);
		
		if (serialisedValue == null)
			return null;
		else
			return EObjectSerialiser.deserialise(metamodel, serialisedValue.toString());		
	}
	
	public void update(EObject newObject) throws IOException {
		session.setAttribute(attributeName, EObjectSerialiser.serialise(newObject));
	}
}
