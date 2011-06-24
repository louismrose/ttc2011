/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Comparison Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.scl.VariableComparisonCondition#getVariable <em>Variable</em>}</li>
 *   <li>{@link simulator.scl.VariableComparisonCondition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.scl.ConfigPackage#getVariableComparisonCondition()
 * @model abstract="true"
 * @generated
 */
public interface VariableComparisonCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see simulator.scl.ConfigPackage#getVariableComparisonCondition_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link simulator.scl.VariableComparisonCondition#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Displayable)
	 * @see simulator.scl.ConfigPackage#getVariableComparisonCondition_Value()
	 * @model required="true"
	 * @generated
	 */
	Displayable getValue();

	/**
	 * Sets the value of the '{@link simulator.scl.VariableComparisonCondition#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Displayable value);

} // VariableComparisonCondition
