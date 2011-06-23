/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.config.NotCondition#getSubcondition <em>Subcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.config.ConfigPackage#getNotCondition()
 * @model
 * @generated
 */
public interface NotCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Subcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcondition</em>' containment reference.
	 * @see #setSubcondition(Condition)
	 * @see simulator.config.ConfigPackage#getNotCondition_Subcondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getSubcondition();

	/**
	 * Sets the value of the '{@link simulator.config.NotCondition#getSubcondition <em>Subcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subcondition</em>' containment reference.
	 * @see #getSubcondition()
	 * @generated
	 */
	void setSubcondition(Condition value);

} // NotCondition
