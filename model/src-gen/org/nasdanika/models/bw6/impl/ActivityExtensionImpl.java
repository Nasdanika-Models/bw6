/**
 */
package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.bw6.ActivityExtension;
import org.nasdanika.models.bw6.Bw6Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.impl.ActivityExtensionImpl#getInputVariable <em>Input Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ActivityExtensionImpl#getOutputVariable <em>Output Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ActivityExtensionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ActivityExtensionImpl#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ActivityExtensionImpl#getInputBindings <em>Input Bindings</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ActivityExtensionImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ActivityExtensionImpl#getActivityTypeId <em>Activity Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityExtensionImpl extends ActivityImpl implements ActivityExtension {
	/**
	 * The default value of the '{@link #getInputVariable() <em>Input Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_VARIABLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOutputVariable() <em>Output Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_VARIABLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_LANGUAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInputBindings() <em>Input Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputBindings()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_BINDINGS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConfig() <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getActivityTypeId() <em>Activity Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_TYPE_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw6Package.Literals.ACTIVITY_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputVariable() {
		return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__INPUT_VARIABLE, Bw6Package.Literals.ACTIVITY_EXTENSION__INPUT_VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputVariable(String newInputVariable) {
		eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__INPUT_VARIABLE, Bw6Package.Literals.ACTIVITY_EXTENSION__INPUT_VARIABLE, newInputVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputVariable() {
		return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__OUTPUT_VARIABLE, Bw6Package.Literals.ACTIVITY_EXTENSION__OUTPUT_VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputVariable(String newOutputVariable) {
		eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__OUTPUT_VARIABLE, Bw6Package.Literals.ACTIVITY_EXTENSION__OUTPUT_VARIABLE, newOutputVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpression() {
		return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__EXPRESSION, Bw6Package.Literals.ACTIVITY_EXTENSION__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(String newExpression) {
		eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__EXPRESSION, Bw6Package.Literals.ACTIVITY_EXTENSION__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpressionLanguage() {
		return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE, Bw6Package.Literals.ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressionLanguage(String newExpressionLanguage) {
		eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE, Bw6Package.Literals.ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE, newExpressionLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputBindings() {
		return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__INPUT_BINDINGS, Bw6Package.Literals.ACTIVITY_EXTENSION__INPUT_BINDINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputBindings(String newInputBindings) {
		eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__INPUT_BINDINGS, Bw6Package.Literals.ACTIVITY_EXTENSION__INPUT_BINDINGS, newInputBindings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfig() {
		return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__CONFIG, Bw6Package.Literals.ACTIVITY_EXTENSION__CONFIG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfig(String newConfig) {
		eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__CONFIG, Bw6Package.Literals.ACTIVITY_EXTENSION__CONFIG, newConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActivityTypeId() {
		return (String)eDynamicGet(Bw6Package.ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID, Bw6Package.Literals.ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivityTypeId(String newActivityTypeId) {
		eDynamicSet(Bw6Package.ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID, Bw6Package.Literals.ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID, newActivityTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Bw6Package.ACTIVITY_EXTENSION__INPUT_VARIABLE:
				setInputVariable(INPUT_VARIABLE_EDEFAULT);
				return;
			case Bw6Package.ACTIVITY_EXTENSION__OUTPUT_VARIABLE:
				setOutputVariable(OUTPUT_VARIABLE_EDEFAULT);
				return;
			case Bw6Package.ACTIVITY_EXTENSION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case Bw6Package.ACTIVITY_EXTENSION__EXPRESSION_LANGUAGE:
				setExpressionLanguage(EXPRESSION_LANGUAGE_EDEFAULT);
				return;
			case Bw6Package.ACTIVITY_EXTENSION__INPUT_BINDINGS:
				setInputBindings(INPUT_BINDINGS_EDEFAULT);
				return;
			case Bw6Package.ACTIVITY_EXTENSION__CONFIG:
				setConfig(CONFIG_EDEFAULT);
				return;
			case Bw6Package.ACTIVITY_EXTENSION__ACTIVITY_TYPE_ID:
				setActivityTypeId(ACTIVITY_TYPE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //ActivityExtensionImpl
