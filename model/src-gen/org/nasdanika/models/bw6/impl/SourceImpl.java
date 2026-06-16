package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Link;
import org.nasdanika.models.bw6.Source;

public class SourceImpl extends MinimalEObjectImpl.Container implements Source {
    protected static final String LINK_NAME_EDEFAULT = null;
    protected static final String TRANSITION_CONDITION_EDEFAULT = null;
    protected static final String TRANSITION_CONDITION_LANGUAGE_EDEFAULT = null;

    protected SourceImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.SOURCE;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public String getLinkName() {
        return (String)eDynamicGet(Bw6Package.SOURCE__LINK_NAME, Bw6Package.Literals.SOURCE__LINK_NAME, true, true);
    }

    @Override
    public void setLinkName(String value) {
        eDynamicSet(Bw6Package.SOURCE__LINK_NAME, Bw6Package.Literals.SOURCE__LINK_NAME, value);
    }

    @Override
    public String getTransitionCondition() {
        return (String)eDynamicGet(Bw6Package.SOURCE__TRANSITION_CONDITION, Bw6Package.Literals.SOURCE__TRANSITION_CONDITION, true, true);
    }

    @Override
    public void setTransitionCondition(String value) {
        eDynamicSet(Bw6Package.SOURCE__TRANSITION_CONDITION, Bw6Package.Literals.SOURCE__TRANSITION_CONDITION, value);
    }

    @Override
    public String getTransitionConditionLanguage() {
        return (String)eDynamicGet(Bw6Package.SOURCE__TRANSITION_CONDITION_LANGUAGE, Bw6Package.Literals.SOURCE__TRANSITION_CONDITION_LANGUAGE, true, true);
    }

    @Override
    public void setTransitionConditionLanguage(String value) {
        eDynamicSet(Bw6Package.SOURCE__TRANSITION_CONDITION_LANGUAGE, Bw6Package.Literals.SOURCE__TRANSITION_CONDITION_LANGUAGE, value);
    }

    @Override
    public Link getLink() {
        return (Link)eDynamicGet(Bw6Package.SOURCE__LINK, Bw6Package.Literals.SOURCE__LINK, true, true);
    }

    @Override
    public void setLink(Link value) {
        eDynamicSet(Bw6Package.SOURCE__LINK, Bw6Package.Literals.SOURCE__LINK, value);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.SOURCE__LINK_NAME:
                return getLinkName();
            case Bw6Package.SOURCE__TRANSITION_CONDITION:
                return getTransitionCondition();
            case Bw6Package.SOURCE__TRANSITION_CONDITION_LANGUAGE:
                return getTransitionConditionLanguage();
            case Bw6Package.SOURCE__LINK:
                return getLink();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.SOURCE__LINK_NAME:
                setLinkName((String)newValue);
                return;
            case Bw6Package.SOURCE__TRANSITION_CONDITION:
                setTransitionCondition((String)newValue);
                return;
            case Bw6Package.SOURCE__TRANSITION_CONDITION_LANGUAGE:
                setTransitionConditionLanguage((String)newValue);
                return;
            case Bw6Package.SOURCE__LINK:
                setLink((Link)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.SOURCE__LINK_NAME:
                setLinkName(null);
                return;
            case Bw6Package.SOURCE__TRANSITION_CONDITION:
                setTransitionCondition(null);
                return;
            case Bw6Package.SOURCE__TRANSITION_CONDITION_LANGUAGE:
                setTransitionConditionLanguage(null);
                return;
            case Bw6Package.SOURCE__LINK:
                setLink(null);
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.SOURCE__LINK_NAME:
                return LINK_NAME_EDEFAULT == null ? getLinkName() != null : !LINK_NAME_EDEFAULT.equals(getLinkName());
            case Bw6Package.SOURCE__TRANSITION_CONDITION:
                return TRANSITION_CONDITION_EDEFAULT == null ? getTransitionCondition() != null : !TRANSITION_CONDITION_EDEFAULT.equals(getTransitionCondition());
            case Bw6Package.SOURCE__TRANSITION_CONDITION_LANGUAGE:
                return TRANSITION_CONDITION_LANGUAGE_EDEFAULT == null ? getTransitionConditionLanguage() != null : !TRANSITION_CONDITION_LANGUAGE_EDEFAULT.equals(getTransitionConditionLanguage());
            case Bw6Package.SOURCE__LINK:
                return getLink() != null;
        }
        return super.eIsSet(featureID);
    }
}
