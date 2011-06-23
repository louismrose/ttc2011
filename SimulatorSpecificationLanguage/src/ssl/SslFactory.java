/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ssl.SslPackage
 * @generated
 */
public interface SslFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	SslFactory eINSTANCE = ssl.impl.SslFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Specification</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Specification</em>'.
   * @generated
   */
	Specification createSpecification();

	/**
   * Returns a new object of class '<em>Testcase</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Testcase</em>'.
   * @generated
   */
	Testcase createTestcase();

	/**
   * Returns a new object of class '<em>Given</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Given</em>'.
   * @generated
   */
	Given createGiven();

	/**
   * Returns a new object of class '<em>When</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>When</em>'.
   * @generated
   */
	When createWhen();

	/**
   * Returns a new object of class '<em>Then</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Then</em>'.
   * @generated
   */
	Then createThen();

	/**
   * Returns a new object of class '<em>Check Time Past Other</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check Time Past Other</em>'.
   * @generated
   */
  CheckTimePastOther createCheckTimePastOther();

  /**
   * Returns a new object of class '<em>Check Mode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check Mode</em>'.
   * @generated
   */
  CheckMode createCheckMode();

  /**
   * Returns a new object of class '<em>Check Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check Label</em>'.
   * @generated
   */
  CheckLabel createCheckLabel();

  /**
   * Returns a new object of class '<em>Enters Mode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enters Mode</em>'.
   * @generated
   */
  EntersMode createEntersMode();

  /**
   * Returns a new object of class '<em>Press Button</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Press Button</em>'.
   * @generated
   */
	PressButton createPressButton();

	/**
   * Returns a new object of class '<em>Observe Mode</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Observe Mode</em>'.
   * @generated
   */
	ObserveMode createObserveMode();

	/**
   * Returns a new object of class '<em>Observe Button</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Observe Button</em>'.
   * @generated
   */
  ObserveButton createObserveButton();

  /**
   * Returns a new object of class '<em>Observe Label Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Observe Label Value</em>'.
   * @generated
   */
  ObserveLabelValue createObserveLabelValue();

  /**
   * Returns a new object of class '<em>Observe Label Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Observe Label Variable</em>'.
   * @generated
   */
  ObserveLabelVariable createObserveLabelVariable();

  /**
   * Returns a new object of class '<em>Observe Variable Change</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Observe Variable Change</em>'.
   * @generated
   */
  ObserveVariableChange createObserveVariableChange();

  /**
   * Returns a new object of class '<em>Observe Ring</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Observe Ring</em>'.
   * @generated
   */
  ObserveRing createObserveRing();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	SslPackage getSslPackage();

} //SslFactory
