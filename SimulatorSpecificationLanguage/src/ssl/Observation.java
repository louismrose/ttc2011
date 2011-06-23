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
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.Observation#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getObservation()
 * @model abstract="true"
 * @generated
 */
public interface Observation extends EObject {

  /**
   * Returns the value of the '<em><b>Then</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link ssl.Then#getObservations <em>Observations</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' container reference.
   * @see #setThen(Then)
   * @see ssl.SslPackage#getObservation_Then()
   * @see ssl.Then#getObservations
   * @model opposite="observations" required="true" transient="false"
   * @generated
   */
  Then getThen();

  /**
   * Sets the value of the '{@link ssl.Observation#getThen <em>Then</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' container reference.
   * @see #getThen()
   * @generated
   */
  void setThen(Then value);
} // Observation
