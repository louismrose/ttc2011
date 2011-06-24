/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.scl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import simulator.scl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simulator.scl.ConfigPackage
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
			public Adapter caseStringConstant(StringConstant object) {
				return createStringConstantAdapter();
			}
			@Override
			public Adapter caseTimeConstant(TimeConstant object) {
				return createTimeConstantAdapter();
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
	 * Creates a new adapter for an object of class '{@link simulator.scl.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.Mode
	 * @generated
	 */
	public Adapter createModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.OutputMatchesCondition <em>Output Matches Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.OutputMatchesCondition
	 * @generated
	 */
	public Adapter createOutputMatchesConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.AndCondition <em>And Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.AndCondition
	 * @generated
	 */
	public Adapter createAndConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.OrCondition <em>Or Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.OrCondition
	 * @generated
	 */
	public Adapter createOrConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.NotCondition <em>Not Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.NotCondition
	 * @generated
	 */
	public Adapter createNotConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.DisplayMatchesCondition <em>Display Matches Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.DisplayMatchesCondition
	 * @generated
	 */
	public Adapter createDisplayMatchesConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.IndicatorMatchesCondition <em>Indicator Matches Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.IndicatorMatchesCondition
	 * @generated
	 */
	public Adapter createIndicatorMatchesConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.VariableComparisonCondition <em>Variable Comparison Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.VariableComparisonCondition
	 * @generated
	 */
	public Adapter createVariableComparisonConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.VariableEqualsCondition <em>Variable Equals Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.VariableEqualsCondition
	 * @generated
	 */
	public Adapter createVariableEqualsConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.ChangeOutputAction <em>Change Output Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.ChangeOutputAction
	 * @generated
	 */
	public Adapter createChangeOutputActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.ChangeDisplay <em>Change Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.ChangeDisplay
	 * @generated
	 */
	public Adapter createChangeDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.ChangeIndicator <em>Change Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.ChangeIndicator
	 * @generated
	 */
	public Adapter createChangeIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.NextMode <em>Next Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.NextMode
	 * @generated
	 */
	public Adapter createNextModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.SoundAlarm <em>Sound Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.SoundAlarm
	 * @generated
	 */
	public Adapter createSoundAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.SilenceAlarm <em>Silence Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.SilenceAlarm
	 * @generated
	 */
	public Adapter createSilenceAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.EvaluateExpression <em>Evaluate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.EvaluateExpression
	 * @generated
	 */
	public Adapter createEvaluateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.IncrementTimeVariable <em>Increment Time Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.IncrementTimeVariable
	 * @generated
	 */
	public Adapter createIncrementTimeVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.Displayable <em>Displayable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.Displayable
	 * @generated
	 */
	public Adapter createDisplayableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.StringConstant
	 * @generated
	 */
	public Adapter createStringConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.TimeConstant <em>Time Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.TimeConstant
	 * @generated
	 */
	public Adapter createTimeConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simulator.scl.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simulator.scl.Variable
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
