package org.nasdanika.models.bw6.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.bw6.Activity;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Link;
import org.nasdanika.models.bw6.Source;
import org.nasdanika.models.bw6.Target;

public abstract class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
    protected static final String NAME_EDEFAULT = null;
    protected static final String XPDL_ID_EDEFAULT = null;

    protected ActivityImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.ACTIVITY;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public String getName() {
        return (String)eDynamicGet(Bw6Package.ACTIVITY__NAME, Bw6Package.Literals.ACTIVITY__NAME, true, true);
    }

    @Override
    public void setName(String value) {
        eDynamicSet(Bw6Package.ACTIVITY__NAME, Bw6Package.Literals.ACTIVITY__NAME, value);
    }

    @Override
    public String getXpdlId() {
        return (String)eDynamicGet(Bw6Package.ACTIVITY__XPDL_ID, Bw6Package.Literals.ACTIVITY__XPDL_ID, true, true);
    }

    @Override
    public void setXpdlId(String value) {
        eDynamicSet(Bw6Package.ACTIVITY__XPDL_ID, Bw6Package.Literals.ACTIVITY__XPDL_ID, value);
    }

    @SuppressWarnings("unchecked")
    @Override
    public EList<Link> getOutgoingLinks() {
        return (EList<Link>)eDynamicGet(Bw6Package.ACTIVITY__OUTGOING_LINKS, Bw6Package.Literals.ACTIVITY__OUTGOING_LINKS, true, true);
    }

    @SuppressWarnings("unchecked")
    @Override
    public EList<Link> getIncomingLinks() {
        return (EList<Link>)eDynamicGet(Bw6Package.ACTIVITY__INCOMING_LINKS, Bw6Package.Literals.ACTIVITY__INCOMING_LINKS, true, true);
    }

    @SuppressWarnings("unchecked")
    @Override
    public EList<Source> getSources() {
        return (EList<Source>)eDynamicGet(Bw6Package.ACTIVITY__SOURCES, Bw6Package.Literals.ACTIVITY__SOURCES, true, true);
    }

    @SuppressWarnings("unchecked")
    @Override
    public EList<Target> getTargets() {
        return (EList<Target>)eDynamicGet(Bw6Package.ACTIVITY__TARGETS, Bw6Package.Literals.ACTIVITY__TARGETS, true, true);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.ACTIVITY__NAME:
                return getName();
            case Bw6Package.ACTIVITY__XPDL_ID:
                return getXpdlId();
            case Bw6Package.ACTIVITY__OUTGOING_LINKS:
                return getOutgoingLinks();
            case Bw6Package.ACTIVITY__INCOMING_LINKS:
                return getIncomingLinks();
            case Bw6Package.ACTIVITY__SOURCES:
                return getSources();
            case Bw6Package.ACTIVITY__TARGETS:
                return getTargets();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.ACTIVITY__NAME:
                setName((String)newValue);
                return;
            case Bw6Package.ACTIVITY__XPDL_ID:
                setXpdlId((String)newValue);
                return;
            case Bw6Package.ACTIVITY__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                getOutgoingLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case Bw6Package.ACTIVITY__INCOMING_LINKS:
                getIncomingLinks().clear();
                getIncomingLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case Bw6Package.ACTIVITY__SOURCES:
                getSources().clear();
                getSources().addAll((Collection<? extends Source>)newValue);
                return;
            case Bw6Package.ACTIVITY__TARGETS:
                getTargets().clear();
                getTargets().addAll((Collection<? extends Target>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.ACTIVITY__NAME:
                setName(null);
                return;
            case Bw6Package.ACTIVITY__XPDL_ID:
                setXpdlId(null);
                return;
            case Bw6Package.ACTIVITY__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                return;
            case Bw6Package.ACTIVITY__INCOMING_LINKS:
                getIncomingLinks().clear();
                return;
            case Bw6Package.ACTIVITY__SOURCES:
                getSources().clear();
                return;
            case Bw6Package.ACTIVITY__TARGETS:
                getTargets().clear();
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.ACTIVITY__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case Bw6Package.ACTIVITY__XPDL_ID:
                return XPDL_ID_EDEFAULT == null ? getXpdlId() != null : !XPDL_ID_EDEFAULT.equals(getXpdlId());
            case Bw6Package.ACTIVITY__OUTGOING_LINKS:
                return !getOutgoingLinks().isEmpty();
            case Bw6Package.ACTIVITY__INCOMING_LINKS:
                return !getIncomingLinks().isEmpty();
            case Bw6Package.ACTIVITY__SOURCES:
                return !getSources().isEmpty();
            case Bw6Package.ACTIVITY__TARGETS:
                return !getTargets().isEmpty();
        }
        return super.eIsSet(featureID);
    }
}
