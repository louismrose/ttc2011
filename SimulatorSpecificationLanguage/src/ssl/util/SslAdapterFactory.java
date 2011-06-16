/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ssl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ssl.SslPackage
 * @generated
 */
public class SslAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static SslPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SslAdapterFactory() {
    if (modelPackage == null)
    {
      modelPackage = SslPackage.eINSTANCE;
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
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
	protected SslSwitch<Adapter> modelSwitch =
		new SslSwitch<Adapter>()
    {
      @Override
      public Adapter caseSpecification(Specification object)
      {
        return createSpecificationAdapter();
      }
      @Override
      public Adapter caseTestcase(Testcase object)
      {
        return createTestcaseAdapter();
      }
      @Override
      public Adapter caseGiven(Given object)
      {
        return createGivenAdapter();
      }
      @Override
      public Adapter caseWhen(When object)
      {
        return createWhenAdapter();
      }
      @Override
      public Adapter caseThen(Then object)
      {
        return createThenAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseCheckTimePastOther(CheckTimePastOther object)
      {
        return createCheckTimePastOtherAdapter();
      }
      @Override
      public Adapter caseCheckMode(CheckMode object)
      {
        return createCheckModeAdapter();
      }
      @Override
      public Adapter caseCheckLabel(CheckLabel object)
      {
        return createCheckLabelAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter casePressButton(PressButton object)
      {
        return createPressButtonAdapter();
      }
      @Override
      public Adapter caseObservation(Observation object)
      {
        return createObservationAdapter();
      }
      @Override
      public Adapter caseObserveMode(ObserveMode object)
      {
        return createObserveModeAdapter();
      }
      @Override
      public Adapter caseObserveButton(ObserveButton object)
      {
        return createObserveButtonAdapter();
      }
      @Override
      public Adapter caseObserveLabelValue(ObserveLabelValue object)
      {
        return createObserveLabelValueAdapter();
      }
      @Override
      public Adapter caseObserveLabelVariable(ObserveLabelVariable object)
      {
        return createObserveLabelVariableAdapter();
      }
      @Override
      public Adapter caseObserveVariableChange(ObserveVariableChange object)
      {
        return createObserveVariableChangeAdapter();
      }
      @Override
      public Adapter caseObserveRing(ObserveRing object)
      {
        return createObserveRingAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
   * Creates a new adapter for an object of class '{@link ssl.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.Specification
   * @generated
   */
	public Adapter createSpecificationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link ssl.Testcase <em>Testcase</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.Testcase
   * @generated
   */
	public Adapter createTestcaseAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link ssl.Given <em>Given</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.Given
   * @generated
   */
	public Adapter createGivenAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link ssl.When <em>When</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.When
   * @generated
   */
	public Adapter createWhenAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link ssl.Then <em>Then</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.Then
   * @generated
   */
	public Adapter createThenAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link ssl.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.Condition
   * @generated
   */
	public Adapter createConditionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link ssl.CheckTimePastOther <em>Check Time Past Other</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.CheckTimePastOther
   * @generated
   */
  public Adapter createCheckTimePastOtherAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ssl.CheckMode <em>Check Mode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.CheckMode
   * @generated
   */
  public Adapter createCheckModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ssl.CheckLabel <em>Check Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.CheckLabel
   * @generated
   */
  public Adapter createCheckLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ssl.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.Action
   * @generated
   */
	public Adapter createActionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link ssl.PressButton <em>Press Button</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.PressButton
   * @generated
   */
	public Adapter createPressButtonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link ssl.Observation <em>Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.Observation
   * @generated
   */
	public Adapter createObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link ssl.ObserveMode <em>Observe Mode</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.ObserveMode
   * @generated
   */
	public Adapter createObserveModeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link ssl.ObserveButton <em>Observe Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.ObserveButton
   * @generated
   */
  public Adapter createObserveButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ssl.ObserveLabelValue <em>Observe Label Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.ObserveLabelValue
   * @generated
   */
  public Adapter createObserveLabelValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ssl.ObserveLabelVariable <em>Observe Label Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.ObserveLabelVariable
   * @generated
   */
  public Adapter createObserveLabelVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ssl.ObserveVariableChange <em>Observe Variable Change</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.ObserveVariableChange
   * @generated
   */
  public Adapter createObserveVariableChangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ssl.ObserveRing <em>Observe Ring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ssl.ObserveRing
   * @generated
   */
  public Adapter createObserveRingAdapter()
  {
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

} //SslAdapterFactory
