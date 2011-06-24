/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observe Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.ObserveOutput#getLabelType <em>Label Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getObserveOutput()
 * @model abstract="true"
 * @generated
 */
public interface ObserveOutput extends Observation {
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
	 * @see ssl.SslPackage#getObserveOutput_LabelType()
	 * @model required="true"
	 * @generated
	 */
	LabelType getLabelType();

	/**
	 * Sets the value of the '{@link ssl.ObserveOutput#getLabelType <em>Label Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Type</em>' attribute.
	 * @see ssl.LabelType
	 * @see #getLabelType()
	 * @generated
	 */
	void setLabelType(LabelType value);

} // ObserveOutput
