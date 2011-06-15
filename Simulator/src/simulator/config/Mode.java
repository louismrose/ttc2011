/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config;

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
 *   <li>{@link simulator.config.Mode#getName <em>Name</em>}</li>
 *   <li>{@link simulator.config.Mode#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link simulator.config.Mode#getButtonBehaviours <em>Button Behaviours</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.config.ConfigPackage#getMode()
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
	 * @see simulator.config.ConfigPackage#getMode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simulator.config.Mode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entry Actions</b></em>' containment reference list.
	 * The list contents are of type {@link simulator.config.ModeEntryAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Actions</em>' containment reference list.
	 * @see simulator.config.ConfigPackage#getMode_EntryActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModeEntryAction> getEntryActions();

	/**
	 * Returns the value of the '<em><b>Button Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link simulator.config.ButtonBehaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Behaviours</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Behaviours</em>' containment reference list.
	 * @see simulator.config.ConfigPackage#getMode_ButtonBehaviours()
	 * @model containment="true"
	 * @generated
	 */
	EList<ButtonBehaviour> getButtonBehaviours();

} // Mode
