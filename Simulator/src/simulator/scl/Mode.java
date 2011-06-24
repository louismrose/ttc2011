/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.scl.Mode#getName <em>Name</em>}</li>
 *   <li>{@link simulator.scl.Mode#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link simulator.scl.Mode#getButtons <em>Buttons</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.scl.ConfigPackage#getMode()
 * @model
 * @generated
 */
public interface Mode extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simulator.scl.ConfigPackage#getMode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simulator.scl.Mode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entry Actions</b></em>' containment reference list.
	 * The list contents are of type {@link simulator.scl.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Actions</em>' containment reference list.
	 * @see simulator.scl.ConfigPackage#getMode_EntryActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getEntryActions();

	/**
	 * Returns the value of the '<em><b>Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link simulator.scl.Button}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buttons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttons</em>' containment reference list.
	 * @see simulator.scl.ConfigPackage#getMode_Buttons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Button> getButtons();

} // Mode
