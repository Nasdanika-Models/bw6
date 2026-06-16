package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

public interface Bw6Package extends EPackage {
    String eNAME = "bw6";
    String eNS_URI = "https://bw6.models.nasdanika.org";
    String eNS_PREFIX = "org.nasdanika.models.bw6";
    Bw6Package eINSTANCE = org.nasdanika.models.bw6.impl.Bw6PackageImpl.init();

    int PROCESS = 0;
    int PROCESS_INFO = 1;
    int PROCESS_INTERFACE = 2;
    int IMPORT = 3;
    int PARTNER_LINK = 4;
    int VARIABLE = 5;
    int SCOPE = 6;
    int FLOW = 7;
    int LINK = 8;
    int ACTIVITY = 9;
    int SOURCE = 10;
    int TARGET = 11;
    int ACTIVITY_EXTENSION = 12;
    int RECEIVE_EVENT = 13;
    int EMPTY_ACTIVITY = 14;

    int PROCESS__NAME = 0;
    int PROCESS__TARGET_NAMESPACE = 1;
    int PROCESS__EXIT_ON_STANDARD_FAULT = 2;
    int PROCESS__SUPPRESS_JOIN_FAILURE = 3;
    int PROCESS__INFO = 4;
    int PROCESS__PROCESS_INTERFACE = 5;
    int PROCESS__TYPES = 6;
    int PROCESS__IMPORTS = 7;
    int PROCESS__PARTNER_LINKS = 8;
    int PROCESS__VARIABLES = 9;
    int PROCESS__SCOPE = 10;
    int PROCESS_FEATURE_COUNT = 11;
    int PROCESS_OPERATION_COUNT = 0;

    int PROCESS_INFO__CALLABLE = 0;
    int PROCESS_INFO__CREATED_BY = 1;
    int PROCESS_INFO__CREATION_DATE = 2;
    int PROCESS_INFO__MODIFIED_BY = 3;
    int PROCESS_INFO__MODIFICATION_DATE = 4;
    int PROCESS_INFO__HISTORY_SIZE = 5;
    int PROCESS_INFO__FLOW_MODEL = 6;
    int PROCESS_INFO__POOL_ICON = 7;
    int PROCESS_INFO_FEATURE_COUNT = 8;
    int PROCESS_INFO_OPERATION_COUNT = 0;

    int PROCESS_INTERFACE__CONTEXT = 0;
    int PROCESS_INTERFACE__INPUT = 1;
    int PROCESS_INTERFACE__OUTPUT = 2;
    int PROCESS_INTERFACE_FEATURE_COUNT = 3;
    int PROCESS_INTERFACE_OPERATION_COUNT = 0;

    int IMPORT__IMPORT_TYPE = 0;
    int IMPORT__NAMESPACE = 1;
    int IMPORT__LOCATION = 2;
    int IMPORT_FEATURE_COUNT = 3;
    int IMPORT_OPERATION_COUNT = 0;

    int PARTNER_LINK__NAME = 0;
    int PARTNER_LINK__PARTNER_LINK_TYPE = 1;
    int PARTNER_LINK__MY_ROLE = 2;
    int PARTNER_LINK__PARTNER_ROLE = 3;
    int PARTNER_LINK_FEATURE_COUNT = 4;
    int PARTNER_LINK_OPERATION_COUNT = 0;

    int VARIABLE__NAME = 0;
    int VARIABLE__ELEMENT = 1;
    int VARIABLE__MESSAGE_TYPE = 2;
    int VARIABLE__TYPE = 3;
    int VARIABLE__INTERNAL = 4;
    int VARIABLE__PARAMETER = 5;
    int VARIABLE__DEFAULT_VALUE = 6;
    int VARIABLE_FEATURE_COUNT = 7;
    int VARIABLE_OPERATION_COUNT = 0;

    int SCOPE__NAME = 0;
    int SCOPE__FLOW = 1;
    int SCOPE_FEATURE_COUNT = 2;
    int SCOPE_OPERATION_COUNT = 0;

    int FLOW__NAME = 0;
    int FLOW__LINKS = 1;
    int FLOW__ACTIVITIES = 2;
    int FLOW_FEATURE_COUNT = 3;
    int FLOW_OPERATION_COUNT = 0;

    int LINK__NAME = 0;
    int LINK__LINK_TYPE = 1;
    int LINK__LABEL = 2;
    int LINK__SOURCE = 3;
    int LINK__TARGET = 4;
    int LINK_FEATURE_COUNT = 5;
    int LINK_OPERATION_COUNT = 0;

    int ACTIVITY__NAME = 0;
    int ACTIVITY__XPDL_ID = 1;
    int ACTIVITY__OUTGOING_LINKS = 2;
    int ACTIVITY__INCOMING_LINKS = 3;
    int ACTIVITY__SOURCES = 4;
    int ACTIVITY__TARGETS = 5;
    int ACTIVITY_FEATURE_COUNT = 6;
    int ACTIVITY_OPERATION_COUNT = 0;

    int SOURCE__LINK_NAME = 0;
    int SOURCE__TRANSITION_CONDITION = 1;
    int SOURCE__TRANSITION_CONDITION_LANGUAGE = 2;
    int SOURCE__LINK = 3;
    int SOURCE_FEATURE_COUNT = 4;
    int SOURCE_OPERATION_COUNT = 0;

    int TARGET__LINK_NAME = 0;
    int TARGET__LINK = 1;
    int TARGET_FEATURE_COUNT = 2;
    int TARGET_OPERATION_COUNT = 0;

    int ACTIVITY_EXTENSION__NAME = ACTIVITY__NAME;
    int ACTIVITY_EXTENSION__XPDL_ID = ACTIVITY__XPDL_ID;
    int ACTIVITY_EXTENSION__OUTGOING_LINKS = ACTIVITY__OUTGOING_LINKS;
    int ACTIVITY_EXTENSION__INCOMING_LINKS = ACTIVITY__INCOMING_LINKS;
    int ACTIVITY_EXTENSION__SOURCES = ACTIVITY__SOURCES;
    int ACTIVITY_EXTENSION__TARGETS = ACTIVITY__TARGETS;
    int ACTIVITY_EXTENSION__INPUT_VARIABLE = 6;
    int ACTIVITY_EXTENSION__OUTPUT_VARIABLE = 7;
    int ACTIVITY_EXTENSION__EXPRESSION = 8;
    int ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE = 9;
    int ACTIVITY_EXTENSION__INPUT_BINDINGS = 10;
    int ACTIVITY_EXTENSION__CONFIG = 11;
    int ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID = 12;
    int ACTIVITY_EXTENSION_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 7;
    int ACTIVITY_EXTENSION_OPERATION_COUNT = 0;

    int RECEIVE_EVENT__NAME = ACTIVITY__NAME;
    int RECEIVE_EVENT__XPDL_ID = ACTIVITY__XPDL_ID;
    int RECEIVE_EVENT__OUTGOING_LINKS = ACTIVITY__OUTGOING_LINKS;
    int RECEIVE_EVENT__INCOMING_LINKS = ACTIVITY__INCOMING_LINKS;
    int RECEIVE_EVENT__SOURCES = ACTIVITY__SOURCES;
    int RECEIVE_EVENT__TARGETS = ACTIVITY__TARGETS;
    int RECEIVE_EVENT__CREATE_INSTANCE = 6;
    int RECEIVE_EVENT__EVENT_TIMEOUT = 7;
    int RECEIVE_EVENT__VARIABLE = 8;
    int RECEIVE_EVENT__EVENT_SOURCE = 9;
    int RECEIVE_EVENT_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;
    int RECEIVE_EVENT_OPERATION_COUNT = 0;

    int EMPTY_ACTIVITY__NAME = ACTIVITY__NAME;
    int EMPTY_ACTIVITY__XPDL_ID = ACTIVITY__XPDL_ID;
    int EMPTY_ACTIVITY__OUTGOING_LINKS = ACTIVITY__OUTGOING_LINKS;
    int EMPTY_ACTIVITY__INCOMING_LINKS = ACTIVITY__INCOMING_LINKS;
    int EMPTY_ACTIVITY__SOURCES = ACTIVITY__SOURCES;
    int EMPTY_ACTIVITY__TARGETS = ACTIVITY__TARGETS;
    int EMPTY_ACTIVITY__CONSTRUCTOR = 6;
    int EMPTY_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;
    int EMPTY_ACTIVITY_OPERATION_COUNT = 0;

    EClass getProcessEClass();
    EAttribute getProcess_Name();
    EAttribute getProcess_TargetNamespace();
    EAttribute getProcess_ExitOnStandardFault();
    EAttribute getProcess_SuppressJoinFailure();
    EReference getProcess_Info();
    EReference getProcess_ProcessInterface();
    EAttribute getProcess_Types();
    EReference getProcess_Imports();
    EReference getProcess_PartnerLinks();
    EReference getProcess_Variables();
    EReference getProcess_Scope();

    EClass getProcessInfoEClass();
    EAttribute getProcessInfo_Callable();
    EAttribute getProcessInfo_CreatedBy();
    EAttribute getProcessInfo_CreationDate();
    EAttribute getProcessInfo_ModifiedBy();
    EAttribute getProcessInfo_ModificationDate();
    EAttribute getProcessInfo_HistorySize();
    EAttribute getProcessInfo_FlowModel();
    EAttribute getProcessInfo_PoolIcon();

    EClass getProcessInterfaceEClass();
    EAttribute getProcessInterface_Context();
    EAttribute getProcessInterface_Input();
    EAttribute getProcessInterface_Output();

    EClass getImportEClass();
    EAttribute getImport_ImportType();
    EAttribute getImport_Namespace();
    EAttribute getImport_Location();

    EClass getPartnerLinkEClass();
    EAttribute getPartnerLink_Name();
    EAttribute getPartnerLink_PartnerLinkType();
    EAttribute getPartnerLink_MyRole();
    EAttribute getPartnerLink_PartnerRole();

    EClass getVariableEClass();
    EAttribute getVariable_Name();
    EAttribute getVariable_Element();
    EAttribute getVariable_MessageType();
    EAttribute getVariable_Type();
    EAttribute getVariable_Internal();
    EAttribute getVariable_Parameter();
    EAttribute getVariable_DefaultValue();

    EClass getScopeEClass();
    EAttribute getScope_Name();
    EReference getScope_Flow();

    EClass getFlowEClass();
    EAttribute getFlow_Name();
    EReference getFlow_Links();
    EReference getFlow_Activities();

    EClass getLinkEClass();
    EAttribute getLink_Name();
    EAttribute getLink_LinkType();
    EAttribute getLink_Label();
    EReference getLink_Source();
    EReference getLink_Target();

    EClass getActivityEClass();
    EAttribute getActivity_Name();
    EAttribute getActivity_XpdlId();
    EReference getActivity_OutgoingLinks();
    EReference getActivity_IncomingLinks();
    EReference getActivity_Sources();
    EReference getActivity_Targets();

    EClass getSourceEClass();
    EAttribute getSource_LinkName();
    EAttribute getSource_TransitionCondition();
    EAttribute getSource_TransitionConditionLanguage();
    EReference getSource_Link();

    EClass getTargetEClass();
    EAttribute getTarget_LinkName();
    EReference getTarget_Link();

    EClass getActivityExtensionEClass();
    EAttribute getActivityExtension_InputVariable();
    EAttribute getActivityExtension_OutputVariable();
    EAttribute getActivityExtension_Expression();
    EAttribute getActivityExtension_ExpressionLanguage();
    EAttribute getActivityExtension_InputBindings();
    EAttribute getActivityExtension_Config();
    EAttribute getActivityExtension_ActivityTypeId();

    EClass getReceiveEventEClass();
    EAttribute getReceiveEvent_CreateInstance();
    EAttribute getReceiveEvent_EventTimeout();
    EAttribute getReceiveEvent_Variable();
    EAttribute getReceiveEvent_EventSource();

    EClass getEmptyActivityEClass();
    EAttribute getEmptyActivity_Constructor();

    Bw6Factory getBw6Factory();

    interface Literals {
        EClass PROCESS = eINSTANCE.getProcessEClass();
        EAttribute PROCESS__NAME = (EAttribute)PROCESS.getEStructuralFeatures().get(0);
        EAttribute PROCESS__TARGET_NAMESPACE = (EAttribute)PROCESS.getEStructuralFeatures().get(1);
        EAttribute PROCESS__EXIT_ON_STANDARD_FAULT = (EAttribute)PROCESS.getEStructuralFeatures().get(2);
        EAttribute PROCESS__SUPPRESS_JOIN_FAILURE = (EAttribute)PROCESS.getEStructuralFeatures().get(3);
        EReference PROCESS__INFO = (EReference)PROCESS.getEStructuralFeatures().get(4);
        EReference PROCESS__PROCESS_INTERFACE = (EReference)PROCESS.getEStructuralFeatures().get(5);
        EAttribute PROCESS__TYPES = (EAttribute)PROCESS.getEStructuralFeatures().get(6);
        EReference PROCESS__IMPORTS = (EReference)PROCESS.getEStructuralFeatures().get(7);
        EReference PROCESS__PARTNER_LINKS = (EReference)PROCESS.getEStructuralFeatures().get(8);
        EReference PROCESS__VARIABLES = (EReference)PROCESS.getEStructuralFeatures().get(9);
        EReference PROCESS__SCOPE = (EReference)PROCESS.getEStructuralFeatures().get(10);

        EClass PROCESS_INFO = eINSTANCE.getProcessInfoEClass();
        EAttribute PROCESS_INFO__CALLABLE = (EAttribute)PROCESS_INFO.getEStructuralFeatures().get(0);
        EAttribute PROCESS_INFO__CREATED_BY = (EAttribute)PROCESS_INFO.getEStructuralFeatures().get(1);
        EAttribute PROCESS_INFO__CREATION_DATE = (EAttribute)PROCESS_INFO.getEStructuralFeatures().get(2);
        EAttribute PROCESS_INFO__MODIFIED_BY = (EAttribute)PROCESS_INFO.getEStructuralFeatures().get(3);
        EAttribute PROCESS_INFO__MODIFICATION_DATE = (EAttribute)PROCESS_INFO.getEStructuralFeatures().get(4);
        EAttribute PROCESS_INFO__HISTORY_SIZE = (EAttribute)PROCESS_INFO.getEStructuralFeatures().get(5);
        EAttribute PROCESS_INFO__FLOW_MODEL = (EAttribute)PROCESS_INFO.getEStructuralFeatures().get(6);
        EAttribute PROCESS_INFO__POOL_ICON = (EAttribute)PROCESS_INFO.getEStructuralFeatures().get(7);

        EClass PROCESS_INTERFACE = eINSTANCE.getProcessInterfaceEClass();
        EAttribute PROCESS_INTERFACE__CONTEXT = (EAttribute)PROCESS_INTERFACE.getEStructuralFeatures().get(0);
        EAttribute PROCESS_INTERFACE__INPUT = (EAttribute)PROCESS_INTERFACE.getEStructuralFeatures().get(1);
        EAttribute PROCESS_INTERFACE__OUTPUT = (EAttribute)PROCESS_INTERFACE.getEStructuralFeatures().get(2);

        EClass IMPORT = eINSTANCE.getImportEClass();
        EAttribute IMPORT__IMPORT_TYPE = (EAttribute)IMPORT.getEStructuralFeatures().get(0);
        EAttribute IMPORT__NAMESPACE = (EAttribute)IMPORT.getEStructuralFeatures().get(1);
        EAttribute IMPORT__LOCATION = (EAttribute)IMPORT.getEStructuralFeatures().get(2);

        EClass PARTNER_LINK = eINSTANCE.getPartnerLinkEClass();
        EAttribute PARTNER_LINK__NAME = (EAttribute)PARTNER_LINK.getEStructuralFeatures().get(0);
        EAttribute PARTNER_LINK__PARTNER_LINK_TYPE = (EAttribute)PARTNER_LINK.getEStructuralFeatures().get(1);
        EAttribute PARTNER_LINK__MY_ROLE = (EAttribute)PARTNER_LINK.getEStructuralFeatures().get(2);
        EAttribute PARTNER_LINK__PARTNER_ROLE = (EAttribute)PARTNER_LINK.getEStructuralFeatures().get(3);

        EClass VARIABLE = eINSTANCE.getVariableEClass();
        EAttribute VARIABLE__NAME = (EAttribute)VARIABLE.getEStructuralFeatures().get(0);
        EAttribute VARIABLE__ELEMENT = (EAttribute)VARIABLE.getEStructuralFeatures().get(1);
        EAttribute VARIABLE__MESSAGE_TYPE = (EAttribute)VARIABLE.getEStructuralFeatures().get(2);
        EAttribute VARIABLE__TYPE = (EAttribute)VARIABLE.getEStructuralFeatures().get(3);
        EAttribute VARIABLE__INTERNAL = (EAttribute)VARIABLE.getEStructuralFeatures().get(4);
        EAttribute VARIABLE__PARAMETER = (EAttribute)VARIABLE.getEStructuralFeatures().get(5);
        EAttribute VARIABLE__DEFAULT_VALUE = (EAttribute)VARIABLE.getEStructuralFeatures().get(6);

        EClass SCOPE = eINSTANCE.getScopeEClass();
        EAttribute SCOPE__NAME = (EAttribute)SCOPE.getEStructuralFeatures().get(0);
        EReference SCOPE__FLOW = (EReference)SCOPE.getEStructuralFeatures().get(1);

        EClass FLOW = eINSTANCE.getFlowEClass();
        EAttribute FLOW__NAME = (EAttribute)FLOW.getEStructuralFeatures().get(0);
        EReference FLOW__LINKS = (EReference)FLOW.getEStructuralFeatures().get(1);
        EReference FLOW__ACTIVITIES = (EReference)FLOW.getEStructuralFeatures().get(2);

        EClass LINK = eINSTANCE.getLinkEClass();
        EAttribute LINK__NAME = (EAttribute)LINK.getEStructuralFeatures().get(0);
        EAttribute LINK__LINK_TYPE = (EAttribute)LINK.getEStructuralFeatures().get(1);
        EAttribute LINK__LABEL = (EAttribute)LINK.getEStructuralFeatures().get(2);
        EReference LINK__SOURCE = (EReference)LINK.getEStructuralFeatures().get(3);
        EReference LINK__TARGET = (EReference)LINK.getEStructuralFeatures().get(4);

        EClass ACTIVITY = eINSTANCE.getActivityEClass();
        EAttribute ACTIVITY__NAME = (EAttribute)ACTIVITY.getEStructuralFeatures().get(0);
        EAttribute ACTIVITY__XPDL_ID = (EAttribute)ACTIVITY.getEStructuralFeatures().get(1);
        EReference ACTIVITY__OUTGOING_LINKS = (EReference)ACTIVITY.getEStructuralFeatures().get(2);
        EReference ACTIVITY__INCOMING_LINKS = (EReference)ACTIVITY.getEStructuralFeatures().get(3);
        EReference ACTIVITY__SOURCES = (EReference)ACTIVITY.getEStructuralFeatures().get(4);
        EReference ACTIVITY__TARGETS = (EReference)ACTIVITY.getEStructuralFeatures().get(5);

        EClass SOURCE = eINSTANCE.getSourceEClass();
        EAttribute SOURCE__LINK_NAME = (EAttribute)SOURCE.getEStructuralFeatures().get(0);
        EAttribute SOURCE__TRANSITION_CONDITION = (EAttribute)SOURCE.getEStructuralFeatures().get(1);
        EAttribute SOURCE__TRANSITION_CONDITION_LANGUAGE = (EAttribute)SOURCE.getEStructuralFeatures().get(2);
        EReference SOURCE__LINK = (EReference)SOURCE.getEStructuralFeatures().get(3);

        EClass TARGET = eINSTANCE.getTargetEClass();
        EAttribute TARGET__LINK_NAME = (EAttribute)TARGET.getEStructuralFeatures().get(0);
        EReference TARGET__LINK = (EReference)TARGET.getEStructuralFeatures().get(1);

        EClass ACTIVITY_EXTENSION = eINSTANCE.getActivityExtensionEClass();
        EAttribute ACTIVITY_EXTENSION__INPUT_VARIABLE = (EAttribute)ACTIVITY_EXTENSION.getEStructuralFeatures().get(0);
        EAttribute ACTIVITY_EXTENSION__OUTPUT_VARIABLE = (EAttribute)ACTIVITY_EXTENSION.getEStructuralFeatures().get(1);
        EAttribute ACTIVITY_EXTENSION__EXPRESSION = (EAttribute)ACTIVITY_EXTENSION.getEStructuralFeatures().get(2);
        EAttribute ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE = (EAttribute)ACTIVITY_EXTENSION.getEStructuralFeatures().get(3);
        EAttribute ACTIVITY_EXTENSION__INPUT_BINDINGS = (EAttribute)ACTIVITY_EXTENSION.getEStructuralFeatures().get(4);
        EAttribute ACTIVITY_EXTENSION__CONFIG = (EAttribute)ACTIVITY_EXTENSION.getEStructuralFeatures().get(5);
        EAttribute ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID = (EAttribute)ACTIVITY_EXTENSION.getEStructuralFeatures().get(6);

        EClass RECEIVE_EVENT = eINSTANCE.getReceiveEventEClass();
        EAttribute RECEIVE_EVENT__CREATE_INSTANCE = (EAttribute)RECEIVE_EVENT.getEStructuralFeatures().get(0);
        EAttribute RECEIVE_EVENT__EVENT_TIMEOUT = (EAttribute)RECEIVE_EVENT.getEStructuralFeatures().get(1);
        EAttribute RECEIVE_EVENT__VARIABLE = (EAttribute)RECEIVE_EVENT.getEStructuralFeatures().get(2);
        EAttribute RECEIVE_EVENT__EVENT_SOURCE = (EAttribute)RECEIVE_EVENT.getEStructuralFeatures().get(3);

        EClass EMPTY_ACTIVITY = eINSTANCE.getEmptyActivityEClass();
        EAttribute EMPTY_ACTIVITY__CONSTRUCTOR = (EAttribute)EMPTY_ACTIVITY.getEStructuralFeatures().get(0);

    }
}
