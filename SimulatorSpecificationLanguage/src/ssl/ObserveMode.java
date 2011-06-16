/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observe Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.ObserveMode#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getObserveMode()
 * @model
 * @generated
 */
public interface ObserveMode extends Observation {
	/**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see #setMode(String)
   * @see ssl.SslPackage#getObserveMode_Mode()
   * @model required="true"
   * @generated
   */
	String getMode();

	/**
   * Sets the value of the '{@link ssl.ObserveMode#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see #getMode()
   * @generated
   */
	void setMode(String value);

} // ObserveMode
