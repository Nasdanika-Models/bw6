package org.nasdanika.models.bw6.loader;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

import org.nasdanika.models.bw6.Activity;
import org.nasdanika.models.bw6.ActivityExtension;
import org.nasdanika.models.bw6.Bw6Factory;
import org.nasdanika.models.bw6.EmptyActivity;
import org.nasdanika.models.bw6.Flow;
import org.nasdanika.models.bw6.Import;
import org.nasdanika.models.bw6.Link;
import org.nasdanika.models.bw6.PartnerLink;
import org.nasdanika.models.bw6.Process;
import org.nasdanika.models.bw6.ProcessInfo;
import org.nasdanika.models.bw6.ProcessInterface;
import org.nasdanika.models.bw6.ReceiveEvent;
import org.nasdanika.models.bw6.Scope;
import org.nasdanika.models.bw6.Source;
import org.nasdanika.models.bw6.Target;
import org.nasdanika.models.bw6.Variable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class Bw6ProcessLoader {

    public static final String BPWS_NAMESPACE = "http://docs.oasis-open.org/wsbpel/2.0/process/executable";
    public static final String TIBEX_NAMESPACE = "http://www.tibco.com/bpel/2007/extensions";
    public static final String SCA_BPEL_NAMESPACE = "http://docs.oasis-open.org/ns/opencsa/sca-bpel/200801";

    private final Bw6Factory factory;

    public Bw6ProcessLoader() {
        this(Bw6Factory.eINSTANCE);
    }

    public Bw6ProcessLoader(Bw6Factory factory) {
        this.factory = factory;
    }

    public Process load(InputStream inputStream, String systemId) throws XMLStreamException, IOException {
        XMLInputFactory xmlFactory = XMLInputFactory.newFactory();
        xmlFactory.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, Boolean.FALSE);
        xmlFactory.setProperty(XMLInputFactory.SUPPORT_DTD, Boolean.FALSE);
        try (inputStream) {
            return load(xmlFactory.createXMLStreamReader(systemId, inputStream));
        }
    }

    public Process load(XMLStreamReader reader) throws XMLStreamException {
        try {
            while (reader.hasNext()) {
                if (reader.next() == XMLStreamConstants.START_ELEMENT
                        && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                        && "process".equals(reader.getLocalName())) {
                    Process process = parseProcess(reader);
                    resolve(process);
                    return process;
                }
            }
            return null;
        } finally {
            reader.close();
        }
    }

    private Process parseProcess(XMLStreamReader reader) throws XMLStreamException {
        Process process = factory.createProcess();
        process.setName(reader.getAttributeValue(null, "name"));
        process.setTargetNamespace(reader.getAttributeValue(null, "targetNamespace"));
        process.setExitOnStandardFault(parseBoolean(reader.getAttributeValue(null, "exitOnStandardFault")));
        process.setSuppressJoinFailure(parseBoolean(reader.getAttributeValue(null, "suppressJoinFailure")));

        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT) {
                String ns = reader.getNamespaceURI();
                String local = reader.getLocalName();
                if (TIBEX_NAMESPACE.equals(ns) && "ProcessInfo".equals(local)) {
                    process.setInfo(parseProcessInfo(reader));
                } else if (TIBEX_NAMESPACE.equals(ns) && "ProcessInterface".equals(local)) {
                    process.setProcessInterface(parseProcessInterface(reader));
                } else if (TIBEX_NAMESPACE.equals(ns) && "Types".equals(local)) {
                    process.setTypes(captureElement(reader));
                } else if (TIBEX_NAMESPACE.equals(ns) && "ProcessTemplateConfigurations".equals(local)) {
                    skipElement(reader);
                } else if (BPWS_NAMESPACE.equals(ns) && "import".equals(local)) {
                    process.getImports().add(parseImport(reader));
                } else if (BPWS_NAMESPACE.equals(ns) && "partnerLinks".equals(local)) {
                    parsePartnerLinks(reader, process);
                } else if (BPWS_NAMESPACE.equals(ns) && "variables".equals(local)) {
                    parseVariables(reader, process);
                } else if (BPWS_NAMESPACE.equals(ns) && "extensions".equals(local)) {
                    skipElement(reader);
                } else if (BPWS_NAMESPACE.equals(ns) && "scope".equals(local)) {
                    process.setScope(parseScope(reader));
                } else {
                    skipElement(reader);
                }
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "process".equals(reader.getLocalName())) {
                return process;
            }
        }
        return process;
    }

    private ProcessInfo parseProcessInfo(XMLStreamReader reader) throws XMLStreamException {
        ProcessInfo info = factory.createProcessInfo();
        info.setCallable(parseBoolean(reader.getAttributeValue(null, "callable")));
        info.setCreatedBy(reader.getAttributeValue(null, "createdBy"));
        info.setCreationDate(reader.getAttributeValue(null, "creationDate"));
        info.setModifiedBy(reader.getAttributeValue(null, "modifiedBy"));
        info.setModificationDate(reader.getAttributeValue(null, "modificationDate"));
        info.setHistorySize(reader.getAttributeValue(null, "historySize"));
        info.setFlowModel(reader.getAttributeValue(null, "flowModel"));
        info.setPoolIcon(reader.getAttributeValue(null, "poolIcon"));
        skipElement(reader);
        return info;
    }

    private ProcessInterface parseProcessInterface(XMLStreamReader reader) throws XMLStreamException {
        ProcessInterface processInterface = factory.createProcessInterface();
        processInterface.setContext(reader.getAttributeValue(null, "context"));
        processInterface.setInput(reader.getAttributeValue(null, "input"));
        processInterface.setOutput(reader.getAttributeValue(null, "output"));
        skipElement(reader);
        return processInterface;
    }

    private Import parseImport(XMLStreamReader reader) throws XMLStreamException {
        Import imprt = factory.createImport();
        imprt.setImportType(reader.getAttributeValue(null, "importType"));
        imprt.setNamespace(reader.getAttributeValue(null, "namespace"));
        imprt.setLocation(reader.getAttributeValue(null, "location"));
        skipElement(reader);
        return imprt;
    }

    private void parsePartnerLinks(XMLStreamReader reader, Process process) throws XMLStreamException {
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "partnerLink".equals(reader.getLocalName())) {
                process.getPartnerLinks().add(parsePartnerLink(reader));
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "partnerLinks".equals(reader.getLocalName())) {
                return;
            }
        }
    }

    private PartnerLink parsePartnerLink(XMLStreamReader reader) throws XMLStreamException {
        PartnerLink partnerLink = factory.createPartnerLink();
        partnerLink.setName(reader.getAttributeValue(null, "name"));
        partnerLink.setPartnerLinkType(reader.getAttributeValue(null, "partnerLinkType"));
        partnerLink.setMyRole(reader.getAttributeValue(null, "myRole"));
        partnerLink.setPartnerRole(reader.getAttributeValue(null, "partnerRole"));
        skipElement(reader);
        return partnerLink;
    }

    private void parseVariables(XMLStreamReader reader, Process process) throws XMLStreamException {
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "variable".equals(reader.getLocalName())) {
                process.getVariables().add(parseVariable(reader));
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "variables".equals(reader.getLocalName())) {
                return;
            }
        }
    }

    private Variable parseVariable(XMLStreamReader reader) throws XMLStreamException {
        Variable variable = factory.createVariable();
        variable.setName(reader.getAttributeValue(null, "name"));
        variable.setElement(reader.getAttributeValue(null, "element"));
        variable.setMessageType(reader.getAttributeValue(null, "messageType"));
        variable.setType(reader.getAttributeValue(null, "type"));
        variable.setInternal(parseBoolean(reader.getAttributeValue(SCA_BPEL_NAMESPACE, "internal")));
        variable.setParameter(reader.getAttributeValue(TIBEX_NAMESPACE, "parameter"));

        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "from".equals(reader.getLocalName())) {
                parseVariableFrom(reader, variable);
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "variable".equals(reader.getLocalName())) {
                return variable;
            }
        }
        return variable;
    }

    private void parseVariableFrom(XMLStreamReader reader, Variable variable) throws XMLStreamException {
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "literal".equals(reader.getLocalName())) {
                variable.setDefaultValue(readLiteralText(reader));
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "from".equals(reader.getLocalName())) {
                return;
            }
        }
    }

    private Scope parseScope(XMLStreamReader reader) throws XMLStreamException {
        Scope scope = factory.createScope();
        scope.setName(reader.getAttributeValue(null, "name"));
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT) {
                if (BPWS_NAMESPACE.equals(reader.getNamespaceURI()) && "flow".equals(reader.getLocalName())) {
                    scope.setFlow(parseFlow(reader));
                } else {
                    skipElement(reader);
                }
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "scope".equals(reader.getLocalName())) {
                return scope;
            }
        }
        return scope;
    }

    private Flow parseFlow(XMLStreamReader reader) throws XMLStreamException {
        Flow flow = factory.createFlow();
        flow.setName(reader.getAttributeValue(null, "name"));
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT) {
                String ns = reader.getNamespaceURI();
                String local = reader.getLocalName();
                if (BPWS_NAMESPACE.equals(ns) && "links".equals(local)) {
                    parseLinks(reader, flow);
                } else if (BPWS_NAMESPACE.equals(ns) && "extensionActivity".equals(local)) {
                    Activity activity = parseExtensionActivity(reader);
                    if (activity != null) {
                        flow.getActivities().add(activity);
                    }
                } else if (BPWS_NAMESPACE.equals(ns) && "empty".equals(local)) {
                    flow.getActivities().add(parseEmptyActivity(reader));
                } else if (BPWS_NAMESPACE.equals(ns) && "scope".equals(local)) {
                    mergeNestedScope(flow, parseScope(reader));
                } else {
                    scanNestedActivities(reader, flow);
                }
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "flow".equals(reader.getLocalName())) {
                return flow;
            }
        }
        return flow;
    }

    private void mergeNestedScope(Flow flow, Scope nestedScope) {
        if (nestedScope != null && nestedScope.getFlow() != null) {
            flow.getLinks().addAll(nestedScope.getFlow().getLinks());
            flow.getActivities().addAll(nestedScope.getFlow().getActivities());
        }
    }

    private void scanNestedActivities(XMLStreamReader reader, Flow flow) throws XMLStreamException {
        String startNs = reader.getNamespaceURI();
        String startLocal = reader.getLocalName();
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT) {
                String ns = reader.getNamespaceURI();
                String local = reader.getLocalName();
                if (BPWS_NAMESPACE.equals(ns) && "extensionActivity".equals(local)) {
                    Activity activity = parseExtensionActivity(reader);
                    if (activity != null) {
                        flow.getActivities().add(activity);
                    }
                } else if (BPWS_NAMESPACE.equals(ns) && "empty".equals(local)) {
                    flow.getActivities().add(parseEmptyActivity(reader));
                } else if (BPWS_NAMESPACE.equals(ns) && "scope".equals(local)) {
                    mergeNestedScope(flow, parseScope(reader));
                } else {
                    scanNestedActivities(reader, flow);
                }
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && safeEquals(startNs, reader.getNamespaceURI())
                    && startLocal.equals(reader.getLocalName())) {
                return;
            }
        }
    }

    private void parseLinks(XMLStreamReader reader, Flow flow) throws XMLStreamException {
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "link".equals(reader.getLocalName())) {
                flow.getLinks().add(parseLink(reader));
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "links".equals(reader.getLocalName())) {
                return;
            }
        }
    }

    private Link parseLink(XMLStreamReader reader) throws XMLStreamException {
        Link link = factory.createLink();
        link.setName(reader.getAttributeValue(null, "name"));
        link.setLinkType(reader.getAttributeValue(TIBEX_NAMESPACE, "linkType"));
        link.setLabel(reader.getAttributeValue(TIBEX_NAMESPACE, "label"));
        skipElement(reader);
        return link;
    }

    private Activity parseExtensionActivity(XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT) {
                if (TIBEX_NAMESPACE.equals(reader.getNamespaceURI()) && "receiveEvent".equals(reader.getLocalName())) {
                    Activity activity = parseReceiveEvent(reader);
                    consumeEnd(reader, BPWS_NAMESPACE, "extensionActivity");
                    return activity;
                }
                if (TIBEX_NAMESPACE.equals(reader.getNamespaceURI()) && "activityExtension".equals(reader.getLocalName())) {
                    Activity activity = parseActivityExtension(reader);
                    consumeEnd(reader, BPWS_NAMESPACE, "extensionActivity");
                    return activity;
                }
                skipElement(reader);
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "extensionActivity".equals(reader.getLocalName())) {
                return null;
            }
        }
        return null;
    }

    private ReceiveEvent parseReceiveEvent(XMLStreamReader reader) throws XMLStreamException {
        ReceiveEvent receiveEvent = factory.createReceiveEvent();
        receiveEvent.setName(reader.getAttributeValue(null, "name"));
        receiveEvent.setXpdlId(reader.getAttributeValue(TIBEX_NAMESPACE, "xpdlId"));
        receiveEvent.setCreateInstance(parseBoolean(reader.getAttributeValue(null, "createInstance")));
        receiveEvent.setEventTimeout(parseInt(reader.getAttributeValue(null, "eventTimeout")));
        receiveEvent.setVariable(reader.getAttributeValue(null, "variable"));

        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT) {
                String ns = reader.getNamespaceURI();
                String local = reader.getLocalName();
                if (BPWS_NAMESPACE.equals(ns) && "sources".equals(local)) {
                    parseSources(reader, receiveEvent);
                } else if (BPWS_NAMESPACE.equals(ns) && "targets".equals(local)) {
                    parseTargets(reader, receiveEvent);
                } else if (TIBEX_NAMESPACE.equals(ns) && "eventSource".equals(local)) {
                    receiveEvent.setEventSource(captureElement(reader));
                } else {
                    skipElement(reader);
                }
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && TIBEX_NAMESPACE.equals(reader.getNamespaceURI())
                    && "receiveEvent".equals(reader.getLocalName())) {
                return receiveEvent;
            }
        }
        return receiveEvent;
    }

    private ActivityExtension parseActivityExtension(XMLStreamReader reader) throws XMLStreamException {
        ActivityExtension activityExtension = factory.createActivityExtension();
        activityExtension.setName(reader.getAttributeValue(null, "name"));
        activityExtension.setXpdlId(reader.getAttributeValue(TIBEX_NAMESPACE, "xpdlId"));
        activityExtension.setInputVariable(reader.getAttributeValue(null, "inputVariable"));
        activityExtension.setOutputVariable(reader.getAttributeValue(null, "outputVariable"));
        activityExtension.setExpression(reader.getAttributeValue(null, "expression"));
        activityExtension.setExpressionLanguage(reader.getAttributeValue(null, "expressionLanguage"));

        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT) {
                String ns = reader.getNamespaceURI();
                String local = reader.getLocalName();
                if (BPWS_NAMESPACE.equals(ns) && "sources".equals(local)) {
                    parseSources(reader, activityExtension);
                } else if (BPWS_NAMESPACE.equals(ns) && "targets".equals(local)) {
                    parseTargets(reader, activityExtension);
                } else if (TIBEX_NAMESPACE.equals(ns) && "inputBindings".equals(local)) {
                    String inputBindings = captureElement(reader);
                    activityExtension.setInputBindings(inputBindings);
                    populateInputBindingAttributes(activityExtension, inputBindings);
                } else if (TIBEX_NAMESPACE.equals(ns) && "config".equals(local)) {
                    String config = captureElement(reader);
                    activityExtension.setConfig(config);
                    activityExtension.setActivityTypeId(extractActivityTypeId(config));
                } else {
                    skipElement(reader);
                }
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && TIBEX_NAMESPACE.equals(reader.getNamespaceURI())
                    && "activityExtension".equals(reader.getLocalName())) {
                return activityExtension;
            }
        }
        return activityExtension;
    }

    private EmptyActivity parseEmptyActivity(XMLStreamReader reader) throws XMLStreamException {
        EmptyActivity emptyActivity = factory.createEmptyActivity();
        emptyActivity.setName(reader.getAttributeValue(null, "name"));
        emptyActivity.setXpdlId(reader.getAttributeValue(TIBEX_NAMESPACE, "xpdlId"));
        emptyActivity.setConstructor(reader.getAttributeValue(TIBEX_NAMESPACE, "constructor"));
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT) {
                if (BPWS_NAMESPACE.equals(reader.getNamespaceURI()) && "sources".equals(reader.getLocalName())) {
                    parseSources(reader, emptyActivity);
                } else if (BPWS_NAMESPACE.equals(reader.getNamespaceURI()) && "targets".equals(reader.getLocalName())) {
                    parseTargets(reader, emptyActivity);
                } else {
                    skipElement(reader);
                }
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "empty".equals(reader.getLocalName())) {
                return emptyActivity;
            }
        }
        return emptyActivity;
    }

    private void parseSources(XMLStreamReader reader, Activity activity) throws XMLStreamException {
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "source".equals(reader.getLocalName())) {
                activity.getSources().add(parseSource(reader));
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "sources".equals(reader.getLocalName())) {
                return;
            }
        }
    }

    private void parseTargets(XMLStreamReader reader, Activity activity) throws XMLStreamException {
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "target".equals(reader.getLocalName())) {
                activity.getTargets().add(parseTarget(reader));
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "targets".equals(reader.getLocalName())) {
                return;
            }
        }
    }

    private Source parseSource(XMLStreamReader reader) throws XMLStreamException {
        Source source = factory.createSource();
        source.setLinkName(reader.getAttributeValue(null, "linkName"));
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "transitionCondition".equals(reader.getLocalName())) {
                source.setTransitionConditionLanguage(reader.getAttributeValue(null, "expressionLanguage"));
                source.setTransitionCondition(reader.getElementText());
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "source".equals(reader.getLocalName())) {
                return source;
            }
        }
        return source;
    }

    private Target parseTarget(XMLStreamReader reader) throws XMLStreamException {
        Target target = factory.createTarget();
        target.setLinkName(reader.getAttributeValue(null, "linkName"));
        skipElement(reader);
        return target;
    }

    private void resolve(Process process) {
        if (process == null || process.getScope() == null || process.getScope().getFlow() == null) {
            return;
        }
        Flow flow = process.getScope().getFlow();
        Map<String, Link> linksByName = new LinkedHashMap<>();
        for (Link link : flow.getLinks()) {
            if (link.getName() != null) {
                linksByName.put(link.getName(), link);
            }
        }
        for (Activity activity : flow.getActivities()) {
            for (Source source : activity.getSources()) {
                Link link = linksByName.get(source.getLinkName());
                source.setLink(link);
                if (link != null) {
                    link.setSource(activity);
                    if (!activity.getOutgoingLinks().contains(link)) {
                        activity.getOutgoingLinks().add(link);
                    }
                }
            }
            for (Target target : activity.getTargets()) {
                Link link = linksByName.get(target.getLinkName());
                target.setLink(link);
                if (link != null) {
                    link.setTarget(activity);
                    if (!activity.getIncomingLinks().contains(link)) {
                        activity.getIncomingLinks().add(link);
                    }
                }
            }
        }
    }

    private void populateInputBindingAttributes(ActivityExtension activityExtension, String xml) {
        Element root = parseXmlFragment(xml);
        if (root == null) {
            return;
        }
        Element inputBinding = findElement(root, "inputBinding");
        if (inputBinding != null) {
            if (activityExtension.getExpression() == null) {
                activityExtension.setExpression(inputBinding.getAttribute("expression"));
            }
            if (activityExtension.getExpressionLanguage() == null) {
                activityExtension.setExpressionLanguage(inputBinding.getAttribute("expressionLanguage"));
            }
        }
    }

    private String extractActivityTypeId(String xml) {
        Element root = parseXmlFragment(xml);
        if (root == null) {
            return null;
        }
        Element bwActivity = findElement(root, "BWActivity");
        return bwActivity == null ? null : bwActivity.getAttribute("activityTypeID");
    }

    private Element parseXmlFragment(String xml) {
        if (xml == null || xml.isBlank()) {
            return null;
        }
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
            factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            factory.setXIncludeAware(false);
            factory.setExpandEntityReferences(false);
            Document document = factory.newDocumentBuilder().parse(new InputSource(new StringReader(xml)));
            return document.getDocumentElement();
        } catch (Exception e) {
            return null;
        }
    }

    private Element findElement(Element start, String localName) {
        if (localName.equals(start.getLocalName()) || localName.equals(start.getNodeName())) {
            return start;
        }
        for (Node child = start.getFirstChild(); child != null; child = child.getNextSibling()) {
            if (child instanceof Element element) {
                Element found = findElement(element, localName);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }

    private String readLiteralText(XMLStreamReader reader) throws XMLStreamException {
        StringBuilder sb = new StringBuilder();
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.CHARACTERS || event == XMLStreamConstants.CDATA) {
                sb.append(reader.getText());
            } else if (event == XMLStreamConstants.START_ELEMENT) {
                sb.append(captureElement(reader));
            } else if (event == XMLStreamConstants.END_ELEMENT
                    && BPWS_NAMESPACE.equals(reader.getNamespaceURI())
                    && "literal".equals(reader.getLocalName())) {
                return sb.toString().trim();
            }
        }
        return sb.toString().trim();
    }

    private void consumeEnd(XMLStreamReader reader, String namespace, String localName) throws XMLStreamException {
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.END_ELEMENT
                    && safeEquals(namespace, reader.getNamespaceURI())
                    && localName.equals(reader.getLocalName())) {
                return;
            }
        }
    }

    private boolean parseBoolean(String value) {
        return value != null && ("true".equalsIgnoreCase(value)
                || "yes".equalsIgnoreCase(value)
                || "1".equals(value));
    }

    private int parseInt(String value) {
        if (value == null || value.isBlank()) {
            return 0;
        }
        return Integer.parseInt(value);
    }

    private void skipElement(XMLStreamReader reader) throws XMLStreamException {
        int depth = 1;
        while (depth > 0 && reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT) {
                depth++;
            } else if (event == XMLStreamConstants.END_ELEMENT) {
                depth--;
            }
        }
    }

    private String captureElement(XMLStreamReader reader) throws XMLStreamException {
        StringWriter sw = new StringWriter();
        XMLStreamWriter writer = XMLOutputFactory.newFactory().createXMLStreamWriter(sw);
        int depth = 0;
        while (true) {
            switch (reader.getEventType()) {
                case XMLStreamConstants.START_ELEMENT:
                    depth++;
                    writeStartElement(reader, writer);
                    break;
                case XMLStreamConstants.CHARACTERS:
                case XMLStreamConstants.SPACE:
                    writer.writeCharacters(reader.getText());
                    break;
                case XMLStreamConstants.CDATA:
                    writer.writeCData(reader.getText());
                    break;
                case XMLStreamConstants.COMMENT:
                    writer.writeComment(reader.getText());
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    writer.writeEndElement();
                    depth--;
                    if (depth == 0) {
                        writer.flush();
                        writer.close();
                        return sw.toString();
                    }
                    break;
                default:
                    break;
            }
            if (!reader.hasNext()) {
                writer.flush();
                writer.close();
                return sw.toString();
            }
            reader.next();
        }
    }

    private void writeStartElement(XMLStreamReader reader, XMLStreamWriter writer) throws XMLStreamException {
        String prefix = reader.getPrefix();
        String namespace = reader.getNamespaceURI();
        String localName = reader.getLocalName();
        if (namespace != null && !namespace.isEmpty()) {
            if (prefix == null || prefix.isEmpty()) {
                writer.writeStartElement("", localName, namespace);
                writer.writeDefaultNamespace(namespace);
            } else {
                writer.writeStartElement(prefix, localName, namespace);
                writer.writeNamespace(prefix, namespace);
            }
        } else {
            writer.writeStartElement(localName);
        }
        for (int i = 0; i < reader.getNamespaceCount(); i++) {
            String nsPrefix = reader.getNamespacePrefix(i);
            String nsUri = reader.getNamespaceURI(i);
            if (nsPrefix == null || nsPrefix.isEmpty()) {
                writer.writeDefaultNamespace(nsUri == null ? "" : nsUri);
            } else {
                writer.writeNamespace(nsPrefix, nsUri == null ? "" : nsUri);
            }
        }
        for (int i = 0; i < reader.getAttributeCount(); i++) {
            String attrPrefix = reader.getAttributePrefix(i);
            String attrNamespace = reader.getAttributeNamespace(i);
            String attrLocal = reader.getAttributeLocalName(i);
            String value = reader.getAttributeValue(i);
            if (attrNamespace != null && !attrNamespace.isEmpty()) {
                if (attrPrefix != null && !attrPrefix.isEmpty()) {
                    writer.writeNamespace(attrPrefix, attrNamespace);
                    writer.writeAttribute(attrPrefix, attrNamespace, attrLocal, value);
                } else {
                    writer.writeAttribute(attrNamespace, attrLocal, value);
                }
            } else {
                writer.writeAttribute(attrLocal, value);
            }
        }
    }

    private boolean safeEquals(String left, String right) {
        return left == null ? right == null : left.equals(right);
    }
}
