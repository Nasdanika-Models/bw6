package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Variable;

public class VariableImpl extends MinimalEObjectImpl.Container implements Variable {
    protected static final String NAME_EDEFAULT = null;
    protected static final String ELEMENT_EDEFAULT = null;
    protected static final String MESSAGE_TYPE_EDEFAULT = null;
    protected static final String TYPE_EDEFAULT = null;
    protected static final boolean INTERNAL_EDEFAULT = false;
    protected static final String PARAMETER_EDEFAULT = null;
    protected static final String DEFAULT_VALUE_EDEFAULT = null;

    protected VariableImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.VARIABLE;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public String getName() {
        return (String)eDynamicGet(Bw6Package.VARIABLE__NAME, Bw6Package.Literals.VARIABLE__NAME, true, true);
    }

    @Override
    public void setName(String value) {
        eDynamicSet(Bw6Package.VARIABLE__NAME, Bw6Package.Literals.VARIABLE__NAME, value);
    }

    @Override
    public String getElement() {
        return (String)eDynamicGet(Bw6Package.VARIABLE__ELEMENT, Bw6Package.Literals.VARIABLE__ELEMENT, true, true);
    }

    @Override
    public void setElement(String value) {
        eDynamicSet(Bw6Package.VARIABLE__ELEMENT, Bw6Package.Literals.VARIABLE__ELEMENT, value);
    }

    @Override
    public String getMessageType() {
        return (String)eDynamicGet(Bw6Package.VARIABLE__MESSAGE_TYPE, Bw6Package.Literals.VARIABLE__MESSAGE_TYPE, true, true);
    }

    @Override
    public void setMessageType(String value) {
        eDynamicSet(Bw6Package.VARIABLE__MESSAGE_TYPE, Bw6Package.Literals.VARIABLE__MESSAGE_TYPE, value);
    }

    @Override
    public String getType() {
        return (String)eDynamicGet(Bw6Package.VARIABLE__TYPE, Bw6Package.Literals.VARIABLE__TYPE, true, true);
    }

    @Override
    public void setType(String value) {
        eDynamicSet(Bw6Package.VARIABLE__TYPE, Bw6Package.Literals.VARIABLE__TYPE, value);
    }

    @Override
    public boolean isInternal() {
        return (boolean)eDynamicGet(Bw6Package.VARIABLE__INTERNAL, Bw6Package.Literals.VARIABLE__INTERNAL, true, true);
    }

    @Override
    public void setInternal(boolean value) {
        eDynamicSet(Bw6Package.VARIABLE__INTERNAL, Bw6Package.Literals.VARIABLE__INTERNAL, value);
    }

    @Override
    public String getParameter() {
        return (String)eDynamicGet(Bw6Package.VARIABLE__PARAMETER, Bw6Package.Literals.VARIABLE__PARAMETER, true, true);
    }

    @Override
    public void setParameter(String value) {
        eDynamicSet(Bw6Package.VARIABLE__PARAMETER, Bw6Package.Literals.VARIABLE__PARAMETER, value);
    }

    @Override
    public String getDefaultValue() {
        return (String)eDynamicGet(Bw6Package.VARIABLE__DEFAULT_VALUE, Bw6Package.Literals.VARIABLE__DEFAULT_VALUE, true, true);
    }

    @Override
    public void setDefaultValue(String value) {
        eDynamicSet(Bw6Package.VARIABLE__DEFAULT_VALUE, Bw6Package.Literals.VARIABLE__DEFAULT_VALUE, value);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.VARIABLE__NAME:
                return getName();
            case Bw6Package.VARIABLE__ELEMENT:
                return getElement();
            case Bw6Package.VARIABLE__MESSAGE_TYPE:
                return getMessageType();
            case Bw6Package.VARIABLE__TYPE:
                return getType();
            case Bw6Package.VARIABLE__INTERNAL:
                return isInternal();
            case Bw6Package.VARIABLE__PARAMETER:
                return getParameter();
            case Bw6Package.VARIABLE__DEFAULT_VALUE:
                return getDefaultValue();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.VARIABLE__NAME:
                setName((String)newValue);
                return;
            case Bw6Package.VARIABLE__ELEMENT:
                setElement((String)newValue);
                return;
            case Bw6Package.VARIABLE__MESSAGE_TYPE:
                setMessageType((String)newValue);
                return;
            case Bw6Package.VARIABLE__TYPE:
                setType((String)newValue);
                return;
            case Bw6Package.VARIABLE__INTERNAL:
                setInternal((boolean)newValue);
                return;
            case Bw6Package.VARIABLE__PARAMETER:
                setParameter((String)newValue);
                return;
            case Bw6Package.VARIABLE__DEFAULT_VALUE:
                setDefaultValue((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.VARIABLE__NAME:
                setName(null);
                return;
            case Bw6Package.VARIABLE__ELEMENT:
                setElement(null);
                return;
            case Bw6Package.VARIABLE__MESSAGE_TYPE:
                setMessageType(null);
                return;
            case Bw6Package.VARIABLE__TYPE:
                setType(null);
                return;
            case Bw6Package.VARIABLE__INTERNAL:
                setInternal(false);
                return;
            case Bw6Package.VARIABLE__PARAMETER:
                setParameter(null);
                return;
            case Bw6Package.VARIABLE__DEFAULT_VALUE:
                setDefaultValue(null);
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.VARIABLE__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case Bw6Package.VARIABLE__ELEMENT:
                return ELEMENT_EDEFAULT == null ? getElement() != null : !ELEMENT_EDEFAULT.equals(getElement());
            case Bw6Package.VARIABLE__MESSAGE_TYPE:
                return MESSAGE_TYPE_EDEFAULT == null ? getMessageType() != null : !MESSAGE_TYPE_EDEFAULT.equals(getMessageType());
            case Bw6Package.VARIABLE__TYPE:
                return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
            case Bw6Package.VARIABLE__INTERNAL:
                return isInternal() != INTERNAL_EDEFAULT;
            case Bw6Package.VARIABLE__PARAMETER:
                return PARAMETER_EDEFAULT == null ? getParameter() != null : !PARAMETER_EDEFAULT.equals(getParameter());
            case Bw6Package.VARIABLE__DEFAULT_VALUE:
                return DEFAULT_VALUE_EDEFAULT == null ? getDefaultValue() != null : !DEFAULT_VALUE_EDEFAULT.equals(getDefaultValue());
        }
        return super.eIsSet(featureID);
    }
}
