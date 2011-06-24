/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ssl.Condition#getGiven <em>Given</em>}</li>
 * </ul>
 * </p>
 *
 * @see ssl.SslPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Given</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ssl.Given#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given</em>' container reference.
	 * @see #setGiven(Given)
	 * @see ssl.SslPackage#getCondition_Given()
	 * @see ssl.Given#getConditions
	 * @model opposite="conditions" required="true" transient="false"
	 * @generated
	 */
	Given getGiven();

	/**
	 * Sets the value of the '{@link ssl.Condition#getGiven <em>Given</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given</em>' container reference.
	 * @see #getGiven()
	 * @generated
	 */
	void setGiven(Given value);

} // Condition
