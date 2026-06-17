/**
 */
package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.ProcessInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessInfoImpl#isCallable <em>Callable</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessInfoImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessInfoImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessInfoImpl#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessInfoImpl#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessInfoImpl#getHistorySize <em>History Size</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessInfoImpl#getFlowModel <em>Flow Model</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessInfoImpl#getPoolIcon <em>Pool Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessInfoImpl extends MinimalEObjectImpl.Container implements ProcessInfo {
	/**
	 * The default value of the '{@link #isCallable() <em>Callable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALLABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getModifiedBy() <em>Modified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIED_BY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getModificationDate() <em>Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFICATION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHistorySize() <em>History Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistorySize()
	 * @generated
	 * @ordered
	 */
	protected static final String HISTORY_SIZE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFlowModel() <em>Flow Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowModel()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_MODEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPoolIcon() <em>Pool Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String POOL_ICON_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw6Package.Literals.PROCESS_INFO;
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
	public boolean isCallable() {
		return (Boolean)eDynamicGet(Bw6Package.PROCESS_INFO__CALLABLE, Bw6Package.Literals.PROCESS_INFO__CALLABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallable(boolean newCallable) {
		eDynamicSet(Bw6Package.PROCESS_INFO__CALLABLE, Bw6Package.Literals.PROCESS_INFO__CALLABLE, newCallable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedBy() {
		return (String)eDynamicGet(Bw6Package.PROCESS_INFO__CREATED_BY, Bw6Package.Literals.PROCESS_INFO__CREATED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedBy(String newCreatedBy) {
		eDynamicSet(Bw6Package.PROCESS_INFO__CREATED_BY, Bw6Package.Literals.PROCESS_INFO__CREATED_BY, newCreatedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationDate() {
		return (String)eDynamicGet(Bw6Package.PROCESS_INFO__CREATION_DATE, Bw6Package.Literals.PROCESS_INFO__CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(String newCreationDate) {
		eDynamicSet(Bw6Package.PROCESS_INFO__CREATION_DATE, Bw6Package.Literals.PROCESS_INFO__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModifiedBy() {
		return (String)eDynamicGet(Bw6Package.PROCESS_INFO__MODIFIED_BY, Bw6Package.Literals.PROCESS_INFO__MODIFIED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifiedBy(String newModifiedBy) {
		eDynamicSet(Bw6Package.PROCESS_INFO__MODIFIED_BY, Bw6Package.Literals.PROCESS_INFO__MODIFIED_BY, newModifiedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModificationDate() {
		return (String)eDynamicGet(Bw6Package.PROCESS_INFO__MODIFICATION_DATE, Bw6Package.Literals.PROCESS_INFO__MODIFICATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModificationDate(String newModificationDate) {
		eDynamicSet(Bw6Package.PROCESS_INFO__MODIFICATION_DATE, Bw6Package.Literals.PROCESS_INFO__MODIFICATION_DATE, newModificationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHistorySize() {
		return (String)eDynamicGet(Bw6Package.PROCESS_INFO__HISTORY_SIZE, Bw6Package.Literals.PROCESS_INFO__HISTORY_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHistorySize(String newHistorySize) {
		eDynamicSet(Bw6Package.PROCESS_INFO__HISTORY_SIZE, Bw6Package.Literals.PROCESS_INFO__HISTORY_SIZE, newHistorySize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFlowModel() {
		return (String)eDynamicGet(Bw6Package.PROCESS_INFO__FLOW_MODEL, Bw6Package.Literals.PROCESS_INFO__FLOW_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowModel(String newFlowModel) {
		eDynamicSet(Bw6Package.PROCESS_INFO__FLOW_MODEL, Bw6Package.Literals.PROCESS_INFO__FLOW_MODEL, newFlowModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPoolIcon() {
		return (String)eDynamicGet(Bw6Package.PROCESS_INFO__POOL_ICON, Bw6Package.Literals.PROCESS_INFO__POOL_ICON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoolIcon(String newPoolIcon) {
		eDynamicSet(Bw6Package.PROCESS_INFO__POOL_ICON, Bw6Package.Literals.PROCESS_INFO__POOL_ICON, newPoolIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bw6Package.PROCESS_INFO__CALLABLE:
				return isCallable();
			case Bw6Package.PROCESS_INFO__CREATED_BY:
				return getCreatedBy();
			case Bw6Package.PROCESS_INFO__CREATION_DATE:
				return getCreationDate();
			case Bw6Package.PROCESS_INFO__MODIFIED_BY:
				return getModifiedBy();
			case Bw6Package.PROCESS_INFO__MODIFICATION_DATE:
				return getModificationDate();
			case Bw6Package.PROCESS_INFO__HISTORY_SIZE:
				return getHistorySize();
			case Bw6Package.PROCESS_INFO__FLOW_MODEL:
				return getFlowModel();
			case Bw6Package.PROCESS_INFO__POOL_ICON:
				return getPoolIcon();
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
			case Bw6Package.PROCESS_INFO__CALLABLE:
				setCallable((Boolean)newValue);
				return;
			case Bw6Package.PROCESS_INFO__CREATED_BY:
				setCreatedBy((String)newValue);
				return;
			case Bw6Package.PROCESS_INFO__CREATION_DATE:
				setCreationDate((String)newValue);
				return;
			case Bw6Package.PROCESS_INFO__MODIFIED_BY:
				setModifiedBy((String)newValue);
				return;
			case Bw6Package.PROCESS_INFO__MODIFICATION_DATE:
				setModificationDate((String)newValue);
				return;
			case Bw6Package.PROCESS_INFO__HISTORY_SIZE:
				setHistorySize((String)newValue);
				return;
			case Bw6Package.PROCESS_INFO__FLOW_MODEL:
				setFlowModel((String)newValue);
				return;
			case Bw6Package.PROCESS_INFO__POOL_ICON:
				setPoolIcon((String)newValue);
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
			case Bw6Package.PROCESS_INFO__CALLABLE:
				setCallable(CALLABLE_EDEFAULT);
				return;
			case Bw6Package.PROCESS_INFO__CREATED_BY:
				setCreatedBy(CREATED_BY_EDEFAULT);
				return;
			case Bw6Package.PROCESS_INFO__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case Bw6Package.PROCESS_INFO__MODIFIED_BY:
				setModifiedBy(MODIFIED_BY_EDEFAULT);
				return;
			case Bw6Package.PROCESS_INFO__MODIFICATION_DATE:
				setModificationDate(MODIFICATION_DATE_EDEFAULT);
				return;
			case Bw6Package.PROCESS_INFO__HISTORY_SIZE:
				setHistorySize(HISTORY_SIZE_EDEFAULT);
				return;
			case Bw6Package.PROCESS_INFO__FLOW_MODEL:
				setFlowModel(FLOW_MODEL_EDEFAULT);
				return;
			case Bw6Package.PROCESS_INFO__POOL_ICON:
				setPoolIcon(POOL_ICON_EDEFAULT);
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
			case Bw6Package.PROCESS_INFO__CALLABLE:
				return isCallable() != CALLABLE_EDEFAULT;
			case Bw6Package.PROCESS_INFO__CREATED_BY:
				return CREATED_BY_EDEFAULT == null ? getCreatedBy() != null : !CREATED_BY_EDEFAULT.equals(getCreatedBy());
			case Bw6Package.PROCESS_INFO__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null : !CREATION_DATE_EDEFAULT.equals(getCreationDate());
			case Bw6Package.PROCESS_INFO__MODIFIED_BY:
				return MODIFIED_BY_EDEFAULT == null ? getModifiedBy() != null : !MODIFIED_BY_EDEFAULT.equals(getModifiedBy());
			case Bw6Package.PROCESS_INFO__MODIFICATION_DATE:
				return MODIFICATION_DATE_EDEFAULT == null ? getModificationDate() != null : !MODIFICATION_DATE_EDEFAULT.equals(getModificationDate());
			case Bw6Package.PROCESS_INFO__HISTORY_SIZE:
				return HISTORY_SIZE_EDEFAULT == null ? getHistorySize() != null : !HISTORY_SIZE_EDEFAULT.equals(getHistorySize());
			case Bw6Package.PROCESS_INFO__FLOW_MODEL:
				return FLOW_MODEL_EDEFAULT == null ? getFlowModel() != null : !FLOW_MODEL_EDEFAULT.equals(getFlowModel());
			case Bw6Package.PROCESS_INFO__POOL_ICON:
				return POOL_ICON_EDEFAULT == null ? getPoolIcon() != null : !POOL_ICON_EDEFAULT.equals(getPoolIcon());
		}
		return super.eIsSet(featureID);
	}

} //ProcessInfoImpl
