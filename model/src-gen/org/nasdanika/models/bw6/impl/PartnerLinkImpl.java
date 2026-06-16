package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.PartnerLink;

public class PartnerLinkImpl extends MinimalEObjectImpl.Container implements PartnerLink {
    protected static final String NAME_EDEFAULT = null;
    protected static final String PARTNER_LINK_TYPE_EDEFAULT = null;
    protected static final String MY_ROLE_EDEFAULT = null;
    protected static final String PARTNER_ROLE_EDEFAULT = null;

    protected PartnerLinkImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.PARTNER_LINK;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public String getName() {
        return (String)eDynamicGet(Bw6Package.PARTNER_LINK__NAME, Bw6Package.Literals.PARTNER_LINK__NAME, true, true);
    }

    @Override
    public void setName(String value) {
        eDynamicSet(Bw6Package.PARTNER_LINK__NAME, Bw6Package.Literals.PARTNER_LINK__NAME, value);
    }

    @Override
    public String getPartnerLinkType() {
        return (String)eDynamicGet(Bw6Package.PARTNER_LINK__PARTNER_LINK_TYPE, Bw6Package.Literals.PARTNER_LINK__PARTNER_LINK_TYPE, true, true);
    }

    @Override
    public void setPartnerLinkType(String value) {
        eDynamicSet(Bw6Package.PARTNER_LINK__PARTNER_LINK_TYPE, Bw6Package.Literals.PARTNER_LINK__PARTNER_LINK_TYPE, value);
    }

    @Override
    public String getMyRole() {
        return (String)eDynamicGet(Bw6Package.PARTNER_LINK__MY_ROLE, Bw6Package.Literals.PARTNER_LINK__MY_ROLE, true, true);
    }

    @Override
    public void setMyRole(String value) {
        eDynamicSet(Bw6Package.PARTNER_LINK__MY_ROLE, Bw6Package.Literals.PARTNER_LINK__MY_ROLE, value);
    }

    @Override
    public String getPartnerRole() {
        return (String)eDynamicGet(Bw6Package.PARTNER_LINK__PARTNER_ROLE, Bw6Package.Literals.PARTNER_LINK__PARTNER_ROLE, true, true);
    }

    @Override
    public void setPartnerRole(String value) {
        eDynamicSet(Bw6Package.PARTNER_LINK__PARTNER_ROLE, Bw6Package.Literals.PARTNER_LINK__PARTNER_ROLE, value);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.PARTNER_LINK__NAME:
                return getName();
            case Bw6Package.PARTNER_LINK__PARTNER_LINK_TYPE:
                return getPartnerLinkType();
            case Bw6Package.PARTNER_LINK__MY_ROLE:
                return getMyRole();
            case Bw6Package.PARTNER_LINK__PARTNER_ROLE:
                return getPartnerRole();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.PARTNER_LINK__NAME:
                setName((String)newValue);
                return;
            case Bw6Package.PARTNER_LINK__PARTNER_LINK_TYPE:
                setPartnerLinkType((String)newValue);
                return;
            case Bw6Package.PARTNER_LINK__MY_ROLE:
                setMyRole((String)newValue);
                return;
            case Bw6Package.PARTNER_LINK__PARTNER_ROLE:
                setPartnerRole((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.PARTNER_LINK__NAME:
                setName(null);
                return;
            case Bw6Package.PARTNER_LINK__PARTNER_LINK_TYPE:
                setPartnerLinkType(null);
                return;
            case Bw6Package.PARTNER_LINK__MY_ROLE:
                setMyRole(null);
                return;
            case Bw6Package.PARTNER_LINK__PARTNER_ROLE:
                setPartnerRole(null);
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.PARTNER_LINK__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case Bw6Package.PARTNER_LINK__PARTNER_LINK_TYPE:
                return PARTNER_LINK_TYPE_EDEFAULT == null ? getPartnerLinkType() != null : !PARTNER_LINK_TYPE_EDEFAULT.equals(getPartnerLinkType());
            case Bw6Package.PARTNER_LINK__MY_ROLE:
                return MY_ROLE_EDEFAULT == null ? getMyRole() != null : !MY_ROLE_EDEFAULT.equals(getMyRole());
            case Bw6Package.PARTNER_LINK__PARTNER_ROLE:
                return PARTNER_ROLE_EDEFAULT == null ? getPartnerRole() != null : !PARTNER_ROLE_EDEFAULT.equals(getPartnerRole());
        }
        return super.eIsSet(featureID);
    }
}
