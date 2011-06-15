/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Button Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__BUTTON_BEHAVIOURS = 2;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ModeEntryActionImpl <em>Mode Entry Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ModeEntryActionImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getModeEntryAction()
	 * @generated
	 */
	int MODE_ENTRY_ACTION = 2;

	/**
	 * The number of structural features of the '<em>Mode Entry Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_ENTRY_ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ChangeDisplayImpl <em>Change Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ChangeDisplayImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getChangeDisplay()
	 * @generated
	 */
	int CHANGE_DISPLAY = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DISPLAY__TEXT = MODE_ENTRY_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DISPLAY_FEATURE_COUNT = MODE_ENTRY_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ButtonBehaviourImpl <em>Button Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ButtonBehaviourImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getButtonBehaviour()
	 * @generated
	 */
	int BUTTON_BEHAVIOUR = 4;

	/**
	 * The number of structural features of the '<em>Button Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BEHAVIOUR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.DisplayButtonBehaviourImpl <em>Display Button Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.DisplayButtonBehaviourImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getDisplayButtonBehaviour()
	 * @generated
	 */
	int DISPLAY_BUTTON_BEHAVIOUR = 5;

	/**
	 * The number of structural features of the '<em>Display Button Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_BUTTON_BEHAVIOUR_FEATURE_COUNT = BUTTON_BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.ModeButtonBehaviourImpl <em>Mode Button Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.ModeButtonBehaviourImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getModeButtonBehaviour()
	 * @generated
	 */
	int MODE_BUTTON_BEHAVIOUR = 6;

	/**
	 * The number of structural features of the '<em>Mode Button Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_BUTTON_BEHAVIOUR_FEATURE_COUNT = BUTTON_BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.config.impl.AlarmButtonBehaviourImpl <em>Alarm Button Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.config.impl.AlarmButtonBehaviourImpl
	 * @see simulator.config.impl.ConfigPackageImpl#getAlarmButtonBehaviour()
	 * @generated
	 */
	int ALARM_BUTTON_BEHAVIOUR = 7;

	/**
	 * The number of structural features of the '<em>Alarm Button Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_BUTTON_BEHAVIOUR_FEATURE_COUNT = BUTTON_BEHAVIOUR_FEATURE_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link simulator.config.Mode#getButtonBehaviours <em>Button Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Button Behaviours</em>'.
	 * @see simulator.config.Mode#getButtonBehaviours()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_ButtonBehaviours();

	/**
	 * Returns the meta object for class '{@link simulator.config.ModeEntryAction <em>Mode Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Entry Action</em>'.
	 * @see simulator.config.ModeEntryAction
	 * @generated
	 */
	EClass getModeEntryAction();

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
	 * Returns the meta object for the attribute '{@link simulator.config.ChangeDisplay#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see simulator.config.ChangeDisplay#getText()
	 * @see #getChangeDisplay()
	 * @generated
	 */
	EAttribute getChangeDisplay_Text();

	/**
	 * Returns the meta object for class '{@link simulator.config.ButtonBehaviour <em>Button Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Behaviour</em>'.
	 * @see simulator.config.ButtonBehaviour
	 * @generated
	 */
	EClass getButtonBehaviour();

	/**
	 * Returns the meta object for class '{@link simulator.config.DisplayButtonBehaviour <em>Display Button Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Button Behaviour</em>'.
	 * @see simulator.config.DisplayButtonBehaviour
	 * @generated
	 */
	EClass getDisplayButtonBehaviour();

	/**
	 * Returns the meta object for class '{@link simulator.config.ModeButtonBehaviour <em>Mode Button Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Button Behaviour</em>'.
	 * @see simulator.config.ModeButtonBehaviour
	 * @generated
	 */
	EClass getModeButtonBehaviour();

	/**
	 * Returns the meta object for class '{@link simulator.config.AlarmButtonBehaviour <em>Alarm Button Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Button Behaviour</em>'.
	 * @see simulator.config.AlarmButtonBehaviour
	 * @generated
	 */
	EClass getAlarmButtonBehaviour();

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
		 * The meta object literal for the '<em><b>Button Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__BUTTON_BEHAVIOURS = eINSTANCE.getMode_ButtonBehaviours();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.ModeEntryActionImpl <em>Mode Entry Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.ModeEntryActionImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getModeEntryAction()
		 * @generated
		 */
		EClass MODE_ENTRY_ACTION = eINSTANCE.getModeEntryAction();

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
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_DISPLAY__TEXT = eINSTANCE.getChangeDisplay_Text();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.ButtonBehaviourImpl <em>Button Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.ButtonBehaviourImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getButtonBehaviour()
		 * @generated
		 */
		EClass BUTTON_BEHAVIOUR = eINSTANCE.getButtonBehaviour();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.DisplayButtonBehaviourImpl <em>Display Button Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.DisplayButtonBehaviourImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getDisplayButtonBehaviour()
		 * @generated
		 */
		EClass DISPLAY_BUTTON_BEHAVIOUR = eINSTANCE.getDisplayButtonBehaviour();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.ModeButtonBehaviourImpl <em>Mode Button Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.ModeButtonBehaviourImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getModeButtonBehaviour()
		 * @generated
		 */
		EClass MODE_BUTTON_BEHAVIOUR = eINSTANCE.getModeButtonBehaviour();

		/**
		 * The meta object literal for the '{@link simulator.config.impl.AlarmButtonBehaviourImpl <em>Alarm Button Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.config.impl.AlarmButtonBehaviourImpl
		 * @see simulator.config.impl.ConfigPackageImpl#getAlarmButtonBehaviour()
		 * @generated
		 */
		EClass ALARM_BUTTON_BEHAVIOUR = eINSTANCE.getAlarmButtonBehaviour();

	}

} //ConfigPackage
