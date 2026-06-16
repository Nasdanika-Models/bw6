package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.ProcessInfo;

public class ProcessInfoImpl extends MinimalEObjectImpl.Container implements ProcessInfo {
    protected static final boolean CALLABLE_EDEFAULT = false;
    protected static final String CREATED_BY_EDEFAULT = null;
    protected static final String CREATION_DATE_EDEFAULT = null;
    protected static final String MODIFIED_BY_EDEFAULT = null;
    protected static final String MODIFICATION_DATE_EDEFAULT = null;
    protected static final String HISTORY_SIZE_EDEFAULT = null;
    protected static final String FLOW_MODEL_EDEFAULT = null;
    protected static final String POOL_ICON_EDEFAULT = null;

    protected ProcessInfoImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.PROCESS_INFO;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public boolean isCallable() {
        return (boolean)eDynamicGet(Bw6Package.PROCESS_INFO__CALLABLE, Bw6Package.Literals.PROCESS_INFO__CALLABLE, true, true);
    }

    @Override
    public void setCallable(boolean value) {
        eDynamicSet(Bw6Package.PROCESS_INFO__CALLABLE, Bw6Package.Literals.PROCESS_INFO__CALLABLE, value);
    }

    @Override
    public String getCreatedBy() {
        return (String)eDynamicGet(Bw6Package.PROCESS_INFO__CREATED_BY, Bw6Package.Literals.PROCESS_INFO__CREATED_BY, true, true);
    }

    @Override
    public void setCreatedBy(String value) {
        eDynamicSet(Bw6Package.PROCESS_INFO__CREATED_BY, Bw6Package.Literals.PROCESS_INFO__CREATED_BY, value);
    }

    @Override
    public String getCreationDate() {
        return (String)eDynamicGet(Bw6Package.PROCESS_INFO__CREATION_DATE, Bw6Package.Literals.PROCESS_INFO__CREATION_DATE, true, true);
    }

    @Override
    public void setCreationDate(String value) {
        eDynamicSet(Bw6Package.PROCESS_INFO__CREATION_DATE, Bw6Package.Literals.PROCESS_INFO__CREATION_DATE, value);
    }

    @Override
    public String getModifiedBy() {
        return (String)eDynamicGet(Bw6Package.PROCESS_INFO__MODIFIED_BY, Bw6Package.Literals.PROCESS_INFO__MODIFIED_BY, true, true);
    }

    @Override
    public void setModifiedBy(String value) {
        eDynamicSet(Bw6Package.PROCESS_INFO__MODIFIED_BY, Bw6Package.Literals.PROCESS_INFO__MODIFIED_BY, value);
    }

    @Override
    public String getModificationDate() {
        return (String)eDynamicGet(Bw6Package.PROCESS_INFO__MODIFICATION_DATE, Bw6Package.Literals.PROCESS_INFO__MODIFICATION_DATE, true, true);
    }

    @Override
    public void setModificationDate(String value) {
        eDynamicSet(Bw6Package.PROCESS_INFO__MODIFICATION_DATE, Bw6Package.Literals.PROCESS_INFO__MODIFICATION_DATE, value);
    }

    @Override
    public String getHistorySize() {
        return (String)eDynamicGet(Bw6Package.PROCESS_INFO__HISTORY_SIZE, Bw6Package.Literals.PROCESS_INFO__HISTORY_SIZE, true, true);
    }

    @Override
    public void setHistorySize(String value) {
        eDynamicSet(Bw6Package.PROCESS_INFO__HISTORY_SIZE, Bw6Package.Literals.PROCESS_INFO__HISTORY_SIZE, value);
    }

    @Override
    public String getFlowModel() {
        return (String)eDynamicGet(Bw6Package.PROCESS_INFO__FLOW_MODEL, Bw6Package.Literals.PROCESS_INFO__FLOW_MODEL, true, true);
    }

    @Override
    public void setFlowModel(String value) {
        eDynamicSet(Bw6Package.PROCESS_INFO__FLOW_MODEL, Bw6Package.Literals.PROCESS_INFO__FLOW_MODEL, value);
    }

    @Override
    public String getPoolIcon() {
        return (String)eDynamicGet(Bw6Package.PROCESS_INFO__POOL_ICON, Bw6Package.Literals.PROCESS_INFO__POOL_ICON, true, true);
    }

    @Override
    public void setPoolIcon(String value) {
        eDynamicSet(Bw6Package.PROCESS_INFO__POOL_ICON, Bw6Package.Literals.PROCESS_INFO__POOL_ICON, value);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.PROCESS_INFO__CALLABLE:
                return isCallable();
            case Bw6Package.PROCESS_INFO__CREATED_BY:
                return getCreatedBy();
            case Bw6Package.PROCESS_INFO__CREATION_DATE:
                return getCreationDate();
            case Bw6Package.PROCESS_INFO__MODIFIED_BY:
                return getModifiedBy();
            case Bw6Package.PROCESS_INFO__MODIFICATION_DATE:
                return getModificationDate();
            case Bw6Package.PROCESS_INFO__HISTORY_SIZE:
                return getHistorySize();
            case Bw6Package.PROCESS_INFO__FLOW_MODEL:
                return getFlowModel();
            case Bw6Package.PROCESS_INFO__POOL_ICON:
                return getPoolIcon();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.PROCESS_INFO__CALLABLE:
                setCallable((boolean)newValue);
                return;
            case Bw6Package.PROCESS_INFO__CREATED_BY:
                setCreatedBy((String)newValue);
                return;
            case Bw6Package.PROCESS_INFO__CREATION_DATE:
                setCreationDate((String)newValue);
                return;
            case Bw6Package.PROCESS_INFO__MODIFIED_BY:
                setModifiedBy((String)newValue);
                return;
            case Bw6Package.PROCESS_INFO__MODIFICATION_DATE:
                setModificationDate((String)newValue);
                return;
            case Bw6Package.PROCESS_INFO__HISTORY_SIZE:
                setHistorySize((String)newValue);
                return;
            case Bw6Package.PROCESS_INFO__FLOW_MODEL:
                setFlowModel((String)newValue);
                return;
            case Bw6Package.PROCESS_INFO__POOL_ICON:
                setPoolIcon((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.PROCESS_INFO__CALLABLE:
                setCallable(false);
                return;
            case Bw6Package.PROCESS_INFO__CREATED_BY:
                setCreatedBy(null);
                return;
            case Bw6Package.PROCESS_INFO__CREATION_DATE:
                setCreationDate(null);
                return;
            case Bw6Package.PROCESS_INFO__MODIFIED_BY:
                setModifiedBy(null);
                return;
            case Bw6Package.PROCESS_INFO__MODIFICATION_DATE:
                setModificationDate(null);
                return;
            case Bw6Package.PROCESS_INFO__HISTORY_SIZE:
                setHistorySize(null);
                return;
            case Bw6Package.PROCESS_INFO__FLOW_MODEL:
                setFlowModel(null);
                return;
            case Bw6Package.PROCESS_INFO__POOL_ICON:
                setPoolIcon(null);
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.PROCESS_INFO__CALLABLE:
                return isCallable() != CALLABLE_EDEFAULT;
            case Bw6Package.PROCESS_INFO__CREATED_BY:
                return CREATED_BY_EDEFAULT == null ? getCreatedBy() != null : !CREATED_BY_EDEFAULT.equals(getCreatedBy());
            case Bw6Package.PROCESS_INFO__CREATION_DATE:
                return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null : !CREATION_DATE_EDEFAULT.equals(getCreationDate());
            case Bw6Package.PROCESS_INFO__MODIFIED_BY:
                return MODIFIED_BY_EDEFAULT == null ? getModifiedBy() != null : !MODIFIED_BY_EDEFAULT.equals(getModifiedBy());
            case Bw6Package.PROCESS_INFO__MODIFICATION_DATE:
                return MODIFICATION_DATE_EDEFAULT == null ? getModificationDate() != null : !MODIFICATION_DATE_EDEFAULT.equals(getModificationDate());
            case Bw6Package.PROCESS_INFO__HISTORY_SIZE:
                return HISTORY_SIZE_EDEFAULT == null ? getHistorySize() != null : !HISTORY_SIZE_EDEFAULT.equals(getHistorySize());
            case Bw6Package.PROCESS_INFO__FLOW_MODEL:
                return FLOW_MODEL_EDEFAULT == null ? getFlowModel() != null : !FLOW_MODEL_EDEFAULT.equals(getFlowModel());
            case Bw6Package.PROCESS_INFO__POOL_ICON:
                return POOL_ICON_EDEFAULT == null ? getPoolIcon() != null : !POOL_ICON_EDEFAULT.equals(getPoolIcon());
        }
        return super.eIsSet(featureID);
    }
}
