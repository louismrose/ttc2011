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

import ssl.CheckLabel;
import ssl.LabelType;
import ssl.SslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ssl.impl.CheckLabelImpl#getLabelType <em>Label Type</em>}</li>
 *   <li>{@link ssl.impl.CheckLabelImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckLabelImpl extends ConditionImpl implements CheckLabel
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
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckLabelImpl()
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
    return SslPackage.Literals.CHECK_LABEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.CHECK_LABEL__LABEL_TYPE, oldLabelType, labelType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SslPackage.CHECK_LABEL__VALUE, oldValue, value));
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
      case SslPackage.CHECK_LABEL__LABEL_TYPE:
        return getLabelType();
      case SslPackage.CHECK_LABEL__VALUE:
        return getValue();
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
      case SslPackage.CHECK_LABEL__LABEL_TYPE:
        setLabelType((LabelType)newValue);
        return;
      case SslPackage.CHECK_LABEL__VALUE:
        setValue((String)newValue);
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
      case SslPackage.CHECK_LABEL__LABEL_TYPE:
        setLabelType(LABEL_TYPE_EDEFAULT);
        return;
      case SslPackage.CHECK_LABEL__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case SslPackage.CHECK_LABEL__LABEL_TYPE:
        return labelType != LABEL_TYPE_EDEFAULT;
      case SslPackage.CHECK_LABEL__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //CheckLabelImpl
