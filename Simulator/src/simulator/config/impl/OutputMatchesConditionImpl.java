/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simulator.config.ConfigPackage;
import simulator.config.Displayable;
import simulator.config.OutputMatchesCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Matches Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.config.impl.OutputMatchesConditionImpl#getValueToMatch <em>Value To Match</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OutputMatchesConditionImpl extends ConditionImpl implements OutputMatchesCondition {
	/**
	 * The cached value of the '{@link #getValueToMatch() <em>Value To Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueToMatch()
	 * @generated
	 * @ordered
	 */
	protected Displayable valueToMatch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputMatchesConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.OUTPUT_MATCHES_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Displayable getValueToMatch() {
		if (valueToMatch != null && valueToMatch.eIsProxy()) {
			InternalEObject oldValueToMatch = (InternalEObject)valueToMatch;
			valueToMatch = (Displayable)eResolveProxy(oldValueToMatch);
			if (valueToMatch != oldValueToMatch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigPackage.OUTPUT_MATCHES_CONDITION__VALUE_TO_MATCH, oldValueToMatch, valueToMatch));
			}
		}
		return valueToMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Displayable basicGetValueToMatch() {
		return valueToMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueToMatch(Displayable newValueToMatch) {
		Displayable oldValueToMatch = valueToMatch;
		valueToMatch = newValueToMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.OUTPUT_MATCHES_CONDITION__VALUE_TO_MATCH, oldValueToMatch, valueToMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.OUTPUT_MATCHES_CONDITION__VALUE_TO_MATCH:
				if (resolve) return getValueToMatch();
				return basicGetValueToMatch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.OUTPUT_MATCHES_CONDITION__VALUE_TO_MATCH:
				setValueToMatch((Displayable)newValue);
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
			case ConfigPackage.OUTPUT_MATCHES_CONDITION__VALUE_TO_MATCH:
				setValueToMatch((Displayable)null);
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
			case ConfigPackage.OUTPUT_MATCHES_CONDITION__VALUE_TO_MATCH:
				return valueToMatch != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputMatchesConditionImpl
