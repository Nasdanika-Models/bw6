/**
 */
package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.PartnerLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partner Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.impl.PartnerLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.PartnerLinkImpl#getPartnerLinkType <em>Partner Link Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.PartnerLinkImpl#getMyRole <em>My Role</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.PartnerLinkImpl#getPartnerRole <em>Partner Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartnerLinkImpl extends MinimalEObjectImpl.Container implements PartnerLink {
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
	 * The default value of the '{@link #getPartnerLinkType() <em>Partner Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTNER_LINK_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMyRole() <em>My Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyRole()
	 * @generated
	 * @ordered
	 */
	protected static final String MY_ROLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPartnerRole() <em>Partner Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerRole()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTNER_ROLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartnerLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw6Package.Literals.PARTNER_LINK;
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
		return (String)eDynamicGet(Bw6Package.PARTNER_LINK__NAME, Bw6Package.Literals.PARTNER_LINK__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(Bw6Package.PARTNER_LINK__NAME, Bw6Package.Literals.PARTNER_LINK__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartnerLinkType() {
		return (String)eDynamicGet(Bw6Package.PARTNER_LINK__PARTNER_LINK_TYPE, Bw6Package.Literals.PARTNER_LINK__PARTNER_LINK_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartnerLinkType(String newPartnerLinkType) {
		eDynamicSet(Bw6Package.PARTNER_LINK__PARTNER_LINK_TYPE, Bw6Package.Literals.PARTNER_LINK__PARTNER_LINK_TYPE, newPartnerLinkType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMyRole() {
		return (String)eDynamicGet(Bw6Package.PARTNER_LINK__MY_ROLE, Bw6Package.Literals.PARTNER_LINK__MY_ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMyRole(String newMyRole) {
		eDynamicSet(Bw6Package.PARTNER_LINK__MY_ROLE, Bw6Package.Literals.PARTNER_LINK__MY_ROLE, newMyRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartnerRole() {
		return (String)eDynamicGet(Bw6Package.PARTNER_LINK__PARTNER_ROLE, Bw6Package.Literals.PARTNER_LINK__PARTNER_ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartnerRole(String newPartnerRole) {
		eDynamicSet(Bw6Package.PARTNER_LINK__PARTNER_ROLE, Bw6Package.Literals.PARTNER_LINK__PARTNER_ROLE, newPartnerRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bw6Package.PARTNER_LINK__NAME:
				return getName();
			case Bw6Package.PARTNER_LINK__PARTNER_LINK_TYPE:
				return getPartnerLinkType();
			case Bw6Package.PARTNER_LINK__MY_ROLE:
				return getMyRole();
			case Bw6Package.PARTNER_LINK__PARTNER_ROLE:
				return getPartnerRole();
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
			case Bw6Package.PARTNER_LINK__NAME:
				setName((String)newValue);
				return;
			case Bw6Package.PARTNER_LINK__PARTNER_LINK_TYPE:
				setPartnerLinkType((String)newValue);
				return;
			case Bw6Package.PARTNER_LINK__MY_ROLE:
				setMyRole((String)newValue);
				return;
			case Bw6Package.PARTNER_LINK__PARTNER_ROLE:
				setPartnerRole((String)newValue);
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
			case Bw6Package.PARTNER_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Bw6Package.PARTNER_LINK__PARTNER_LINK_TYPE:
				setPartnerLinkType(PARTNER_LINK_TYPE_EDEFAULT);
				return;
			case Bw6Package.PARTNER_LINK__MY_ROLE:
				setMyRole(MY_ROLE_EDEFAULT);
				return;
			case Bw6Package.PARTNER_LINK__PARTNER_ROLE:
				setPartnerRole(PARTNER_ROLE_EDEFAULT);
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
			case Bw6Package.PARTNER_LINK__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case Bw6Package.PARTNER_LINK__PARTNER_LINK_TYPE:
				return PARTNER_LINK_TYPE_EDEFAULT == null ? getPartnerLinkType() != null : !PARTNER_LINK_TYPE_EDEFAULT.equals(getPartnerLinkType());
			case Bw6Package.PARTNER_LINK__MY_ROLE:
				return MY_ROLE_EDEFAULT == null ? getMyRole() != null : !MY_ROLE_EDEFAULT.equals(getMyRole());
			case Bw6Package.PARTNER_LINK__PARTNER_ROLE:
				return PARTNER_ROLE_EDEFAULT == null ? getPartnerRole() != null : !PARTNER_ROLE_EDEFAULT.equals(getPartnerRole());
		}
		return super.eIsSet(featureID);
	}

} //PartnerLinkImpl
