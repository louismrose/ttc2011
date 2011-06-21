/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Output Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.config.ChangeOutputAction#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.config.ConfigPackage#getChangeOutputAction()
 * @model abstract="true"
 * @generated
 */
public interface ChangeOutputAction extends Action {
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
	 * @see simulator.config.ConfigPackage#getChangeOutputAction_NewValue()
	 * @model required="true"
	 * @generated
	 */
	Displayable getNewValue();

	/**
	 * Sets the value of the '{@link simulator.config.ChangeOutputAction#getNewValue <em>New Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' reference.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(Displayable value);

} // ChangeOutputAction
