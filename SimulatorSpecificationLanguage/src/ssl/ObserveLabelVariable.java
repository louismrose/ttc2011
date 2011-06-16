/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observe Label Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.ObserveLabelVariable#getLabelType <em>Label Type</em>}</li>
 *   <li>{@link ssl.ObserveLabelVariable#getVariableName <em>Variable Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getObserveLabelVariable()
 * @model
 * @generated
 */
public interface ObserveLabelVariable extends Observation
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
   * @see ssl.SslPackage#getObserveLabelVariable_LabelType()
   * @model required="true"
   * @generated
   */
  LabelType getLabelType();

  /**
   * Sets the value of the '{@link ssl.ObserveLabelVariable#getLabelType <em>Label Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Type</em>' attribute.
   * @see ssl.LabelType
   * @see #getLabelType()
   * @generated
   */
  void setLabelType(LabelType value);

  /**
   * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Name</em>' attribute.
   * @see #setVariableName(String)
   * @see ssl.SslPackage#getObserveLabelVariable_VariableName()
   * @model required="true"
   * @generated
   */
  String getVariableName();

  /**
   * Sets the value of the '{@link ssl.ObserveLabelVariable#getVariableName <em>Variable Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Name</em>' attribute.
   * @see #getVariableName()
   * @generated
   */
  void setVariableName(String value);

} // ObserveLabelVariable
