/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.config.OrCondition#getSubconditions <em>Subconditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.config.ConfigPackage#getOrCondition()
 * @model
 * @generated
 */
public interface OrCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Subconditions</b></em>' containment reference list.
	 * The list contents are of type {@link simulator.config.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subconditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subconditions</em>' containment reference list.
	 * @see simulator.config.ConfigPackage#getOrCondition_Subconditions()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Condition> getSubconditions();

} // OrCondition
