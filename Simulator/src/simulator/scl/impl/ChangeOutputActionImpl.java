/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.scl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simulator.scl.ChangeOutputAction;
import simulator.scl.ConfigPackage;
import simulator.scl.Displayable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Output Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.scl.impl.ChangeOutputActionImpl#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ChangeOutputActionImpl extends ActionImpl implements ChangeOutputAction {
	/**
	 * The cached value of the '{@link #getNewValue() <em>New Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected Displayable newValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeOutputActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.CHANGE_OUTPUT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Displayable getNewValue() {
		if (newValue != null && newValue.eIsProxy()) {
			InternalEObject oldNewValue = (InternalEObject)newValue;
			newValue = (Displayable)eResolveProxy(oldNewValue);
			if (newValue != oldNewValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigPackage.CHANGE_OUTPUT_ACTION__NEW_VALUE, oldNewValue, newValue));
			}
		}
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Displayable basicGetNewValue() {
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewValue(Displayable newNewValue) {
		Displayable oldNewValue = newValue;
		newValue = newNewValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CHANGE_OUTPUT_ACTION__NEW_VALUE, oldNewValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.CHANGE_OUTPUT_ACTION__NEW_VALUE:
				if (resolve) return getNewValue();
				return basicGetNewValue();
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
			case ConfigPackage.CHANGE_OUTPUT_ACTION__NEW_VALUE:
				setNewValue((Displayable)newValue);
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
			case ConfigPackage.CHANGE_OUTPUT_ACTION__NEW_VALUE:
				setNewValue((Displayable)null);
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
			case ConfigPackage.CHANGE_OUTPUT_ACTION__NEW_VALUE:
				return newValue != null;
		}
		return super.eIsSet(featureID);
	}

} //ChangeOutputActionImpl
