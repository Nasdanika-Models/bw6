package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.ProcessInterface;

public class ProcessInterfaceImpl extends MinimalEObjectImpl.Container implements ProcessInterface {
    protected static final String CONTEXT_EDEFAULT = null;
    protected static final String INPUT_EDEFAULT = null;
    protected static final String OUTPUT_EDEFAULT = null;

    protected ProcessInterfaceImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.PROCESS_INTERFACE;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public String getContext() {
        return (String)eDynamicGet(Bw6Package.PROCESS_INTERFACE__CONTEXT, Bw6Package.Literals.PROCESS_INTERFACE__CONTEXT, true, true);
    }

    @Override
    public void setContext(String value) {
        eDynamicSet(Bw6Package.PROCESS_INTERFACE__CONTEXT, Bw6Package.Literals.PROCESS_INTERFACE__CONTEXT, value);
    }

    @Override
    public String getInput() {
        return (String)eDynamicGet(Bw6Package.PROCESS_INTERFACE__INPUT, Bw6Package.Literals.PROCESS_INTERFACE__INPUT, true, true);
    }

    @Override
    public void setInput(String value) {
        eDynamicSet(Bw6Package.PROCESS_INTERFACE__INPUT, Bw6Package.Literals.PROCESS_INTERFACE__INPUT, value);
    }

    @Override
    public String getOutput() {
        return (String)eDynamicGet(Bw6Package.PROCESS_INTERFACE__OUTPUT, Bw6Package.Literals.PROCESS_INTERFACE__OUTPUT, true, true);
    }

    @Override
    public void setOutput(String value) {
        eDynamicSet(Bw6Package.PROCESS_INTERFACE__OUTPUT, Bw6Package.Literals.PROCESS_INTERFACE__OUTPUT, value);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.PROCESS_INTERFACE__CONTEXT:
                return getContext();
            case Bw6Package.PROCESS_INTERFACE__INPUT:
                return getInput();
            case Bw6Package.PROCESS_INTERFACE__OUTPUT:
                return getOutput();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.PROCESS_INTERFACE__CONTEXT:
                setContext((String)newValue);
                return;
            case Bw6Package.PROCESS_INTERFACE__INPUT:
                setInput((String)newValue);
                return;
            case Bw6Package.PROCESS_INTERFACE__OUTPUT:
                setOutput((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.PROCESS_INTERFACE__CONTEXT:
                setContext(null);
                return;
            case Bw6Package.PROCESS_INTERFACE__INPUT:
                setInput(null);
                return;
            case Bw6Package.PROCESS_INTERFACE__OUTPUT:
                setOutput(null);
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.PROCESS_INTERFACE__CONTEXT:
                return CONTEXT_EDEFAULT == null ? getContext() != null : !CONTEXT_EDEFAULT.equals(getContext());
            case Bw6Package.PROCESS_INTERFACE__INPUT:
                return INPUT_EDEFAULT == null ? getInput() != null : !INPUT_EDEFAULT.equals(getInput());
            case Bw6Package.PROCESS_INTERFACE__OUTPUT:
                return OUTPUT_EDEFAULT == null ? getOutput() != null : !OUTPUT_EDEFAULT.equals(getOutput());
        }
        return super.eIsSet(featureID);
    }
}
