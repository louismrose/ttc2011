/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Variable Equals Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.CheckVariableEqualsVariable#getFirstVariableName <em>First Variable Name</em>}</li>
 *   <li>{@link ssl.CheckVariableEqualsVariable#getSecondVariableName <em>Second Variable Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getCheckVariableEqualsVariable()
 * @model
 * @generated
 */
public interface CheckVariableEqualsVariable extends Condition {
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
	 * @see ssl.SslPackage#getCheckVariableEqualsVariable_FirstVariableName()
	 * @model required="true"
	 * @generated
	 */
	String getFirstVariableName();

	/**
	 * Sets the value of the '{@link ssl.CheckVariableEqualsVariable#getFirstVariableName <em>First Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Variable Name</em>' attribute.
	 * @see #getFirstVariableName()
	 * @generated
	 */
	void setFirstVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Second Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Variable Name</em>' attribute.
	 * @see #setSecondVariableName(String)
	 * @see ssl.SslPackage#getCheckVariableEqualsVariable_SecondVariableName()
	 * @model required="true"
	 * @generated
	 */
	String getSecondVariableName();

	/**
	 * Sets the value of the '{@link ssl.CheckVariableEqualsVariable#getSecondVariableName <em>Second Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Variable Name</em>' attribute.
	 * @see #getSecondVariableName()
	 * @generated
	 */
	void setSecondVariableName(String value);

} // CheckVariableEqualsVariable
