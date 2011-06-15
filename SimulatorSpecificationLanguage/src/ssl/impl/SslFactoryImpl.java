/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ssl.impl;

import org.eclipse.emf.ecore.EClass;
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
			case SslPackage.SET_MODE: return createSetMode();
			case SslPackage.PRESS_BUTTON: return createPressButton();
			case SslPackage.OBSERVE_MODE: return createObserveMode();
			case SslPackage.OBSERVE_BINDING: return createObserveBinding();
			case SslPackage.OBSERVE_DISPLAY: return createObserveDisplay();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public SetMode createSetMode() {
		SetModeImpl setMode = new SetModeImpl();
		return setMode;
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
	public ObserveBinding createObserveBinding() {
		ObserveBindingImpl observeBinding = new ObserveBindingImpl();
		return observeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserveDisplay createObserveDisplay() {
		ObserveDisplayImpl observeDisplay = new ObserveDisplayImpl();
		return observeDisplay;
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
