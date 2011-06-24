/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.scl;

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
 * @see simulator.scl.ConfigFactory
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
	ConfigPackage eINSTANCE = simulator.scl.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link simulator.scl.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.ConfigurationImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getConfiguration()
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
	 * The meta object id for the '{@link simulator.scl.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.ModeImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getMode()
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
	 * The meta object id for the '{@link simulator.scl.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.ButtonImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getButton()
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
	 * The meta object id for the '{@link simulator.scl.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.ActionImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getAction()
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
	 * The meta object id for the '{@link simulator.scl.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.ConditionImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getCondition()
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
	 * The meta object id for the '{@link simulator.scl.impl.OutputMatchesConditionImpl <em>Output Matches Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.OutputMatchesConditionImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getOutputMatchesCondition()
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
	 * The meta object id for the '{@link simulator.scl.impl.AndConditionImpl <em>And Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.AndConditionImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getAndCondition()
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
	 * The meta object id for the '{@link simulator.scl.impl.OrConditionImpl <em>Or Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.OrConditionImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getOrCondition()
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
	 * The meta object id for the '{@link simulator.scl.impl.NotConditionImpl <em>Not Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.NotConditionImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getNotCondition()
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
	 * The meta object id for the '{@link simulator.scl.impl.DisplayMatchesConditionImpl <em>Display Matches Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.DisplayMatchesConditionImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getDisplayMatchesCondition()
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
	 * The meta object id for the '{@link simulator.scl.impl.IndicatorMatchesConditionImpl <em>Indicator Matches Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.IndicatorMatchesConditionImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getIndicatorMatchesCondition()
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
	 * The meta object id for the '{@link simulator.scl.impl.VariableComparisonConditionImpl <em>Variable Comparison Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.VariableComparisonConditionImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getVariableComparisonCondition()
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
	 * The meta object id for the '{@link simulator.scl.impl.VariableEqualsConditionImpl <em>Variable Equals Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.VariableEqualsConditionImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getVariableEqualsCondition()
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
	 * The meta object id for the '{@link simulator.scl.impl.ChangeOutputActionImpl <em>Change Output Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.ChangeOutputActionImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getChangeOutputAction()
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
	 * The meta object id for the '{@link simulator.scl.impl.ChangeDisplayImpl <em>Change Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.ChangeDisplayImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getChangeDisplay()
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
	 * The meta object id for the '{@link simulator.scl.impl.ChangeIndicatorImpl <em>Change Indicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.ChangeIndicatorImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getChangeIndicator()
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
	 * The meta object id for the '{@link simulator.scl.impl.NextModeImpl <em>Next Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.NextModeImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getNextMode()
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
	 * The meta object id for the '{@link simulator.scl.impl.SoundAlarmImpl <em>Sound Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.SoundAlarmImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getSoundAlarm()
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
	 * The meta object id for the '{@link simulator.scl.impl.SilenceAlarmImpl <em>Silence Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.SilenceAlarmImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getSilenceAlarm()
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
	 * The meta object id for the '{@link simulator.scl.impl.EvaluateExpressionImpl <em>Evaluate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.EvaluateExpressionImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getEvaluateExpression()
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
	 * The meta object id for the '{@link simulator.scl.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.ExpressionImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getExpression()
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
	 * The meta object id for the '{@link simulator.scl.impl.IncrementTimeVariableImpl <em>Increment Time Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.IncrementTimeVariableImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getIncrementTimeVariable()
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
	 * The meta object id for the '{@link simulator.scl.impl.DisplayableImpl <em>Displayable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.DisplayableImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getDisplayable()
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
	 * The meta object id for the '{@link simulator.scl.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.ConstantImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 23;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = DISPLAYABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.scl.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.StringConstantImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.scl.impl.TimeConstantImpl <em>Time Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.TimeConstantImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getTimeConstant()
	 * @generated
	 */
	int TIME_CONSTANT = 25;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTANT__HOURS = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTANT__MINUTES = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simulator.scl.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.impl.VariableImpl
	 * @see simulator.scl.impl.ConfigPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 26;

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
	 * The meta object id for the '{@link simulator.scl.UnitOfTime <em>Unit Of Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.scl.UnitOfTime
	 * @see simulator.scl.impl.ConfigPackageImpl#getUnitOfTime()
	 * @generated
	 */
	int UNIT_OF_TIME = 27;


	/**
	 * Returns the meta object for class '{@link simulator.scl.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see simulator.scl.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.scl.Configuration#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see simulator.scl.Configuration#getModes()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Modes();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.scl.Configuration#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see simulator.scl.Configuration#getVariables()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.scl.Configuration#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see simulator.scl.Configuration#getConstants()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Constants();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.scl.Configuration#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see simulator.scl.Configuration#getEvents()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Events();

	/**
	 * Returns the meta object for class '{@link simulator.scl.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see simulator.scl.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for the attribute '{@link simulator.scl.Mode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simulator.scl.Mode#getName()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.scl.Mode#getEntryActions <em>Entry Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Actions</em>'.
	 * @see simulator.scl.Mode#getEntryActions()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_EntryActions();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.scl.Mode#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buttons</em>'.
	 * @see simulator.scl.Mode#getButtons()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_Buttons();

	/**
	 * Returns the meta object for class '{@link simulator.scl.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see simulator.scl.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link simulator.scl.Button#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simulator.scl.Button#getName()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.scl.Button#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviour</em>'.
	 * @see simulator.scl.Button#getBehaviour()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Behaviour();

	/**
	 * Returns the meta object for class '{@link simulator.scl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see simulator.scl.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference '{@link simulator.scl.Action#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see simulator.scl.Action#getGuard()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Guard();

	/**
	 * Returns the meta object for class '{@link simulator.scl.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see simulator.scl.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link simulator.scl.OutputMatchesCondition <em>Output Matches Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Matches Condition</em>'.
	 * @see simulator.scl.OutputMatchesCondition
	 * @generated
	 */
	EClass getOutputMatchesCondition();

	/**
	 * Returns the meta object for the reference '{@link simulator.scl.OutputMatchesCondition#getValueToMatch <em>Value To Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value To Match</em>'.
	 * @see simulator.scl.OutputMatchesCondition#getValueToMatch()
	 * @see #getOutputMatchesCondition()
	 * @generated
	 */
	EReference getOutputMatchesCondition_ValueToMatch();

	/**
	 * Returns the meta object for class '{@link simulator.scl.AndCondition <em>And Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Condition</em>'.
	 * @see simulator.scl.AndCondition
	 * @generated
	 */
	EClass getAndCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.scl.AndCondition#getSubconditions <em>Subconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subconditions</em>'.
	 * @see simulator.scl.AndCondition#getSubconditions()
	 * @see #getAndCondition()
	 * @generated
	 */
	EReference getAndCondition_Subconditions();

	/**
	 * Returns the meta object for class '{@link simulator.scl.OrCondition <em>Or Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Condition</em>'.
	 * @see simulator.scl.OrCondition
	 * @generated
	 */
	EClass getOrCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.scl.OrCondition#getSubconditions <em>Subconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subconditions</em>'.
	 * @see simulator.scl.OrCondition#getSubconditions()
	 * @see #getOrCondition()
	 * @generated
	 */
	EReference getOrCondition_Subconditions();

	/**
	 * Returns the meta object for class '{@link simulator.scl.NotCondition <em>Not Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Condition</em>'.
	 * @see simulator.scl.NotCondition
	 * @generated
	 */
	EClass getNotCondition();

	/**
	 * Returns the meta object for the containment reference '{@link simulator.scl.NotCondition#getSubcondition <em>Subcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subcondition</em>'.
	 * @see simulator.scl.NotCondition#getSubcondition()
	 * @see #getNotCondition()
	 * @generated
	 */
	EReference getNotCondition_Subcondition();

	/**
	 * Returns the meta object for class '{@link simulator.scl.DisplayMatchesCondition <em>Display Matches Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Matches Condition</em>'.
	 * @see simulator.scl.DisplayMatchesCondition
	 * @generated
	 */
	EClass getDisplayMatchesCondition();

	/**
	 * Returns the meta object for class '{@link simulator.scl.IndicatorMatchesCondition <em>Indicator Matches Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indicator Matches Condition</em>'.
	 * @see simulator.scl.IndicatorMatchesCondition
	 * @generated
	 */
	EClass getIndicatorMatchesCondition();

	/**
	 * Returns the meta object for class '{@link simulator.scl.VariableComparisonCondition <em>Variable Comparison Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Comparison Condition</em>'.
	 * @see simulator.scl.VariableComparisonCondition
	 * @generated
	 */
	EClass getVariableComparisonCondition();

	/**
	 * Returns the meta object for the reference '{@link simulator.scl.VariableComparisonCondition#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see simulator.scl.VariableComparisonCondition#getVariable()
	 * @see #getVariableComparisonCondition()
	 * @generated
	 */
	EReference getVariableComparisonCondition_Variable();

	/**
	 * Returns the meta object for the reference '{@link simulator.scl.VariableComparisonCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see simulator.scl.VariableComparisonCondition#getValue()
	 * @see #getVariableComparisonCondition()
	 * @generated
	 */
	EReference getVariableComparisonCondition_Value();

	/**
	 * Returns the meta object for class '{@link simulator.scl.VariableEqualsCondition <em>Variable Equals Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Equals Condition</em>'.
	 * @see simulator.scl.VariableEqualsCondition
	 * @generated
	 */
	EClass getVariableEqualsCondition();

	/**
	 * Returns the meta object for class '{@link simulator.scl.ChangeOutputAction <em>Change Output Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Output Action</em>'.
	 * @see simulator.scl.ChangeOutputAction
	 * @generated
	 */
	EClass getChangeOutputAction();

	/**
	 * Returns the meta object for the reference '{@link simulator.scl.ChangeOutputAction#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Value</em>'.
	 * @see simulator.scl.ChangeOutputAction#getNewValue()
	 * @see #getChangeOutputAction()
	 * @generated
	 */
	EReference getChangeOutputAction_NewValue();

	/**
	 * Returns the meta object for class '{@link simulator.scl.ChangeDisplay <em>Change Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Display</em>'.
	 * @see simulator.scl.ChangeDisplay
	 * @generated
	 */
	EClass getChangeDisplay();

	/**
	 * Returns the meta object for class '{@link simulator.scl.ChangeIndicator <em>Change Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Indicator</em>'.
	 * @see simulator.scl.ChangeIndicator
	 * @generated
	 */
	EClass getChangeIndicator();

	/**
	 * Returns the meta object for class '{@link simulator.scl.NextMode <em>Next Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next Mode</em>'.
	 * @see simulator.scl.NextMode
	 * @generated
	 */
	EClass getNextMode();

	/**
	 * Returns the meta object for class '{@link simulator.scl.SoundAlarm <em>Sound Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound Alarm</em>'.
	 * @see simulator.scl.SoundAlarm
	 * @generated
	 */
	EClass getSoundAlarm();

	/**
	 * Returns the meta object for class '{@link simulator.scl.SilenceAlarm <em>Silence Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Silence Alarm</em>'.
	 * @see simulator.scl.SilenceAlarm
	 * @generated
	 */
	EClass getSilenceAlarm();

	/**
	 * Returns the meta object for class '{@link simulator.scl.EvaluateExpression <em>Evaluate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluate Expression</em>'.
	 * @see simulator.scl.EvaluateExpression
	 * @generated
	 */
	EClass getEvaluateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link simulator.scl.EvaluateExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see simulator.scl.EvaluateExpression#getExpression()
	 * @see #getEvaluateExpression()
	 * @generated
	 */
	EReference getEvaluateExpression_Expression();

	/**
	 * Returns the meta object for class '{@link simulator.scl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see simulator.scl.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link simulator.scl.IncrementTimeVariable <em>Increment Time Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment Time Variable</em>'.
	 * @see simulator.scl.IncrementTimeVariable
	 * @generated
	 */
	EClass getIncrementTimeVariable();

	/**
	 * Returns the meta object for the reference '{@link simulator.scl.IncrementTimeVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see simulator.scl.IncrementTimeVariable#getVariable()
	 * @see #getIncrementTimeVariable()
	 * @generated
	 */
	EReference getIncrementTimeVariable_Variable();

	/**
	 * Returns the meta object for the attribute '{@link simulator.scl.IncrementTimeVariable#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see simulator.scl.IncrementTimeVariable#getUnit()
	 * @see #getIncrementTimeVariable()
	 * @generated
	 */
	EAttribute getIncrementTimeVariable_Unit();

	/**
	 * Returns the meta object for class '{@link simulator.scl.Displayable <em>Displayable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Displayable</em>'.
	 * @see simulator.scl.Displayable
	 * @generated
	 */
	EClass getDisplayable();

	/**
	 * Returns the meta object for class '{@link simulator.scl.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see simulator.scl.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link simulator.scl.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see simulator.scl.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link simulator.scl.StringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see simulator.scl.StringConstant#getValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link simulator.scl.TimeConstant <em>Time Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Constant</em>'.
	 * @see simulator.scl.TimeConstant
	 * @generated
	 */
	EClass getTimeConstant();

	/**
	 * Returns the meta object for the attribute '{@link simulator.scl.TimeConstant#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see simulator.scl.TimeConstant#getHours()
	 * @see #getTimeConstant()
	 * @generated
	 */
	EAttribute getTimeConstant_Hours();

	/**
	 * Returns the meta object for the attribute '{@link simulator.scl.TimeConstant#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see simulator.scl.TimeConstant#getMinutes()
	 * @see #getTimeConstant()
	 * @generated
	 */
	EAttribute getTimeConstant_Minutes();

	/**
	 * Returns the meta object for class '{@link simulator.scl.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see simulator.scl.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link simulator.scl.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simulator.scl.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for enum '{@link simulator.scl.UnitOfTime <em>Unit Of Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Of Time</em>'.
	 * @see simulator.scl.UnitOfTime
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
		 * The meta object literal for the '{@link simulator.scl.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.ConfigurationImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getConfiguration()
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
		 * The meta object literal for the '{@link simulator.scl.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.ModeImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getMode()
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
		 * The meta object literal for the '{@link simulator.scl.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.ButtonImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getButton()
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
		 * The meta object literal for the '{@link simulator.scl.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.ActionImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getAction()
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
		 * The meta object literal for the '{@link simulator.scl.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.ConditionImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.OutputMatchesConditionImpl <em>Output Matches Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.OutputMatchesConditionImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getOutputMatchesCondition()
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
		 * The meta object literal for the '{@link simulator.scl.impl.AndConditionImpl <em>And Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.AndConditionImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getAndCondition()
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
		 * The meta object literal for the '{@link simulator.scl.impl.OrConditionImpl <em>Or Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.OrConditionImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getOrCondition()
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
		 * The meta object literal for the '{@link simulator.scl.impl.NotConditionImpl <em>Not Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.NotConditionImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getNotCondition()
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
		 * The meta object literal for the '{@link simulator.scl.impl.DisplayMatchesConditionImpl <em>Display Matches Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.DisplayMatchesConditionImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getDisplayMatchesCondition()
		 * @generated
		 */
		EClass DISPLAY_MATCHES_CONDITION = eINSTANCE.getDisplayMatchesCondition();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.IndicatorMatchesConditionImpl <em>Indicator Matches Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.IndicatorMatchesConditionImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getIndicatorMatchesCondition()
		 * @generated
		 */
		EClass INDICATOR_MATCHES_CONDITION = eINSTANCE.getIndicatorMatchesCondition();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.VariableComparisonConditionImpl <em>Variable Comparison Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.VariableComparisonConditionImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getVariableComparisonCondition()
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
		 * The meta object literal for the '{@link simulator.scl.impl.VariableEqualsConditionImpl <em>Variable Equals Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.VariableEqualsConditionImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getVariableEqualsCondition()
		 * @generated
		 */
		EClass VARIABLE_EQUALS_CONDITION = eINSTANCE.getVariableEqualsCondition();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.ChangeOutputActionImpl <em>Change Output Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.ChangeOutputActionImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getChangeOutputAction()
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
		 * The meta object literal for the '{@link simulator.scl.impl.ChangeDisplayImpl <em>Change Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.ChangeDisplayImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getChangeDisplay()
		 * @generated
		 */
		EClass CHANGE_DISPLAY = eINSTANCE.getChangeDisplay();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.ChangeIndicatorImpl <em>Change Indicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.ChangeIndicatorImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getChangeIndicator()
		 * @generated
		 */
		EClass CHANGE_INDICATOR = eINSTANCE.getChangeIndicator();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.NextModeImpl <em>Next Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.NextModeImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getNextMode()
		 * @generated
		 */
		EClass NEXT_MODE = eINSTANCE.getNextMode();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.SoundAlarmImpl <em>Sound Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.SoundAlarmImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getSoundAlarm()
		 * @generated
		 */
		EClass SOUND_ALARM = eINSTANCE.getSoundAlarm();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.SilenceAlarmImpl <em>Silence Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.SilenceAlarmImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getSilenceAlarm()
		 * @generated
		 */
		EClass SILENCE_ALARM = eINSTANCE.getSilenceAlarm();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.EvaluateExpressionImpl <em>Evaluate Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.EvaluateExpressionImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getEvaluateExpression()
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
		 * The meta object literal for the '{@link simulator.scl.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.ExpressionImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.IncrementTimeVariableImpl <em>Increment Time Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.IncrementTimeVariableImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getIncrementTimeVariable()
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
		 * The meta object literal for the '{@link simulator.scl.impl.DisplayableImpl <em>Displayable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.DisplayableImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getDisplayable()
		 * @generated
		 */
		EClass DISPLAYABLE = eINSTANCE.getDisplayable();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.ConstantImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.StringConstantImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.TimeConstantImpl <em>Time Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.TimeConstantImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getTimeConstant()
		 * @generated
		 */
		EClass TIME_CONSTANT = eINSTANCE.getTimeConstant();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTANT__HOURS = eINSTANCE.getTimeConstant_Hours();

		/**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTANT__MINUTES = eINSTANCE.getTimeConstant_Minutes();

		/**
		 * The meta object literal for the '{@link simulator.scl.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.impl.VariableImpl
		 * @see simulator.scl.impl.ConfigPackageImpl#getVariable()
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
		 * The meta object literal for the '{@link simulator.scl.UnitOfTime <em>Unit Of Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.scl.UnitOfTime
		 * @see simulator.scl.impl.ConfigPackageImpl#getUnitOfTime()
		 * @generated
		 */
		EEnum UNIT_OF_TIME = eINSTANCE.getUnitOfTime();

	}

} //ConfigPackage
