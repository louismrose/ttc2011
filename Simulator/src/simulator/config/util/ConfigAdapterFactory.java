/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import simulator.config.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simulator.config.ConfigPackage
 * @generated
 */
public class ConfigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConfigPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigSwitch<Adapter> modelSwitch =
		new ConfigSwitch<Adapter>() {
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseMode(Mode object) {
				return createModeAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseOutputMatchesCondition(OutputMatchesCondition object) {
				return createOutputMatchesConditionAdapter();
			}
			@Override
			public Adapter caseAndCondition(AndCondition object) {
				return createAndConditionAdapter();
			}
			@Override
			public Adapter caseOrCondition(OrCondition object) {
				return createOrConditionAdapter();
			}
			@Override
			public Adapter caseNotCondition(NotCondition object) {
				return createNotConditionAdapter();
			}
			@Override
			public Adapter caseDisplayMatchesCondition(DisplayMatchesCondition object) {
				return createDisplayMatchesConditionAdapter();
			}
			@Override
			public Adapter caseIndicatorMatchesCondition(IndicatorMatchesCondition object) {
				return createIndicatorMatchesConditionAdapter();
			}
			@Override
			public Adapter caseVariableComparisonCondition(VariableComparisonCondition object) {
				return createVariableComparisonConditionAdapter();
			}
			@Override
			public Adapter caseVariableEqualsCondition(VariableEqualsCondition object) {
				return createVariableEqualsConditionAdapter();
			}
			@Override
			public Adapter caseChangeOutputAction(ChangeOutputAction object) {
				return createChangeOutputActionAdapter();
			}
			@Override
			public Adapter caseChangeDisplay(ChangeDisplay object) {
				return createChangeDisplayAdapter();
			}
			@Override
			public Adapter caseChangeIndicator(ChangeIndicator object) {
				return createChangeIndicatorAdapter();
			}
			@Override
			public Adapter caseNextMode(NextMode object) {
				return createNextModeAdapter();
			}
			@Override
			public Adapter caseSoundAlarm(SoundAlarm object) {
				return createSoundAlarmAdapter();
			}
			@Override
			public Adapter caseSilenceAlarm(SilenceAlarm object) {
				return createSilenceAlarmAdapter();
			}
			@Override
			public Adapter caseEvaluateExpression(EvaluateExpression object) {
				return createEvaluateExpressionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseIncrementTimeVariable(IncrementTimeVariable object) {
				return createIncrementTimeVariableAdapter();
			}
			@Override
			public Adapter caseDisplayable(Displayable object) {
				return createDisplayableAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.Mode
	 * @generated
	 */
	public Adapter createModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.OutputMatchesCondition <em>Output Matches Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.OutputMatchesCondition
	 * @generated
	 */
	public Adapter createOutputMatchesConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.AndCondition <em>And Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.AndCondition
	 * @generated
	 */
	public Adapter createAndConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.OrCondition <em>Or Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.OrCondition
	 * @generated
	 */
	public Adapter createOrConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.NotCondition <em>Not Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.NotCondition
	 * @generated
	 */
	public Adapter createNotConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.DisplayMatchesCondition <em>Display Matches Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.DisplayMatchesCondition
	 * @generated
	 */
	public Adapter createDisplayMatchesConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.IndicatorMatchesCondition <em>Indicator Matches Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.IndicatorMatchesCondition
	 * @generated
	 */
	public Adapter createIndicatorMatchesConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.VariableComparisonCondition <em>Variable Comparison Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.VariableComparisonCondition
	 * @generated
	 */
	public Adapter createVariableComparisonConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.VariableEqualsCondition <em>Variable Equals Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.VariableEqualsCondition
	 * @generated
	 */
	public Adapter createVariableEqualsConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.ChangeOutputAction <em>Change Output Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.ChangeOutputAction
	 * @generated
	 */
	public Adapter createChangeOutputActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.ChangeDisplay <em>Change Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.ChangeDisplay
	 * @generated
	 */
	public Adapter createChangeDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.ChangeIndicator <em>Change Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.ChangeIndicator
	 * @generated
	 */
	public Adapter createChangeIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.NextMode <em>Next Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.NextMode
	 * @generated
	 */
	public Adapter createNextModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.SoundAlarm <em>Sound Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.SoundAlarm
	 * @generated
	 */
	public Adapter createSoundAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.SilenceAlarm <em>Silence Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.SilenceAlarm
	 * @generated
	 */
	public Adapter createSilenceAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.EvaluateExpression <em>Evaluate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.EvaluateExpression
	 * @generated
	 */
	public Adapter createEvaluateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.IncrementTimeVariable <em>Increment Time Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.IncrementTimeVariable
	 * @generated
	 */
	public Adapter createIncrementTimeVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.Displayable <em>Displayable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.Displayable
	 * @generated
	 */
	public Adapter createDisplayableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.config.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.config.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConfigAdapterFactory
