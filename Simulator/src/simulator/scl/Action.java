/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.scl.Action#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.scl.ConfigPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Condition)
	 * @see simulator.scl.ConfigPackage#getAction_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Condition getGuard();

	/**
	 * Sets the value of the '{@link simulator.scl.Action#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Condition value);

} // Action
