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

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import simulator.trace.Trace;
import simulator.trace.TraceElement;
import simulator.trace.TraceFactory;
import simulator.trace.TracePackage;

public class SerializableTrace implements Trace, Serializable {

	// Generated by Eclipse
	private static final long serialVersionUID = -4648576874212687054L;
	
	private final SerializableEObject<Trace> serializableTrace;
	
	public SerializableTrace() throws IOException {
		this(TraceFactory.eINSTANCE.createTrace());
	}
	
	public SerializableTrace(Trace trace) throws IOException {
		this.serializableTrace = new SerializableEObject<Trace>(trace);
	}
	
	public Trace getTrace() {
		return serializableTrace.getEObject(TracePackage.eINSTANCE);
	}

	public EList<TraceElement> getElements() {
		return getTrace().getElements();
	}

	public EList<Adapter> eAdapters() {
		return getTrace().eAdapters();
	}

	public boolean eDeliver() {
		return getTrace().eDeliver();
	}

	public void eSetDeliver(boolean deliver) {
		getTrace().eSetDeliver(deliver);
	}

	public void eNotify(Notification notification) {
		getTrace().eNotify(notification);
	}

	public EClass eClass() {
		return getTrace().eClass();
	}

	public Resource eResource() {
		return getTrace().eResource();
	}

	public EObject eContainer() {
		return getTrace().eContainer();
	}

	public EStructuralFeature eContainingFeature() {
		return getTrace().eContainingFeature();
	}

	public EReference eContainmentFeature() {
		return getTrace().eContainmentFeature();
	}

	public EList<EObject> eContents() {
		return getTrace().eContents();
	}

	public TreeIterator<EObject> eAllContents() {
		return getTrace().eAllContents();
	}

	public boolean eIsProxy() {
		return getTrace().eIsProxy();
	}

	public EList<EObject> eCrossReferences() {
		return getTrace().eCrossReferences();
	}

	public Object eGet(EStructuralFeature feature) {
		return getTrace().eGet(feature);
	}

	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return getTrace().eGet(feature, resolve);
	}

	public void eSet(EStructuralFeature feature, Object newValue) {
		getTrace().eSet(feature, newValue);
	}

	public boolean eIsSet(EStructuralFeature feature) {
		return getTrace().eIsSet(feature);
	}

	public void eUnset(EStructuralFeature feature) {
		getTrace().eUnset(feature);
	}

	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		return getTrace().eInvoke(operation, arguments);
	}

}