/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import ssl.*;

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
 * @see ssl.SslPackage
 * @generated
 */
public class SslSwitch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static SslPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SslSwitch() {
    if (modelPackage == null)
    {
      modelPackage = SslPackage.eINSTANCE;
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
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
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
    switch (classifierID)
    {
      case SslPackage.SPECIFICATION:
      {
        Specification specification = (Specification)theEObject;
        T result = caseSpecification(specification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.TESTCASE:
      {
        Testcase testcase = (Testcase)theEObject;
        T result = caseTestcase(testcase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.GIVEN:
      {
        Given given = (Given)theEObject;
        T result = caseGiven(given);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.WHEN:
      {
        When when = (When)theEObject;
        T result = caseWhen(when);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.THEN:
      {
        Then then = (Then)theEObject;
        T result = caseThen(then);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.CHECK_TIME_PAST_OTHER:
      {
        CheckTimePastOther checkTimePastOther = (CheckTimePastOther)theEObject;
        T result = caseCheckTimePastOther(checkTimePastOther);
        if (result == null) result = caseCondition(checkTimePastOther);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.CHECK_MODE:
      {
        CheckMode checkMode = (CheckMode)theEObject;
        T result = caseCheckMode(checkMode);
        if (result == null) result = caseCondition(checkMode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.CHECK_LABEL:
      {
        CheckLabel checkLabel = (CheckLabel)theEObject;
        T result = caseCheckLabel(checkLabel);
        if (result == null) result = caseCondition(checkLabel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.PRESS_BUTTON:
      {
        PressButton pressButton = (PressButton)theEObject;
        T result = casePressButton(pressButton);
        if (result == null) result = caseAction(pressButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.OBSERVATION:
      {
        Observation observation = (Observation)theEObject;
        T result = caseObservation(observation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.OBSERVE_MODE:
      {
        ObserveMode observeMode = (ObserveMode)theEObject;
        T result = caseObserveMode(observeMode);
        if (result == null) result = caseObservation(observeMode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.OBSERVE_BUTTON:
      {
        ObserveButton observeButton = (ObserveButton)theEObject;
        T result = caseObserveButton(observeButton);
        if (result == null) result = caseObservation(observeButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.OBSERVE_LABEL_VALUE:
      {
        ObserveLabelValue observeLabelValue = (ObserveLabelValue)theEObject;
        T result = caseObserveLabelValue(observeLabelValue);
        if (result == null) result = caseObservation(observeLabelValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.OBSERVE_LABEL_VARIABLE:
      {
        ObserveLabelVariable observeLabelVariable = (ObserveLabelVariable)theEObject;
        T result = caseObserveLabelVariable(observeLabelVariable);
        if (result == null) result = caseObservation(observeLabelVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.OBSERVE_VARIABLE_CHANGE:
      {
        ObserveVariableChange observeVariableChange = (ObserveVariableChange)theEObject;
        T result = caseObserveVariableChange(observeVariableChange);
        if (result == null) result = caseObservation(observeVariableChange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SslPackage.OBSERVE_RING:
      {
        ObserveRing observeRing = (ObserveRing)theEObject;
        T result = caseObserveRing(observeRing);
        if (result == null) result = caseObservation(observeRing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSpecification(Specification object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Testcase</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Testcase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTestcase(Testcase object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Given</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Given</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGiven(Given object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>When</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseWhen(When object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Then</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Then</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseThen(Then object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Check Time Past Other</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Time Past Other</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckTimePastOther(CheckTimePastOther object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Mode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Mode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckMode(CheckMode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckLabel(CheckLabel object)
  {
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
   * Returns the result of interpreting the object as an instance of '<em>Press Button</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Press Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePressButton(PressButton object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseObservation(Observation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Observe Mode</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observe Mode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseObserveMode(ObserveMode object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Observe Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observe Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObserveButton(ObserveButton object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Observe Label Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observe Label Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObserveLabelValue(ObserveLabelValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Observe Label Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observe Label Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObserveLabelVariable(ObserveLabelVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Observe Variable Change</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observe Variable Change</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObserveVariableChange(ObserveVariableChange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Observe Ring</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observe Ring</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObserveRing(ObserveRing object)
  {
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

} //SslSwitch
