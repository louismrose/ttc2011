/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observe Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.ObserveButton#getButton <em>Button</em>}</li>
 *   <li>{@link ssl.ObserveButton#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getObserveButton()
 * @model
 * @generated
 */
public interface ObserveButton extends Observation
{
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
   * @see ssl.SslPackage#getObserveButton_Button()
   * @model required="true"
   * @generated
   */
  String getButton();

  /**
   * Sets the value of the '{@link ssl.ObserveButton#getButton <em>Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Button</em>' attribute.
   * @see #getButton()
   * @generated
   */
  void setButton(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ssl.SslPackage#getObserveButton_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ssl.ObserveButton#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ObserveButton
