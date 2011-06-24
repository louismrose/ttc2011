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

import simulator.scl.AndCondition;
import simulator.scl.Condition;
import simulator.scl.ConfigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.scl.impl.AndConditionImpl#getSubconditions <em>Subconditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndConditionImpl extends ConditionImpl implements AndCondition {
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
	protected AndConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.AND_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getSubconditions() {
		if (subconditions == null) {
			subconditions = new EObjectContainmentEList<Condition>(Condition.class, this, ConfigPackage.AND_CONDITION__SUBCONDITIONS);
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
			case ConfigPackage.AND_CONDITION__SUBCONDITIONS:
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
			case ConfigPackage.AND_CONDITION__SUBCONDITIONS:
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
			case ConfigPackage.AND_CONDITION__SUBCONDITIONS:
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
			case ConfigPackage.AND_CONDITION__SUBCONDITIONS:
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
			case ConfigPackage.AND_CONDITION__SUBCONDITIONS:
				return subconditions != null && !subconditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AndConditionImpl
