/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.config.AlarmEvent#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link simulator.config.AlarmEvent#getAlarmTime <em>Alarm Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.config.ConfigPackage#getAlarmEvent()
 * @model
 * @generated
 */
public interface AlarmEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(Variable)
	 * @see simulator.config.ConfigPackage#getAlarmEvent_Trigger()
	 * @model required="true"
	 * @generated
	 */
	Variable getTrigger();

	/**
	 * Sets the value of the '{@link simulator.config.AlarmEvent#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Variable value);

	/**
	 * Returns the value of the '<em><b>Alarm Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alarm Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Time</em>' reference.
	 * @see #setAlarmTime(Variable)
	 * @see simulator.config.ConfigPackage#getAlarmEvent_AlarmTime()
	 * @model required="true"
	 * @generated
	 */
	Variable getAlarmTime();

	/**
	 * Sets the value of the '{@link simulator.config.AlarmEvent#getAlarmTime <em>Alarm Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Time</em>' reference.
	 * @see #getAlarmTime()
	 * @generated
	 */
	void setAlarmTime(Variable value);

} // AlarmEvent
