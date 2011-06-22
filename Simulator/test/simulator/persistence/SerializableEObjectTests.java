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

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Test;

public class SerializableEObjectTests {

	private final EClass clazz = createEClass();
	
	@Test
	public void objectCanBeSerialisedAndDeserialised() throws Exception {
	
		final SerializableEObject<EClass> reconstituted = serializeAndDeserialize(new SerializableEObject<EClass>(clazz));
		
		assertEquals("Foo", reconstituted.getEObject(EcorePackage.eINSTANCE).getName());
	}
	
	@Test
	public void changesToObjectAreSerialised() throws Exception {
		final SerializableEObject<EClass> serializableClass = new SerializableEObject<EClass>(clazz);
		serializableClass.getEObject(EcorePackage.eINSTANCE).setName("Bar");
		
		final SerializableEObject<EClass> reconstituted = serializeAndDeserialize(serializableClass);
		
		assertEquals("Bar", reconstituted.getEObject(EcorePackage.eINSTANCE).getName());
	}
	
	private static EClass createEClass() {
		final EClass clazz = EcoreFactory.eINSTANCE.createEClass();
		clazz.setName("Foo");
		return clazz;
	}
	
	@SuppressWarnings("unchecked")
	private static <T extends Serializable> T serializeAndDeserialize(T object) throws IOException, ClassNotFoundException {
		return (T)deserialize(serialize(object));
	}

	private static <T> byte[] serialize(T object) throws IOException {
		final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		new ObjectOutputStream(byteArrayOutputStream).writeObject(object);
		return byteArrayOutputStream.toByteArray();
	}

	private static Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
		return new ObjectInputStream(new ByteArrayInputStream(bytes)).readObject();
	}
}
