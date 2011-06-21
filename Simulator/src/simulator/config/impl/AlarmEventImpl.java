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

import simulator.config.AlarmEvent;
import simulator.config.ConfigPackage;
import simulator.config.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.config.impl.AlarmEventImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link simulator.config.impl.AlarmEventImpl#getAlarmTime <em>Alarm Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlarmEventImpl extends EventImpl implements AlarmEvent {
	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected Variable trigger;

	/**
	 * The cached value of the '{@link #getAlarmTime() <em>Alarm Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmTime()
	 * @generated
	 * @ordered
	 */
	protected Variable alarmTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.ALARM_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getTrigger() {
		if (trigger != null && trigger.eIsProxy()) {
			InternalEObject oldTrigger = (InternalEObject)trigger;
			trigger = (Variable)eResolveProxy(oldTrigger);
			if (trigger != oldTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigPackage.ALARM_EVENT__TRIGGER, oldTrigger, trigger));
			}
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Variable newTrigger) {
		Variable oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ALARM_EVENT__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getAlarmTime() {
		if (alarmTime != null && alarmTime.eIsProxy()) {
			InternalEObject oldAlarmTime = (InternalEObject)alarmTime;
			alarmTime = (Variable)eResolveProxy(oldAlarmTime);
			if (alarmTime != oldAlarmTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigPackage.ALARM_EVENT__ALARM_TIME, oldAlarmTime, alarmTime));
			}
		}
		return alarmTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetAlarmTime() {
		return alarmTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmTime(Variable newAlarmTime) {
		Variable oldAlarmTime = alarmTime;
		alarmTime = newAlarmTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ALARM_EVENT__ALARM_TIME, oldAlarmTime, alarmTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.ALARM_EVENT__TRIGGER:
				if (resolve) return getTrigger();
				return basicGetTrigger();
			case ConfigPackage.ALARM_EVENT__ALARM_TIME:
				if (resolve) return getAlarmTime();
				return basicGetAlarmTime();
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
			case ConfigPackage.ALARM_EVENT__TRIGGER:
				setTrigger((Variable)newValue);
				return;
			case ConfigPackage.ALARM_EVENT__ALARM_TIME:
				setAlarmTime((Variable)newValue);
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
			case ConfigPackage.ALARM_EVENT__TRIGGER:
				setTrigger((Variable)null);
				return;
			case ConfigPackage.ALARM_EVENT__ALARM_TIME:
				setAlarmTime((Variable)null);
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
			case ConfigPackage.ALARM_EVENT__TRIGGER:
				return trigger != null;
			case ConfigPackage.ALARM_EVENT__ALARM_TIME:
				return alarmTime != null;
		}
		return super.eIsSet(featureID);
	}

} //AlarmEventImpl
