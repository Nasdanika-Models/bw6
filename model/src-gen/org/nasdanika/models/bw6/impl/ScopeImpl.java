package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Flow;
import org.nasdanika.models.bw6.Scope;

public class ScopeImpl extends MinimalEObjectImpl.Container implements Scope {
    protected static final String NAME_EDEFAULT = null;

    protected ScopeImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.SCOPE;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public String getName() {
        return (String)eDynamicGet(Bw6Package.SCOPE__NAME, Bw6Package.Literals.SCOPE__NAME, true, true);
    }

    @Override
    public void setName(String value) {
        eDynamicSet(Bw6Package.SCOPE__NAME, Bw6Package.Literals.SCOPE__NAME, value);
    }

    @Override
    public Flow getFlow() {
        return (Flow)eDynamicGet(Bw6Package.SCOPE__FLOW, Bw6Package.Literals.SCOPE__FLOW, true, true);
    }

    @Override
    public void setFlow(Flow value) {
        eDynamicSet(Bw6Package.SCOPE__FLOW, Bw6Package.Literals.SCOPE__FLOW, value);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.SCOPE__NAME:
                return getName();
            case Bw6Package.SCOPE__FLOW:
                return getFlow();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.SCOPE__NAME:
                setName((String)newValue);
                return;
            case Bw6Package.SCOPE__FLOW:
                setFlow((Flow)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.SCOPE__NAME:
                setName(null);
                return;
            case Bw6Package.SCOPE__FLOW:
                setFlow(null);
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.SCOPE__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case Bw6Package.SCOPE__FLOW:
                return getFlow() != null;
        }
        return super.eIsSet(featureID);
    }
}
