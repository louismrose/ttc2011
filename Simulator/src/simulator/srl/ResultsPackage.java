/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.srl;

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
 * @see simulator.srl.ResultsFactory
 * @model kind="package"
 * @generated
 */
public interface ResultsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "srl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "srl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "srl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultsPackage eINSTANCE = simulator.srl.impl.ResultsPackageImpl.init();

	/**
	 * The meta object id for the '{@link simulator.srl.impl.ResultsImpl <em>Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.srl.impl.ResultsImpl
	 * @see simulator.srl.impl.ResultsPackageImpl#getResults()
	 * @generated
	 */
	int RESULTS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link simulator.srl.impl.SimulationElementImpl <em>Simulation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.srl.impl.SimulationElementImpl
	 * @see simulator.srl.impl.ResultsPackageImpl#getSimulationElement()
	 * @generated
	 */
	int SIMULATION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ELEMENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ELEMENT__PARAMS = 1;

	/**
	 * The number of structural features of the '<em>Simulation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link simulator.srl.impl.StimulusImpl <em>Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.srl.impl.StimulusImpl
	 * @see simulator.srl.impl.ResultsPackageImpl#getStimulus()
	 * @generated
	 */
	int STIMULUS = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__TYPE = SIMULATION_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__PARAMS = SIMULATION_ELEMENT__PARAMS;

	/**
	 * The number of structural features of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_FEATURE_COUNT = SIMULATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.srl.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.srl.impl.ResponseImpl
	 * @see simulator.srl.impl.ResultsPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__TYPE = SIMULATION_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__PARAMS = SIMULATION_ELEMENT__PARAMS;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = SIMULATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.srl.impl.EnvironmentalChangeImpl <em>Environmental Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.srl.impl.EnvironmentalChangeImpl
	 * @see simulator.srl.impl.ResultsPackageImpl#getEnvironmentalChange()
	 * @generated
	 */
	int ENVIRONMENTAL_CHANGE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_CHANGE__TYPE = SIMULATION_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_CHANGE__PARAMS = SIMULATION_ELEMENT__PARAMS;

	/**
	 * The number of structural features of the '<em>Environmental Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_CHANGE_FEATURE_COUNT = SIMULATION_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link simulator.srl.Results <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results</em>'.
	 * @see simulator.srl.Results
	 * @generated
	 */
	EClass getResults();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.srl.Results#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see simulator.srl.Results#getElements()
	 * @see #getResults()
	 * @generated
	 */
	EReference getResults_Elements();

	/**
	 * Returns the meta object for class '{@link simulator.srl.SimulationElement <em>Simulation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Element</em>'.
	 * @see simulator.srl.SimulationElement
	 * @generated
	 */
	EClass getSimulationElement();

	/**
	 * Returns the meta object for the attribute '{@link simulator.srl.SimulationElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see simulator.srl.SimulationElement#getType()
	 * @see #getSimulationElement()
	 * @generated
	 */
	EAttribute getSimulationElement_Type();

	/**
	 * Returns the meta object for the attribute list '{@link simulator.srl.SimulationElement#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Params</em>'.
	 * @see simulator.srl.SimulationElement#getParams()
	 * @see #getSimulationElement()
	 * @generated
	 */
	EAttribute getSimulationElement_Params();

	/**
	 * Returns the meta object for class '{@link simulator.srl.Stimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus</em>'.
	 * @see simulator.srl.Stimulus
	 * @generated
	 */
	EClass getStimulus();

	/**
	 * Returns the meta object for class '{@link simulator.srl.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see simulator.srl.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for class '{@link simulator.srl.EnvironmentalChange <em>Environmental Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environmental Change</em>'.
	 * @see simulator.srl.EnvironmentalChange
	 * @generated
	 */
	EClass getEnvironmentalChange();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResultsFactory getResultsFactory();

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
		 * The meta object literal for the '{@link simulator.srl.impl.ResultsImpl <em>Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.srl.impl.ResultsImpl
		 * @see simulator.srl.impl.ResultsPackageImpl#getResults()
		 * @generated
		 */
		EClass RESULTS = eINSTANCE.getResults();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS__ELEMENTS = eINSTANCE.getResults_Elements();

		/**
		 * The meta object literal for the '{@link simulator.srl.impl.SimulationElementImpl <em>Simulation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.srl.impl.SimulationElementImpl
		 * @see simulator.srl.impl.ResultsPackageImpl#getSimulationElement()
		 * @generated
		 */
		EClass SIMULATION_ELEMENT = eINSTANCE.getSimulationElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_ELEMENT__TYPE = eINSTANCE.getSimulationElement_Type();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_ELEMENT__PARAMS = eINSTANCE.getSimulationElement_Params();

		/**
		 * The meta object literal for the '{@link simulator.srl.impl.StimulusImpl <em>Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.srl.impl.StimulusImpl
		 * @see simulator.srl.impl.ResultsPackageImpl#getStimulus()
		 * @generated
		 */
		EClass STIMULUS = eINSTANCE.getStimulus();

		/**
		 * The meta object literal for the '{@link simulator.srl.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.srl.impl.ResponseImpl
		 * @see simulator.srl.impl.ResultsPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '{@link simulator.srl.impl.EnvironmentalChangeImpl <em>Environmental Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.srl.impl.EnvironmentalChangeImpl
		 * @see simulator.srl.impl.ResultsPackageImpl#getEnvironmentalChange()
		 * @generated
		 */
		EClass ENVIRONMENTAL_CHANGE = eINSTANCE.getEnvironmentalChange();

	}

} //ResultsPackage
