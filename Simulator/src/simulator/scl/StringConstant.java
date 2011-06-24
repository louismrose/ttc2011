/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.scl.StringConstant#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.scl.ConfigPackage#getStringConstant()
 * @model
 * @generated
 */
public interface StringConstant extends Constant {
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
	 * @see simulator.scl.ConfigPackage#getStringConstant_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link simulator.scl.StringConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringConstant
