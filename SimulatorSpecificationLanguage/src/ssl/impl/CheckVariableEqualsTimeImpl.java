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

import ssl.CheckVariableEqualsTime;
import ssl.SslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Variable Equals Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ssl.impl.CheckVariableEqualsTimeImpl#getFirstVariableName <em>First Variable Name</em>}</li>
 *   <li>{@link ssl.impl.CheckVariableEqualsTimeImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckVariableEqualsTimeImpl extends ConditionImpl implements CheckVariableEqualsTime {
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
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckVariableEqualsTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SslPackage.Literals.CHECK_VARIABLE_EQUALS_TIME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.CHECK_VARIABLE_EQUALS_TIME__FIRST_VARIABLE_NAME, oldFirstVariableName, firstVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.CHECK_VARIABLE_EQUALS_TIME__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SslPackage.CHECK_VARIABLE_EQUALS_TIME__FIRST_VARIABLE_NAME:
				return getFirstVariableName();
			case SslPackage.CHECK_VARIABLE_EQUALS_TIME__TIME:
				return getTime();
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
			case SslPackage.CHECK_VARIABLE_EQUALS_TIME__FIRST_VARIABLE_NAME:
				setFirstVariableName((String)newValue);
				return;
			case SslPackage.CHECK_VARIABLE_EQUALS_TIME__TIME:
				setTime((String)newValue);
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
			case SslPackage.CHECK_VARIABLE_EQUALS_TIME__FIRST_VARIABLE_NAME:
				setFirstVariableName(FIRST_VARIABLE_NAME_EDEFAULT);
				return;
			case SslPackage.CHECK_VARIABLE_EQUALS_TIME__TIME:
				setTime(TIME_EDEFAULT);
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
			case SslPackage.CHECK_VARIABLE_EQUALS_TIME__FIRST_VARIABLE_NAME:
				return FIRST_VARIABLE_NAME_EDEFAULT == null ? firstVariableName != null : !FIRST_VARIABLE_NAME_EDEFAULT.equals(firstVariableName);
			case SslPackage.CHECK_VARIABLE_EQUALS_TIME__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
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
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //CheckVariableEqualsTimeImpl
