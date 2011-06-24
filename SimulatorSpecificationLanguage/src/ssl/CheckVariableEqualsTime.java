/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Variable Equals Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.CheckVariableEqualsTime#getFirstVariableName <em>First Variable Name</em>}</li>
 *   <li>{@link ssl.CheckVariableEqualsTime#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getCheckVariableEqualsTime()
 * @model
 * @generated
 */
public interface CheckVariableEqualsTime extends Condition {
	/**
	 * Returns the value of the '<em><b>First Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Variable Name</em>' attribute.
	 * @see #setFirstVariableName(String)
	 * @see ssl.SslPackage#getCheckVariableEqualsTime_FirstVariableName()
	 * @model required="true"
	 * @generated
	 */
	String getFirstVariableName();

	/**
	 * Sets the value of the '{@link ssl.CheckVariableEqualsTime#getFirstVariableName <em>First Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Variable Name</em>' attribute.
	 * @see #getFirstVariableName()
	 * @generated
	 */
	void setFirstVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see ssl.SslPackage#getCheckVariableEqualsTime_Time()
	 * @model required="true"
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link ssl.CheckVariableEqualsTime#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

} // CheckVariableEqualsTime
