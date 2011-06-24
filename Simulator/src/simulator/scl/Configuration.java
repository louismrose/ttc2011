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
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.scl.Configuration#getModes <em>Modes</em>}</li>
 *   <li>{@link simulator.scl.Configuration#getVariables <em>Variables</em>}</li>
 *   <li>{@link simulator.scl.Configuration#getConstants <em>Constants</em>}</li>
 *   <li>{@link simulator.scl.Configuration#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.scl.ConfigPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
	 * The list contents are of type {@link simulator.scl.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' containment reference list.
	 * @see simulator.scl.ConfigPackage#getConfiguration_Modes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mode> getModes();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link simulator.scl.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see simulator.scl.ConfigPackage#getConfiguration_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link simulator.scl.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see simulator.scl.ConfigPackage#getConfiguration_Constants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getConstants();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link simulator.scl.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see simulator.scl.ConfigPackage#getConfiguration_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getEvents();

} // Configuration
