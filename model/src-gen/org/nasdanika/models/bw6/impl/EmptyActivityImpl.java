/**
 */
package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.EmptyActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empty Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.impl.EmptyActivityImpl#getConstructor <em>Constructor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmptyActivityImpl extends ActivityImpl implements EmptyActivity {
	/**
	 * The default value of the '{@link #getConstructor() <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructor()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRUCTOR_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmptyActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw6Package.Literals.EMPTY_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstructor() {
		return (String)eDynamicGet(Bw6Package.EMPTY_ACTIVITY__CONSTRUCTOR, Bw6Package.Literals.EMPTY_ACTIVITY__CONSTRUCTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstructor(String newConstructor) {
		eDynamicSet(Bw6Package.EMPTY_ACTIVITY__CONSTRUCTOR, Bw6Package.Literals.EMPTY_ACTIVITY__CONSTRUCTOR, newConstructor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bw6Package.EMPTY_ACTIVITY__CONSTRUCTOR:
				return getConstructor();
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
			case Bw6Package.EMPTY_ACTIVITY__CONSTRUCTOR:
				setConstructor((String)newValue);
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
			case Bw6Package.EMPTY_ACTIVITY__CONSTRUCTOR:
				setConstructor(CONSTRUCTOR_EDEFAULT);
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
			case Bw6Package.EMPTY_ACTIVITY__CONSTRUCTOR:
				return CONSTRUCTOR_EDEFAULT == null ? getConstructor() != null : !CONSTRUCTOR_EDEFAULT.equals(getConstructor());
		}
		return super.eIsSet(featureID);
	}

} //EmptyActivityImpl
