package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.EmptyActivity;

public class EmptyActivityImpl extends ActivityImpl implements EmptyActivity {
    protected static final String CONSTRUCTOR_EDEFAULT = null;

    protected EmptyActivityImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.EMPTY_ACTIVITY;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public String getConstructor() {
        return (String)eDynamicGet(Bw6Package.EMPTY_ACTIVITY__CONSTRUCTOR, Bw6Package.Literals.EMPTY_ACTIVITY__CONSTRUCTOR, true, true);
    }

    @Override
    public void setConstructor(String value) {
        eDynamicSet(Bw6Package.EMPTY_ACTIVITY__CONSTRUCTOR, Bw6Package.Literals.EMPTY_ACTIVITY__CONSTRUCTOR, value);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.EMPTY_ACTIVITY__CONSTRUCTOR:
                return getConstructor();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.EMPTY_ACTIVITY__CONSTRUCTOR:
                setConstructor((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.EMPTY_ACTIVITY__CONSTRUCTOR:
                setConstructor(null);
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.EMPTY_ACTIVITY__CONSTRUCTOR:
                return CONSTRUCTOR_EDEFAULT == null ? getConstructor() != null : !CONSTRUCTOR_EDEFAULT.equals(getConstructor());
        }
        return super.eIsSet(featureID);
    }
}
