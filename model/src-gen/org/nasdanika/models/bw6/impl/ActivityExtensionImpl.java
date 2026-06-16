package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.bw6.ActivityExtension;
import org.nasdanika.models.bw6.Bw6Package;

public class ActivityExtensionImpl extends ActivityImpl implements ActivityExtension {
    protected static final String INPUT_VARIABLE_EDEFAULT = null;
    protected static final String OUTPUT_VARIABLE_EDEFAULT = null;
    protected static final String EXPRESSION_EDEFAULT = null;
    protected static final String EXPRESSION_LANGUAGE_EDEFAULT = null;
    protected static final String INPUT_BINDINGS_EDEFAULT = null;
    protected static final String CONFIG_EDEFAULT = null;
    protected static final String ACTIVITY_TYPE_ID_EDEFAULT = null;

    protected ActivityExtensionImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return Bw6Package.Literals.ACTIVITY_EXTENSION;
    }

    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    @Override
    public String getInputVariable() {
        return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__INPUT_VARIABLE, Bw6Package.Literals.ACTIVITY_EXTENSION__INPUT_VARIABLE, true, true);
    }

    @Override
    public void setInputVariable(String value) {
        eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__INPUT_VARIABLE, Bw6Package.Literals.ACTIVITY_EXTENSION__INPUT_VARIABLE, value);
    }

    @Override
    public String getOutputVariable() {
        return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__OUTPUT_VARIABLE, Bw6Package.Literals.ACTIVITY_EXTENSION__OUTPUT_VARIABLE, true, true);
    }

    @Override
    public void setOutputVariable(String value) {
        eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__OUTPUT_VARIABLE, Bw6Package.Literals.ACTIVITY_EXTENSION__OUTPUT_VARIABLE, value);
    }

    @Override
    public String getExpression() {
        return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__EXPRESSION, Bw6Package.Literals.ACTIVITY_EXTENSION__EXPRESSION, true, true);
    }

    @Override
    public void setExpression(String value) {
        eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__EXPRESSION, Bw6Package.Literals.ACTIVITY_EXTENSION__EXPRESSION, value);
    }

    @Override
    public String getExpressionLanguage() {
        return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE, Bw6Package.Literals.ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE, true, true);
    }

    @Override
    public void setExpressionLanguage(String value) {
        eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE, Bw6Package.Literals.ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE, value);
    }

    @Override
    public String getInputBindings() {
        return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__INPUT_BINDINGS, Bw6Package.Literals.ACTIVITY_EXTENSION__INPUT_BINDINGS, true, true);
    }

    @Override
    public void setInputBindings(String value) {
        eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__INPUT_BINDINGS, Bw6Package.Literals.ACTIVITY_EXTENSION__INPUT_BINDINGS, value);
    }

    @Override
    public String getConfig() {
        return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__CONFIG, Bw6Package.Literals.ACTIVITY_EXTENSION__CONFIG, true, true);
    }

    @Override
    public void setConfig(String value) {
        eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__CONFIG, Bw6Package.Literals.ACTIVITY_EXTENSION__CONFIG, value);
    }

    @Override
    public String getActivityTypeId() {
        return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID, Bw6Package.Literals.ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID, true, true);
    }

    @Override
    public void setActivityTypeId(String value) {
        eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID, Bw6Package.Literals.ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID, value);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Bw6Package.ACTIVITY_EXTENSION__INPUT_VARIABLE:
                return getInputVariable();
            case Bw6Package.ACTIVITY_EXTENSION__OUTPUT_VARIABLE:
                return getOutputVariable();
            case Bw6Package.ACTIVITY_EXTENSION__EXPRESSION:
                return getExpression();
            case Bw6Package.ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE:
                return getExpressionLanguage();
            case Bw6Package.ACTIVITY_EXTENSION__INPUT_BINDINGS:
                return getInputBindings();
            case Bw6Package.ACTIVITY_EXTENSION__CONFIG:
                return getConfig();
            case Bw6Package.ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID:
                return getActivityTypeId();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Bw6Package.ACTIVITY_EXTENSION__INPUT_VARIABLE:
                setInputVariable((String)newValue);
                return;
            case Bw6Package.ACTIVITY_EXTENSION__OUTPUT_VARIABLE:
                setOutputVariable((String)newValue);
                return;
            case Bw6Package.ACTIVITY_EXTENSION__EXPRESSION:
                setExpression((String)newValue);
                return;
            case Bw6Package.ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE:
                setExpressionLanguage((String)newValue);
                return;
            case Bw6Package.ACTIVITY_EXTENSION__INPUT_BINDINGS:
                setInputBindings((String)newValue);
                return;
            case Bw6Package.ACTIVITY_EXTENSION__CONFIG:
                setConfig((String)newValue);
                return;
            case Bw6Package.ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID:
                setActivityTypeId((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Bw6Package.ACTIVITY_EXTENSION__INPUT_VARIABLE:
                setInputVariable(null);
                return;
            case Bw6Package.ACTIVITY_EXTENSION__OUTPUT_VARIABLE:
                setOutputVariable(null);
                return;
            case Bw6Package.ACTIVITY_EXTENSION__EXPRESSION:
                setExpression(null);
                return;
            case Bw6Package.ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE:
                setExpressionLanguage(null);
                return;
            case Bw6Package.ACTIVITY_EXTENSION__INPUT_BINDINGS:
                setInputBindings(null);
                return;
            case Bw6Package.ACTIVITY_EXTENSION__CONFIG:
                setConfig(null);
                return;
            case Bw6Package.ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID:
                setActivityTypeId(null);
                return;
        }
        super.eUnset(featureID);
    }

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Bw6Package.ACTIVITY_EXTENSION__INPUT_VARIABLE:
                return INPUT_VARIABLE_EDEFAULT == null ? getInputVariable() != null : !INPUT_VARIABLE_EDEFAULT.equals(getInputVariable());
            case Bw6Package.ACTIVITY_EXTENSION__OUTPUT_VARIABLE:
                return OUTPUT_VARIABLE_EDEFAULT == null ? getOutputVariable() != null : !OUTPUT_VARIABLE_EDEFAULT.equals(getOutputVariable());
            case Bw6Package.ACTIVITY_EXTENSION__EXPRESSION:
                return EXPRESSION_EDEFAULT == null ? getExpression() != null : !EXPRESSION_EDEFAULT.equals(getExpression());
            case Bw6Package.ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE:
                return EXPRESSION_LANGUAGE_EDEFAULT == null ? getExpressionLanguage() != null : !EXPRESSION_LANGUAGE_EDEFAULT.equals(getExpressionLanguage());
            case Bw6Package.ACTIVITY_EXTENSION__INPUT_BINDINGS:
                return INPUT_BINDINGS_EDEFAULT == null ? getInputBindings() != null : !INPUT_BINDINGS_EDEFAULT.equals(getInputBindings());
            case Bw6Package.ACTIVITY_EXTENSION__CONFIG:
                return CONFIG_EDEFAULT == null ? getConfig() != null : !CONFIG_EDEFAULT.equals(getConfig());
            case Bw6Package.ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID:
                return ACTIVITY_TYPE_ID_EDEFAULT == null ? getActivityTypeId() != null : !ACTIVITY_TYPE_ID_EDEFAULT.equals(getActivityTypeId());
        }
        return super.eIsSet(featureID);
    }
}
