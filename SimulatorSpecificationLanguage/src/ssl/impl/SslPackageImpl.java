/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ssl.Action;
import ssl.CheckLabel;
import ssl.CheckMode;
import ssl.CheckVariableEqualsTime;
import ssl.CheckVariableEqualsVariable;
import ssl.Condition;
import ssl.EntersMode;
import ssl.Given;
import ssl.LabelType;
import ssl.Observation;
import ssl.ObserveButton;
import ssl.ObserveLabelValue;
import ssl.ObserveLabelVariable;
import ssl.ObserveMode;
import ssl.ObserveOutput;
import ssl.ObserveRing;
import ssl.ObserveVariableChange;
import ssl.PressButton;
import ssl.Specification;
import ssl.SslFactory;
import ssl.SslPackage;
import ssl.Testcase;
import ssl.Then;
import ssl.UnitOfTime;
import ssl.When;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SslPackageImpl extends EPackageImpl implements SslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testcaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass givenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkVariableEqualsVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkVariableEqualsTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entersModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observeModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observeButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observeOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observeLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observeLabelVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observeVariableChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observeRingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitOfTimeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ssl.SslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SslPackageImpl() {
		super(eNS_URI, SslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SslPackage init() {
		if (isInited) return (SslPackage)EPackage.Registry.INSTANCE.getEPackage(SslPackage.eNS_URI);

		// Obtain or create and register package
		SslPackageImpl theSslPackage = (SslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SslPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSslPackage.createPackageContents();

		// Initialize created meta-data
		theSslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSslPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SslPackage.eNS_URI, theSslPackage);
		return theSslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Testcases() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestcase() {
		return testcaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestcase_Given() {
		return (EReference)testcaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestcase_When() {
		return (EReference)testcaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestcase_Then() {
		return (EReference)testcaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGiven() {
		return givenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGiven_Testcase() {
		return (EReference)givenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGiven_Conditions() {
		return (EReference)givenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhen() {
		return whenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhen_Testcase() {
		return (EReference)whenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhen_Actions() {
		return (EReference)whenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThen() {
		return thenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThen_Testcase() {
		return (EReference)thenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThen_Observations() {
		return (EReference)thenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Given() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckVariableEqualsVariable() {
		return checkVariableEqualsVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckVariableEqualsVariable_FirstVariableName() {
		return (EAttribute)checkVariableEqualsVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckVariableEqualsVariable_SecondVariableName() {
		return (EAttribute)checkVariableEqualsVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckVariableEqualsTime() {
		return checkVariableEqualsTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckVariableEqualsTime_FirstVariableName() {
		return (EAttribute)checkVariableEqualsTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckVariableEqualsTime_Time() {
		return (EAttribute)checkVariableEqualsTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckMode() {
		return checkModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckMode_Mode() {
		return (EAttribute)checkModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckLabel() {
		return checkLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckLabel_LabelType() {
		return (EAttribute)checkLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckLabel_Value() {
		return (EAttribute)checkLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_When() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntersMode() {
		return entersModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntersMode_Mode() {
		return (EAttribute)entersModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressButton() {
		return pressButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPressButton_Button() {
		return (EAttribute)pressButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Then() {
		return (EReference)observationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserveMode() {
		return observeModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObserveMode_Mode() {
		return (EAttribute)observeModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserveButton() {
		return observeButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObserveButton_Button() {
		return (EAttribute)observeButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObserveButton_Name() {
		return (EAttribute)observeButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserveOutput() {
		return observeOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObserveOutput_LabelType() {
		return (EAttribute)observeOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserveLabelValue() {
		return observeLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObserveLabelValue_Value() {
		return (EAttribute)observeLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserveLabelVariable() {
		return observeLabelVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObserveLabelVariable_VariableName() {
		return (EAttribute)observeLabelVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserveVariableChange() {
		return observeVariableChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObserveVariableChange_VariableName() {
		return (EAttribute)observeVariableChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObserveVariableChange_Unit() {
		return (EAttribute)observeVariableChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserveRing() {
		return observeRingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLabelType() {
		return labelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitOfTime() {
		return unitOfTimeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SslFactory getSslFactory() {
		return (SslFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__TESTCASES);

		testcaseEClass = createEClass(TESTCASE);
		createEReference(testcaseEClass, TESTCASE__GIVEN);
		createEReference(testcaseEClass, TESTCASE__WHEN);
		createEReference(testcaseEClass, TESTCASE__THEN);

		givenEClass = createEClass(GIVEN);
		createEReference(givenEClass, GIVEN__TESTCASE);
		createEReference(givenEClass, GIVEN__CONDITIONS);

		whenEClass = createEClass(WHEN);
		createEReference(whenEClass, WHEN__TESTCASE);
		createEReference(whenEClass, WHEN__ACTIONS);

		thenEClass = createEClass(THEN);
		createEReference(thenEClass, THEN__TESTCASE);
		createEReference(thenEClass, THEN__OBSERVATIONS);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__GIVEN);

		checkVariableEqualsVariableEClass = createEClass(CHECK_VARIABLE_EQUALS_VARIABLE);
		createEAttribute(checkVariableEqualsVariableEClass, CHECK_VARIABLE_EQUALS_VARIABLE__FIRST_VARIABLE_NAME);
		createEAttribute(checkVariableEqualsVariableEClass, CHECK_VARIABLE_EQUALS_VARIABLE__SECOND_VARIABLE_NAME);

		checkVariableEqualsTimeEClass = createEClass(CHECK_VARIABLE_EQUALS_TIME);
		createEAttribute(checkVariableEqualsTimeEClass, CHECK_VARIABLE_EQUALS_TIME__FIRST_VARIABLE_NAME);
		createEAttribute(checkVariableEqualsTimeEClass, CHECK_VARIABLE_EQUALS_TIME__TIME);

		checkModeEClass = createEClass(CHECK_MODE);
		createEAttribute(checkModeEClass, CHECK_MODE__MODE);

		checkLabelEClass = createEClass(CHECK_LABEL);
		createEAttribute(checkLabelEClass, CHECK_LABEL__LABEL_TYPE);
		createEAttribute(checkLabelEClass, CHECK_LABEL__VALUE);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__WHEN);

		entersModeEClass = createEClass(ENTERS_MODE);
		createEAttribute(entersModeEClass, ENTERS_MODE__MODE);

		pressButtonEClass = createEClass(PRESS_BUTTON);
		createEAttribute(pressButtonEClass, PRESS_BUTTON__BUTTON);

		observationEClass = createEClass(OBSERVATION);
		createEReference(observationEClass, OBSERVATION__THEN);

		observeModeEClass = createEClass(OBSERVE_MODE);
		createEAttribute(observeModeEClass, OBSERVE_MODE__MODE);

		observeButtonEClass = createEClass(OBSERVE_BUTTON);
		createEAttribute(observeButtonEClass, OBSERVE_BUTTON__BUTTON);
		createEAttribute(observeButtonEClass, OBSERVE_BUTTON__NAME);

		observeOutputEClass = createEClass(OBSERVE_OUTPUT);
		createEAttribute(observeOutputEClass, OBSERVE_OUTPUT__LABEL_TYPE);

		observeLabelValueEClass = createEClass(OBSERVE_LABEL_VALUE);
		createEAttribute(observeLabelValueEClass, OBSERVE_LABEL_VALUE__VALUE);

		observeLabelVariableEClass = createEClass(OBSERVE_LABEL_VARIABLE);
		createEAttribute(observeLabelVariableEClass, OBSERVE_LABEL_VARIABLE__VARIABLE_NAME);

		observeVariableChangeEClass = createEClass(OBSERVE_VARIABLE_CHANGE);
		createEAttribute(observeVariableChangeEClass, OBSERVE_VARIABLE_CHANGE__VARIABLE_NAME);
		createEAttribute(observeVariableChangeEClass, OBSERVE_VARIABLE_CHANGE__UNIT);

		observeRingEClass = createEClass(OBSERVE_RING);

		// Create enums
		labelTypeEEnum = createEEnum(LABEL_TYPE);
		unitOfTimeEEnum = createEEnum(UNIT_OF_TIME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		checkVariableEqualsVariableEClass.getESuperTypes().add(this.getCondition());
		checkVariableEqualsTimeEClass.getESuperTypes().add(this.getCondition());
		checkModeEClass.getESuperTypes().add(this.getCondition());
		checkLabelEClass.getESuperTypes().add(this.getCondition());
		entersModeEClass.getESuperTypes().add(this.getAction());
		pressButtonEClass.getESuperTypes().add(this.getAction());
		observeModeEClass.getESuperTypes().add(this.getObservation());
		observeButtonEClass.getESuperTypes().add(this.getObservation());
		observeOutputEClass.getESuperTypes().add(this.getObservation());
		observeLabelValueEClass.getESuperTypes().add(this.getObserveOutput());
		observeLabelVariableEClass.getESuperTypes().add(this.getObserveOutput());
		observeVariableChangeEClass.getESuperTypes().add(this.getObservation());
		observeRingEClass.getESuperTypes().add(this.getObservation());

		// Initialize classes and features; add operations and parameters
		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_Testcases(), this.getTestcase(), null, "testcases", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testcaseEClass, Testcase.class, "Testcase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestcase_Given(), this.getGiven(), this.getGiven_Testcase(), "given", null, 0, 1, Testcase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestcase_When(), this.getWhen(), this.getWhen_Testcase(), "when", null, 0, 1, Testcase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestcase_Then(), this.getThen(), this.getThen_Testcase(), "then", null, 1, 1, Testcase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(givenEClass, Given.class, "Given", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGiven_Testcase(), this.getTestcase(), this.getTestcase_Given(), "testcase", null, 1, 1, Given.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGiven_Conditions(), this.getCondition(), this.getCondition_Given(), "conditions", null, 1, -1, Given.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whenEClass, When.class, "When", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhen_Testcase(), this.getTestcase(), this.getTestcase_When(), "testcase", null, 1, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhen_Actions(), this.getAction(), this.getAction_When(), "actions", null, 1, -1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thenEClass, Then.class, "Then", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThen_Testcase(), this.getTestcase(), this.getTestcase_Then(), "testcase", null, 1, 1, Then.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThen_Observations(), this.getObservation(), this.getObservation_Then(), "observations", null, 1, -1, Then.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Given(), this.getGiven(), this.getGiven_Conditions(), "given", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkVariableEqualsVariableEClass, CheckVariableEqualsVariable.class, "CheckVariableEqualsVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckVariableEqualsVariable_FirstVariableName(), ecorePackage.getEString(), "firstVariableName", null, 1, 1, CheckVariableEqualsVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckVariableEqualsVariable_SecondVariableName(), ecorePackage.getEString(), "secondVariableName", null, 1, 1, CheckVariableEqualsVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkVariableEqualsTimeEClass, CheckVariableEqualsTime.class, "CheckVariableEqualsTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckVariableEqualsTime_FirstVariableName(), ecorePackage.getEString(), "firstVariableName", null, 1, 1, CheckVariableEqualsTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckVariableEqualsTime_Time(), ecorePackage.getEString(), "time", null, 1, 1, CheckVariableEqualsTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkModeEClass, CheckMode.class, "CheckMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckMode_Mode(), ecorePackage.getEString(), "mode", null, 1, 1, CheckMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkLabelEClass, CheckLabel.class, "CheckLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckLabel_LabelType(), this.getLabelType(), "labelType", null, 1, 1, CheckLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckLabel_Value(), ecorePackage.getEString(), "value", null, 0, 1, CheckLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_When(), this.getWhen(), this.getWhen_Actions(), "when", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entersModeEClass, EntersMode.class, "EntersMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntersMode_Mode(), ecorePackage.getEString(), "mode", null, 1, 1, EntersMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pressButtonEClass, PressButton.class, "PressButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPressButton_Button(), ecorePackage.getEString(), "button", null, 1, 1, PressButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observationEClass, Observation.class, "Observation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObservation_Then(), this.getThen(), this.getThen_Observations(), "then", null, 1, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observeModeEClass, ObserveMode.class, "ObserveMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObserveMode_Mode(), ecorePackage.getEString(), "mode", null, 1, 1, ObserveMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observeButtonEClass, ObserveButton.class, "ObserveButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObserveButton_Button(), ecorePackage.getEString(), "button", null, 1, 1, ObserveButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObserveButton_Name(), ecorePackage.getEString(), "name", null, 1, 1, ObserveButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observeOutputEClass, ObserveOutput.class, "ObserveOutput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObserveOutput_LabelType(), this.getLabelType(), "labelType", null, 1, 1, ObserveOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observeLabelValueEClass, ObserveLabelValue.class, "ObserveLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObserveLabelValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ObserveLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observeLabelVariableEClass, ObserveLabelVariable.class, "ObserveLabelVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObserveLabelVariable_VariableName(), ecorePackage.getEString(), "variableName", null, 1, 1, ObserveLabelVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observeVariableChangeEClass, ObserveVariableChange.class, "ObserveVariableChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObserveVariableChange_VariableName(), ecorePackage.getEString(), "variableName", null, 1, 1, ObserveVariableChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObserveVariableChange_Unit(), this.getUnitOfTime(), "unit", null, 1, 1, ObserveVariableChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observeRingEClass, ObserveRing.class, "ObserveRing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(labelTypeEEnum, LabelType.class, "LabelType");
		addEEnumLiteral(labelTypeEEnum, LabelType.DISPLAY);
		addEEnumLiteral(labelTypeEEnum, LabelType.INDICATOR);

		initEEnum(unitOfTimeEEnum, UnitOfTime.class, "UnitOfTime");
		addEEnumLiteral(unitOfTimeEEnum, UnitOfTime.HOUR);
		addEEnumLiteral(unitOfTimeEEnum, UnitOfTime.MINUTE);

		// Create resource
		createResource(eNS_URI);
	}

} //SslPackageImpl
