package org.nasdanika.models.bw6;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public interface Process extends EObject {
    String getName();
    void setName(String value);

    String getTargetNamespace();
    void setTargetNamespace(String value);

    boolean isExitOnStandardFault();
    void setExitOnStandardFault(boolean value);

    boolean isSuppressJoinFailure();
    void setSuppressJoinFailure(boolean value);

    ProcessInfo getInfo();
    void setInfo(ProcessInfo value);

    ProcessInterface getProcessInterface();
    void setProcessInterface(ProcessInterface value);

    String getTypes();
    void setTypes(String value);

    EList<Import> getImports();

    EList<PartnerLink> getPartnerLinks();

    EList<Variable> getVariables();

    Scope getScope();
    void setScope(Scope value);

}
