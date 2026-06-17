/**
 */
package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.impl.ImportImpl#getImportType <em>Import Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ImportImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ImportImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import {
	/**
	 * The default value of the '{@link #getImportType() <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportType()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw6Package.Literals.IMPORT;
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
	public String getImportType() {
		return (String)eDynamicGet(Bw6Package.IMPORT__IMPORT_TYPE, Bw6Package.Literals.IMPORT__IMPORT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportType(String newImportType) {
		eDynamicSet(Bw6Package.IMPORT__IMPORT_TYPE, Bw6Package.Literals.IMPORT__IMPORT_TYPE, newImportType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespace() {
		return (String)eDynamicGet(Bw6Package.IMPORT__NAMESPACE, Bw6Package.Literals.IMPORT__NAMESPACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespace(String newNamespace) {
		eDynamicSet(Bw6Package.IMPORT__NAMESPACE, Bw6Package.Literals.IMPORT__NAMESPACE, newNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return (String)eDynamicGet(Bw6Package.IMPORT__LOCATION, Bw6Package.Literals.IMPORT__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		eDynamicSet(Bw6Package.IMPORT__LOCATION, Bw6Package.Literals.IMPORT__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bw6Package.IMPORT__IMPORT_TYPE:
				return getImportType();
			case Bw6Package.IMPORT__NAMESPACE:
				return getNamespace();
			case Bw6Package.IMPORT__LOCATION:
				return getLocation();
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
			case Bw6Package.IMPORT__IMPORT_TYPE:
				setImportType((String)newValue);
				return;
			case Bw6Package.IMPORT__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case Bw6Package.IMPORT__LOCATION:
				setLocation((String)newValue);
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
			case Bw6Package.IMPORT__IMPORT_TYPE:
				setImportType(IMPORT_TYPE_EDEFAULT);
				return;
			case Bw6Package.IMPORT__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case Bw6Package.IMPORT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
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
			case Bw6Package.IMPORT__IMPORT_TYPE:
				return IMPORT_TYPE_EDEFAULT == null ? getImportType() != null : !IMPORT_TYPE_EDEFAULT.equals(getImportType());
			case Bw6Package.IMPORT__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? getNamespace() != null : !NAMESPACE_EDEFAULT.equals(getNamespace());
			case Bw6Package.IMPORT__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
		}
		return super.eIsSet(featureID);
	}

} //ImportImpl
