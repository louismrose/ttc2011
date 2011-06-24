/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.Specification#getTestcases <em>Testcases</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject {
	/**
	 * Returns the value of the '<em><b>Testcases</b></em>' containment reference list.
	 * The list contents are of type {@link ssl.Testcase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testcases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testcases</em>' containment reference list.
	 * @see ssl.SslPackage#getSpecification_Testcases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Testcase> getTestcases();

} // Specification
