/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import simulator.config.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see simulator.config.ConfigPackage
 * @generated
 */
public class ConfigSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigSwitch() {
		if (modelPackage == null) {
			modelPackage = ConfigPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConfigPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.MODE: {
				Mode mode = (Mode)theEObject;
				T result = caseMode(mode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.OUTPUT_MATCHES_CONDITION: {
				OutputMatchesCondition outputMatchesCondition = (OutputMatchesCondition)theEObject;
				T result = caseOutputMatchesCondition(outputMatchesCondition);
				if (result == null) result = caseCondition(outputMatchesCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.AND_CONDITION: {
				AndCondition andCondition = (AndCondition)theEObject;
				T result = caseAndCondition(andCondition);
				if (result == null) result = caseCondition(andCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.OR_CONDITION: {
				OrCondition orCondition = (OrCondition)theEObject;
				T result = caseOrCondition(orCondition);
				if (result == null) result = caseCondition(orCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.NOT_CONDITION: {
				NotCondition notCondition = (NotCondition)theEObject;
				T result = caseNotCondition(notCondition);
				if (result == null) result = caseCondition(notCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.DISPLAY_MATCHES_CONDITION: {
				DisplayMatchesCondition displayMatchesCondition = (DisplayMatchesCondition)theEObject;
				T result = caseDisplayMatchesCondition(displayMatchesCondition);
				if (result == null) result = caseOutputMatchesCondition(displayMatchesCondition);
				if (result == null) result = caseCondition(displayMatchesCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.INDICATOR_MATCHES_CONDITION: {
				IndicatorMatchesCondition indicatorMatchesCondition = (IndicatorMatchesCondition)theEObject;
				T result = caseIndicatorMatchesCondition(indicatorMatchesCondition);
				if (result == null) result = caseOutputMatchesCondition(indicatorMatchesCondition);
				if (result == null) result = caseCondition(indicatorMatchesCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.VARIABLE_COMPARISON_CONDITION: {
				VariableComparisonCondition variableComparisonCondition = (VariableComparisonCondition)theEObject;
				T result = caseVariableComparisonCondition(variableComparisonCondition);
				if (result == null) result = caseCondition(variableComparisonCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.VARIABLE_EQUALS_CONDITION: {
				VariableEqualsCondition variableEqualsCondition = (VariableEqualsCondition)theEObject;
				T result = caseVariableEqualsCondition(variableEqualsCondition);
				if (result == null) result = caseVariableComparisonCondition(variableEqualsCondition);
				if (result == null) result = caseCondition(variableEqualsCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.CHANGE_OUTPUT_ACTION: {
				ChangeOutputAction changeOutputAction = (ChangeOutputAction)theEObject;
				T result = caseChangeOutputAction(changeOutputAction);
				if (result == null) result = caseAction(changeOutputAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.CHANGE_DISPLAY: {
				ChangeDisplay changeDisplay = (ChangeDisplay)theEObject;
				T result = caseChangeDisplay(changeDisplay);
				if (result == null) result = caseChangeOutputAction(changeDisplay);
				if (result == null) result = caseAction(changeDisplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.CHANGE_INDICATOR: {
				ChangeIndicator changeIndicator = (ChangeIndicator)theEObject;
				T result = caseChangeIndicator(changeIndicator);
				if (result == null) result = caseChangeOutputAction(changeIndicator);
				if (result == null) result = caseAction(changeIndicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.NEXT_MODE: {
				NextMode nextMode = (NextMode)theEObject;
				T result = caseNextMode(nextMode);
				if (result == null) result = caseAction(nextMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.SOUND_ALARM: {
				SoundAlarm soundAlarm = (SoundAlarm)theEObject;
				T result = caseSoundAlarm(soundAlarm);
				if (result == null) result = caseAction(soundAlarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.SILENCE_ALARM: {
				SilenceAlarm silenceAlarm = (SilenceAlarm)theEObject;
				T result = caseSilenceAlarm(silenceAlarm);
				if (result == null) result = caseAction(silenceAlarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.EVALUATE_EXPRESSION: {
				EvaluateExpression evaluateExpression = (EvaluateExpression)theEObject;
				T result = caseEvaluateExpression(evaluateExpression);
				if (result == null) result = caseAction(evaluateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.INCREMENT_TIME_VARIABLE: {
				IncrementTimeVariable incrementTimeVariable = (IncrementTimeVariable)theEObject;
				T result = caseIncrementTimeVariable(incrementTimeVariable);
				if (result == null) result = caseExpression(incrementTimeVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.DISPLAYABLE: {
				Displayable displayable = (Displayable)theEObject;
				T result = caseDisplayable(displayable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseDisplayable(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.STRING_CONSTANT: {
				StringConstant stringConstant = (StringConstant)theEObject;
				T result = caseStringConstant(stringConstant);
				if (result == null) result = caseConstant(stringConstant);
				if (result == null) result = caseDisplayable(stringConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.TIME_CONSTANT: {
				TimeConstant timeConstant = (TimeConstant)theEObject;
				T result = caseTimeConstant(timeConstant);
				if (result == null) result = caseConstant(timeConstant);
				if (result == null) result = caseDisplayable(timeConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseDisplayable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMode(Mode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Matches Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Matches Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputMatchesCondition(OutputMatchesCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndCondition(AndCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrCondition(OrCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotCondition(NotCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Matches Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Matches Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayMatchesCondition(DisplayMatchesCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indicator Matches Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indicator Matches Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndicatorMatchesCondition(IndicatorMatchesCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Comparison Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Comparison Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableComparisonCondition(VariableComparisonCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Equals Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Equals Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableEqualsCondition(VariableEqualsCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Output Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Output Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeOutputAction(ChangeOutputAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeDisplay(ChangeDisplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeIndicator(ChangeIndicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextMode(NextMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sound Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sound Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoundAlarm(SoundAlarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Silence Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Silence Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSilenceAlarm(SilenceAlarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluate Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluateExpression(EvaluateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Increment Time Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Increment Time Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncrementTimeVariable(IncrementTimeVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Displayable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Displayable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayable(Displayable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConstant(StringConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeConstant(TimeConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ConfigSwitch
