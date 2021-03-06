/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.scl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simulator.scl.Condition;
import simulator.scl.ConfigPackage;
import simulator.scl.OrCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.scl.impl.OrConditionImpl#getSubconditions <em>Subconditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrConditionImpl extends ConditionImpl implements OrCondition {
	/**
	 * The cached value of the '{@link #getSubconditions() <em>Subconditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> subconditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.OR_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getSubconditions() {
		if (subconditions == null) {
			subconditions = new EObjectContainmentEList<Condition>(Condition.class, this, ConfigPackage.OR_CONDITION__SUBCONDITIONS);
		}
		return subconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.OR_CONDITION__SUBCONDITIONS:
				return ((InternalEList<?>)getSubconditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.OR_CONDITION__SUBCONDITIONS:
				return getSubconditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.OR_CONDITION__SUBCONDITIONS:
				getSubconditions().clear();
				getSubconditions().addAll((Collection<? extends Condition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigPackage.OR_CONDITION__SUBCONDITIONS:
				getSubconditions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigPackage.OR_CONDITION__SUBCONDITIONS:
				return subconditions != null && !subconditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrConditionImpl
