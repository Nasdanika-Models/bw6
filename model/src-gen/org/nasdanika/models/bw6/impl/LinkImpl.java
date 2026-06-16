package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.bw6.Activity;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Link;

public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
    protected static final String NAME_EDEFAULT = null;
    protected static final String LINK_TYPE_EDEFAULT = null;
    protected static final String LABEL_EDEFAULT = null;

    protected LinkImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.LINK;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public String getName() {
        return (String)eDynamicGet(Bw6Package.LINK__NAME, Bw6Package.Literals.LINK__NAME, true, true);
    }

    @Override
    public void setName(String value) {
        eDynamicSet(Bw6Package.LINK__NAME, Bw6Package.Literals.LINK__NAME, value);
    }

    @Override
    public String getLinkType() {
        return (String)eDynamicGet(Bw6Package.LINK__LINK_TYPE, Bw6Package.Literals.LINK__LINK_TYPE, true, true);
    }

    @Override
    public void setLinkType(String value) {
        eDynamicSet(Bw6Package.LINK__LINK_TYPE, Bw6Package.Literals.LINK__LINK_TYPE, value);
    }

    @Override
    public String getLabel() {
        return (String)eDynamicGet(Bw6Package.LINK__LABEL, Bw6Package.Literals.LINK__LABEL, true, true);
    }

    @Override
    public void setLabel(String value) {
        eDynamicSet(Bw6Package.LINK__LABEL, Bw6Package.Literals.LINK__LABEL, value);
    }

    @Override
    public Activity getSource() {
        return (Activity)eDynamicGet(Bw6Package.LINK__SOURCE, Bw6Package.Literals.LINK__SOURCE, true, true);
    }

    @Override
    public void setSource(Activity value) {
        eDynamicSet(Bw6Package.LINK__SOURCE, Bw6Package.Literals.LINK__SOURCE, value);
    }

    @Override
    public Activity getTarget() {
        return (Activity)eDynamicGet(Bw6Package.LINK__TARGET, Bw6Package.Literals.LINK__TARGET, true, true);
    }

    @Override
    public void setTarget(Activity value) {
        eDynamicSet(Bw6Package.LINK__TARGET, Bw6Package.Literals.LINK__TARGET, value);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.LINK__NAME:
                return getName();
            case Bw6Package.LINK__LINK_TYPE:
                return getLinkType();
            case Bw6Package.LINK__LABEL:
                return getLabel();
            case Bw6Package.LINK__SOURCE:
                return getSource();
            case Bw6Package.LINK__TARGET:
                return getTarget();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.LINK__NAME:
                setName((String)newValue);
                return;
            case Bw6Package.LINK__LINK_TYPE:
                setLinkType((String)newValue);
                return;
            case Bw6Package.LINK__LABEL:
                setLabel((String)newValue);
                return;
            case Bw6Package.LINK__SOURCE:
                setSource((Activity)newValue);
                return;
            case Bw6Package.LINK__TARGET:
                setTarget((Activity)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.LINK__NAME:
                setName(null);
                return;
            case Bw6Package.LINK__LINK_TYPE:
                setLinkType(null);
                return;
            case Bw6Package.LINK__LABEL:
                setLabel(null);
                return;
            case Bw6Package.LINK__SOURCE:
                setSource(null);
                return;
            case Bw6Package.LINK__TARGET:
                setTarget(null);
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.LINK__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case Bw6Package.LINK__LINK_TYPE:
                return LINK_TYPE_EDEFAULT == null ? getLinkType() != null : !LINK_TYPE_EDEFAULT.equals(getLinkType());
            case Bw6Package.LINK__LABEL:
                return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
            case Bw6Package.LINK__SOURCE:
                return getSource() != null;
            case Bw6Package.LINK__TARGET:
                return getTarget() != null;
        }
        return super.eIsSet(featureID);
    }
}
