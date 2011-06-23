/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config;

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
 * @see simulator.config.ConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "simulatorConfig";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simulatorConfig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = simulator.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link simulator.config.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ConfigurationImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__MODES = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__VARIABLES = 1;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONSTANTS = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__EVENTS = 3;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ModeImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__ENTRY_ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__BUTTONS = 2;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ButtonImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BEHAVIOUR = 1;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ActionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__GUARD = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ConditionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.OutputMatchesConditionImpl <em>Output Matches Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.OutputMatchesConditionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getOutputMatchesCondition()
	 * @generated
	 */
	int OUTPUT_MATCHES_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Value To Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MATCHES_CONDITION__VALUE_TO_MATCH = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Matches Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MATCHES_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.config.impl.AndConditionImpl <em>And Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.AndConditionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getAndCondition()
	 * @generated
	 */
	int AND_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Subconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONDITION__SUBCONDITIONS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.config.impl.OrConditionImpl <em>Or Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.OrConditionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getOrCondition()
	 * @generated
	 */
	int OR_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Subconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONDITION__SUBCONDITIONS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.config.impl.NotConditionImpl <em>Not Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.NotConditionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getNotCondition()
	 * @generated
	 */
	int NOT_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Subcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION__SUBCONDITION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.config.impl.DisplayMatchesConditionImpl <em>Display Matches Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.DisplayMatchesConditionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getDisplayMatchesCondition()
	 * @generated
	 */
	int DISPLAY_MATCHES_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Value To Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_MATCHES_CONDITION__VALUE_TO_MATCH = OUTPUT_MATCHES_CONDITION__VALUE_TO_MATCH;

	/**
	 * The number of structural features of the '<em>Display Matches Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_MATCHES_CONDITION_FEATURE_COUNT = OUTPUT_MATCHES_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.IndicatorMatchesConditionImpl <em>Indicator Matches Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.IndicatorMatchesConditionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getIndicatorMatchesCondition()
	 * @generated
	 */
	int INDICATOR_MATCHES_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Value To Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_MATCHES_CONDITION__VALUE_TO_MATCH = OUTPUT_MATCHES_CONDITION__VALUE_TO_MATCH;

	/**
	 * The number of structural features of the '<em>Indicator Matches Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_MATCHES_CONDITION_FEATURE_COUNT = OUTPUT_MATCHES_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.VariableComparisonConditionImpl <em>Variable Comparison Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.VariableComparisonConditionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getVariableComparisonCondition()
	 * @generated
	 */
	int VARIABLE_COMPARISON_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_COMPARISON_CONDITION__VARIABLE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_COMPARISON_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Comparison Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_COMPARISON_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simulator.config.impl.VariableEqualsConditionImpl <em>Variable Equals Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.VariableEqualsConditionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getVariableEqualsCondition()
	 * @generated
	 */
	int VARIABLE_EQUALS_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EQUALS_CONDITION__VARIABLE = VARIABLE_COMPARISON_CONDITION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EQUALS_CONDITION__VALUE = VARIABLE_COMPARISON_CONDITION__VALUE;

	/**
	 * The number of structural features of the '<em>Variable Equals Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EQUALS_CONDITION_FEATURE_COUNT = VARIABLE_COMPARISON_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ChangeOutputActionImpl <em>Change Output Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ChangeOutputActionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getChangeOutputAction()
	 * @generated
	 */
	int CHANGE_OUTPUT_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OUTPUT_ACTION__GUARD = ACTION__GUARD;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OUTPUT_ACTION__NEW_VALUE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Output Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OUTPUT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ChangeDisplayImpl <em>Change Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ChangeDisplayImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getChangeDisplay()
	 * @generated
	 */
	int CHANGE_DISPLAY = 14;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DISPLAY__GUARD = CHANGE_OUTPUT_ACTION__GUARD;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DISPLAY__NEW_VALUE = CHANGE_OUTPUT_ACTION__NEW_VALUE;

	/**
	 * The number of structural features of the '<em>Change Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DISPLAY_FEATURE_COUNT = CHANGE_OUTPUT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ChangeIndicatorImpl <em>Change Indicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ChangeIndicatorImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getChangeIndicator()
	 * @generated
	 */
	int CHANGE_INDICATOR = 15;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INDICATOR__GUARD = CHANGE_OUTPUT_ACTION__GUARD;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INDICATOR__NEW_VALUE = CHANGE_OUTPUT_ACTION__NEW_VALUE;

	/**
	 * The number of structural features of the '<em>Change Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_INDICATOR_FEATURE_COUNT = CHANGE_OUTPUT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.NextModeImpl <em>Next Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.NextModeImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getNextMode()
	 * @generated
	 */
	int NEXT_MODE = 16;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_MODE__GUARD = ACTION__GUARD;

	/**
	 * The number of structural features of the '<em>Next Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_MODE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.SoundAlarmImpl <em>Sound Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.SoundAlarmImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getSoundAlarm()
	 * @generated
	 */
	int SOUND_ALARM = 17;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_ALARM__GUARD = ACTION__GUARD;

	/**
	 * The number of structural features of the '<em>Sound Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_ALARM_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.SilenceAlarmImpl <em>Silence Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.SilenceAlarmImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getSilenceAlarm()
	 * @generated
	 */
	int SILENCE_ALARM = 18;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILENCE_ALARM__GUARD = ACTION__GUARD;

	/**
	 * The number of structural features of the '<em>Silence Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILENCE_ALARM_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.EvaluateExpressionImpl <em>Evaluate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.EvaluateExpressionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getEvaluateExpression()
	 * @generated
	 */
	int EVALUATE_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_EXPRESSION__GUARD = ACTION__GUARD;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_EXPRESSION__EXPRESSION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_EXPRESSION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ExpressionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 20;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.IncrementTimeVariableImpl <em>Increment Time Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.IncrementTimeVariableImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getIncrementTimeVariable()
	 * @generated
	 */
	int INCREMENT_TIME_VARIABLE = 21;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_TIME_VARIABLE__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_TIME_VARIABLE__UNIT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Increment Time Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_TIME_VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simulator.config.impl.DisplayableImpl <em>Displayable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.DisplayableImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getDisplayable()
	 * @generated
	 */
	int DISPLAYABLE = 22;

	/**
	 * The number of structural features of the '<em>Displayable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ConstantImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = DISPLAYABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = DISPLAYABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.config.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.VariableImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = DISPLAYABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = DISPLAYABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.config.UnitOfTime <em>Unit Of Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.UnitOfTime
	 * @see simulator.config.impl.ConfigPackageImpl#getUnitOfTime()
	 * @generated
	 */
	int UNIT_OF_TIME = 25;


	/**
	 * Returns the meta object for class '{@link simulator.config.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see simulator.config.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.config.Configuration#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see simulator.config.Configuration#getModes()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Modes();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.config.Configuration#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see simulator.config.Configuration#getVariables()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.config.Configuration#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see simulator.config.Configuration#getConstants()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Constants();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.config.Configuration#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see simulator.config.Configuration#getEvents()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Events();

	/**
	 * Returns the meta object for class '{@link simulator.config.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see simulator.config.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for the attribute '{@link simulator.config.Mode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simulator.config.Mode#getName()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.config.Mode#getEntryActions <em>Entry Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Actions</em>'.
	 * @see simulator.config.Mode#getEntryActions()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_EntryActions();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.config.Mode#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buttons</em>'.
	 * @see simulator.config.Mode#getButtons()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_Buttons();

	/**
	 * Returns the meta object for class '{@link simulator.config.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see simulator.config.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link simulator.config.Button#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simulator.config.Button#getName()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.config.Button#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviour</em>'.
	 * @see simulator.config.Button#getBehaviour()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Behaviour();

	/**
	 * Returns the meta object for class '{@link simulator.config.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see simulator.config.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference '{@link simulator.config.Action#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see simulator.config.Action#getGuard()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Guard();

	/**
	 * Returns the meta object for class '{@link simulator.config.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see simulator.config.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link simulator.config.OutputMatchesCondition <em>Output Matches Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Matches Condition</em>'.
	 * @see simulator.config.OutputMatchesCondition
	 * @generated
	 */
	EClass getOutputMatchesCondition();

	/**
	 * Returns the meta object for the reference '{@link simulator.config.OutputMatchesCondition#getValueToMatch <em>Value To Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value To Match</em>'.
	 * @see simulator.config.OutputMatchesCondition#getValueToMatch()
	 * @see #getOutputMatchesCondition()
	 * @generated
	 */
	EReference getOutputMatchesCondition_ValueToMatch();

	/**
	 * Returns the meta object for class '{@link simulator.config.AndCondition <em>And Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Condition</em>'.
	 * @see simulator.config.AndCondition
	 * @generated
	 */
	EClass getAndCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.config.AndCondition#getSubconditions <em>Subconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subconditions</em>'.
	 * @see simulator.config.AndCondition#getSubconditions()
	 * @see #getAndCondition()
	 * @generated
	 */
	EReference getAndCondition_Subconditions();

	/**
	 * Returns the meta object for class '{@link simulator.config.OrCondition <em>Or Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Condition</em>'.
	 * @see simulator.config.OrCondition
	 * @generated
	 */
	EClass getOrCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.config.OrCondition#getSubconditions <em>Subconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subconditions</em>'.
	 * @see simulator.config.OrCondition#getSubconditions()
	 * @see #getOrCondition()
	 * @generated
	 */
	EReference getOrCondition_Subconditions();

	/**
	 * Returns the meta object for class '{@link simulator.config.NotCondition <em>Not Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Condition</em>'.
	 * @see simulator.config.NotCondition
	 * @generated
	 */
	EClass getNotCondition();

	/**
	 * Returns the meta object for the containment reference '{@link simulator.config.NotCondition#getSubcondition <em>Subcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subcondition</em>'.
	 * @see simulator.config.NotCondition#getSubcondition()
	 * @see #getNotCondition()
	 * @generated
	 */
	EReference getNotCondition_Subcondition();

	/**
	 * Returns the meta object for class '{@link simulator.config.DisplayMatchesCondition <em>Display Matches Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Matches Condition</em>'.
	 * @see simulator.config.DisplayMatchesCondition
	 * @generated
	 */
	EClass getDisplayMatchesCondition();

	/**
	 * Returns the meta object for class '{@link simulator.config.IndicatorMatchesCondition <em>Indicator Matches Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indicator Matches Condition</em>'.
	 * @see simulator.config.IndicatorMatchesCondition
	 * @generated
	 */
	EClass getIndicatorMatchesCondition();

	/**
	 * Returns the meta object for class '{@link simulator.config.VariableComparisonCondition <em>Variable Comparison Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Comparison Condition</em>'.
	 * @see simulator.config.VariableComparisonCondition
	 * @generated
	 */
	EClass getVariableComparisonCondition();

	/**
	 * Returns the meta object for the reference '{@link simulator.config.VariableComparisonCondition#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see simulator.config.VariableComparisonCondition#getVariable()
	 * @see #getVariableComparisonCondition()
	 * @generated
	 */
	EReference getVariableComparisonCondition_Variable();

	/**
	 * Returns the meta object for the reference '{@link simulator.config.VariableComparisonCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see simulator.config.VariableComparisonCondition#getValue()
	 * @see #getVariableComparisonCondition()
	 * @generated
	 */
	EReference getVariableComparisonCondition_Value();

	/**
	 * Returns the meta object for class '{@link simulator.config.VariableEqualsCondition <em>Variable Equals Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Equals Condition</em>'.
	 * @see simulator.config.VariableEqualsCondition
	 * @generated
	 */
	EClass getVariableEqualsCondition();

	/**
	 * Returns the meta object for class '{@link simulator.config.ChangeOutputAction <em>Change Output Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Output Action</em>'.
	 * @see simulator.config.ChangeOutputAction
	 * @generated
	 */
	EClass getChangeOutputAction();

	/**
	 * Returns the meta object for the reference '{@link simulator.config.ChangeOutputAction#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Value</em>'.
	 * @see simulator.config.ChangeOutputAction#getNewValue()
	 * @see #getChangeOutputAction()
	 * @generated
	 */
	EReference getChangeOutputAction_NewValue();

	/**
	 * Returns the meta object for class '{@link simulator.config.ChangeDisplay <em>Change Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Display</em>'.
	 * @see simulator.config.ChangeDisplay
	 * @generated
	 */
	EClass getChangeDisplay();

	/**
	 * Returns the meta object for class '{@link simulator.config.ChangeIndicator <em>Change Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Indicator</em>'.
	 * @see simulator.config.ChangeIndicator
	 * @generated
	 */
	EClass getChangeIndicator();

	/**
	 * Returns the meta object for class '{@link simulator.config.NextMode <em>Next Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next Mode</em>'.
	 * @see simulator.config.NextMode
	 * @generated
	 */
	EClass getNextMode();

	/**
	 * Returns the meta object for class '{@link simulator.config.SoundAlarm <em>Sound Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound Alarm</em>'.
	 * @see simulator.config.SoundAlarm
	 * @generated
	 */
	EClass getSoundAlarm();

	/**
	 * Returns the meta object for class '{@link simulator.config.SilenceAlarm <em>Silence Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Silence Alarm</em>'.
	 * @see simulator.config.SilenceAlarm
	 * @generated
	 */
	EClass getSilenceAlarm();

	/**
	 * Returns the meta object for class '{@link simulator.config.EvaluateExpression <em>Evaluate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluate Expression</em>'.
	 * @see simulator.config.EvaluateExpression
	 * @generated
	 */
	EClass getEvaluateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link simulator.config.EvaluateExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see simulator.config.EvaluateExpression#getExpression()
	 * @see #getEvaluateExpression()
	 * @generated
	 */
	EReference getEvaluateExpression_Expression();

	/**
	 * Returns the meta object for class '{@link simulator.config.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see simulator.config.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link simulator.config.IncrementTimeVariable <em>Increment Time Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment Time Variable</em>'.
	 * @see simulator.config.IncrementTimeVariable
	 * @generated
	 */
	EClass getIncrementTimeVariable();

	/**
	 * Returns the meta object for the reference '{@link simulator.config.IncrementTimeVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see simulator.config.IncrementTimeVariable#getVariable()
	 * @see #getIncrementTimeVariable()
	 * @generated
	 */
	EReference getIncrementTimeVariable_Variable();

	/**
	 * Returns the meta object for the attribute '{@link simulator.config.IncrementTimeVariable#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see simulator.config.IncrementTimeVariable#getUnit()
	 * @see #getIncrementTimeVariable()
	 * @generated
	 */
	EAttribute getIncrementTimeVariable_Unit();

	/**
	 * Returns the meta object for class '{@link simulator.config.Displayable <em>Displayable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Displayable</em>'.
	 * @see simulator.config.Displayable
	 * @generated
	 */
	EClass getDisplayable();

	/**
	 * Returns the meta object for class '{@link simulator.config.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see simulator.config.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link simulator.config.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see simulator.config.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for class '{@link simulator.config.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see simulator.config.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link simulator.config.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simulator.config.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for enum '{@link simulator.config.UnitOfTime <em>Unit Of Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Of Time</em>'.
	 * @see simulator.config.UnitOfTime
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
	ConfigFactory getConfigFactory();

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
		 * The meta object literal for the '{@link simulator.config.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.ConfigurationImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__MODES = eINSTANCE.getConfiguration_Modes();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__VARIABLES = eINSTANCE.getConfiguration_Variables();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONSTANTS = eINSTANCE.getConfiguration_Constants();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__EVENTS = eINSTANCE.getConfiguration_Events();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.ModeImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getMode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE__NAME = eINSTANCE.getMode_Name();

		/**
		 * The meta object literal for the '<em><b>Entry Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__ENTRY_ACTIONS = eINSTANCE.getMode_EntryActions();

		/**
		 * The meta object literal for the '<em><b>Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__BUTTONS = eINSTANCE.getMode_Buttons();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.ButtonImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__NAME = eINSTANCE.getButton_Name();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__BEHAVIOUR = eINSTANCE.getButton_Behaviour();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.ActionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__GUARD = eINSTANCE.getAction_Guard();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.ConditionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.OutputMatchesConditionImpl <em>Output Matches Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.OutputMatchesConditionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getOutputMatchesCondition()
		 * @generated
		 */
		EClass OUTPUT_MATCHES_CONDITION = eINSTANCE.getOutputMatchesCondition();

		/**
		 * The meta object literal for the '<em><b>Value To Match</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_MATCHES_CONDITION__VALUE_TO_MATCH = eINSTANCE.getOutputMatchesCondition_ValueToMatch();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.AndConditionImpl <em>And Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.AndConditionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getAndCondition()
		 * @generated
		 */
		EClass AND_CONDITION = eINSTANCE.getAndCondition();

		/**
		 * The meta object literal for the '<em><b>Subconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_CONDITION__SUBCONDITIONS = eINSTANCE.getAndCondition_Subconditions();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.OrConditionImpl <em>Or Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.OrConditionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getOrCondition()
		 * @generated
		 */
		EClass OR_CONDITION = eINSTANCE.getOrCondition();

		/**
		 * The meta object literal for the '<em><b>Subconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_CONDITION__SUBCONDITIONS = eINSTANCE.getOrCondition_Subconditions();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.NotConditionImpl <em>Not Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.NotConditionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getNotCondition()
		 * @generated
		 */
		EClass NOT_CONDITION = eINSTANCE.getNotCondition();

		/**
		 * The meta object literal for the '<em><b>Subcondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_CONDITION__SUBCONDITION = eINSTANCE.getNotCondition_Subcondition();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.DisplayMatchesConditionImpl <em>Display Matches Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.DisplayMatchesConditionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getDisplayMatchesCondition()
		 * @generated
		 */
		EClass DISPLAY_MATCHES_CONDITION = eINSTANCE.getDisplayMatchesCondition();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.IndicatorMatchesConditionImpl <em>Indicator Matches Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.IndicatorMatchesConditionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getIndicatorMatchesCondition()
		 * @generated
		 */
		EClass INDICATOR_MATCHES_CONDITION = eINSTANCE.getIndicatorMatchesCondition();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.VariableComparisonConditionImpl <em>Variable Comparison Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.VariableComparisonConditionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getVariableComparisonCondition()
		 * @generated
		 */
		EClass VARIABLE_COMPARISON_CONDITION = eINSTANCE.getVariableComparisonCondition();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_COMPARISON_CONDITION__VARIABLE = eINSTANCE.getVariableComparisonCondition_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_COMPARISON_CONDITION__VALUE = eINSTANCE.getVariableComparisonCondition_Value();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.VariableEqualsConditionImpl <em>Variable Equals Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.VariableEqualsConditionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getVariableEqualsCondition()
		 * @generated
		 */
		EClass VARIABLE_EQUALS_CONDITION = eINSTANCE.getVariableEqualsCondition();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.ChangeOutputActionImpl <em>Change Output Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.ChangeOutputActionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getChangeOutputAction()
		 * @generated
		 */
		EClass CHANGE_OUTPUT_ACTION = eINSTANCE.getChangeOutputAction();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_OUTPUT_ACTION__NEW_VALUE = eINSTANCE.getChangeOutputAction_NewValue();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.ChangeDisplayImpl <em>Change Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.ChangeDisplayImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getChangeDisplay()
		 * @generated
		 */
		EClass CHANGE_DISPLAY = eINSTANCE.getChangeDisplay();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.ChangeIndicatorImpl <em>Change Indicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.ChangeIndicatorImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getChangeIndicator()
		 * @generated
		 */
		EClass CHANGE_INDICATOR = eINSTANCE.getChangeIndicator();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.NextModeImpl <em>Next Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.NextModeImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getNextMode()
		 * @generated
		 */
		EClass NEXT_MODE = eINSTANCE.getNextMode();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.SoundAlarmImpl <em>Sound Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.SoundAlarmImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getSoundAlarm()
		 * @generated
		 */
		EClass SOUND_ALARM = eINSTANCE.getSoundAlarm();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.SilenceAlarmImpl <em>Silence Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.SilenceAlarmImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getSilenceAlarm()
		 * @generated
		 */
		EClass SILENCE_ALARM = eINSTANCE.getSilenceAlarm();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.EvaluateExpressionImpl <em>Evaluate Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.EvaluateExpressionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getEvaluateExpression()
		 * @generated
		 */
		EClass EVALUATE_EXPRESSION = eINSTANCE.getEvaluateExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATE_EXPRESSION__EXPRESSION = eINSTANCE.getEvaluateExpression_Expression();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.ExpressionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.IncrementTimeVariableImpl <em>Increment Time Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.IncrementTimeVariableImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getIncrementTimeVariable()
		 * @generated
		 */
		EClass INCREMENT_TIME_VARIABLE = eINSTANCE.getIncrementTimeVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCREMENT_TIME_VARIABLE__VARIABLE = eINSTANCE.getIncrementTimeVariable_Variable();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCREMENT_TIME_VARIABLE__UNIT = eINSTANCE.getIncrementTimeVariable_Unit();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.DisplayableImpl <em>Displayable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.DisplayableImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getDisplayable()
		 * @generated
		 */
		EClass DISPLAYABLE = eINSTANCE.getDisplayable();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.ConstantImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.VariableImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link simulator.config.UnitOfTime <em>Unit Of Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.UnitOfTime
		 * @see simulator.config.impl.ConfigPackageImpl#getUnitOfTime()
		 * @generated
		 */
		EEnum UNIT_OF_TIME = eINSTANCE.getUnitOfTime();

	}

} //ConfigPackage
