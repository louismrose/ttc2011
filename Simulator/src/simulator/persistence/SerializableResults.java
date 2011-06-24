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

import simulator.srl.Results;
import simulator.srl.ResultsFactory;
import simulator.srl.ResultsPackage;
import simulator.srl.SimulationElement;


public class SerializableResults implements Results, Serializable {

	// Generated by Eclipse
	private static final long serialVersionUID = -4648576874212687054L;
	
	private final SerializableEObject<Results> serializableTrace;
	
	public SerializableResults() {
		this(ResultsFactory.eINSTANCE.createResults());
	}
	
	public SerializableResults(Results results) {
		this.serializableTrace = new SerializableEObject<Results>(results);
	}
	
	public Results getResults() {
		return serializableTrace.getEObject(ResultsPackage.eINSTANCE);
	}

	public EList<SimulationElement> getElements() {
		return getResults().getElements();
	}

	public EList<Adapter> eAdapters() {
		return getResults().eAdapters();
	}

	public boolean eDeliver() {
		return getResults().eDeliver();
	}

	public void eSetDeliver(boolean deliver) {
		getResults().eSetDeliver(deliver);
	}

	public void eNotify(Notification notification) {
		getResults().eNotify(notification);
	}

	public EClass eClass() {
		return getResults().eClass();
	}

	public Resource eResource() {
		return getResults().eResource();
	}

	public EObject eContainer() {
		return getResults().eContainer();
	}

	public EStructuralFeature eContainingFeature() {
		return getResults().eContainingFeature();
	}

	public EReference eContainmentFeature() {
		return getResults().eContainmentFeature();
	}

	public EList<EObject> eContents() {
		return getResults().eContents();
	}

	public TreeIterator<EObject> eAllContents() {
		return getResults().eAllContents();
	}

	public boolean eIsProxy() {
		return getResults().eIsProxy();
	}

	public EList<EObject> eCrossReferences() {
		return getResults().eCrossReferences();
	}

	public Object eGet(EStructuralFeature feature) {
		return getResults().eGet(feature);
	}

	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return getResults().eGet(feature, resolve);
	}

	public void eSet(EStructuralFeature feature, Object newValue) {
		getResults().eSet(feature, newValue);
	}

	public boolean eIsSet(EStructuralFeature feature) {
		return getResults().eIsSet(feature);
	}

	public void eUnset(EStructuralFeature feature) {
		getResults().eUnset(feature);
	}

	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		return getResults().eInvoke(operation, arguments);
	}

}