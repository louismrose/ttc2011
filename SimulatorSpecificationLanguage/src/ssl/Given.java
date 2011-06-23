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
 *   <li>{@link ssl.Given#getTestcase <em>Testcase</em>}</li>
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
   * Returns the value of the '<em><b>Testcase</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link ssl.Testcase#getGiven <em>Given</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Testcase</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Testcase</em>' container reference.
   * @see #setTestcase(Testcase)
   * @see ssl.SslPackage#getGiven_Testcase()
   * @see ssl.Testcase#getGiven
   * @model opposite="given" required="true" transient="false"
   * @generated
   */
  Testcase getTestcase();

  /**
   * Sets the value of the '{@link ssl.Given#getTestcase <em>Testcase</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Testcase</em>' container reference.
   * @see #getTestcase()
   * @generated
   */
  void setTestcase(Testcase value);

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link ssl.Condition}.
   * It is bidirectional and its opposite is '{@link ssl.Condition#getGiven <em>Given</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see ssl.SslPackage#getGiven_Conditions()
   * @see ssl.Condition#getGiven
   * @model opposite="given" containment="true" required="true"
   * @generated
   */
	EList<Condition> getConditions();

} // Given
