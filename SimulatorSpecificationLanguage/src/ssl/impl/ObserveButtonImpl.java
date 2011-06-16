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

import ssl.ObserveButton;
import ssl.SslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observe Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ssl.impl.ObserveButtonImpl#getButton <em>Button</em>}</li>
 *   <li>{@link ssl.impl.ObserveButtonImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObserveButtonImpl extends ObservationImpl implements ObserveButton
{
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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObserveButtonImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SslPackage.Literals.OBSERVE_BUTTON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getButton()
  {
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setButton(String newButton)
  {
    String oldButton = button;
    button = newButton;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.OBSERVE_BUTTON__BUTTON, oldButton, button));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.OBSERVE_BUTTON__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SslPackage.OBSERVE_BUTTON__BUTTON:
        return getButton();
      case SslPackage.OBSERVE_BUTTON__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SslPackage.OBSERVE_BUTTON__BUTTON:
        setButton((String)newValue);
        return;
      case SslPackage.OBSERVE_BUTTON__NAME:
        setName((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SslPackage.OBSERVE_BUTTON__BUTTON:
        setButton(BUTTON_EDEFAULT);
        return;
      case SslPackage.OBSERVE_BUTTON__NAME:
        setName(NAME_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SslPackage.OBSERVE_BUTTON__BUTTON:
        return BUTTON_EDEFAULT == null ? button != null : !BUTTON_EDEFAULT.equals(button);
      case SslPackage.OBSERVE_BUTTON__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (button: ");
    result.append(button);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ObserveButtonImpl
