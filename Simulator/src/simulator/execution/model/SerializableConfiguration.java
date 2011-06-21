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
package simulator.execution.model;

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

import simulator.EObjectSerialiser;
import simulator.config.ConfigPackage;
import simulator.config.Configuration;
import simulator.config.Constant;
import simulator.config.Mode;
import simulator.config.Variable;

public class SerializableConfiguration implements Configuration, Serializable {

	// Generated by Eclipse
	private static final long serialVersionUID = 4064465039964350751L;

	private final String serialisedConfiguration;
	private transient Configuration configuration;
	
	public SerializableConfiguration(Configuration configuration) throws IOException {
		this.serialisedConfiguration = EObjectSerialiser.serialise(configuration);
		this.configuration = configuration;
	}
	
	public Configuration getConfiguration() {
		if (configuration == null) {
			try {
				configuration = (Configuration)EObjectSerialiser.deserialise(ConfigPackage.eINSTANCE, serialisedConfiguration);
			
			} catch (IOException e) {
				// FIXME serialiser should probably throw an unchecked SerialisationException
				e.printStackTrace();
			}
		}
		
		return configuration;
	}

	@Override
	public EList<Mode> getModes() {
		return getConfiguration().getModes();
	}
	
	@Override
	public EList<Variable> getVariables() {
		return getConfiguration().getVariables();
	}

	@Override
	public EList<Constant> getConstants() {
		return getConfiguration().getConstants();
	}

	@Override
	public EList<Adapter> eAdapters() {
		return getConfiguration().eAdapters();
	}

	@Override
	public boolean eDeliver() {
		return getConfiguration().eDeliver();
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		getConfiguration().eSetDeliver(deliver);
	}

	@Override
	public void eNotify(Notification notification) {
		getConfiguration().eNotify(notification);
	}

	@Override
	public EClass eClass() {
		return getConfiguration().eClass();
	}

	@Override
	public Resource eResource() {
		return getConfiguration().eResource();
	}

	@Override
	public EObject eContainer() {
		return getConfiguration().eContainer();
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		return getConfiguration().eContainingFeature();
	}

	@Override
	public EReference eContainmentFeature() {
		return getConfiguration().eContainmentFeature();
	}

	@Override
	public EList<EObject> eContents() {
		return getConfiguration().eContents();
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		return getConfiguration().eAllContents();
	}

	@Override
	public boolean eIsProxy() {
		return getConfiguration().eIsProxy();
	}

	@Override
	public EList<EObject> eCrossReferences() {
		return getConfiguration().eCrossReferences();
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		return getConfiguration().eGet(feature);
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return getConfiguration().eGet(feature, resolve);
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		getConfiguration().eSet(feature, newValue);
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		return getConfiguration().eIsSet(feature);
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		getConfiguration().eUnset(feature);
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		return getConfiguration().eInvoke(operation, arguments);
	}
}
