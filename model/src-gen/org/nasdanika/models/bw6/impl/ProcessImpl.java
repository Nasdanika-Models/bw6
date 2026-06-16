package org.nasdanika.models.bw6.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Import;
import org.nasdanika.models.bw6.PartnerLink;
import org.nasdanika.models.bw6.Process;
import org.nasdanika.models.bw6.ProcessInfo;
import org.nasdanika.models.bw6.ProcessInterface;
import org.nasdanika.models.bw6.Scope;
import org.nasdanika.models.bw6.Variable;

public class ProcessImpl extends MinimalEObjectImpl.Container implements Process {
    protected static final String NAME_EDEFAULT = null;
    protected static final String TARGET_NAMESPACE_EDEFAULT = null;
    protected static final boolean EXIT_ON_STANDARD_FAULT_EDEFAULT = false;
    protected static final boolean SUPPRESS_JOIN_FAILURE_EDEFAULT = false;
    protected static final String TYPES_EDEFAULT = null;

    protected ProcessImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.PROCESS;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public String getName() {
        return (String)eDynamicGet(Bw6Package.PROCESS__NAME, Bw6Package.Literals.PROCESS__NAME, true, true);
    }

    @Override
    public void setName(String value) {
        eDynamicSet(Bw6Package.PROCESS__NAME, Bw6Package.Literals.PROCESS__NAME, value);
    }

    @Override
    public String getTargetNamespace() {
        return (String)eDynamicGet(Bw6Package.PROCESS__TARGET_NAMESPACE, Bw6Package.Literals.PROCESS__TARGET_NAMESPACE, true, true);
    }

    @Override
    public void setTargetNamespace(String value) {
        eDynamicSet(Bw6Package.PROCESS__TARGET_NAMESPACE, Bw6Package.Literals.PROCESS__TARGET_NAMESPACE, value);
    }

    @Override
    public boolean isExitOnStandardFault() {
        return (boolean)eDynamicGet(Bw6Package.PROCESS__EXIT_ON_STANDARD_FAULT, Bw6Package.Literals.PROCESS__EXIT_ON_STANDARD_FAULT, true, true);
    }

    @Override
    public void setExitOnStandardFault(boolean value) {
        eDynamicSet(Bw6Package.PROCESS__EXIT_ON_STANDARD_FAULT, Bw6Package.Literals.PROCESS__EXIT_ON_STANDARD_FAULT, value);
    }

    @Override
    public boolean isSuppressJoinFailure() {
        return (boolean)eDynamicGet(Bw6Package.PROCESS__SUPPRESS_JOIN_FAILURE, Bw6Package.Literals.PROCESS__SUPPRESS_JOIN_FAILURE, true, true);
    }

    @Override
    public void setSuppressJoinFailure(boolean value) {
        eDynamicSet(Bw6Package.PROCESS__SUPPRESS_JOIN_FAILURE, Bw6Package.Literals.PROCESS__SUPPRESS_JOIN_FAILURE, value);
    }

    @Override
    public ProcessInfo getInfo() {
        return (ProcessInfo)eDynamicGet(Bw6Package.PROCESS__INFO, Bw6Package.Literals.PROCESS__INFO, true, true);
    }

    @Override
    public void setInfo(ProcessInfo value) {
        eDynamicSet(Bw6Package.PROCESS__INFO, Bw6Package.Literals.PROCESS__INFO, value);
    }

    @Override
    public ProcessInterface getProcessInterface() {
        return (ProcessInterface)eDynamicGet(Bw6Package.PROCESS__PROCESS_INTERFACE, Bw6Package.Literals.PROCESS__PROCESS_INTERFACE, true, true);
    }

    @Override
    public void setProcessInterface(ProcessInterface value) {
        eDynamicSet(Bw6Package.PROCESS__PROCESS_INTERFACE, Bw6Package.Literals.PROCESS__PROCESS_INTERFACE, value);
    }

    @Override
    public String getTypes() {
        return (String)eDynamicGet(Bw6Package.PROCESS__TYPES, Bw6Package.Literals.PROCESS__TYPES, true, true);
    }

    @Override
    public void setTypes(String value) {
        eDynamicSet(Bw6Package.PROCESS__TYPES, Bw6Package.Literals.PROCESS__TYPES, value);
    }

    @SuppressWarnings("unchecked")
    @Override
    public EList<Import> getImports() {
        return (EList<Import>)eDynamicGet(Bw6Package.PROCESS__IMPORTS, Bw6Package.Literals.PROCESS__IMPORTS, true, true);
    }

    @SuppressWarnings("unchecked")
    @Override
    public EList<PartnerLink> getPartnerLinks() {
        return (EList<PartnerLink>)eDynamicGet(Bw6Package.PROCESS__PARTNER_LINKS, Bw6Package.Literals.PROCESS__PARTNER_LINKS, true, true);
    }

    @SuppressWarnings("unchecked")
    @Override
    public EList<Variable> getVariables() {
        return (EList<Variable>)eDynamicGet(Bw6Package.PROCESS__VARIABLES, Bw6Package.Literals.PROCESS__VARIABLES, true, true);
    }

    @Override
    public Scope getScope() {
        return (Scope)eDynamicGet(Bw6Package.PROCESS__SCOPE, Bw6Package.Literals.PROCESS__SCOPE, true, true);
    }

    @Override
    public void setScope(Scope value) {
        eDynamicSet(Bw6Package.PROCESS__SCOPE, Bw6Package.Literals.PROCESS__SCOPE, value);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.PROCESS__NAME:
                return getName();
            case Bw6Package.PROCESS__TARGET_NAMESPACE:
                return getTargetNamespace();
            case Bw6Package.PROCESS__EXIT_ON_STANDARD_FAULT:
                return isExitOnStandardFault();
            case Bw6Package.PROCESS__SUPPRESS_JOIN_FAILURE:
                return isSuppressJoinFailure();
            case Bw6Package.PROCESS__INFO:
                return getInfo();
            case Bw6Package.PROCESS__PROCESS_INTERFACE:
                return getProcessInterface();
            case Bw6Package.PROCESS__TYPES:
                return getTypes();
            case Bw6Package.PROCESS__IMPORTS:
                return getImports();
            case Bw6Package.PROCESS__PARTNER_LINKS:
                return getPartnerLinks();
            case Bw6Package.PROCESS__VARIABLES:
                return getVariables();
            case Bw6Package.PROCESS__SCOPE:
                return getScope();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.PROCESS__NAME:
                setName((String)newValue);
                return;
            case Bw6Package.PROCESS__TARGET_NAMESPACE:
                setTargetNamespace((String)newValue);
                return;
            case Bw6Package.PROCESS__EXIT_ON_STANDARD_FAULT:
                setExitOnStandardFault((boolean)newValue);
                return;
            case Bw6Package.PROCESS__SUPPRESS_JOIN_FAILURE:
                setSuppressJoinFailure((boolean)newValue);
                return;
            case Bw6Package.PROCESS__INFO:
                setInfo((ProcessInfo)newValue);
                return;
            case Bw6Package.PROCESS__PROCESS_INTERFACE:
                setProcessInterface((ProcessInterface)newValue);
                return;
            case Bw6Package.PROCESS__TYPES:
                setTypes((String)newValue);
                return;
            case Bw6Package.PROCESS__IMPORTS:
                getImports().clear();
                getImports().addAll((Collection<? extends Import>)newValue);
                return;
            case Bw6Package.PROCESS__PARTNER_LINKS:
                getPartnerLinks().clear();
                getPartnerLinks().addAll((Collection<? extends PartnerLink>)newValue);
                return;
            case Bw6Package.PROCESS__VARIABLES:
                getVariables().clear();
                getVariables().addAll((Collection<? extends Variable>)newValue);
                return;
            case Bw6Package.PROCESS__SCOPE:
                setScope((Scope)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.PROCESS__NAME:
                setName(null);
                return;
            case Bw6Package.PROCESS__TARGET_NAMESPACE:
                setTargetNamespace(null);
                return;
            case Bw6Package.PROCESS__EXIT_ON_STANDARD_FAULT:
                setExitOnStandardFault(false);
                return;
            case Bw6Package.PROCESS__SUPPRESS_JOIN_FAILURE:
                setSuppressJoinFailure(false);
                return;
            case Bw6Package.PROCESS__INFO:
                setInfo(null);
                return;
            case Bw6Package.PROCESS__PROCESS_INTERFACE:
                setProcessInterface(null);
                return;
            case Bw6Package.PROCESS__TYPES:
                setTypes(null);
                return;
            case Bw6Package.PROCESS__IMPORTS:
                getImports().clear();
                return;
            case Bw6Package.PROCESS__PARTNER_LINKS:
                getPartnerLinks().clear();
                return;
            case Bw6Package.PROCESS__VARIABLES:
                getVariables().clear();
                return;
            case Bw6Package.PROCESS__SCOPE:
                setScope(null);
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.PROCESS__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case Bw6Package.PROCESS__TARGET_NAMESPACE:
                return TARGET_NAMESPACE_EDEFAULT == null ? getTargetNamespace() != null : !TARGET_NAMESPACE_EDEFAULT.equals(getTargetNamespace());
            case Bw6Package.PROCESS__EXIT_ON_STANDARD_FAULT:
                return isExitOnStandardFault() != EXIT_ON_STANDARD_FAULT_EDEFAULT;
            case Bw6Package.PROCESS__SUPPRESS_JOIN_FAILURE:
                return isSuppressJoinFailure() != SUPPRESS_JOIN_FAILURE_EDEFAULT;
            case Bw6Package.PROCESS__INFO:
                return getInfo() != null;
            case Bw6Package.PROCESS__PROCESS_INTERFACE:
                return getProcessInterface() != null;
            case Bw6Package.PROCESS__TYPES:
                return TYPES_EDEFAULT == null ? getTypes() != null : !TYPES_EDEFAULT.equals(getTypes());
            case Bw6Package.PROCESS__IMPORTS:
                return !getImports().isEmpty();
            case Bw6Package.PROCESS__PARTNER_LINKS:
                return !getPartnerLinks().isEmpty();
            case Bw6Package.PROCESS__VARIABLES:
                return !getVariables().isEmpty();
            case Bw6Package.PROCESS__SCOPE:
                return getScope() != null;
        }
        return super.eIsSet(featureID);
    }
}
