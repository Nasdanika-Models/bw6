/**
 */
package org.nasdanika.models.bw6;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Xcore model for BW 6.x concepts.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.bw6.Bw6Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel bundleManifest='false' featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface Bw6Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bw6";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://bw6.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.bw6";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bw6Package eINSTANCE = org.nasdanika.models.bw6.impl.Bw6PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.ProcessImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TARGET_NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Exit On Standard Fault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXIT_ON_STANDARD_FAULT = 2;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUPPRESS_JOIN_FAILURE = 3;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INFO = 4;

	/**
	 * The feature id for the '<em><b>Process Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TYPES = 6;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IMPORTS = 7;

	/**
	 * The feature id for the '<em><b>Partner Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARTNER_LINKS = 8;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VARIABLES = 9;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SCOPE = 10;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.ProcessInfoImpl <em>Process Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.ProcessInfoImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getProcessInfo()
	 * @generated
	 */
	int PROCESS_INFO = 1;

	/**
	 * The feature id for the '<em><b>Callable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFO__CALLABLE = 0;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFO__CREATED_BY = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFO__CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFO__MODIFIED_BY = 3;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFO__MODIFICATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>History Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFO__HISTORY_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Flow Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFO__FLOW_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Pool Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFO__POOL_ICON = 7;

	/**
	 * The number of structural features of the '<em>Process Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFO_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Process Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.ProcessInterfaceImpl <em>Process Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.ProcessInterfaceImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getProcessInterface()
	 * @generated
	 */
	int PROCESS_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INTERFACE__CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INTERFACE__INPUT = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INTERFACE__OUTPUT = 2;

	/**
	 * The number of structural features of the '<em>Process Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Process Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.ImportImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.PartnerLinkImpl <em>Partner Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.PartnerLinkImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getPartnerLink()
	 * @generated
	 */
	int PARTNER_LINK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Partner Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__PARTNER_LINK_TYPE = 1;

	/**
	 * The feature id for the '<em><b>My Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__MY_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Partner Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__PARTNER_ROLE = 3;

	/**
	 * The number of structural features of the '<em>Partner Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Partner Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.VariableImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MESSAGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INTERNAL = 4;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DEFAULT_VALUE = 6;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.ScopeImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__FLOW = 1;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.FlowImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__LINKS = 1;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ACTIVITIES = 2;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.LinkImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINK_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = 4;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.ActivityImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Xpdl Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__XPDL_ID = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTGOING_LINKS = 2;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INCOMING_LINKS = 3;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SOURCES = 4;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TARGETS = 5;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.SourceImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__LINK_NAME = 0;

	/**
	 * The feature id for the '<em><b>Transition Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TRANSITION_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Transition Condition Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TRANSITION_CONDITION_LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__LINK = 3;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.TargetImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 11;

	/**
	 * The feature id for the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__LINK_NAME = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__LINK = 1;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.ActivityExtensionImpl <em>Activity Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.ActivityExtensionImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getActivityExtension()
	 * @generated
	 */
	int ACTIVITY_EXTENSION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Xpdl Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__XPDL_ID = ACTIVITY__XPDL_ID;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__OUTGOING_LINKS = ACTIVITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__INCOMING_LINKS = ACTIVITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Input Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__INPUT_VARIABLE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__OUTPUT_VARIABLE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__EXPRESSION = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__INPUT_BINDINGS = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__CONFIG = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Activity Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Activity Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Activity Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXTENSION_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.ReceiveEventImpl <em>Receive Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.ReceiveEventImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getReceiveEvent()
	 * @generated
	 */
	int RECEIVE_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Xpdl Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT__XPDL_ID = ACTIVITY__XPDL_ID;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT__OUTGOING_LINKS = ACTIVITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT__INCOMING_LINKS = ACTIVITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Create Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT__CREATE_INSTANCE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT__EVENT_TIMEOUT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT__VARIABLE = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT__EVENT_SOURCE = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Receive Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Receive Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_EVENT_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw6.impl.EmptyActivityImpl <em>Empty Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw6.impl.EmptyActivityImpl
	 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getEmptyActivity()
	 * @generated
	 */
	int EMPTY_ACTIVITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Xpdl Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_ACTIVITY__XPDL_ID = ACTIVITY__XPDL_ID;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_ACTIVITY__OUTGOING_LINKS = ACTIVITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_ACTIVITY__INCOMING_LINKS = ACTIVITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_ACTIVITY__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_ACTIVITY__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Constructor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_ACTIVITY__CONSTRUCTOR = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Empty Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Empty Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.nasdanika.models.bw6.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.bw6.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Process#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.nasdanika.models.bw6.Process#getTargetNamespace()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Process#isExitOnStandardFault <em>Exit On Standard Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit On Standard Fault</em>'.
	 * @see org.nasdanika.models.bw6.Process#isExitOnStandardFault()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ExitOnStandardFault();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Process#isSuppressJoinFailure <em>Suppress Join Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppress Join Failure</em>'.
	 * @see org.nasdanika.models.bw6.Process#isSuppressJoinFailure()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_SuppressJoinFailure();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bw6.Process#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see org.nasdanika.models.bw6.Process#getInfo()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Info();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bw6.Process#getProcessInterface <em>Process Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Interface</em>'.
	 * @see org.nasdanika.models.bw6.Process#getProcessInterface()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ProcessInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Process#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Types</em>'.
	 * @see org.nasdanika.models.bw6.Process#getTypes()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bw6.Process#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.nasdanika.models.bw6.Process#getImports()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bw6.Process#getPartnerLinks <em>Partner Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partner Links</em>'.
	 * @see org.nasdanika.models.bw6.Process#getPartnerLinks()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_PartnerLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bw6.Process#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.nasdanika.models.bw6.Process#getVariables()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bw6.Process#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.nasdanika.models.bw6.Process#getScope()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Scope();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.ProcessInfo <em>Process Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Info</em>'.
	 * @see org.nasdanika.models.bw6.ProcessInfo
	 * @generated
	 */
	EClass getProcessInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ProcessInfo#isCallable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callable</em>'.
	 * @see org.nasdanika.models.bw6.ProcessInfo#isCallable()
	 * @see #getProcessInfo()
	 * @generated
	 */
	EAttribute getProcessInfo_Callable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ProcessInfo#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By</em>'.
	 * @see org.nasdanika.models.bw6.ProcessInfo#getCreatedBy()
	 * @see #getProcessInfo()
	 * @generated
	 */
	EAttribute getProcessInfo_CreatedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ProcessInfo#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.nasdanika.models.bw6.ProcessInfo#getCreationDate()
	 * @see #getProcessInfo()
	 * @generated
	 */
	EAttribute getProcessInfo_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ProcessInfo#getModifiedBy <em>Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified By</em>'.
	 * @see org.nasdanika.models.bw6.ProcessInfo#getModifiedBy()
	 * @see #getProcessInfo()
	 * @generated
	 */
	EAttribute getProcessInfo_ModifiedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ProcessInfo#getModificationDate <em>Modification Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification Date</em>'.
	 * @see org.nasdanika.models.bw6.ProcessInfo#getModificationDate()
	 * @see #getProcessInfo()
	 * @generated
	 */
	EAttribute getProcessInfo_ModificationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ProcessInfo#getHistorySize <em>History Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History Size</em>'.
	 * @see org.nasdanika.models.bw6.ProcessInfo#getHistorySize()
	 * @see #getProcessInfo()
	 * @generated
	 */
	EAttribute getProcessInfo_HistorySize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ProcessInfo#getFlowModel <em>Flow Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Model</em>'.
	 * @see org.nasdanika.models.bw6.ProcessInfo#getFlowModel()
	 * @see #getProcessInfo()
	 * @generated
	 */
	EAttribute getProcessInfo_FlowModel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ProcessInfo#getPoolIcon <em>Pool Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pool Icon</em>'.
	 * @see org.nasdanika.models.bw6.ProcessInfo#getPoolIcon()
	 * @see #getProcessInfo()
	 * @generated
	 */
	EAttribute getProcessInfo_PoolIcon();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.ProcessInterface <em>Process Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Interface</em>'.
	 * @see org.nasdanika.models.bw6.ProcessInterface
	 * @generated
	 */
	EClass getProcessInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ProcessInterface#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.nasdanika.models.bw6.ProcessInterface#getContext()
	 * @see #getProcessInterface()
	 * @generated
	 */
	EAttribute getProcessInterface_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ProcessInterface#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see org.nasdanika.models.bw6.ProcessInterface#getInput()
	 * @see #getProcessInterface()
	 * @generated
	 */
	EAttribute getProcessInterface_Input();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ProcessInterface#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see org.nasdanika.models.bw6.ProcessInterface#getOutput()
	 * @see #getProcessInterface()
	 * @generated
	 */
	EAttribute getProcessInterface_Output();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.nasdanika.models.bw6.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Import#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see org.nasdanika.models.bw6.Import#getImportType()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Import#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.nasdanika.models.bw6.Import#getNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Import#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.models.bw6.Import#getLocation()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Location();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.PartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner Link</em>'.
	 * @see org.nasdanika.models.bw6.PartnerLink
	 * @generated
	 */
	EClass getPartnerLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.PartnerLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.bw6.PartnerLink#getName()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EAttribute getPartnerLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.PartnerLink#getPartnerLinkType <em>Partner Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Link Type</em>'.
	 * @see org.nasdanika.models.bw6.PartnerLink#getPartnerLinkType()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EAttribute getPartnerLink_PartnerLinkType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.PartnerLink#getMyRole <em>My Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Role</em>'.
	 * @see org.nasdanika.models.bw6.PartnerLink#getMyRole()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EAttribute getPartnerLink_MyRole();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.PartnerLink#getPartnerRole <em>Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Role</em>'.
	 * @see org.nasdanika.models.bw6.PartnerLink#getPartnerRole()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EAttribute getPartnerLink_PartnerRole();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.nasdanika.models.bw6.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.bw6.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Variable#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see org.nasdanika.models.bw6.Variable#getElement()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Element();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Variable#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see org.nasdanika.models.bw6.Variable#getMessageType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_MessageType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.bw6.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Variable#isInternal <em>Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal</em>'.
	 * @see org.nasdanika.models.bw6.Variable#isInternal()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Internal();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Variable#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see org.nasdanika.models.bw6.Variable#getParameter()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Variable#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.nasdanika.models.bw6.Variable#getDefaultValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see org.nasdanika.models.bw6.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Scope#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.bw6.Scope#getName()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bw6.Scope#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow</em>'.
	 * @see org.nasdanika.models.bw6.Scope#getFlow()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Flow();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.nasdanika.models.bw6.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Flow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.bw6.Flow#getName()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bw6.Flow#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.nasdanika.models.bw6.Flow#getLinks()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bw6.Flow#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.nasdanika.models.bw6.Flow#getActivities()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Activities();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.nasdanika.models.bw6.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.bw6.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Link#getLinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Type</em>'.
	 * @see org.nasdanika.models.bw6.Link#getLinkType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_LinkType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Link#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.models.bw6.Link#getLabel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Label();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.bw6.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.nasdanika.models.bw6.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.bw6.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.bw6.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.nasdanika.models.bw6.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.bw6.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Activity#getXpdlId <em>Xpdl Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpdl Id</em>'.
	 * @see org.nasdanika.models.bw6.Activity#getXpdlId()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_XpdlId();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.bw6.Activity#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Links</em>'.
	 * @see org.nasdanika.models.bw6.Activity#getOutgoingLinks()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_OutgoingLinks();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.bw6.Activity#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see org.nasdanika.models.bw6.Activity#getIncomingLinks()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_IncomingLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bw6.Activity#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see org.nasdanika.models.bw6.Activity#getSources()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bw6.Activity#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see org.nasdanika.models.bw6.Activity#getTargets()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Targets();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.nasdanika.models.bw6.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Source#getLinkName <em>Link Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Name</em>'.
	 * @see org.nasdanika.models.bw6.Source#getLinkName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_LinkName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Source#getTransitionCondition <em>Transition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Condition</em>'.
	 * @see org.nasdanika.models.bw6.Source#getTransitionCondition()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_TransitionCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Source#getTransitionConditionLanguage <em>Transition Condition Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Condition Language</em>'.
	 * @see org.nasdanika.models.bw6.Source#getTransitionConditionLanguage()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_TransitionConditionLanguage();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.bw6.Source#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see org.nasdanika.models.bw6.Source#getLink()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Link();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see org.nasdanika.models.bw6.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.Target#getLinkName <em>Link Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Name</em>'.
	 * @see org.nasdanika.models.bw6.Target#getLinkName()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_LinkName();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.bw6.Target#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see org.nasdanika.models.bw6.Target#getLink()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Link();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.ActivityExtension <em>Activity Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Extension</em>'.
	 * @see org.nasdanika.models.bw6.ActivityExtension
	 * @generated
	 */
	EClass getActivityExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ActivityExtension#getInputVariable <em>Input Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Variable</em>'.
	 * @see org.nasdanika.models.bw6.ActivityExtension#getInputVariable()
	 * @see #getActivityExtension()
	 * @generated
	 */
	EAttribute getActivityExtension_InputVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ActivityExtension#getOutputVariable <em>Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Variable</em>'.
	 * @see org.nasdanika.models.bw6.ActivityExtension#getOutputVariable()
	 * @see #getActivityExtension()
	 * @generated
	 */
	EAttribute getActivityExtension_OutputVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ActivityExtension#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.nasdanika.models.bw6.ActivityExtension#getExpression()
	 * @see #getActivityExtension()
	 * @generated
	 */
	EAttribute getActivityExtension_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ActivityExtension#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.nasdanika.models.bw6.ActivityExtension#getExpressionLanguage()
	 * @see #getActivityExtension()
	 * @generated
	 */
	EAttribute getActivityExtension_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ActivityExtension#getInputBindings <em>Input Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Bindings</em>'.
	 * @see org.nasdanika.models.bw6.ActivityExtension#getInputBindings()
	 * @see #getActivityExtension()
	 * @generated
	 */
	EAttribute getActivityExtension_InputBindings();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ActivityExtension#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config</em>'.
	 * @see org.nasdanika.models.bw6.ActivityExtension#getConfig()
	 * @see #getActivityExtension()
	 * @generated
	 */
	EAttribute getActivityExtension_Config();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ActivityExtension#getActivityTypeId <em>Activity Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Type Id</em>'.
	 * @see org.nasdanika.models.bw6.ActivityExtension#getActivityTypeId()
	 * @see #getActivityExtension()
	 * @generated
	 */
	EAttribute getActivityExtension_ActivityTypeId();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.ReceiveEvent <em>Receive Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Event</em>'.
	 * @see org.nasdanika.models.bw6.ReceiveEvent
	 * @generated
	 */
	EClass getReceiveEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ReceiveEvent#isCreateInstance <em>Create Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Instance</em>'.
	 * @see org.nasdanika.models.bw6.ReceiveEvent#isCreateInstance()
	 * @see #getReceiveEvent()
	 * @generated
	 */
	EAttribute getReceiveEvent_CreateInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ReceiveEvent#getEventTimeout <em>Event Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Timeout</em>'.
	 * @see org.nasdanika.models.bw6.ReceiveEvent#getEventTimeout()
	 * @see #getReceiveEvent()
	 * @generated
	 */
	EAttribute getReceiveEvent_EventTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ReceiveEvent#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.nasdanika.models.bw6.ReceiveEvent#getVariable()
	 * @see #getReceiveEvent()
	 * @generated
	 */
	EAttribute getReceiveEvent_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.ReceiveEvent#getEventSource <em>Event Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Source</em>'.
	 * @see org.nasdanika.models.bw6.ReceiveEvent#getEventSource()
	 * @see #getReceiveEvent()
	 * @generated
	 */
	EAttribute getReceiveEvent_EventSource();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw6.EmptyActivity <em>Empty Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Activity</em>'.
	 * @see org.nasdanika.models.bw6.EmptyActivity
	 * @generated
	 */
	EClass getEmptyActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw6.EmptyActivity#getConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constructor</em>'.
	 * @see org.nasdanika.models.bw6.EmptyActivity#getConstructor()
	 * @see #getEmptyActivity()
	 * @generated
	 */
	EAttribute getEmptyActivity_Constructor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bw6Factory getBw6Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.ProcessImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__TARGET_NAMESPACE = eINSTANCE.getProcess_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Exit On Standard Fault</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__EXIT_ON_STANDARD_FAULT = eINSTANCE.getProcess_ExitOnStandardFault();

		/**
		 * The meta object literal for the '<em><b>Suppress Join Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__SUPPRESS_JOIN_FAILURE = eINSTANCE.getProcess_SuppressJoinFailure();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__INFO = eINSTANCE.getProcess_Info();

		/**
		 * The meta object literal for the '<em><b>Process Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PROCESS_INTERFACE = eINSTANCE.getProcess_ProcessInterface();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__TYPES = eINSTANCE.getProcess_Types();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__IMPORTS = eINSTANCE.getProcess_Imports();

		/**
		 * The meta object literal for the '<em><b>Partner Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PARTNER_LINKS = eINSTANCE.getProcess_PartnerLinks();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__VARIABLES = eINSTANCE.getProcess_Variables();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__SCOPE = eINSTANCE.getProcess_Scope();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.ProcessInfoImpl <em>Process Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.ProcessInfoImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getProcessInfo()
		 * @generated
		 */
		EClass PROCESS_INFO = eINSTANCE.getProcessInfo();

		/**
		 * The meta object literal for the '<em><b>Callable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INFO__CALLABLE = eINSTANCE.getProcessInfo_Callable();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INFO__CREATED_BY = eINSTANCE.getProcessInfo_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INFO__CREATION_DATE = eINSTANCE.getProcessInfo_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Modified By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INFO__MODIFIED_BY = eINSTANCE.getProcessInfo_ModifiedBy();

		/**
		 * The meta object literal for the '<em><b>Modification Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INFO__MODIFICATION_DATE = eINSTANCE.getProcessInfo_ModificationDate();

		/**
		 * The meta object literal for the '<em><b>History Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INFO__HISTORY_SIZE = eINSTANCE.getProcessInfo_HistorySize();

		/**
		 * The meta object literal for the '<em><b>Flow Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INFO__FLOW_MODEL = eINSTANCE.getProcessInfo_FlowModel();

		/**
		 * The meta object literal for the '<em><b>Pool Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INFO__POOL_ICON = eINSTANCE.getProcessInfo_PoolIcon();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.ProcessInterfaceImpl <em>Process Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.ProcessInterfaceImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getProcessInterface()
		 * @generated
		 */
		EClass PROCESS_INTERFACE = eINSTANCE.getProcessInterface();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INTERFACE__CONTEXT = eINSTANCE.getProcessInterface_Context();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INTERFACE__INPUT = eINSTANCE.getProcessInterface_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INTERFACE__OUTPUT = eINSTANCE.getProcessInterface_Output();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.ImportImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_TYPE = eINSTANCE.getImport_ImportType();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__NAMESPACE = eINSTANCE.getImport_Namespace();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__LOCATION = eINSTANCE.getImport_Location();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.PartnerLinkImpl <em>Partner Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.PartnerLinkImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getPartnerLink()
		 * @generated
		 */
		EClass PARTNER_LINK = eINSTANCE.getPartnerLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER_LINK__NAME = eINSTANCE.getPartnerLink_Name();

		/**
		 * The meta object literal for the '<em><b>Partner Link Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER_LINK__PARTNER_LINK_TYPE = eINSTANCE.getPartnerLink_PartnerLinkType();

		/**
		 * The meta object literal for the '<em><b>My Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER_LINK__MY_ROLE = eINSTANCE.getPartnerLink_MyRole();

		/**
		 * The meta object literal for the '<em><b>Partner Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER_LINK__PARTNER_ROLE = eINSTANCE.getPartnerLink_PartnerRole();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.VariableImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ELEMENT = eINSTANCE.getVariable_Element();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__MESSAGE_TYPE = eINSTANCE.getVariable_MessageType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Internal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__INTERNAL = eINSTANCE.getVariable_Internal();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__PARAMETER = eINSTANCE.getVariable_Parameter();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__DEFAULT_VALUE = eINSTANCE.getVariable_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.ScopeImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__NAME = eINSTANCE.getScope_Name();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__FLOW = eINSTANCE.getScope_Flow();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.FlowImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__NAME = eINSTANCE.getFlow_Name();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__LINKS = eINSTANCE.getFlow_Links();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__ACTIVITIES = eINSTANCE.getFlow_Activities();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.LinkImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '<em><b>Link Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__LINK_TYPE = eINSTANCE.getLink_LinkType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__LABEL = eINSTANCE.getLink_Label();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.ActivityImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Xpdl Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__XPDL_ID = eINSTANCE.getActivity_XpdlId();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__OUTGOING_LINKS = eINSTANCE.getActivity_OutgoingLinks();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INCOMING_LINKS = eINSTANCE.getActivity_IncomingLinks();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SOURCES = eINSTANCE.getActivity_Sources();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__TARGETS = eINSTANCE.getActivity_Targets();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.SourceImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Link Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__LINK_NAME = eINSTANCE.getSource_LinkName();

		/**
		 * The meta object literal for the '<em><b>Transition Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__TRANSITION_CONDITION = eINSTANCE.getSource_TransitionCondition();

		/**
		 * The meta object literal for the '<em><b>Transition Condition Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__TRANSITION_CONDITION_LANGUAGE = eINSTANCE.getSource_TransitionConditionLanguage();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__LINK = eINSTANCE.getSource_Link();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.TargetImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em><b>Link Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__LINK_NAME = eINSTANCE.getTarget_LinkName();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__LINK = eINSTANCE.getTarget_Link();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.ActivityExtensionImpl <em>Activity Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.ActivityExtensionImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getActivityExtension()
		 * @generated
		 */
		EClass ACTIVITY_EXTENSION = eINSTANCE.getActivityExtension();

		/**
		 * The meta object literal for the '<em><b>Input Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXTENSION__INPUT_VARIABLE = eINSTANCE.getActivityExtension_InputVariable();

		/**
		 * The meta object literal for the '<em><b>Output Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXTENSION__OUTPUT_VARIABLE = eINSTANCE.getActivityExtension_OutputVariable();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXTENSION__EXPRESSION = eINSTANCE.getActivityExtension_Expression();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE = eINSTANCE.getActivityExtension_ExpressionLanguage();

		/**
		 * The meta object literal for the '<em><b>Input Bindings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXTENSION__INPUT_BINDINGS = eINSTANCE.getActivityExtension_InputBindings();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXTENSION__CONFIG = eINSTANCE.getActivityExtension_Config();

		/**
		 * The meta object literal for the '<em><b>Activity Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID = eINSTANCE.getActivityExtension_ActivityTypeId();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.ReceiveEventImpl <em>Receive Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.ReceiveEventImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getReceiveEvent()
		 * @generated
		 */
		EClass RECEIVE_EVENT = eINSTANCE.getReceiveEvent();

		/**
		 * The meta object literal for the '<em><b>Create Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE_EVENT__CREATE_INSTANCE = eINSTANCE.getReceiveEvent_CreateInstance();

		/**
		 * The meta object literal for the '<em><b>Event Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE_EVENT__EVENT_TIMEOUT = eINSTANCE.getReceiveEvent_EventTimeout();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE_EVENT__VARIABLE = eINSTANCE.getReceiveEvent_Variable();

		/**
		 * The meta object literal for the '<em><b>Event Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE_EVENT__EVENT_SOURCE = eINSTANCE.getReceiveEvent_EventSource();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw6.impl.EmptyActivityImpl <em>Empty Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw6.impl.EmptyActivityImpl
		 * @see org.nasdanika.models.bw6.impl.Bw6PackageImpl#getEmptyActivity()
		 * @generated
		 */
		EClass EMPTY_ACTIVITY = eINSTANCE.getEmptyActivity();

		/**
		 * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPTY_ACTIVITY__CONSTRUCTOR = eINSTANCE.getEmptyActivity_Constructor();

	}

} //Bw6Package
