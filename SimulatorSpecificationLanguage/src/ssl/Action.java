/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.Action#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>When</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ssl.When#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' container reference.
	 * @see #setWhen(When)
	 * @see ssl.SslPackage#getAction_When()
	 * @see ssl.When#getActions
	 * @model opposite="actions" required="true" transient="false"
	 * @generated
	 */
	When getWhen();

	/**
	 * Sets the value of the '{@link ssl.Action#getWhen <em>When</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' container reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(When value);

} // Action
