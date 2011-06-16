/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ssl.PressButton;
import ssl.SslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Press Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ssl.impl.PressButtonImpl#getButton <em>Button</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PressButtonImpl extends ActionImpl implements PressButton {
	/**
   * The default value of the '{@link #getButton() <em>Button</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getButton()
   * @generated
   * @ordered
   */
	protected static final String BUTTON_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getButton() <em>Button</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getButton()
   * @generated
   * @ordered
   */
	protected String button = BUTTON_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PressButtonImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SslPackage.Literals.PRESS_BUTTON;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getButton() {
    return button;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setButton(String newButton) {
    String oldButton = button;
    button = newButton;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.PRESS_BUTTON__BUTTON, oldButton, button));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case SslPackage.PRESS_BUTTON__BUTTON:
        return getButton();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case SslPackage.PRESS_BUTTON__BUTTON:
        setButton((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case SslPackage.PRESS_BUTTON__BUTTON:
        setButton(BUTTON_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case SslPackage.PRESS_BUTTON__BUTTON:
        return BUTTON_EDEFAULT == null ? button != null : !BUTTON_EDEFAULT.equals(button);
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (button: ");
    result.append(button);
    result.append(')');
    return result.toString();
  }

} //PressButtonImpl
