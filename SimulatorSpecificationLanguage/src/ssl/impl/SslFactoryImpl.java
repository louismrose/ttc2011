/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ssl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SslFactoryImpl extends EFactoryImpl implements SslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SslFactory init() {
		try {
			SslFactory theSslFactory = (SslFactory)EPackage.Registry.INSTANCE.getEFactory("ssl"); 
			if (theSslFactory != null) {
				return theSslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SslFactoryImpl() {
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
			case SslPackage.SPECIFICATION: return createSpecification();
			case SslPackage.TESTCASE: return createTestcase();
			case SslPackage.GIVEN: return createGiven();
			case SslPackage.WHEN: return createWhen();
			case SslPackage.THEN: return createThen();
			case SslPackage.CHECK_VARIABLE_EQUALS_VARIABLE: return createCheckVariableEqualsVariable();
			case SslPackage.CHECK_VARIABLE_EQUALS_TIME: return createCheckVariableEqualsTime();
			case SslPackage.CHECK_MODE: return createCheckMode();
			case SslPackage.CHECK_LABEL: return createCheckLabel();
			case SslPackage.ENTERS_MODE: return createEntersMode();
			case SslPackage.PRESS_BUTTON: return createPressButton();
			case SslPackage.OBSERVE_MODE: return createObserveMode();
			case SslPackage.OBSERVE_BUTTON: return createObserveButton();
			case SslPackage.OBSERVE_LABEL_VALUE: return createObserveLabelValue();
			case SslPackage.OBSERVE_LABEL_VARIABLE: return createObserveLabelVariable();
			case SslPackage.OBSERVE_VARIABLE_CHANGE: return createObserveVariableChange();
			case SslPackage.OBSERVE_RING: return createObserveRing();
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
			case SslPackage.LABEL_TYPE:
				return createLabelTypeFromString(eDataType, initialValue);
			case SslPackage.UNIT_OF_TIME:
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
			case SslPackage.LABEL_TYPE:
				return convertLabelTypeToString(eDataType, instanceValue);
			case SslPackage.UNIT_OF_TIME:
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
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testcase createTestcase() {
		TestcaseImpl testcase = new TestcaseImpl();
		return testcase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Given createGiven() {
		GivenImpl given = new GivenImpl();
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When createWhen() {
		WhenImpl when = new WhenImpl();
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Then createThen() {
		ThenImpl then = new ThenImpl();
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckVariableEqualsVariable createCheckVariableEqualsVariable() {
		CheckVariableEqualsVariableImpl checkVariableEqualsVariable = new CheckVariableEqualsVariableImpl();
		return checkVariableEqualsVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckVariableEqualsTime createCheckVariableEqualsTime() {
		CheckVariableEqualsTimeImpl checkVariableEqualsTime = new CheckVariableEqualsTimeImpl();
		return checkVariableEqualsTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckMode createCheckMode() {
		CheckModeImpl checkMode = new CheckModeImpl();
		return checkMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckLabel createCheckLabel() {
		CheckLabelImpl checkLabel = new CheckLabelImpl();
		return checkLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntersMode createEntersMode() {
		EntersModeImpl entersMode = new EntersModeImpl();
		return entersMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressButton createPressButton() {
		PressButtonImpl pressButton = new PressButtonImpl();
		return pressButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserveMode createObserveMode() {
		ObserveModeImpl observeMode = new ObserveModeImpl();
		return observeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserveButton createObserveButton() {
		ObserveButtonImpl observeButton = new ObserveButtonImpl();
		return observeButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserveLabelValue createObserveLabelValue() {
		ObserveLabelValueImpl observeLabelValue = new ObserveLabelValueImpl();
		return observeLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserveLabelVariable createObserveLabelVariable() {
		ObserveLabelVariableImpl observeLabelVariable = new ObserveLabelVariableImpl();
		return observeLabelVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserveVariableChange createObserveVariableChange() {
		ObserveVariableChangeImpl observeVariableChange = new ObserveVariableChangeImpl();
		return observeVariableChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserveRing createObserveRing() {
		ObserveRingImpl observeRing = new ObserveRingImpl();
		return observeRing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelType createLabelTypeFromString(EDataType eDataType, String initialValue) {
		LabelType result = LabelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public SslPackage getSslPackage() {
		return (SslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SslPackage getPackage() {
		return SslPackage.eINSTANCE;
	}

} //SslFactoryImpl
