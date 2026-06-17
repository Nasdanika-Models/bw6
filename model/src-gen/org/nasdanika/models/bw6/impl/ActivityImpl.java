/**
 */
package org.nasdanika.models.bw6.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.bw6.Activity;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Link;
import org.nasdanika.models.bw6.Source;
import org.nasdanika.models.bw6.Target;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ActivityImpl#getXpdlId <em>Xpdl Id</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ActivityImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ActivityImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ActivityImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ActivityImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
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
	 * The default value of the '{@link #getXpdlId() <em>Xpdl Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpdlId()
	 * @generated
	 * @ordered
	 */
	protected static final String XPDL_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw6Package.Literals.ACTIVITY;
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
		return (String)eDynamicGet(Bw6Package.ACTIVITY__NAME, Bw6Package.Literals.ACTIVITY__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(Bw6Package.ACTIVITY__NAME, Bw6Package.Literals.ACTIVITY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXpdlId() {
		return (String)eDynamicGet(Bw6Package.ACTIVITY__XPDL_ID, Bw6Package.Literals.ACTIVITY__XPDL_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXpdlId(String newXpdlId) {
		eDynamicSet(Bw6Package.ACTIVITY__XPDL_ID, Bw6Package.Literals.ACTIVITY__XPDL_ID, newXpdlId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Link> getOutgoingLinks() {
		return (EList<Link>)eDynamicGet(Bw6Package.ACTIVITY__OUTGOING_LINKS, Bw6Package.Literals.ACTIVITY__OUTGOING_LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Link> getIncomingLinks() {
		return (EList<Link>)eDynamicGet(Bw6Package.ACTIVITY__INCOMING_LINKS, Bw6Package.Literals.ACTIVITY__INCOMING_LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Source> getSources() {
		return (EList<Source>)eDynamicGet(Bw6Package.ACTIVITY__SOURCES, Bw6Package.Literals.ACTIVITY__SOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Target> getTargets() {
		return (EList<Target>)eDynamicGet(Bw6Package.ACTIVITY__TARGETS, Bw6Package.Literals.ACTIVITY__TARGETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bw6Package.ACTIVITY__OUTGOING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLinks()).basicAdd(otherEnd, msgs);
			case Bw6Package.ACTIVITY__INCOMING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bw6Package.ACTIVITY__OUTGOING_LINKS:
				return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
			case Bw6Package.ACTIVITY__INCOMING_LINKS:
				return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
			case Bw6Package.ACTIVITY__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case Bw6Package.ACTIVITY__TARGETS:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bw6Package.ACTIVITY__NAME:
				return getName();
			case Bw6Package.ACTIVITY__XPDL_ID:
				return getXpdlId();
			case Bw6Package.ACTIVITY__OUTGOING_LINKS:
				return getOutgoingLinks();
			case Bw6Package.ACTIVITY__INCOMING_LINKS:
				return getIncomingLinks();
			case Bw6Package.ACTIVITY__SOURCES:
				return getSources();
			case Bw6Package.ACTIVITY__TARGETS:
				return getTargets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bw6Package.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case Bw6Package.ACTIVITY__XPDL_ID:
				setXpdlId((String)newValue);
				return;
			case Bw6Package.ACTIVITY__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				getOutgoingLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case Bw6Package.ACTIVITY__INCOMING_LINKS:
				getIncomingLinks().clear();
				getIncomingLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case Bw6Package.ACTIVITY__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Source>)newValue);
				return;
			case Bw6Package.ACTIVITY__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Target>)newValue);
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
			case Bw6Package.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Bw6Package.ACTIVITY__XPDL_ID:
				setXpdlId(XPDL_ID_EDEFAULT);
				return;
			case Bw6Package.ACTIVITY__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				return;
			case Bw6Package.ACTIVITY__INCOMING_LINKS:
				getIncomingLinks().clear();
				return;
			case Bw6Package.ACTIVITY__SOURCES:
				getSources().clear();
				return;
			case Bw6Package.ACTIVITY__TARGETS:
				getTargets().clear();
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
			case Bw6Package.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case Bw6Package.ACTIVITY__XPDL_ID:
				return XPDL_ID_EDEFAULT == null ? getXpdlId() != null : !XPDL_ID_EDEFAULT.equals(getXpdlId());
			case Bw6Package.ACTIVITY__OUTGOING_LINKS:
				return !getOutgoingLinks().isEmpty();
			case Bw6Package.ACTIVITY__INCOMING_LINKS:
				return !getIncomingLinks().isEmpty();
			case Bw6Package.ACTIVITY__SOURCES:
				return !getSources().isEmpty();
			case Bw6Package.ACTIVITY__TARGETS:
				return !getTargets().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
