/**
 */
package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.bw6.Activity;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Link;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.impl.LinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.LinkImpl#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.LinkImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.LinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.LinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
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
	 * The default value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw6Package.Literals.LINK;
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
		return (String)eDynamicGet(Bw6Package.LINK__NAME, Bw6Package.Literals.LINK__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(Bw6Package.LINK__NAME, Bw6Package.Literals.LINK__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkType() {
		return (String)eDynamicGet(Bw6Package.LINK__LINK_TYPE, Bw6Package.Literals.LINK__LINK_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkType(String newLinkType) {
		eDynamicSet(Bw6Package.LINK__LINK_TYPE, Bw6Package.Literals.LINK__LINK_TYPE, newLinkType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return (String)eDynamicGet(Bw6Package.LINK__LABEL, Bw6Package.Literals.LINK__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		eDynamicSet(Bw6Package.LINK__LABEL, Bw6Package.Literals.LINK__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getSource() {
		return (Activity)eDynamicGet(Bw6Package.LINK__SOURCE, Bw6Package.Literals.LINK__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetSource() {
		return (Activity)eDynamicGet(Bw6Package.LINK__SOURCE, Bw6Package.Literals.LINK__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Activity newSource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSource, Bw6Package.LINK__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Activity newSource) {
		eDynamicSet(Bw6Package.LINK__SOURCE, Bw6Package.Literals.LINK__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getTarget() {
		return (Activity)eDynamicGet(Bw6Package.LINK__TARGET, Bw6Package.Literals.LINK__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetTarget() {
		return (Activity)eDynamicGet(Bw6Package.LINK__TARGET, Bw6Package.Literals.LINK__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Activity newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, Bw6Package.LINK__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Activity newTarget) {
		eDynamicSet(Bw6Package.LINK__TARGET, Bw6Package.Literals.LINK__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bw6Package.LINK__SOURCE:
				Activity source = basicGetSource();
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, Bw6Package.ACTIVITY__OUTGOING_LINKS, Activity.class, msgs);
				return basicSetSource((Activity)otherEnd, msgs);
			case Bw6Package.LINK__TARGET:
				Activity target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, Bw6Package.ACTIVITY__INCOMING_LINKS, Activity.class, msgs);
				return basicSetTarget((Activity)otherEnd, msgs);
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
			case Bw6Package.LINK__SOURCE:
				return basicSetSource(null, msgs);
			case Bw6Package.LINK__TARGET:
				return basicSetTarget(null, msgs);
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
			case Bw6Package.LINK__NAME:
				return getName();
			case Bw6Package.LINK__LINK_TYPE:
				return getLinkType();
			case Bw6Package.LINK__LABEL:
				return getLabel();
			case Bw6Package.LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Bw6Package.LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case Bw6Package.LINK__NAME:
				setName((String)newValue);
				return;
			case Bw6Package.LINK__LINK_TYPE:
				setLinkType((String)newValue);
				return;
			case Bw6Package.LINK__LABEL:
				setLabel((String)newValue);
				return;
			case Bw6Package.LINK__SOURCE:
				setSource((Activity)newValue);
				return;
			case Bw6Package.LINK__TARGET:
				setTarget((Activity)newValue);
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
			case Bw6Package.LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Bw6Package.LINK__LINK_TYPE:
				setLinkType(LINK_TYPE_EDEFAULT);
				return;
			case Bw6Package.LINK__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Bw6Package.LINK__SOURCE:
				setSource((Activity)null);
				return;
			case Bw6Package.LINK__TARGET:
				setTarget((Activity)null);
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
			case Bw6Package.LINK__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case Bw6Package.LINK__LINK_TYPE:
				return LINK_TYPE_EDEFAULT == null ? getLinkType() != null : !LINK_TYPE_EDEFAULT.equals(getLinkType());
			case Bw6Package.LINK__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case Bw6Package.LINK__SOURCE:
				return basicGetSource() != null;
			case Bw6Package.LINK__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl
