/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.srl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.srl.SimulationElement#getType <em>Type</em>}</li>
 *   <li>{@link simulator.srl.SimulationElement#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.srl.ResultsPackage#getSimulationElement()
 * @model abstract="true"
 * @generated
 */
public interface SimulationElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see simulator.srl.ResultsPackage#getSimulationElement_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link simulator.srl.SimulationElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' attribute list.
	 * @see simulator.srl.ResultsPackage#getSimulationElement_Params()
	 * @model
	 * @generated
	 */
	EList<String> getParams();

} // SimulationElement
