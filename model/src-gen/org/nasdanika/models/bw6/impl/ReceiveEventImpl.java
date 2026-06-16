package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.ReceiveEvent;

public class ReceiveEventImpl extends ActivityImpl implements ReceiveEvent {
    protected static final boolean CREATE_INSTANCE_EDEFAULT = false;
    protected static final int EVENT_TIMEOUT_EDEFAULT = 0;
    protected static final String VARIABLE_EDEFAULT = null;
    protected static final String EVENT_SOURCE_EDEFAULT = null;

    protected ReceiveEventImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.RECEIVE_EVENT;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public boolean isCreateInstance() {
        return (boolean)eDynamicGet(Bw6Package.RECEIVE_EVENT__CREATE_INSTANCE, Bw6Package.Literals.RECEIVE_EVENT__CREATE_INSTANCE, true, true);
    }

    @Override
    public void setCreateInstance(boolean value) {
        eDynamicSet(Bw6Package.RECEIVE_EVENT__CREATE_INSTANCE, Bw6Package.Literals.RECEIVE_EVENT__CREATE_INSTANCE, value);
    }

    @Override
    public int getEventTimeout() {
        return (int)eDynamicGet(Bw6Package.RECEIVE_EVENT__EVENT_TIMEOUT, Bw6Package.Literals.RECEIVE_EVENT__EVENT_TIMEOUT, true, true);
    }

    @Override
    public void setEventTimeout(int value) {
        eDynamicSet(Bw6Package.RECEIVE_EVENT__EVENT_TIMEOUT, Bw6Package.Literals.RECEIVE_EVENT__EVENT_TIMEOUT, value);
    }

    @Override
    public String getVariable() {
        return (String)eDynamicGet(Bw6Package.RECEIVE_EVENT__VARIABLE, Bw6Package.Literals.RECEIVE_EVENT__VARIABLE, true, true);
    }

    @Override
    public void setVariable(String value) {
        eDynamicSet(Bw6Package.RECEIVE_EVENT__VARIABLE, Bw6Package.Literals.RECEIVE_EVENT__VARIABLE, value);
    }

    @Override
    public String getEventSource() {
        return (String)eDynamicGet(Bw6Package.RECEIVE_EVENT__EVENT_SOURCE, Bw6Package.Literals.RECEIVE_EVENT__EVENT_SOURCE, true, true);
    }

    @Override
    public void setEventSource(String value) {
        eDynamicSet(Bw6Package.RECEIVE_EVENT__EVENT_SOURCE, Bw6Package.Literals.RECEIVE_EVENT__EVENT_SOURCE, value);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.RECEIVE_EVENT__CREATE_INSTANCE:
                return isCreateInstance();
            case Bw6Package.RECEIVE_EVENT__EVENT_TIMEOUT:
                return getEventTimeout();
            case Bw6Package.RECEIVE_EVENT__VARIABLE:
                return getVariable();
            case Bw6Package.RECEIVE_EVENT__EVENT_SOURCE:
                return getEventSource();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.RECEIVE_EVENT__CREATE_INSTANCE:
                setCreateInstance((boolean)newValue);
                return;
            case Bw6Package.RECEIVE_EVENT__EVENT_TIMEOUT:
                setEventTimeout((int)newValue);
                return;
            case Bw6Package.RECEIVE_EVENT__VARIABLE:
                setVariable((String)newValue);
                return;
            case Bw6Package.RECEIVE_EVENT__EVENT_SOURCE:
                setEventSource((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.RECEIVE_EVENT__CREATE_INSTANCE:
                setCreateInstance(false);
                return;
            case Bw6Package.RECEIVE_EVENT__EVENT_TIMEOUT:
                setEventTimeout(0);
                return;
            case Bw6Package.RECEIVE_EVENT__VARIABLE:
                setVariable(null);
                return;
            case Bw6Package.RECEIVE_EVENT__EVENT_SOURCE:
                setEventSource(null);
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.RECEIVE_EVENT__CREATE_INSTANCE:
                return isCreateInstance() != CREATE_INSTANCE_EDEFAULT;
            case Bw6Package.RECEIVE_EVENT__EVENT_TIMEOUT:
                return getEventTimeout() != EVENT_TIMEOUT_EDEFAULT;
            case Bw6Package.RECEIVE_EVENT__VARIABLE:
                return VARIABLE_EDEFAULT == null ? getVariable() != null : !VARIABLE_EDEFAULT.equals(getVariable());
            case Bw6Package.RECEIVE_EVENT__EVENT_SOURCE:
                return EVENT_SOURCE_EDEFAULT == null ? getEventSource() != null : !EVENT_SOURCE_EDEFAULT.equals(getEventSource());
        }
        return super.eIsSet(featureID);
    }
}
