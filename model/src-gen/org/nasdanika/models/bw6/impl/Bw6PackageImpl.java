package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.bw6.Process;
import org.nasdanika.models.bw6.ProcessInfo;
import org.nasdanika.models.bw6.ProcessInterface;
import org.nasdanika.models.bw6.Import;
import org.nasdanika.models.bw6.PartnerLink;
import org.nasdanika.models.bw6.Variable;
import org.nasdanika.models.bw6.Scope;
import org.nasdanika.models.bw6.Flow;
import org.nasdanika.models.bw6.Link;
import org.nasdanika.models.bw6.Activity;
import org.nasdanika.models.bw6.Source;
import org.nasdanika.models.bw6.Target;
import org.nasdanika.models.bw6.ActivityExtension;
import org.nasdanika.models.bw6.ReceiveEvent;
import org.nasdanika.models.bw6.EmptyActivity;
import org.nasdanika.models.bw6.Bw6Factory;
import org.nasdanika.models.bw6.Bw6Package;

public class Bw6PackageImpl extends EPackageImpl implements Bw6Package {
    protected static final boolean IS_ABSTRACT = true;
    protected static final boolean IS_INTERFACE = true;
    protected static final boolean IS_GENERATED_INSTANCE_CLASS = true;
    protected static final boolean IS_TRANSIENT = true;
    protected static final boolean IS_VOLATILE = true;
    protected static final boolean CHANGEABLE = true;
    protected static final boolean IS_UNSETTABLE = true;
    protected static final boolean IS_ID = true;
    protected static final boolean IS_UNIQUE = true;
    protected static final boolean IS_DERIVED = true;
    protected static final boolean IS_ORDERED = true;
    protected static final boolean IS_COMPOSITE = true;
    protected static final boolean COMPOSITE = true;
    protected static final boolean IS_RESOLVE_PROXIES = true;

    private EClass processEClass = null;
    private EClass processInfoEClass = null;
    private EClass processInterfaceEClass = null;
    private EClass importEClass = null;
    private EClass partnerLinkEClass = null;
    private EClass variableEClass = null;
    private EClass scopeEClass = null;
    private EClass flowEClass = null;
    private EClass linkEClass = null;
    private EClass activityEClass = null;
    private EClass sourceEClass = null;
    private EClass targetEClass = null;
    private EClass activityExtensionEClass = null;
    private EClass receiveEventEClass = null;
    private EClass emptyActivityEClass = null;

    private Bw6PackageImpl() {
        super(eNS_URI, Bw6Factory.eINSTANCE);
    }

    private static boolean isInited = false;

    public static Bw6Package init() {
        if (isInited) return (Bw6Package)EPackage.Registry.INSTANCE.getEPackage(Bw6Package.eNS_URI);
        Object registeredBw6Package = EPackage.Registry.INSTANCE.get(eNS_URI);
        Bw6PackageImpl theBw6Package = registeredBw6Package instanceof Bw6PackageImpl ? (Bw6PackageImpl)registeredBw6Package : new Bw6PackageImpl();
        isInited = true;
        EcorePackage.eINSTANCE.eClass();
        theBw6Package.createPackageContents();
        theBw6Package.initializePackageContents();
        theBw6Package.freeze();
        EPackage.Registry.INSTANCE.put(Bw6Package.eNS_URI, theBw6Package);
        return theBw6Package;
    }

    @Override
    public EClass getProcessEClass() {
        return processEClass;
    }

    @Override
    public EAttribute getProcess_Name() {
        return (EAttribute)processEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getProcess_TargetNamespace() {
        return (EAttribute)processEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getProcess_ExitOnStandardFault() {
        return (EAttribute)processEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EAttribute getProcess_SuppressJoinFailure() {
        return (EAttribute)processEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EReference getProcess_Info() {
        return (EReference)processEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EReference getProcess_ProcessInterface() {
        return (EReference)processEClass.getEStructuralFeatures().get(5);
    }

    @Override
    public EAttribute getProcess_Types() {
        return (EAttribute)processEClass.getEStructuralFeatures().get(6);
    }

    @Override
    public EReference getProcess_Imports() {
        return (EReference)processEClass.getEStructuralFeatures().get(7);
    }

    @Override
    public EReference getProcess_PartnerLinks() {
        return (EReference)processEClass.getEStructuralFeatures().get(8);
    }

    @Override
    public EReference getProcess_Variables() {
        return (EReference)processEClass.getEStructuralFeatures().get(9);
    }

    @Override
    public EReference getProcess_Scope() {
        return (EReference)processEClass.getEStructuralFeatures().get(10);
    }

    @Override
    public EClass getProcessInfoEClass() {
        return processInfoEClass;
    }

    @Override
    public EAttribute getProcessInfo_Callable() {
        return (EAttribute)processInfoEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getProcessInfo_CreatedBy() {
        return (EAttribute)processInfoEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getProcessInfo_CreationDate() {
        return (EAttribute)processInfoEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EAttribute getProcessInfo_ModifiedBy() {
        return (EAttribute)processInfoEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EAttribute getProcessInfo_ModificationDate() {
        return (EAttribute)processInfoEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EAttribute getProcessInfo_HistorySize() {
        return (EAttribute)processInfoEClass.getEStructuralFeatures().get(5);
    }

    @Override
    public EAttribute getProcessInfo_FlowModel() {
        return (EAttribute)processInfoEClass.getEStructuralFeatures().get(6);
    }

    @Override
    public EAttribute getProcessInfo_PoolIcon() {
        return (EAttribute)processInfoEClass.getEStructuralFeatures().get(7);
    }

    @Override
    public EClass getProcessInterfaceEClass() {
        return processInterfaceEClass;
    }

    @Override
    public EAttribute getProcessInterface_Context() {
        return (EAttribute)processInterfaceEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getProcessInterface_Input() {
        return (EAttribute)processInterfaceEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getProcessInterface_Output() {
        return (EAttribute)processInterfaceEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EClass getImportEClass() {
        return importEClass;
    }

    @Override
    public EAttribute getImport_ImportType() {
        return (EAttribute)importEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getImport_Namespace() {
        return (EAttribute)importEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getImport_Location() {
        return (EAttribute)importEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EClass getPartnerLinkEClass() {
        return partnerLinkEClass;
    }

    @Override
    public EAttribute getPartnerLink_Name() {
        return (EAttribute)partnerLinkEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getPartnerLink_PartnerLinkType() {
        return (EAttribute)partnerLinkEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getPartnerLink_MyRole() {
        return (EAttribute)partnerLinkEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EAttribute getPartnerLink_PartnerRole() {
        return (EAttribute)partnerLinkEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EClass getVariableEClass() {
        return variableEClass;
    }

    @Override
    public EAttribute getVariable_Name() {
        return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getVariable_Element() {
        return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getVariable_MessageType() {
        return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EAttribute getVariable_Type() {
        return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EAttribute getVariable_Internal() {
        return (EAttribute)variableEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EAttribute getVariable_Parameter() {
        return (EAttribute)variableEClass.getEStructuralFeatures().get(5);
    }

    @Override
    public EAttribute getVariable_DefaultValue() {
        return (EAttribute)variableEClass.getEStructuralFeatures().get(6);
    }

    @Override
    public EClass getScopeEClass() {
        return scopeEClass;
    }

    @Override
    public EAttribute getScope_Name() {
        return (EAttribute)scopeEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EReference getScope_Flow() {
        return (EReference)scopeEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EClass getFlowEClass() {
        return flowEClass;
    }

    @Override
    public EAttribute getFlow_Name() {
        return (EAttribute)flowEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EReference getFlow_Links() {
        return (EReference)flowEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EReference getFlow_Activities() {
        return (EReference)flowEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EClass getLinkEClass() {
        return linkEClass;
    }

    @Override
    public EAttribute getLink_Name() {
        return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getLink_LinkType() {
        return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getLink_Label() {
        return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EReference getLink_Source() {
        return (EReference)linkEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EReference getLink_Target() {
        return (EReference)linkEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EClass getActivityEClass() {
        return activityEClass;
    }

    @Override
    public EAttribute getActivity_Name() {
        return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getActivity_XpdlId() {
        return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EReference getActivity_OutgoingLinks() {
        return (EReference)activityEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EReference getActivity_IncomingLinks() {
        return (EReference)activityEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EReference getActivity_Sources() {
        return (EReference)activityEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EReference getActivity_Targets() {
        return (EReference)activityEClass.getEStructuralFeatures().get(5);
    }

    @Override
    public EClass getSourceEClass() {
        return sourceEClass;
    }

    @Override
    public EAttribute getSource_LinkName() {
        return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getSource_TransitionCondition() {
        return (EAttribute)sourceEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getSource_TransitionConditionLanguage() {
        return (EAttribute)sourceEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EReference getSource_Link() {
        return (EReference)sourceEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EClass getTargetEClass() {
        return targetEClass;
    }

    @Override
    public EAttribute getTarget_LinkName() {
        return (EAttribute)targetEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EReference getTarget_Link() {
        return (EReference)targetEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EClass getActivityExtensionEClass() {
        return activityExtensionEClass;
    }

    @Override
    public EAttribute getActivityExtension_InputVariable() {
        return (EAttribute)activityExtensionEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getActivityExtension_OutputVariable() {
        return (EAttribute)activityExtensionEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getActivityExtension_Expression() {
        return (EAttribute)activityExtensionEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EAttribute getActivityExtension_ExpressionLanguage() {
        return (EAttribute)activityExtensionEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EAttribute getActivityExtension_InputBindings() {
        return (EAttribute)activityExtensionEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EAttribute getActivityExtension_Config() {
        return (EAttribute)activityExtensionEClass.getEStructuralFeatures().get(5);
    }

    @Override
    public EAttribute getActivityExtension_ActivityTypeId() {
        return (EAttribute)activityExtensionEClass.getEStructuralFeatures().get(6);
    }

    @Override
    public EClass getReceiveEventEClass() {
        return receiveEventEClass;
    }

    @Override
    public EAttribute getReceiveEvent_CreateInstance() {
        return (EAttribute)receiveEventEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getReceiveEvent_EventTimeout() {
        return (EAttribute)receiveEventEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getReceiveEvent_Variable() {
        return (EAttribute)receiveEventEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EAttribute getReceiveEvent_EventSource() {
        return (EAttribute)receiveEventEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EClass getEmptyActivityEClass() {
        return emptyActivityEClass;
    }

    @Override
    public EAttribute getEmptyActivity_Constructor() {
        return (EAttribute)emptyActivityEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public Bw6Factory getBw6Factory() {
        return (Bw6Factory)getEFactoryInstance();
    }

    private boolean isCreated = false;

    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;
        processEClass = createEClass(PROCESS);
        createEAttribute(processEClass, PROCESS__NAME);
        createEAttribute(processEClass, PROCESS__TARGET_NAMESPACE);
        createEAttribute(processEClass, PROCESS__EXIT_ON_STANDARD_FAULT);
        createEAttribute(processEClass, PROCESS__SUPPRESS_JOIN_FAILURE);
        createEReference(processEClass, PROCESS__INFO);
        createEReference(processEClass, PROCESS__PROCESS_INTERFACE);
        createEAttribute(processEClass, PROCESS__TYPES);
        createEReference(processEClass, PROCESS__IMPORTS);
        createEReference(processEClass, PROCESS__PARTNER_LINKS);
        createEReference(processEClass, PROCESS__VARIABLES);
        createEReference(processEClass, PROCESS__SCOPE);
        processInfoEClass = createEClass(PROCESS_INFO);
        createEAttribute(processInfoEClass, PROCESS_INFO__CALLABLE);
        createEAttribute(processInfoEClass, PROCESS_INFO__CREATED_BY);
        createEAttribute(processInfoEClass, PROCESS_INFO__CREATION_DATE);
        createEAttribute(processInfoEClass, PROCESS_INFO__MODIFIED_BY);
        createEAttribute(processInfoEClass, PROCESS_INFO__MODIFICATION_DATE);
        createEAttribute(processInfoEClass, PROCESS_INFO__HISTORY_SIZE);
        createEAttribute(processInfoEClass, PROCESS_INFO__FLOW_MODEL);
        createEAttribute(processInfoEClass, PROCESS_INFO__POOL_ICON);
        processInterfaceEClass = createEClass(PROCESS_INTERFACE);
        createEAttribute(processInterfaceEClass, PROCESS_INTERFACE__CONTEXT);
        createEAttribute(processInterfaceEClass, PROCESS_INTERFACE__INPUT);
        createEAttribute(processInterfaceEClass, PROCESS_INTERFACE__OUTPUT);
        importEClass = createEClass(IMPORT);
        createEAttribute(importEClass, IMPORT__IMPORT_TYPE);
        createEAttribute(importEClass, IMPORT__NAMESPACE);
        createEAttribute(importEClass, IMPORT__LOCATION);
        partnerLinkEClass = createEClass(PARTNER_LINK);
        createEAttribute(partnerLinkEClass, PARTNER_LINK__NAME);
        createEAttribute(partnerLinkEClass, PARTNER_LINK__PARTNER_LINK_TYPE);
        createEAttribute(partnerLinkEClass, PARTNER_LINK__MY_ROLE);
        createEAttribute(partnerLinkEClass, PARTNER_LINK__PARTNER_ROLE);
        variableEClass = createEClass(VARIABLE);
        createEAttribute(variableEClass, VARIABLE__NAME);
        createEAttribute(variableEClass, VARIABLE__ELEMENT);
        createEAttribute(variableEClass, VARIABLE__MESSAGE_TYPE);
        createEAttribute(variableEClass, VARIABLE__TYPE);
        createEAttribute(variableEClass, VARIABLE__INTERNAL);
        createEAttribute(variableEClass, VARIABLE__PARAMETER);
        createEAttribute(variableEClass, VARIABLE__DEFAULT_VALUE);
        scopeEClass = createEClass(SCOPE);
        createEAttribute(scopeEClass, SCOPE__NAME);
        createEReference(scopeEClass, SCOPE__FLOW);
        flowEClass = createEClass(FLOW);
        createEAttribute(flowEClass, FLOW__NAME);
        createEReference(flowEClass, FLOW__LINKS);
        createEReference(flowEClass, FLOW__ACTIVITIES);
        linkEClass = createEClass(LINK);
        createEAttribute(linkEClass, LINK__NAME);
        createEAttribute(linkEClass, LINK__LINK_TYPE);
        createEAttribute(linkEClass, LINK__LABEL);
        createEReference(linkEClass, LINK__SOURCE);
        createEReference(linkEClass, LINK__TARGET);
        activityEClass = createEClass(ACTIVITY);
        createEAttribute(activityEClass, ACTIVITY__NAME);
        createEAttribute(activityEClass, ACTIVITY__XPDL_ID);
        createEReference(activityEClass, ACTIVITY__OUTGOING_LINKS);
        createEReference(activityEClass, ACTIVITY__INCOMING_LINKS);
        createEReference(activityEClass, ACTIVITY__SOURCES);
        createEReference(activityEClass, ACTIVITY__TARGETS);
        sourceEClass = createEClass(SOURCE);
        createEAttribute(sourceEClass, SOURCE__LINK_NAME);
        createEAttribute(sourceEClass, SOURCE__TRANSITION_CONDITION);
        createEAttribute(sourceEClass, SOURCE__TRANSITION_CONDITION_LANGUAGE);
        createEReference(sourceEClass, SOURCE__LINK);
        targetEClass = createEClass(TARGET);
        createEAttribute(targetEClass, TARGET__LINK_NAME);
        createEReference(targetEClass, TARGET__LINK);
        activityExtensionEClass = createEClass(ACTIVITY_EXTENSION);
        createEAttribute(activityExtensionEClass, ACTIVITY_EXTENSION__INPUT_VARIABLE);
        createEAttribute(activityExtensionEClass, ACTIVITY_EXTENSION__OUTPUT_VARIABLE);
        createEAttribute(activityExtensionEClass, ACTIVITY_EXTENSION__EXPRESSION);
        createEAttribute(activityExtensionEClass, ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE);
        createEAttribute(activityExtensionEClass, ACTIVITY_EXTENSION__INPUT_BINDINGS);
        createEAttribute(activityExtensionEClass, ACTIVITY_EXTENSION__CONFIG);
        createEAttribute(activityExtensionEClass, ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID);
        receiveEventEClass = createEClass(RECEIVE_EVENT);
        createEAttribute(receiveEventEClass, RECEIVE_EVENT__CREATE_INSTANCE);
        createEAttribute(receiveEventEClass, RECEIVE_EVENT__EVENT_TIMEOUT);
        createEAttribute(receiveEventEClass, RECEIVE_EVENT__VARIABLE);
        createEAttribute(receiveEventEClass, RECEIVE_EVENT__EVENT_SOURCE);
        emptyActivityEClass = createEClass(EMPTY_ACTIVITY);
        createEAttribute(emptyActivityEClass, EMPTY_ACTIVITY__CONSTRUCTOR);
    }

    private boolean isInitialized = false;

    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        activityExtensionEClass.getESuperTypes().add(this.getActivityEClass());
        receiveEventEClass.getESuperTypes().add(this.getActivityEClass());
        emptyActivityEClass.getESuperTypes().add(this.getActivityEClass());

        initEClass(processEClass, Process.class, "Process", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, Process.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcess_TargetNamespace(), ecorePackage.getEString(), "targetNamespace", null, 0, 1, Process.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcess_ExitOnStandardFault(), ecorePackage.getEBoolean(), "exitOnStandardFault", null, 0, 1, Process.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcess_SuppressJoinFailure(), ecorePackage.getEBoolean(), "suppressJoinFailure", null, 0, 1, Process.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcess_Info(), this.getProcessInfoEClass(), null, "info", null, 0, 1, Process.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcess_ProcessInterface(), this.getProcessInterfaceEClass(), null, "processInterface", null, 0, 1, Process.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcess_Types(), ecorePackage.getEString(), "types", null, 0, 1, Process.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcess_Imports(), this.getImportEClass(), null, "imports", null, 0, -1, Process.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcess_PartnerLinks(), this.getPartnerLinkEClass(), null, "partnerLinks", null, 0, -1, Process.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcess_Variables(), this.getVariableEClass(), null, "variables", null, 0, -1, Process.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcess_Scope(), this.getScopeEClass(), null, "scope", null, 0, 1, Process.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processInfoEClass, ProcessInfo.class, "ProcessInfo", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProcessInfo_Callable(), ecorePackage.getEBoolean(), "callable", null, 0, 1, ProcessInfo.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessInfo_CreatedBy(), ecorePackage.getEString(), "createdBy", null, 0, 1, ProcessInfo.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessInfo_CreationDate(), ecorePackage.getEString(), "creationDate", null, 0, 1, ProcessInfo.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessInfo_ModifiedBy(), ecorePackage.getEString(), "modifiedBy", null, 0, 1, ProcessInfo.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessInfo_ModificationDate(), ecorePackage.getEString(), "modificationDate", null, 0, 1, ProcessInfo.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessInfo_HistorySize(), ecorePackage.getEString(), "historySize", null, 0, 1, ProcessInfo.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessInfo_FlowModel(), ecorePackage.getEString(), "flowModel", null, 0, 1, ProcessInfo.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessInfo_PoolIcon(), ecorePackage.getEString(), "poolIcon", null, 0, 1, ProcessInfo.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processInterfaceEClass, ProcessInterface.class, "ProcessInterface", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProcessInterface_Context(), ecorePackage.getEString(), "context", null, 0, 1, ProcessInterface.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessInterface_Input(), ecorePackage.getEString(), "input", null, 0, 1, ProcessInterface.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessInterface_Output(), ecorePackage.getEString(), "output", null, 0, 1, ProcessInterface.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(importEClass, Import.class, "Import", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getImport_ImportType(), ecorePackage.getEString(), "importType", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getImport_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getImport_Location(), ecorePackage.getEString(), "location", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(partnerLinkEClass, PartnerLink.class, "PartnerLink", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPartnerLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, PartnerLink.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPartnerLink_PartnerLinkType(), ecorePackage.getEString(), "partnerLinkType", null, 0, 1, PartnerLink.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPartnerLink_MyRole(), ecorePackage.getEString(), "myRole", null, 0, 1, PartnerLink.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPartnerLink_PartnerRole(), ecorePackage.getEString(), "partnerRole", null, 0, 1, PartnerLink.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(variableEClass, Variable.class, "Variable", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariable_Element(), ecorePackage.getEString(), "element", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariable_MessageType(), ecorePackage.getEString(), "messageType", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariable_Internal(), ecorePackage.getEBoolean(), "internal", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariable_Parameter(), ecorePackage.getEString(), "parameter", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVariable_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scopeEClass, Scope.class, "Scope", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getScope_Name(), ecorePackage.getEString(), "name", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScope_Flow(), this.getFlowEClass(), null, "flow", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(flowEClass, Flow.class, "Flow", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFlow_Name(), ecorePackage.getEString(), "name", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFlow_Links(), this.getLinkEClass(), null, "links", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFlow_Activities(), this.getActivityEClass(), null, "activities", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(linkEClass, Link.class, "Link", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLink_LinkType(), ecorePackage.getEString(), "linkType", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLink_Label(), ecorePackage.getEString(), "label", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLink_Source(), this.getActivityEClass(), this.getActivity_OutgoingLinks(), "source", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLink_Target(), this.getActivityEClass(), this.getActivity_IncomingLinks(), "target", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(activityEClass, Activity.class, "Activity", true, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivity_XpdlId(), ecorePackage.getEString(), "xpdlId", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivity_OutgoingLinks(), this.getLinkEClass(), this.getLink_Source(), "outgoingLinks", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivity_IncomingLinks(), this.getLinkEClass(), this.getLink_Target(), "incomingLinks", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivity_Sources(), this.getSourceEClass(), null, "sources", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivity_Targets(), this.getTargetEClass(), null, "targets", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sourceEClass, Source.class, "Source", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSource_LinkName(), ecorePackage.getEString(), "linkName", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSource_TransitionCondition(), ecorePackage.getEString(), "transitionCondition", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSource_TransitionConditionLanguage(), ecorePackage.getEString(), "transitionConditionLanguage", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSource_Link(), this.getLinkEClass(), null, "link", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(targetEClass, Target.class, "Target", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTarget_LinkName(), ecorePackage.getEString(), "linkName", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTarget_Link(), this.getLinkEClass(), null, "link", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(activityExtensionEClass, ActivityExtension.class, "ActivityExtension", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getActivityExtension_InputVariable(), ecorePackage.getEString(), "inputVariable", null, 0, 1, ActivityExtension.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivityExtension_OutputVariable(), ecorePackage.getEString(), "outputVariable", null, 0, 1, ActivityExtension.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivityExtension_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, ActivityExtension.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivityExtension_ExpressionLanguage(), ecorePackage.getEString(), "expressionLanguage", null, 0, 1, ActivityExtension.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivityExtension_InputBindings(), ecorePackage.getEString(), "inputBindings", null, 0, 1, ActivityExtension.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivityExtension_Config(), ecorePackage.getEString(), "config", null, 0, 1, ActivityExtension.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getActivityExtension_ActivityTypeId(), ecorePackage.getEString(), "activityTypeId", null, 0, 1, ActivityExtension.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(receiveEventEClass, ReceiveEvent.class, "ReceiveEvent", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getReceiveEvent_CreateInstance(), ecorePackage.getEBoolean(), "createInstance", null, 0, 1, ReceiveEvent.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getReceiveEvent_EventTimeout(), ecorePackage.getEInt(), "eventTimeout", null, 0, 1, ReceiveEvent.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getReceiveEvent_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, ReceiveEvent.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getReceiveEvent_EventSource(), ecorePackage.getEString(), "eventSource", null, 0, 1, ReceiveEvent.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(emptyActivityEClass, EmptyActivity.class, "EmptyActivity", false, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEmptyActivity_Constructor(), ecorePackage.getEString(), "constructor", null, 0, 1, EmptyActivity.class, !IS_TRANSIENT, !IS_VOLATILE, CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        getProcess_PartnerLinks().getEKeys().add(this.getPartnerLink_Name());
        getProcess_Variables().getEKeys().add(this.getVariable_Name());
        getFlow_Links().getEKeys().add(this.getLink_Name());
        getFlow_Activities().getEKeys().add(this.getActivity_Name());

        createResource(eNS_URI);
    }
}
