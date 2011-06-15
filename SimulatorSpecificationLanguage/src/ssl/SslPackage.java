/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ssl.SslFactory
 * @model kind="package"
 * @generated
 */
public interface SslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ssl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ssl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ssl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SslPackage eINSTANCE = ssl.impl.SslPackageImpl.init();

	/**
	 * The meta object id for the '{@link ssl.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.SpecificationImpl
	 * @see ssl.impl.SslPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Testcases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__TESTCASES = 0;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ssl.impl.TestcaseImpl <em>Testcase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.TestcaseImpl
	 * @see ssl.impl.SslPackageImpl#getTestcase()
	 * @generated
	 */
	int TESTCASE = 1;

	/**
	 * The feature id for the '<em><b>Given</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTCASE__GIVEN = 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTCASE__WHEN = 1;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTCASE__THEN = 2;

	/**
	 * The number of structural features of the '<em>Testcase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTCASE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ssl.impl.GivenImpl <em>Given</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.GivenImpl
	 * @see ssl.impl.SslPackageImpl#getGiven()
	 * @generated
	 */
	int GIVEN = 2;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__CONDITIONS = 0;

	/**
	 * The number of structural features of the '<em>Given</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ssl.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.WhenImpl
	 * @see ssl.impl.SslPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ssl.impl.ThenImpl <em>Then</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ThenImpl
	 * @see ssl.impl.SslPackageImpl#getThen()
	 * @generated
	 */
	int THEN = 4;

	/**
	 * The feature id for the '<em><b>Observations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__OBSERVATIONS = 0;

	/**
	 * The number of structural features of the '<em>Then</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ssl.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ConditionImpl
	 * @see ssl.impl.SslPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 5;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssl.impl.SetModeImpl <em>Set Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.SetModeImpl
	 * @see ssl.impl.SslPackageImpl#getSetMode()
	 * @generated
	 */
	int SET_MODE = 6;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MODE__MODE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MODE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssl.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ActionImpl
	 * @see ssl.impl.SslPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssl.impl.PressButtonImpl <em>Press Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.PressButtonImpl
	 * @see ssl.impl.SslPackageImpl#getPressButton()
	 * @generated
	 */
	int PRESS_BUTTON = 8;

	/**
	 * The feature id for the '<em><b>Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESS_BUTTON__BUTTON = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Press Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESS_BUTTON_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssl.impl.ObservationImpl <em>Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ObservationImpl
	 * @see ssl.impl.SslPackageImpl#getObservation()
	 * @generated
	 */
	int OBSERVATION = 9;

	/**
	 * The number of structural features of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ssl.impl.ObserveModeImpl <em>Observe Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ObserveModeImpl
	 * @see ssl.impl.SslPackageImpl#getObserveMode()
	 * @generated
	 */
	int OBSERVE_MODE = 10;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_MODE__MODE = OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Observe Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_MODE_FEATURE_COUNT = OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssl.impl.ObserveBindingImpl <em>Observe Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ObserveBindingImpl
	 * @see ssl.impl.SslPackageImpl#getObserveBinding()
	 * @generated
	 */
	int OBSERVE_BINDING = 11;

	/**
	 * The feature id for the '<em><b>Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_BINDING__BUTTON = OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_BINDING__NAME = OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Observe Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_BINDING_FEATURE_COUNT = OBSERVATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ssl.impl.ObserveDisplayImpl <em>Observe Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ObserveDisplayImpl
	 * @see ssl.impl.SslPackageImpl#getObserveDisplay()
	 * @generated
	 */
	int OBSERVE_DISPLAY = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_DISPLAY__VALUE = OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Observe Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_DISPLAY_FEATURE_COUNT = OBSERVATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link ssl.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see ssl.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link ssl.Specification#getTestcases <em>Testcases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Testcases</em>'.
	 * @see ssl.Specification#getTestcases()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Testcases();

	/**
	 * Returns the meta object for class '{@link ssl.Testcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testcase</em>'.
	 * @see ssl.Testcase
	 * @generated
	 */
	EClass getTestcase();

	/**
	 * Returns the meta object for the containment reference '{@link ssl.Testcase#getGiven <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Given</em>'.
	 * @see ssl.Testcase#getGiven()
	 * @see #getTestcase()
	 * @generated
	 */
	EReference getTestcase_Given();

	/**
	 * Returns the meta object for the containment reference '{@link ssl.Testcase#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see ssl.Testcase#getWhen()
	 * @see #getTestcase()
	 * @generated
	 */
	EReference getTestcase_When();

	/**
	 * Returns the meta object for the containment reference '{@link ssl.Testcase#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see ssl.Testcase#getThen()
	 * @see #getTestcase()
	 * @generated
	 */
	EReference getTestcase_Then();

	/**
	 * Returns the meta object for class '{@link ssl.Given <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Given</em>'.
	 * @see ssl.Given
	 * @generated
	 */
	EClass getGiven();

	/**
	 * Returns the meta object for the containment reference list '{@link ssl.Given#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see ssl.Given#getConditions()
	 * @see #getGiven()
	 * @generated
	 */
	EReference getGiven_Conditions();

	/**
	 * Returns the meta object for class '{@link ssl.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see ssl.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for the containment reference list '{@link ssl.When#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see ssl.When#getActions()
	 * @see #getWhen()
	 * @generated
	 */
	EReference getWhen_Actions();

	/**
	 * Returns the meta object for class '{@link ssl.Then <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Then</em>'.
	 * @see ssl.Then
	 * @generated
	 */
	EClass getThen();

	/**
	 * Returns the meta object for the containment reference list '{@link ssl.Then#getObservations <em>Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observations</em>'.
	 * @see ssl.Then#getObservations()
	 * @see #getThen()
	 * @generated
	 */
	EReference getThen_Observations();

	/**
	 * Returns the meta object for class '{@link ssl.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see ssl.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link ssl.SetMode <em>Set Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Mode</em>'.
	 * @see ssl.SetMode
	 * @generated
	 */
	EClass getSetMode();

	/**
	 * Returns the meta object for the attribute '{@link ssl.SetMode#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see ssl.SetMode#getMode()
	 * @see #getSetMode()
	 * @generated
	 */
	EAttribute getSetMode_Mode();

	/**
	 * Returns the meta object for class '{@link ssl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ssl.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link ssl.PressButton <em>Press Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Press Button</em>'.
	 * @see ssl.PressButton
	 * @generated
	 */
	EClass getPressButton();

	/**
	 * Returns the meta object for the attribute '{@link ssl.PressButton#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button</em>'.
	 * @see ssl.PressButton#getButton()
	 * @see #getPressButton()
	 * @generated
	 */
	EAttribute getPressButton_Button();

	/**
	 * Returns the meta object for class '{@link ssl.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation</em>'.
	 * @see ssl.Observation
	 * @generated
	 */
	EClass getObservation();

	/**
	 * Returns the meta object for class '{@link ssl.ObserveMode <em>Observe Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observe Mode</em>'.
	 * @see ssl.ObserveMode
	 * @generated
	 */
	EClass getObserveMode();

	/**
	 * Returns the meta object for the attribute '{@link ssl.ObserveMode#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see ssl.ObserveMode#getMode()
	 * @see #getObserveMode()
	 * @generated
	 */
	EAttribute getObserveMode_Mode();

	/**
	 * Returns the meta object for class '{@link ssl.ObserveBinding <em>Observe Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observe Binding</em>'.
	 * @see ssl.ObserveBinding
	 * @generated
	 */
	EClass getObserveBinding();

	/**
	 * Returns the meta object for the attribute '{@link ssl.ObserveBinding#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button</em>'.
	 * @see ssl.ObserveBinding#getButton()
	 * @see #getObserveBinding()
	 * @generated
	 */
	EAttribute getObserveBinding_Button();

	/**
	 * Returns the meta object for the attribute '{@link ssl.ObserveBinding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ssl.ObserveBinding#getName()
	 * @see #getObserveBinding()
	 * @generated
	 */
	EAttribute getObserveBinding_Name();

	/**
	 * Returns the meta object for class '{@link ssl.ObserveDisplay <em>Observe Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observe Display</em>'.
	 * @see ssl.ObserveDisplay
	 * @generated
	 */
	EClass getObserveDisplay();

	/**
	 * Returns the meta object for the attribute '{@link ssl.ObserveDisplay#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ssl.ObserveDisplay#getValue()
	 * @see #getObserveDisplay()
	 * @generated
	 */
	EAttribute getObserveDisplay_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SslFactory getSslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ssl.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.SpecificationImpl
		 * @see ssl.impl.SslPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Testcases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__TESTCASES = eINSTANCE.getSpecification_Testcases();

		/**
		 * The meta object literal for the '{@link ssl.impl.TestcaseImpl <em>Testcase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.TestcaseImpl
		 * @see ssl.impl.SslPackageImpl#getTestcase()
		 * @generated
		 */
		EClass TESTCASE = eINSTANCE.getTestcase();

		/**
		 * The meta object literal for the '<em><b>Given</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTCASE__GIVEN = eINSTANCE.getTestcase_Given();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTCASE__WHEN = eINSTANCE.getTestcase_When();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTCASE__THEN = eINSTANCE.getTestcase_Then();

		/**
		 * The meta object literal for the '{@link ssl.impl.GivenImpl <em>Given</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.GivenImpl
		 * @see ssl.impl.SslPackageImpl#getGiven()
		 * @generated
		 */
		EClass GIVEN = eINSTANCE.getGiven();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIVEN__CONDITIONS = eINSTANCE.getGiven_Conditions();

		/**
		 * The meta object literal for the '{@link ssl.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.WhenImpl
		 * @see ssl.impl.SslPackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN__ACTIONS = eINSTANCE.getWhen_Actions();

		/**
		 * The meta object literal for the '{@link ssl.impl.ThenImpl <em>Then</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.ThenImpl
		 * @see ssl.impl.SslPackageImpl#getThen()
		 * @generated
		 */
		EClass THEN = eINSTANCE.getThen();

		/**
		 * The meta object literal for the '<em><b>Observations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEN__OBSERVATIONS = eINSTANCE.getThen_Observations();

		/**
		 * The meta object literal for the '{@link ssl.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.ConditionImpl
		 * @see ssl.impl.SslPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link ssl.impl.SetModeImpl <em>Set Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.SetModeImpl
		 * @see ssl.impl.SslPackageImpl#getSetMode()
		 * @generated
		 */
		EClass SET_MODE = eINSTANCE.getSetMode();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_MODE__MODE = eINSTANCE.getSetMode_Mode();

		/**
		 * The meta object literal for the '{@link ssl.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.ActionImpl
		 * @see ssl.impl.SslPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link ssl.impl.PressButtonImpl <em>Press Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.PressButtonImpl
		 * @see ssl.impl.SslPackageImpl#getPressButton()
		 * @generated
		 */
		EClass PRESS_BUTTON = eINSTANCE.getPressButton();

		/**
		 * The meta object literal for the '<em><b>Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESS_BUTTON__BUTTON = eINSTANCE.getPressButton_Button();

		/**
		 * The meta object literal for the '{@link ssl.impl.ObservationImpl <em>Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.ObservationImpl
		 * @see ssl.impl.SslPackageImpl#getObservation()
		 * @generated
		 */
		EClass OBSERVATION = eINSTANCE.getObservation();

		/**
		 * The meta object literal for the '{@link ssl.impl.ObserveModeImpl <em>Observe Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.ObserveModeImpl
		 * @see ssl.impl.SslPackageImpl#getObserveMode()
		 * @generated
		 */
		EClass OBSERVE_MODE = eINSTANCE.getObserveMode();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVE_MODE__MODE = eINSTANCE.getObserveMode_Mode();

		/**
		 * The meta object literal for the '{@link ssl.impl.ObserveBindingImpl <em>Observe Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.ObserveBindingImpl
		 * @see ssl.impl.SslPackageImpl#getObserveBinding()
		 * @generated
		 */
		EClass OBSERVE_BINDING = eINSTANCE.getObserveBinding();

		/**
		 * The meta object literal for the '<em><b>Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVE_BINDING__BUTTON = eINSTANCE.getObserveBinding_Button();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVE_BINDING__NAME = eINSTANCE.getObserveBinding_Name();

		/**
		 * The meta object literal for the '{@link ssl.impl.ObserveDisplayImpl <em>Observe Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.ObserveDisplayImpl
		 * @see ssl.impl.SslPackageImpl#getObserveDisplay()
		 * @generated
		 */
		EClass OBSERVE_DISPLAY = eINSTANCE.getObserveDisplay();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVE_DISPLAY__VALUE = eINSTANCE.getObserveDisplay_Value();

	}

} //SslPackage
