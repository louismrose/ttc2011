/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.scl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simulator.scl.ConfigPackage;
import simulator.scl.TimeConstant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.scl.impl.TimeConstantImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link simulator.scl.impl.TimeConstantImpl#getMinutes <em>Minutes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeConstantImpl extends ConstantImpl implements TimeConstant {
	/**
	 * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected Integer hours = HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MINUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
	protected Integer minutes = MINUTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.TIME_CONSTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHours() {
		return hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHours(Integer newHours) {
		Integer oldHours = hours;
		hours = newHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.TIME_CONSTANT__HOURS, oldHours, hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinutes() {
		return minutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutes(Integer newMinutes) {
		Integer oldMinutes = minutes;
		minutes = newMinutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.TIME_CONSTANT__MINUTES, oldMinutes, minutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.TIME_CONSTANT__HOURS:
				return getHours();
			case ConfigPackage.TIME_CONSTANT__MINUTES:
				return getMinutes();
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
			case ConfigPackage.TIME_CONSTANT__HOURS:
				setHours((Integer)newValue);
				return;
			case ConfigPackage.TIME_CONSTANT__MINUTES:
				setMinutes((Integer)newValue);
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
			case ConfigPackage.TIME_CONSTANT__HOURS:
				setHours(HOURS_EDEFAULT);
				return;
			case ConfigPackage.TIME_CONSTANT__MINUTES:
				setMinutes(MINUTES_EDEFAULT);
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
			case ConfigPackage.TIME_CONSTANT__HOURS:
				return HOURS_EDEFAULT == null ? hours != null : !HOURS_EDEFAULT.equals(hours);
			case ConfigPackage.TIME_CONSTANT__MINUTES:
				return MINUTES_EDEFAULT == null ? minutes != null : !MINUTES_EDEFAULT.equals(minutes);
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
		result.append(" (hours: ");
		result.append(hours);
		result.append(", minutes: ");
		result.append(minutes);
		result.append(')');
		return result.toString();
	}

} //TimeConstantImpl
