/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssl.CheckVariableEqualsVariable;
import ssl.SslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Variable Equals Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ssl.impl.CheckVariableEqualsVariableImpl#getFirstVariableName <em>First Variable Name</em>}</li>
 *   <li>{@link ssl.impl.CheckVariableEqualsVariableImpl#getSecondVariableName <em>Second Variable Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckVariableEqualsVariableImpl extends ConditionImpl implements CheckVariableEqualsVariable {
	/**
	 * The default value of the '{@link #getFirstVariableName() <em>First Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstVariableName() <em>First Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstVariableName()
	 * @generated
	 * @ordered
	 */
	protected String firstVariableName = FIRST_VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondVariableName() <em>Second Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondVariableName() <em>Second Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondVariableName()
	 * @generated
	 * @ordered
	 */
	protected String secondVariableName = SECOND_VARIABLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckVariableEqualsVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SslPackage.Literals.CHECK_VARIABLE_EQUALS_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstVariableName() {
		return firstVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstVariableName(String newFirstVariableName) {
		String oldFirstVariableName = firstVariableName;
		firstVariableName = newFirstVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.CHECK_VARIABLE_EQUALS_VARIABLE__FIRST_VARIABLE_NAME, oldFirstVariableName, firstVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondVariableName() {
		return secondVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondVariableName(String newSecondVariableName) {
		String oldSecondVariableName = secondVariableName;
		secondVariableName = newSecondVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.CHECK_VARIABLE_EQUALS_VARIABLE__SECOND_VARIABLE_NAME, oldSecondVariableName, secondVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SslPackage.CHECK_VARIABLE_EQUALS_VARIABLE__FIRST_VARIABLE_NAME:
				return getFirstVariableName();
			case SslPackage.CHECK_VARIABLE_EQUALS_VARIABLE__SECOND_VARIABLE_NAME:
				return getSecondVariableName();
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
			case SslPackage.CHECK_VARIABLE_EQUALS_VARIABLE__FIRST_VARIABLE_NAME:
				setFirstVariableName((String)newValue);
				return;
			case SslPackage.CHECK_VARIABLE_EQUALS_VARIABLE__SECOND_VARIABLE_NAME:
				setSecondVariableName((String)newValue);
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
			case SslPackage.CHECK_VARIABLE_EQUALS_VARIABLE__FIRST_VARIABLE_NAME:
				setFirstVariableName(FIRST_VARIABLE_NAME_EDEFAULT);
				return;
			case SslPackage.CHECK_VARIABLE_EQUALS_VARIABLE__SECOND_VARIABLE_NAME:
				setSecondVariableName(SECOND_VARIABLE_NAME_EDEFAULT);
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
			case SslPackage.CHECK_VARIABLE_EQUALS_VARIABLE__FIRST_VARIABLE_NAME:
				return FIRST_VARIABLE_NAME_EDEFAULT == null ? firstVariableName != null : !FIRST_VARIABLE_NAME_EDEFAULT.equals(firstVariableName);
			case SslPackage.CHECK_VARIABLE_EQUALS_VARIABLE__SECOND_VARIABLE_NAME:
				return SECOND_VARIABLE_NAME_EDEFAULT == null ? secondVariableName != null : !SECOND_VARIABLE_NAME_EDEFAULT.equals(secondVariableName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstVariableName: ");
		result.append(firstVariableName);
		result.append(", secondVariableName: ");
		result.append(secondVariableName);
		result.append(')');
		return result.toString();
	}

} //CheckVariableEqualsVariableImpl
