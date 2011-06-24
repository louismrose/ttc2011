/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Testcase</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__TESTCASE = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__CONDITIONS = 1;

	/**
	 * The number of structural features of the '<em>Given</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Testcase</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__TESTCASE = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__ACTIONS = 1;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Testcase</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__TESTCASE = 0;

	/**
	 * The feature id for the '<em><b>Observations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__OBSERVATIONS = 1;

	/**
	 * The number of structural features of the '<em>Then</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Given</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__GIVEN = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ssl.impl.CheckVariableEqualsVariableImpl <em>Check Variable Equals Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.CheckVariableEqualsVariableImpl
	 * @see ssl.impl.SslPackageImpl#getCheckVariableEqualsVariable()
	 * @generated
	 */
	int CHECK_VARIABLE_EQUALS_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Given</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_VARIABLE_EQUALS_VARIABLE__GIVEN = CONDITION__GIVEN;

	/**
	 * The feature id for the '<em><b>First Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_VARIABLE_EQUALS_VARIABLE__FIRST_VARIABLE_NAME = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_VARIABLE_EQUALS_VARIABLE__SECOND_VARIABLE_NAME = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Check Variable Equals Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_VARIABLE_EQUALS_VARIABLE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ssl.impl.CheckVariableEqualsTimeImpl <em>Check Variable Equals Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.CheckVariableEqualsTimeImpl
	 * @see ssl.impl.SslPackageImpl#getCheckVariableEqualsTime()
	 * @generated
	 */
	int CHECK_VARIABLE_EQUALS_TIME = 7;

	/**
	 * The feature id for the '<em><b>Given</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_VARIABLE_EQUALS_TIME__GIVEN = CONDITION__GIVEN;

	/**
	 * The feature id for the '<em><b>First Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_VARIABLE_EQUALS_TIME__FIRST_VARIABLE_NAME = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_VARIABLE_EQUALS_TIME__TIME = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Check Variable Equals Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_VARIABLE_EQUALS_TIME_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ssl.impl.CheckModeImpl <em>Check Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.CheckModeImpl
	 * @see ssl.impl.SslPackageImpl#getCheckMode()
	 * @generated
	 */
	int CHECK_MODE = 8;

	/**
	 * The feature id for the '<em><b>Given</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_MODE__GIVEN = CONDITION__GIVEN;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_MODE__MODE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_MODE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssl.impl.CheckLabelImpl <em>Check Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.CheckLabelImpl
	 * @see ssl.impl.SslPackageImpl#getCheckLabel()
	 * @generated
	 */
	int CHECK_LABEL = 9;

	/**
	 * The feature id for the '<em><b>Given</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_LABEL__GIVEN = CONDITION__GIVEN;

	/**
	 * The feature id for the '<em><b>Label Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_LABEL__LABEL_TYPE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_LABEL__VALUE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Check Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_LABEL_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ssl.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ActionImpl
	 * @see ssl.impl.SslPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 10;

	/**
	 * The feature id for the '<em><b>When</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__WHEN = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ssl.impl.EntersModeImpl <em>Enters Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.EntersModeImpl
	 * @see ssl.impl.SslPackageImpl#getEntersMode()
	 * @generated
	 */
	int ENTERS_MODE = 11;

	/**
	 * The feature id for the '<em><b>When</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERS_MODE__WHEN = ACTION__WHEN;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERS_MODE__MODE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enters Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERS_MODE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssl.impl.PressButtonImpl <em>Press Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.PressButtonImpl
	 * @see ssl.impl.SslPackageImpl#getPressButton()
	 * @generated
	 */
	int PRESS_BUTTON = 12;

	/**
	 * The feature id for the '<em><b>When</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESS_BUTTON__WHEN = ACTION__WHEN;

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
	int OBSERVATION = 13;

	/**
	 * The feature id for the '<em><b>Then</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__THEN = 0;

	/**
	 * The number of structural features of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ssl.impl.ObserveModeImpl <em>Observe Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ObserveModeImpl
	 * @see ssl.impl.SslPackageImpl#getObserveMode()
	 * @generated
	 */
	int OBSERVE_MODE = 14;

	/**
	 * The feature id for the '<em><b>Then</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_MODE__THEN = OBSERVATION__THEN;

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
	 * The meta object id for the '{@link ssl.impl.ObserveButtonImpl <em>Observe Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ObserveButtonImpl
	 * @see ssl.impl.SslPackageImpl#getObserveButton()
	 * @generated
	 */
	int OBSERVE_BUTTON = 15;

	/**
	 * The feature id for the '<em><b>Then</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_BUTTON__THEN = OBSERVATION__THEN;

	/**
	 * The feature id for the '<em><b>Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_BUTTON__BUTTON = OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_BUTTON__NAME = OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Observe Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_BUTTON_FEATURE_COUNT = OBSERVATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ssl.impl.ObserveOutputImpl <em>Observe Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ObserveOutputImpl
	 * @see ssl.impl.SslPackageImpl#getObserveOutput()
	 * @generated
	 */
	int OBSERVE_OUTPUT = 16;

	/**
	 * The feature id for the '<em><b>Then</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_OUTPUT__THEN = OBSERVATION__THEN;

	/**
	 * The feature id for the '<em><b>Label Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_OUTPUT__LABEL_TYPE = OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Observe Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_OUTPUT_FEATURE_COUNT = OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssl.impl.ObserveLabelValueImpl <em>Observe Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ObserveLabelValueImpl
	 * @see ssl.impl.SslPackageImpl#getObserveLabelValue()
	 * @generated
	 */
	int OBSERVE_LABEL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Then</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_LABEL_VALUE__THEN = OBSERVE_OUTPUT__THEN;

	/**
	 * The feature id for the '<em><b>Label Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_LABEL_VALUE__LABEL_TYPE = OBSERVE_OUTPUT__LABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_LABEL_VALUE__VALUE = OBSERVE_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Observe Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_LABEL_VALUE_FEATURE_COUNT = OBSERVE_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssl.impl.ObserveLabelVariableImpl <em>Observe Label Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ObserveLabelVariableImpl
	 * @see ssl.impl.SslPackageImpl#getObserveLabelVariable()
	 * @generated
	 */
	int OBSERVE_LABEL_VARIABLE = 18;

	/**
	 * The feature id for the '<em><b>Then</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_LABEL_VARIABLE__THEN = OBSERVE_OUTPUT__THEN;

	/**
	 * The feature id for the '<em><b>Label Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_LABEL_VARIABLE__LABEL_TYPE = OBSERVE_OUTPUT__LABEL_TYPE;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_LABEL_VARIABLE__VARIABLE_NAME = OBSERVE_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Observe Label Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_LABEL_VARIABLE_FEATURE_COUNT = OBSERVE_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ssl.impl.ObserveVariableChangeImpl <em>Observe Variable Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ObserveVariableChangeImpl
	 * @see ssl.impl.SslPackageImpl#getObserveVariableChange()
	 * @generated
	 */
	int OBSERVE_VARIABLE_CHANGE = 19;

	/**
	 * The feature id for the '<em><b>Then</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_VARIABLE_CHANGE__THEN = OBSERVATION__THEN;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_VARIABLE_CHANGE__VARIABLE_NAME = OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_VARIABLE_CHANGE__UNIT = OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Observe Variable Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_VARIABLE_CHANGE_FEATURE_COUNT = OBSERVATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ssl.impl.ObserveRingImpl <em>Observe Ring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.impl.ObserveRingImpl
	 * @see ssl.impl.SslPackageImpl#getObserveRing()
	 * @generated
	 */
	int OBSERVE_RING = 20;

	/**
	 * The feature id for the '<em><b>Then</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_RING__THEN = OBSERVATION__THEN;

	/**
	 * The number of structural features of the '<em>Observe Ring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVE_RING_FEATURE_COUNT = OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ssl.LabelType <em>Label Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.LabelType
	 * @see ssl.impl.SslPackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 21;

	/**
	 * The meta object id for the '{@link ssl.UnitOfTime <em>Unit Of Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ssl.UnitOfTime
	 * @see ssl.impl.SslPackageImpl#getUnitOfTime()
	 * @generated
	 */
	int UNIT_OF_TIME = 22;


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
	 * Returns the meta object for the container reference '{@link ssl.Given#getTestcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Testcase</em>'.
	 * @see ssl.Given#getTestcase()
	 * @see #getGiven()
	 * @generated
	 */
	EReference getGiven_Testcase();

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
	 * Returns the meta object for the container reference '{@link ssl.When#getTestcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Testcase</em>'.
	 * @see ssl.When#getTestcase()
	 * @see #getWhen()
	 * @generated
	 */
	EReference getWhen_Testcase();

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
	 * Returns the meta object for the container reference '{@link ssl.Then#getTestcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Testcase</em>'.
	 * @see ssl.Then#getTestcase()
	 * @see #getThen()
	 * @generated
	 */
	EReference getThen_Testcase();

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
	 * Returns the meta object for the container reference '{@link ssl.Condition#getGiven <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Given</em>'.
	 * @see ssl.Condition#getGiven()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Given();

	/**
	 * Returns the meta object for class '{@link ssl.CheckVariableEqualsVariable <em>Check Variable Equals Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Variable Equals Variable</em>'.
	 * @see ssl.CheckVariableEqualsVariable
	 * @generated
	 */
	EClass getCheckVariableEqualsVariable();

	/**
	 * Returns the meta object for the attribute '{@link ssl.CheckVariableEqualsVariable#getFirstVariableName <em>First Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Variable Name</em>'.
	 * @see ssl.CheckVariableEqualsVariable#getFirstVariableName()
	 * @see #getCheckVariableEqualsVariable()
	 * @generated
	 */
	EAttribute getCheckVariableEqualsVariable_FirstVariableName();

	/**
	 * Returns the meta object for the attribute '{@link ssl.CheckVariableEqualsVariable#getSecondVariableName <em>Second Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Variable Name</em>'.
	 * @see ssl.CheckVariableEqualsVariable#getSecondVariableName()
	 * @see #getCheckVariableEqualsVariable()
	 * @generated
	 */
	EAttribute getCheckVariableEqualsVariable_SecondVariableName();

	/**
	 * Returns the meta object for class '{@link ssl.CheckVariableEqualsTime <em>Check Variable Equals Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Variable Equals Time</em>'.
	 * @see ssl.CheckVariableEqualsTime
	 * @generated
	 */
	EClass getCheckVariableEqualsTime();

	/**
	 * Returns the meta object for the attribute '{@link ssl.CheckVariableEqualsTime#getFirstVariableName <em>First Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Variable Name</em>'.
	 * @see ssl.CheckVariableEqualsTime#getFirstVariableName()
	 * @see #getCheckVariableEqualsTime()
	 * @generated
	 */
	EAttribute getCheckVariableEqualsTime_FirstVariableName();

	/**
	 * Returns the meta object for the attribute '{@link ssl.CheckVariableEqualsTime#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see ssl.CheckVariableEqualsTime#getTime()
	 * @see #getCheckVariableEqualsTime()
	 * @generated
	 */
	EAttribute getCheckVariableEqualsTime_Time();

	/**
	 * Returns the meta object for class '{@link ssl.CheckMode <em>Check Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Mode</em>'.
	 * @see ssl.CheckMode
	 * @generated
	 */
	EClass getCheckMode();

	/**
	 * Returns the meta object for the attribute '{@link ssl.CheckMode#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see ssl.CheckMode#getMode()
	 * @see #getCheckMode()
	 * @generated
	 */
	EAttribute getCheckMode_Mode();

	/**
	 * Returns the meta object for class '{@link ssl.CheckLabel <em>Check Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Label</em>'.
	 * @see ssl.CheckLabel
	 * @generated
	 */
	EClass getCheckLabel();

	/**
	 * Returns the meta object for the attribute '{@link ssl.CheckLabel#getLabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Type</em>'.
	 * @see ssl.CheckLabel#getLabelType()
	 * @see #getCheckLabel()
	 * @generated
	 */
	EAttribute getCheckLabel_LabelType();

	/**
	 * Returns the meta object for the attribute '{@link ssl.CheckLabel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ssl.CheckLabel#getValue()
	 * @see #getCheckLabel()
	 * @generated
	 */
	EAttribute getCheckLabel_Value();

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
	 * Returns the meta object for the container reference '{@link ssl.Action#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>When</em>'.
	 * @see ssl.Action#getWhen()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_When();

	/**
	 * Returns the meta object for class '{@link ssl.EntersMode <em>Enters Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enters Mode</em>'.
	 * @see ssl.EntersMode
	 * @generated
	 */
	EClass getEntersMode();

	/**
	 * Returns the meta object for the attribute '{@link ssl.EntersMode#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see ssl.EntersMode#getMode()
	 * @see #getEntersMode()
	 * @generated
	 */
	EAttribute getEntersMode_Mode();

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
	 * Returns the meta object for the container reference '{@link ssl.Observation#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Then</em>'.
	 * @see ssl.Observation#getThen()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Then();

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
	 * Returns the meta object for class '{@link ssl.ObserveButton <em>Observe Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observe Button</em>'.
	 * @see ssl.ObserveButton
	 * @generated
	 */
	EClass getObserveButton();

	/**
	 * Returns the meta object for the attribute '{@link ssl.ObserveButton#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button</em>'.
	 * @see ssl.ObserveButton#getButton()
	 * @see #getObserveButton()
	 * @generated
	 */
	EAttribute getObserveButton_Button();

	/**
	 * Returns the meta object for the attribute '{@link ssl.ObserveButton#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ssl.ObserveButton#getName()
	 * @see #getObserveButton()
	 * @generated
	 */
	EAttribute getObserveButton_Name();

	/**
	 * Returns the meta object for class '{@link ssl.ObserveOutput <em>Observe Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observe Output</em>'.
	 * @see ssl.ObserveOutput
	 * @generated
	 */
	EClass getObserveOutput();

	/**
	 * Returns the meta object for the attribute '{@link ssl.ObserveOutput#getLabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Type</em>'.
	 * @see ssl.ObserveOutput#getLabelType()
	 * @see #getObserveOutput()
	 * @generated
	 */
	EAttribute getObserveOutput_LabelType();

	/**
	 * Returns the meta object for class '{@link ssl.ObserveLabelValue <em>Observe Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observe Label Value</em>'.
	 * @see ssl.ObserveLabelValue
	 * @generated
	 */
	EClass getObserveLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link ssl.ObserveLabelValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ssl.ObserveLabelValue#getValue()
	 * @see #getObserveLabelValue()
	 * @generated
	 */
	EAttribute getObserveLabelValue_Value();

	/**
	 * Returns the meta object for class '{@link ssl.ObserveLabelVariable <em>Observe Label Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observe Label Variable</em>'.
	 * @see ssl.ObserveLabelVariable
	 * @generated
	 */
	EClass getObserveLabelVariable();

	/**
	 * Returns the meta object for the attribute '{@link ssl.ObserveLabelVariable#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see ssl.ObserveLabelVariable#getVariableName()
	 * @see #getObserveLabelVariable()
	 * @generated
	 */
	EAttribute getObserveLabelVariable_VariableName();

	/**
	 * Returns the meta object for class '{@link ssl.ObserveVariableChange <em>Observe Variable Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observe Variable Change</em>'.
	 * @see ssl.ObserveVariableChange
	 * @generated
	 */
	EClass getObserveVariableChange();

	/**
	 * Returns the meta object for the attribute '{@link ssl.ObserveVariableChange#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see ssl.ObserveVariableChange#getVariableName()
	 * @see #getObserveVariableChange()
	 * @generated
	 */
	EAttribute getObserveVariableChange_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link ssl.ObserveVariableChange#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see ssl.ObserveVariableChange#getUnit()
	 * @see #getObserveVariableChange()
	 * @generated
	 */
	EAttribute getObserveVariableChange_Unit();

	/**
	 * Returns the meta object for class '{@link ssl.ObserveRing <em>Observe Ring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observe Ring</em>'.
	 * @see ssl.ObserveRing
	 * @generated
	 */
	EClass getObserveRing();

	/**
	 * Returns the meta object for enum '{@link ssl.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Type</em>'.
	 * @see ssl.LabelType
	 * @generated
	 */
	EEnum getLabelType();

	/**
	 * Returns the meta object for enum '{@link ssl.UnitOfTime <em>Unit Of Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Of Time</em>'.
	 * @see ssl.UnitOfTime
	 * @generated
	 */
	EEnum getUnitOfTime();

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
		 * The meta object literal for the '<em><b>Testcase</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIVEN__TESTCASE = eINSTANCE.getGiven_Testcase();

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
		 * The meta object literal for the '<em><b>Testcase</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN__TESTCASE = eINSTANCE.getWhen_Testcase();

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
		 * The meta object literal for the '<em><b>Testcase</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEN__TESTCASE = eINSTANCE.getThen_Testcase();

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
		 * The meta object literal for the '<em><b>Given</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__GIVEN = eINSTANCE.getCondition_Given();

		/**
		 * The meta object literal for the '{@link ssl.impl.CheckVariableEqualsVariableImpl <em>Check Variable Equals Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.CheckVariableEqualsVariableImpl
		 * @see ssl.impl.SslPackageImpl#getCheckVariableEqualsVariable()
		 * @generated
		 */
		EClass CHECK_VARIABLE_EQUALS_VARIABLE = eINSTANCE.getCheckVariableEqualsVariable();

		/**
		 * The meta object literal for the '<em><b>First Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_VARIABLE_EQUALS_VARIABLE__FIRST_VARIABLE_NAME = eINSTANCE.getCheckVariableEqualsVariable_FirstVariableName();

		/**
		 * The meta object literal for the '<em><b>Second Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_VARIABLE_EQUALS_VARIABLE__SECOND_VARIABLE_NAME = eINSTANCE.getCheckVariableEqualsVariable_SecondVariableName();

		/**
		 * The meta object literal for the '{@link ssl.impl.CheckVariableEqualsTimeImpl <em>Check Variable Equals Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.CheckVariableEqualsTimeImpl
		 * @see ssl.impl.SslPackageImpl#getCheckVariableEqualsTime()
		 * @generated
		 */
		EClass CHECK_VARIABLE_EQUALS_TIME = eINSTANCE.getCheckVariableEqualsTime();

		/**
		 * The meta object literal for the '<em><b>First Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_VARIABLE_EQUALS_TIME__FIRST_VARIABLE_NAME = eINSTANCE.getCheckVariableEqualsTime_FirstVariableName();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_VARIABLE_EQUALS_TIME__TIME = eINSTANCE.getCheckVariableEqualsTime_Time();

		/**
		 * The meta object literal for the '{@link ssl.impl.CheckModeImpl <em>Check Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.CheckModeImpl
		 * @see ssl.impl.SslPackageImpl#getCheckMode()
		 * @generated
		 */
		EClass CHECK_MODE = eINSTANCE.getCheckMode();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_MODE__MODE = eINSTANCE.getCheckMode_Mode();

		/**
		 * The meta object literal for the '{@link ssl.impl.CheckLabelImpl <em>Check Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.CheckLabelImpl
		 * @see ssl.impl.SslPackageImpl#getCheckLabel()
		 * @generated
		 */
		EClass CHECK_LABEL = eINSTANCE.getCheckLabel();

		/**
		 * The meta object literal for the '<em><b>Label Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_LABEL__LABEL_TYPE = eINSTANCE.getCheckLabel_LabelType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_LABEL__VALUE = eINSTANCE.getCheckLabel_Value();

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
		 * The meta object literal for the '<em><b>When</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__WHEN = eINSTANCE.getAction_When();

		/**
		 * The meta object literal for the '{@link ssl.impl.EntersModeImpl <em>Enters Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.EntersModeImpl
		 * @see ssl.impl.SslPackageImpl#getEntersMode()
		 * @generated
		 */
		EClass ENTERS_MODE = eINSTANCE.getEntersMode();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTERS_MODE__MODE = eINSTANCE.getEntersMode_Mode();

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
		 * The meta object literal for the '<em><b>Then</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__THEN = eINSTANCE.getObservation_Then();

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
		 * The meta object literal for the '{@link ssl.impl.ObserveButtonImpl <em>Observe Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.ObserveButtonImpl
		 * @see ssl.impl.SslPackageImpl#getObserveButton()
		 * @generated
		 */
		EClass OBSERVE_BUTTON = eINSTANCE.getObserveButton();

		/**
		 * The meta object literal for the '<em><b>Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVE_BUTTON__BUTTON = eINSTANCE.getObserveButton_Button();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVE_BUTTON__NAME = eINSTANCE.getObserveButton_Name();

		/**
		 * The meta object literal for the '{@link ssl.impl.ObserveOutputImpl <em>Observe Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.ObserveOutputImpl
		 * @see ssl.impl.SslPackageImpl#getObserveOutput()
		 * @generated
		 */
		EClass OBSERVE_OUTPUT = eINSTANCE.getObserveOutput();

		/**
		 * The meta object literal for the '<em><b>Label Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVE_OUTPUT__LABEL_TYPE = eINSTANCE.getObserveOutput_LabelType();

		/**
		 * The meta object literal for the '{@link ssl.impl.ObserveLabelValueImpl <em>Observe Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.ObserveLabelValueImpl
		 * @see ssl.impl.SslPackageImpl#getObserveLabelValue()
		 * @generated
		 */
		EClass OBSERVE_LABEL_VALUE = eINSTANCE.getObserveLabelValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVE_LABEL_VALUE__VALUE = eINSTANCE.getObserveLabelValue_Value();

		/**
		 * The meta object literal for the '{@link ssl.impl.ObserveLabelVariableImpl <em>Observe Label Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.ObserveLabelVariableImpl
		 * @see ssl.impl.SslPackageImpl#getObserveLabelVariable()
		 * @generated
		 */
		EClass OBSERVE_LABEL_VARIABLE = eINSTANCE.getObserveLabelVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVE_LABEL_VARIABLE__VARIABLE_NAME = eINSTANCE.getObserveLabelVariable_VariableName();

		/**
		 * The meta object literal for the '{@link ssl.impl.ObserveVariableChangeImpl <em>Observe Variable Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.ObserveVariableChangeImpl
		 * @see ssl.impl.SslPackageImpl#getObserveVariableChange()
		 * @generated
		 */
		EClass OBSERVE_VARIABLE_CHANGE = eINSTANCE.getObserveVariableChange();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVE_VARIABLE_CHANGE__VARIABLE_NAME = eINSTANCE.getObserveVariableChange_VariableName();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVE_VARIABLE_CHANGE__UNIT = eINSTANCE.getObserveVariableChange_Unit();

		/**
		 * The meta object literal for the '{@link ssl.impl.ObserveRingImpl <em>Observe Ring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.impl.ObserveRingImpl
		 * @see ssl.impl.SslPackageImpl#getObserveRing()
		 * @generated
		 */
		EClass OBSERVE_RING = eINSTANCE.getObserveRing();

		/**
		 * The meta object literal for the '{@link ssl.LabelType <em>Label Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.LabelType
		 * @see ssl.impl.SslPackageImpl#getLabelType()
		 * @generated
		 */
		EEnum LABEL_TYPE = eINSTANCE.getLabelType();

		/**
		 * The meta object literal for the '{@link ssl.UnitOfTime <em>Unit Of Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ssl.UnitOfTime
		 * @see ssl.impl.SslPackageImpl#getUnitOfTime()
		 * @generated
		 */
		EEnum UNIT_OF_TIME = eINSTANCE.getUnitOfTime();

	}

} //SslPackage
