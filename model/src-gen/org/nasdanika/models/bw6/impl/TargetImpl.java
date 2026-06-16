package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Link;
import org.nasdanika.models.bw6.Target;

public class TargetImpl extends MinimalEObjectImpl.Container implements Target {
    protected static final String LINK_NAME_EDEFAULT = null;

    protected TargetImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.TARGET;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public String getLinkName() {
        return (String)eDynamicGet(Bw6Package.TARGET__LINK_NAME, Bw6Package.Literals.TARGET__LINK_NAME, true, true);
    }

    @Override
    public void setLinkName(String value) {
        eDynamicSet(Bw6Package.TARGET__LINK_NAME, Bw6Package.Literals.TARGET__LINK_NAME, value);
    }

    @Override
    public Link getLink() {
        return (Link)eDynamicGet(Bw6Package.TARGET__LINK, Bw6Package.Literals.TARGET__LINK, true, true);
    }

    @Override
    public void setLink(Link value) {
        eDynamicSet(Bw6Package.TARGET__LINK, Bw6Package.Literals.TARGET__LINK, value);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.TARGET__LINK_NAME:
                return getLinkName();
            case Bw6Package.TARGET__LINK:
                return getLink();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.TARGET__LINK_NAME:
                setLinkName((String)newValue);
                return;
            case Bw6Package.TARGET__LINK:
                setLink((Link)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.TARGET__LINK_NAME:
                setLinkName(null);
                return;
            case Bw6Package.TARGET__LINK:
                setLink(null);
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.TARGET__LINK_NAME:
                return LINK_NAME_EDEFAULT == null ? getLinkName() != null : !LINK_NAME_EDEFAULT.equals(getLinkName());
            case Bw6Package.TARGET__LINK:
                return getLink() != null;
        }
        return super.eIsSet(featureID);
    }
}
