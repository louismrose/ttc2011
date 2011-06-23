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
 * A representation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.When#getTestcase <em>Testcase</em>}</li>
 *   <li>{@link ssl.When#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getWhen()
 * @model
 * @generated
 */
public interface When extends EObject {
	/**
   * Returns the value of the '<em><b>Testcase</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link ssl.Testcase#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Testcase</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Testcase</em>' container reference.
   * @see #setTestcase(Testcase)
   * @see ssl.SslPackage#getWhen_Testcase()
   * @see ssl.Testcase#getWhen
   * @model opposite="when" required="true" transient="false"
   * @generated
   */
  Testcase getTestcase();

  /**
   * Sets the value of the '{@link ssl.When#getTestcase <em>Testcase</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Testcase</em>' container reference.
   * @see #getTestcase()
   * @generated
   */
  void setTestcase(Testcase value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link ssl.Action}.
   * It is bidirectional and its opposite is '{@link ssl.Action#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see ssl.SslPackage#getWhen_Actions()
   * @see ssl.Action#getWhen
   * @model opposite="when" containment="true" required="true"
   * @generated
   */
	EList<Action> getActions();

} // When
