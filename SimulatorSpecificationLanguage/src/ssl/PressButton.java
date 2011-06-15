/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Press Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.PressButton#getButton <em>Button</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getPressButton()
 * @model
 * @generated
 */
public interface PressButton extends Action {
	/**
	 * Returns the value of the '<em><b>Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button</em>' attribute.
	 * @see #setButton(String)
	 * @see ssl.SslPackage#getPressButton_Button()
	 * @model
	 * @generated
	 */
	String getButton();

	/**
	 * Sets the value of the '{@link ssl.PressButton#getButton <em>Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button</em>' attribute.
	 * @see #getButton()
	 * @generated
	 */
	void setButton(String value);

} // PressButton
