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

import ssl.LabelType;
import ssl.ObserveOutput;
import ssl.SslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observe Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ssl.impl.ObserveOutputImpl#getLabelType <em>Label Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ObserveOutputImpl extends ObservationImpl implements ObserveOutput
{
  /**
   * The default value of the '{@link #getLabelType() <em>Label Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelType()
   * @generated
   * @ordered
   */
  protected static final LabelType LABEL_TYPE_EDEFAULT = LabelType.DISPLAY;

  /**
   * The cached value of the '{@link #getLabelType() <em>Label Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelType()
   * @generated
   * @ordered
   */
  protected LabelType labelType = LABEL_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObserveOutputImpl()
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
    return SslPackage.Literals.OBSERVE_OUTPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelType getLabelType()
  {
    return labelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelType(LabelType newLabelType)
  {
    LabelType oldLabelType = labelType;
    labelType = newLabelType == null ? LABEL_TYPE_EDEFAULT : newLabelType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.OBSERVE_OUTPUT__LABEL_TYPE, oldLabelType, labelType));
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
      case SslPackage.OBSERVE_OUTPUT__LABEL_TYPE:
        return getLabelType();
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
      case SslPackage.OBSERVE_OUTPUT__LABEL_TYPE:
        setLabelType((LabelType)newValue);
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
      case SslPackage.OBSERVE_OUTPUT__LABEL_TYPE:
        setLabelType(LABEL_TYPE_EDEFAULT);
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
      case SslPackage.OBSERVE_OUTPUT__LABEL_TYPE:
        return labelType != LABEL_TYPE_EDEFAULT;
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
    result.append(" (labelType: ");
    result.append(labelType);
    result.append(')');
    return result.toString();
  }

} //ObserveOutputImpl
