/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Matches Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.config.OutputMatchesCondition#getValueToMatch <em>Value To Match</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.config.ConfigPackage#getOutputMatchesCondition()
 * @model abstract="true"
 * @generated
 */
public interface OutputMatchesCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Value To Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value To Match</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value To Match</em>' reference.
	 * @see #setValueToMatch(Displayable)
	 * @see simulator.config.ConfigPackage#getOutputMatchesCondition_ValueToMatch()
	 * @model required="true"
	 * @generated
	 */
	Displayable getValueToMatch();

	/**
	 * Sets the value of the '{@link simulator.config.OutputMatchesCondition#getValueToMatch <em>Value To Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value To Match</em>' reference.
	 * @see #getValueToMatch()
	 * @generated
	 */
	void setValueToMatch(Displayable value);

} // OutputMatchesCondition
