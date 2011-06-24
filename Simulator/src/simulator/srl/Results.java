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
 * A representation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.srl.Results#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.srl.ResultsPackage#getResults()
 * @model
 * @generated
 */
public interface Results extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link simulator.srl.SimulationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see simulator.srl.ResultsPackage#getResults_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimulationElement> getElements();

} // Results
