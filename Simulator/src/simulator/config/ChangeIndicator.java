/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.config.ChangeIndicator#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.config.ConfigPackage#getChangeIndicator()
 * @model
 * @generated
 */
public interface ChangeIndicator extends Action {
	/**
	 * Returns the value of the '<em><b>New Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' reference.
	 * @see #setNewValue(Displayable)
	 * @see simulator.config.ConfigPackage#getChangeIndicator_NewValue()
	 * @model required="true"
	 * @generated
	 */
	Displayable getNewValue();

	/**
	 * Sets the value of the '{@link simulator.config.ChangeIndicator#getNewValue <em>New Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' reference.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(Displayable value);

} // ChangeIndicator
