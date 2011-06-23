/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simulator.config.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigFactoryImpl extends EFactoryImpl implements ConfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigFactory init() {
		try {
			ConfigFactory theConfigFactory = (ConfigFactory)EPackage.Registry.INSTANCE.getEFactory("simulatorConfig"); 
			if (theConfigFactory != null) {
				return theConfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConfigPackage.CONFIGURATION: return createConfiguration();
			case ConfigPackage.MODE: return createMode();
			case ConfigPackage.BUTTON: return createButton();
			case ConfigPackage.AND_CONDITION: return createAndCondition();
			case ConfigPackage.OR_CONDITION: return createOrCondition();
			case ConfigPackage.NOT_CONDITION: return createNotCondition();
			case ConfigPackage.DISPLAY_MATCHES_CONDITION: return createDisplayMatchesCondition();
			case ConfigPackage.INDICATOR_MATCHES_CONDITION: return createIndicatorMatchesCondition();
			case ConfigPackage.VARIABLE_EQUALS_CONDITION: return createVariableEqualsCondition();
			case ConfigPackage.CHANGE_DISPLAY: return createChangeDisplay();
			case ConfigPackage.CHANGE_INDICATOR: return createChangeIndicator();
			case ConfigPackage.NEXT_MODE: return createNextMode();
			case ConfigPackage.SOUND_ALARM: return createSoundAlarm();
			case ConfigPackage.SILENCE_ALARM: return createSilenceAlarm();
			case ConfigPackage.EVALUATE_EXPRESSION: return createEvaluateExpression();
			case ConfigPackage.EXPRESSION: return createExpression();
			case ConfigPackage.INCREMENT_TIME_VARIABLE: return createIncrementTimeVariable();
			case ConfigPackage.CONSTANT: return createConstant();
			case ConfigPackage.VARIABLE: return createVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigPackage.UNIT_OF_TIME:
				return createUnitOfTimeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigPackage.UNIT_OF_TIME:
				return convertUnitOfTimeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createMode() {
		ModeImpl mode = new ModeImpl();
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndCondition createAndCondition() {
		AndConditionImpl andCondition = new AndConditionImpl();
		return andCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrCondition createOrCondition() {
		OrConditionImpl orCondition = new OrConditionImpl();
		return orCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotCondition createNotCondition() {
		NotConditionImpl notCondition = new NotConditionImpl();
		return notCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayMatchesCondition createDisplayMatchesCondition() {
		DisplayMatchesConditionImpl displayMatchesCondition = new DisplayMatchesConditionImpl();
		return displayMatchesCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorMatchesCondition createIndicatorMatchesCondition() {
		IndicatorMatchesConditionImpl indicatorMatchesCondition = new IndicatorMatchesConditionImpl();
		return indicatorMatchesCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableEqualsCondition createVariableEqualsCondition() {
		VariableEqualsConditionImpl variableEqualsCondition = new VariableEqualsConditionImpl();
		return variableEqualsCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeDisplay createChangeDisplay() {
		ChangeDisplayImpl changeDisplay = new ChangeDisplayImpl();
		return changeDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeIndicator createChangeIndicator() {
		ChangeIndicatorImpl changeIndicator = new ChangeIndicatorImpl();
		return changeIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextMode createNextMode() {
		NextModeImpl nextMode = new NextModeImpl();
		return nextMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundAlarm createSoundAlarm() {
		SoundAlarmImpl soundAlarm = new SoundAlarmImpl();
		return soundAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SilenceAlarm createSilenceAlarm() {
		SilenceAlarmImpl silenceAlarm = new SilenceAlarmImpl();
		return silenceAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluateExpression createEvaluateExpression() {
		EvaluateExpressionImpl evaluateExpression = new EvaluateExpressionImpl();
		return evaluateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementTimeVariable createIncrementTimeVariable() {
		IncrementTimeVariableImpl incrementTimeVariable = new IncrementTimeVariableImpl();
		return incrementTimeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfTime createUnitOfTimeFromString(EDataType eDataType, String initialValue) {
		UnitOfTime result = UnitOfTime.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitOfTimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigPackage getConfigPackage() {
		return (ConfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigPackage getPackage() {
		return ConfigPackage.eINSTANCE;
	}

} //ConfigFactoryImpl
