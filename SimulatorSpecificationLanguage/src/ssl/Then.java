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
 * A representation of the model object '<em><b>Then</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.Then#getTestcase <em>Testcase</em>}</li>
 *   <li>{@link ssl.Then#getObservations <em>Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getThen()
 * @model
 * @generated
 */
public interface Then extends EObject {
	/**
   * Returns the value of the '<em><b>Testcase</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link ssl.Testcase#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Testcase</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Testcase</em>' container reference.
   * @see #setTestcase(Testcase)
   * @see ssl.SslPackage#getThen_Testcase()
   * @see ssl.Testcase#getThen
   * @model opposite="then" required="true" transient="false"
   * @generated
   */
  Testcase getTestcase();

  /**
   * Sets the value of the '{@link ssl.Then#getTestcase <em>Testcase</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Testcase</em>' container reference.
   * @see #getTestcase()
   * @generated
   */
  void setTestcase(Testcase value);

  /**
   * Returns the value of the '<em><b>Observations</b></em>' containment reference list.
   * The list contents are of type {@link ssl.Observation}.
   * It is bidirectional and its opposite is '{@link ssl.Observation#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Observations</em>' containment reference list.
   * @see ssl.SslPackage#getThen_Observations()
   * @see ssl.Observation#getThen
   * @model opposite="then" containment="true" required="true"
   * @generated
   */
	EList<Observation> getObservations();

} // Then
