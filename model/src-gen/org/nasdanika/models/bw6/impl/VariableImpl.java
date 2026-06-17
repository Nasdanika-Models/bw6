/**
 */
package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.VariableImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.VariableImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.VariableImpl#isInternal <em>Internal</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.VariableImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.VariableImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isInternal() <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERNAL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw6Package.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(Bw6Package.VARIABLE__NAME, Bw6Package.Literals.VARIABLE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(Bw6Package.VARIABLE__NAME, Bw6Package.Literals.VARIABLE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElement() {
		return (String)eDynamicGet(Bw6Package.VARIABLE__ELEMENT, Bw6Package.Literals.VARIABLE__ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(String newElement) {
		eDynamicSet(Bw6Package.VARIABLE__ELEMENT, Bw6Package.Literals.VARIABLE__ELEMENT, newElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageType() {
		return (String)eDynamicGet(Bw6Package.VARIABLE__MESSAGE_TYPE, Bw6Package.Literals.VARIABLE__MESSAGE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageType(String newMessageType) {
		eDynamicSet(Bw6Package.VARIABLE__MESSAGE_TYPE, Bw6Package.Literals.VARIABLE__MESSAGE_TYPE, newMessageType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(Bw6Package.VARIABLE__TYPE, Bw6Package.Literals.VARIABLE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(Bw6Package.VARIABLE__TYPE, Bw6Package.Literals.VARIABLE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInternal() {
		return (Boolean)eDynamicGet(Bw6Package.VARIABLE__INTERNAL, Bw6Package.Literals.VARIABLE__INTERNAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternal(boolean newInternal) {
		eDynamicSet(Bw6Package.VARIABLE__INTERNAL, Bw6Package.Literals.VARIABLE__INTERNAL, newInternal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameter() {
		return (String)eDynamicGet(Bw6Package.VARIABLE__PARAMETER, Bw6Package.Literals.VARIABLE__PARAMETER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(String newParameter) {
		eDynamicSet(Bw6Package.VARIABLE__PARAMETER, Bw6Package.Literals.VARIABLE__PARAMETER, newParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultValue() {
		return (String)eDynamicGet(Bw6Package.VARIABLE__DEFAULT_VALUE, Bw6Package.Literals.VARIABLE__DEFAULT_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(String newDefaultValue) {
		eDynamicSet(Bw6Package.VARIABLE__DEFAULT_VALUE, Bw6Package.Literals.VARIABLE__DEFAULT_VALUE, newDefaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
				setInternal((Boolean)newValue);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Bw6Package.VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Bw6Package.VARIABLE__ELEMENT:
				setElement(ELEMENT_EDEFAULT);
				return;
			case Bw6Package.VARIABLE__MESSAGE_TYPE:
				setMessageType(MESSAGE_TYPE_EDEFAULT);
				return;
			case Bw6Package.VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Bw6Package.VARIABLE__INTERNAL:
				setInternal(INTERNAL_EDEFAULT);
				return;
			case Bw6Package.VARIABLE__PARAMETER:
				setParameter(PARAMETER_EDEFAULT);
				return;
			case Bw6Package.VARIABLE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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

} //VariableImpl
