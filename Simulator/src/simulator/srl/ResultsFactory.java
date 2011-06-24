/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.srl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simulator.srl.ResultsPackage
 * @generated
 */
public interface ResultsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultsFactory eINSTANCE = simulator.srl.impl.ResultsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results</em>'.
	 * @generated
	 */
	Results createResults();

	/**
	 * Returns a new object of class '<em>Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stimulus</em>'.
	 * @generated
	 */
	Stimulus createStimulus();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Environmental Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environmental Change</em>'.
	 * @generated
	 */
	EnvironmentalChange createEnvironmentalChange();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResultsPackage getResultsPackage();

} //ResultsFactory
