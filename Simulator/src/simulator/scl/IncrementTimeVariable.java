/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Increment Time Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.scl.IncrementTimeVariable#getVariable <em>Variable</em>}</li>
 *   <li>{@link simulator.scl.IncrementTimeVariable#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.scl.ConfigPackage#getIncrementTimeVariable()
 * @model
 * @generated
 */
public interface IncrementTimeVariable extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see simulator.scl.ConfigPackage#getIncrementTimeVariable_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link simulator.scl.IncrementTimeVariable#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link simulator.scl.UnitOfTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see simulator.scl.UnitOfTime
	 * @see #setUnit(UnitOfTime)
	 * @see simulator.scl.ConfigPackage#getIncrementTimeVariable_Unit()
	 * @model required="true"
	 * @generated
	 */
	UnitOfTime getUnit();

	/**
	 * Sets the value of the '{@link simulator.scl.IncrementTimeVariable#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see simulator.scl.UnitOfTime
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitOfTime value);

} // IncrementTimeVariable
