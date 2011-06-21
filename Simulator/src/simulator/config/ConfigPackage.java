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
	 * The meta object id for the '{@link simulator.config.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.EventImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.AlarmEventImpl <em>Alarm Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.AlarmEventImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getAlarmEvent()
	 * @generated
	 */
	int ALARM_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_EVENT__TRIGGER = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_EVENT__ALARM_TIME = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Alarm Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ActionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ChangeOutputActionImpl <em>Change Output Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ChangeOutputActionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getChangeOutputAction()
	 * @generated
	 */
	int CHANGE_OUTPUT_ACTION = 6;

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
	int CHANGE_DISPLAY = 7;

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
	int CHANGE_INDICATOR = 8;

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
	int NEXT_MODE = 9;

	/**
	 * The number of structural features of the '<em>Next Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_MODE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.EvaluateExpressionImpl <em>Evaluate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.EvaluateExpressionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getEvaluateExpression()
	 * @generated
	 */
	int EVALUATE_EXPRESSION = 10;

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
	int EXPRESSION = 11;

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
	int INCREMENT_TIME_VARIABLE = 12;

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
	int DISPLAYABLE = 13;

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
	int CONSTANT = 14;

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
	int VARIABLE = 15;

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
	int UNIT_OF_TIME = 16;


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
	 * Returns the meta object for class '{@link simulator.config.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see simulator.config.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link simulator.config.AlarmEvent <em>Alarm Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Event</em>'.
	 * @see simulator.config.AlarmEvent
	 * @generated
	 */
	EClass getAlarmEvent();

	/**
	 * Returns the meta object for the reference '{@link simulator.config.AlarmEvent#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see simulator.config.AlarmEvent#getTrigger()
	 * @see #getAlarmEvent()
	 * @generated
	 */
	EReference getAlarmEvent_Trigger();

	/**
	 * Returns the meta object for the reference '{@link simulator.config.AlarmEvent#getAlarmTime <em>Alarm Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alarm Time</em>'.
	 * @see simulator.config.AlarmEvent#getAlarmTime()
	 * @see #getAlarmEvent()
	 * @generated
	 */
	EReference getAlarmEvent_AlarmTime();

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
		 * The meta object literal for the '{@link simulator.config.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.EventImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.AlarmEventImpl <em>Alarm Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.AlarmEventImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getAlarmEvent()
		 * @generated
		 */
		EClass ALARM_EVENT = eINSTANCE.getAlarmEvent();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALARM_EVENT__TRIGGER = eINSTANCE.getAlarmEvent_Trigger();

		/**
		 * The meta object literal for the '<em><b>Alarm Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALARM_EVENT__ALARM_TIME = eINSTANCE.getAlarmEvent_AlarmTime();

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
