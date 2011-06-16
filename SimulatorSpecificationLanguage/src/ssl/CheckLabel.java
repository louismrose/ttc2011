/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.CheckLabel#getLabelType <em>Label Type</em>}</li>
 *   <li>{@link ssl.CheckLabel#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getCheckLabel()
 * @model
 * @generated
 */
public interface CheckLabel extends Condition
{
  /**
   * Returns the value of the '<em><b>Label Type</b></em>' attribute.
   * The literals are from the enumeration {@link ssl.LabelType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Type</em>' attribute.
   * @see ssl.LabelType
   * @see #setLabelType(LabelType)
   * @see ssl.SslPackage#getCheckLabel_LabelType()
   * @model required="true"
   * @generated
   */
  LabelType getLabelType();

  /**
   * Sets the value of the '{@link ssl.CheckLabel#getLabelType <em>Label Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Type</em>' attribute.
   * @see ssl.LabelType
   * @see #getLabelType()
   * @generated
   */
  void setLabelType(LabelType value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see ssl.SslPackage#getCheckLabel_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link ssl.CheckLabel#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // CheckLabel
