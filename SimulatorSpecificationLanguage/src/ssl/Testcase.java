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
 * A representation of the model object '<em><b>Testcase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.Testcase#getGiven <em>Given</em>}</li>
 *   <li>{@link ssl.Testcase#getWhen <em>When</em>}</li>
 *   <li>{@link ssl.Testcase#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getTestcase()
 * @model
 * @generated
 */
public interface Testcase extends EObject {
	/**
   * Returns the value of the '<em><b>Given</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Given</em>' containment reference.
   * @see #setGiven(Given)
   * @see ssl.SslPackage#getTestcase_Given()
   * @model containment="true" required="true"
   * @generated
   */
	Given getGiven();

	/**
   * Sets the value of the '{@link ssl.Testcase#getGiven <em>Given</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Given</em>' containment reference.
   * @see #getGiven()
   * @generated
   */
	void setGiven(Given value);

	/**
   * Returns the value of the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' containment reference.
   * @see #setWhen(When)
   * @see ssl.SslPackage#getTestcase_When()
   * @model containment="true"
   * @generated
   */
	When getWhen();

	/**
   * Sets the value of the '{@link ssl.Testcase#getWhen <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' containment reference.
   * @see #getWhen()
   * @generated
   */
	void setWhen(When value);

	/**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(Then)
   * @see ssl.SslPackage#getTestcase_Then()
   * @model containment="true" required="true"
   * @generated
   */
	Then getThen();

	/**
   * Sets the value of the '{@link ssl.Testcase#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
	void setThen(Then value);

} // Testcase
