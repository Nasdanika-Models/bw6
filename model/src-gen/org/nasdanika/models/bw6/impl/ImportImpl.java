package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Import;

public class ImportImpl extends MinimalEObjectImpl.Container implements Import {
    protected static final String IMPORT_TYPE_EDEFAULT = null;
    protected static final String NAMESPACE_EDEFAULT = null;
    protected static final String LOCATION_EDEFAULT = null;

    protected ImportImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.IMPORT;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public String getImportType() {
        return (String)eDynamicGet(Bw6Package.IMPORT__IMPORT_TYPE, Bw6Package.Literals.IMPORT__IMPORT_TYPE, true, true);
    }

    @Override
    public void setImportType(String value) {
        eDynamicSet(Bw6Package.IMPORT__IMPORT_TYPE, Bw6Package.Literals.IMPORT__IMPORT_TYPE, value);
    }

    @Override
    public String getNamespace() {
        return (String)eDynamicGet(Bw6Package.IMPORT__NAMESPACE, Bw6Package.Literals.IMPORT__NAMESPACE, true, true);
    }

    @Override
    public void setNamespace(String value) {
        eDynamicSet(Bw6Package.IMPORT__NAMESPACE, Bw6Package.Literals.IMPORT__NAMESPACE, value);
    }

    @Override
    public String getLocation() {
        return (String)eDynamicGet(Bw6Package.IMPORT__LOCATION, Bw6Package.Literals.IMPORT__LOCATION, true, true);
    }

    @Override
    public void setLocation(String value) {
        eDynamicSet(Bw6Package.IMPORT__LOCATION, Bw6Package.Literals.IMPORT__LOCATION, value);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.IMPORT__IMPORT_TYPE:
                return getImportType();
            case Bw6Package.IMPORT__NAMESPACE:
                return getNamespace();
            case Bw6Package.IMPORT__LOCATION:
                return getLocation();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.IMPORT__IMPORT_TYPE:
                setImportType((String)newValue);
                return;
            case Bw6Package.IMPORT__NAMESPACE:
                setNamespace((String)newValue);
                return;
            case Bw6Package.IMPORT__LOCATION:
                setLocation((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.IMPORT__IMPORT_TYPE:
                setImportType(null);
                return;
            case Bw6Package.IMPORT__NAMESPACE:
                setNamespace(null);
                return;
            case Bw6Package.IMPORT__LOCATION:
                setLocation(null);
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.IMPORT__IMPORT_TYPE:
                return IMPORT_TYPE_EDEFAULT == null ? getImportType() != null : !IMPORT_TYPE_EDEFAULT.equals(getImportType());
            case Bw6Package.IMPORT__NAMESPACE:
                return NAMESPACE_EDEFAULT == null ? getNamespace() != null : !NAMESPACE_EDEFAULT.equals(getNamespace());
            case Bw6Package.IMPORT__LOCATION:
                return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
        }
        return super.eIsSet(featureID);
    }
}
