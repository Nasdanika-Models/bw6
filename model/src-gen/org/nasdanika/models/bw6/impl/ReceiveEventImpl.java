/**
 */
package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.ReceiveEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.impl.ReceiveEventImpl#isCreateInstance <em>Create Instance</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ReceiveEventImpl#getEventTimeout <em>Event Timeout</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ReceiveEventImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ReceiveEventImpl#getEventSource <em>Event Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiveEventImpl extends ActivityImpl implements ReceiveEvent {
	/**
	 * The default value of the '{@link #isCreateInstance() <em>Create Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateInstance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_INSTANCE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getEventTimeout() <em>Event Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int EVENT_TIMEOUT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEventSource() <em>Event Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSource()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_SOURCE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw6Package.Literals.RECEIVE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCreateInstance() {
		return (Boolean)eDynamicGet(Bw6Package.RECEIVE_EVENT__CREATE_INSTANCE, Bw6Package.Literals.RECEIVE_EVENT__CREATE_INSTANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateInstance(boolean newCreateInstance) {
		eDynamicSet(Bw6Package.RECEIVE_EVENT__CREATE_INSTANCE, Bw6Package.Literals.RECEIVE_EVENT__CREATE_INSTANCE, newCreateInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEventTimeout() {
		return (Integer)eDynamicGet(Bw6Package.RECEIVE_EVENT__EVENT_TIMEOUT, Bw6Package.Literals.RECEIVE_EVENT__EVENT_TIMEOUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventTimeout(int newEventTimeout) {
		eDynamicSet(Bw6Package.RECEIVE_EVENT__EVENT_TIMEOUT, Bw6Package.Literals.RECEIVE_EVENT__EVENT_TIMEOUT, newEventTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVariable() {
		return (String)eDynamicGet(Bw6Package.RECEIVE_EVENT__VARIABLE, Bw6Package.Literals.RECEIVE_EVENT__VARIABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(String newVariable) {
		eDynamicSet(Bw6Package.RECEIVE_EVENT__VARIABLE, Bw6Package.Literals.RECEIVE_EVENT__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventSource() {
		return (String)eDynamicGet(Bw6Package.RECEIVE_EVENT__EVENT_SOURCE, Bw6Package.Literals.RECEIVE_EVENT__EVENT_SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventSource(String newEventSource) {
		eDynamicSet(Bw6Package.RECEIVE_EVENT__EVENT_SOURCE, Bw6Package.Literals.RECEIVE_EVENT__EVENT_SOURCE, newEventSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bw6Package.RECEIVE_EVENT__CREATE_INSTANCE:
				return isCreateInstance();
			case Bw6Package.RECEIVE_EVENT__EVENT_TIMEOUT:
				return getEventTimeout();
			case Bw6Package.RECEIVE_EVENT__VARIABLE:
				return getVariable();
			case Bw6Package.RECEIVE_EVENT__EVENT_SOURCE:
				return getEventSource();
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
			case Bw6Package.RECEIVE_EVENT__CREATE_INSTANCE:
				setCreateInstance((Boolean)newValue);
				return;
			case Bw6Package.RECEIVE_EVENT__EVENT_TIMEOUT:
				setEventTimeout((Integer)newValue);
				return;
			case Bw6Package.RECEIVE_EVENT__VARIABLE:
				setVariable((String)newValue);
				return;
			case Bw6Package.RECEIVE_EVENT__EVENT_SOURCE:
				setEventSource((String)newValue);
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
			case Bw6Package.RECEIVE_EVENT__CREATE_INSTANCE:
				setCreateInstance(CREATE_INSTANCE_EDEFAULT);
				return;
			case Bw6Package.RECEIVE_EVENT__EVENT_TIMEOUT:
				setEventTimeout(EVENT_TIMEOUT_EDEFAULT);
				return;
			case Bw6Package.RECEIVE_EVENT__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case Bw6Package.RECEIVE_EVENT__EVENT_SOURCE:
				setEventSource(EVENT_SOURCE_EDEFAULT);
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
			case Bw6Package.RECEIVE_EVENT__CREATE_INSTANCE:
				return isCreateInstance() != CREATE_INSTANCE_EDEFAULT;
			case Bw6Package.RECEIVE_EVENT__EVENT_TIMEOUT:
				return getEventTimeout() != EVENT_TIMEOUT_EDEFAULT;
			case Bw6Package.RECEIVE_EVENT__VARIABLE:
				return VARIABLE_EDEFAULT == null ? getVariable() != null : !VARIABLE_EDEFAULT.equals(getVariable());
			case Bw6Package.RECEIVE_EVENT__EVENT_SOURCE:
				return EVENT_SOURCE_EDEFAULT == null ? getEventSource() != null : !EVENT_SOURCE_EDEFAULT.equals(getEventSource());
		}
		return super.eIsSet(featureID);
	}

} //ReceiveEventImpl
