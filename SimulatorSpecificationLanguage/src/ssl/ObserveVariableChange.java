/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observe Variable Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.ObserveVariableChange#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link ssl.ObserveVariableChange#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getObserveVariableChange()
 * @model
 * @generated
 */
public interface ObserveVariableChange extends Observation {
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
	 * @see ssl.SslPackage#getObserveVariableChange_VariableName()
	 * @model required="true"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link ssl.ObserveVariableChange#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link ssl.UnitOfTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see ssl.UnitOfTime
	 * @see #setUnit(UnitOfTime)
	 * @see ssl.SslPackage#getObserveVariableChange_Unit()
	 * @model required="true"
	 * @generated
	 */
	UnitOfTime getUnit();

	/**
	 * Sets the value of the '{@link ssl.ObserveVariableChange#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see ssl.UnitOfTime
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitOfTime value);

} // ObserveVariableChange
