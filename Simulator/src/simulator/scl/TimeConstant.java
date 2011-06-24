/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.scl.TimeConstant#getHours <em>Hours</em>}</li>
 *   <li>{@link simulator.scl.TimeConstant#getMinutes <em>Minutes</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.scl.ConfigPackage#getTimeConstant()
 * @model
 * @generated
 */
public interface TimeConstant extends Constant {
	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see #setHours(Integer)
	 * @see simulator.scl.ConfigPackage#getTimeConstant_Hours()
	 * @model required="true"
	 * @generated
	 */
	Integer getHours();

	/**
	 * Sets the value of the '{@link simulator.scl.TimeConstant#getHours <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours</em>' attribute.
	 * @see #getHours()
	 * @generated
	 */
	void setHours(Integer value);

	/**
	 * Returns the value of the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minutes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes</em>' attribute.
	 * @see #setMinutes(Integer)
	 * @see simulator.scl.ConfigPackage#getTimeConstant_Minutes()
	 * @model required="true"
	 * @generated
	 */
	Integer getMinutes();

	/**
	 * Sets the value of the '{@link simulator.scl.TimeConstant#getMinutes <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes</em>' attribute.
	 * @see #getMinutes()
	 * @generated
	 */
	void setMinutes(Integer value);

} // TimeConstant
