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
 * A representation of the model object '<em><b>Given</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.Given#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getGiven()
 * @model
 * @generated
 */
public interface Given extends EObject {
	/**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link ssl.Condition}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see ssl.SslPackage#getGiven_Conditions()
   * @model containment="true" required="true"
   * @generated
   */
	EList<Condition> getConditions();

} // Given
