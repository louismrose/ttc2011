/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simulator.config.Condition;
import simulator.config.ConfigPackage;
import simulator.config.NotCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.config.impl.NotConditionImpl#getSubcondition <em>Subcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotConditionImpl extends ConditionImpl implements NotCondition {
	/**
	 * The cached value of the '{@link #getSubcondition() <em>Subcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcondition()
	 * @generated
	 * @ordered
	 */
	protected Condition subcondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.NOT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getSubcondition() {
		return subcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubcondition(Condition newSubcondition, NotificationChain msgs) {
		Condition oldSubcondition = subcondition;
		subcondition = newSubcondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.NOT_CONDITION__SUBCONDITION, oldSubcondition, newSubcondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubcondition(Condition newSubcondition) {
		if (newSubcondition != subcondition) {
			NotificationChain msgs = null;
			if (subcondition != null)
				msgs = ((InternalEObject)subcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.NOT_CONDITION__SUBCONDITION, null, msgs);
			if (newSubcondition != null)
				msgs = ((InternalEObject)newSubcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.NOT_CONDITION__SUBCONDITION, null, msgs);
			msgs = basicSetSubcondition(newSubcondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.NOT_CONDITION__SUBCONDITION, newSubcondition, newSubcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.NOT_CONDITION__SUBCONDITION:
				return basicSetSubcondition(null, msgs);
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
			case ConfigPackage.NOT_CONDITION__SUBCONDITION:
				return getSubcondition();
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
			case ConfigPackage.NOT_CONDITION__SUBCONDITION:
				setSubcondition((Condition)newValue);
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
			case ConfigPackage.NOT_CONDITION__SUBCONDITION:
				setSubcondition((Condition)null);
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
			case ConfigPackage.NOT_CONDITION__SUBCONDITION:
				return subcondition != null;
		}
		return super.eIsSet(featureID);
	}

} //NotConditionImpl
