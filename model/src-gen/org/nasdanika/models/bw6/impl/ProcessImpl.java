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

import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Import;
import org.nasdanika.models.bw6.PartnerLink;
import org.nasdanika.models.bw6.ProcessInfo;
import org.nasdanika.models.bw6.ProcessInterface;
import org.nasdanika.models.bw6.Scope;
import org.nasdanika.models.bw6.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessImpl#isExitOnStandardFault <em>Exit On Standard Fault</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessImpl#isSuppressJoinFailure <em>Suppress Join Failure</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessImpl#getProcessInterface <em>Process Interface</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessImpl#getPartnerLinks <em>Partner Links</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements org.nasdanika.models.bw6.Process {
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
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isExitOnStandardFault() <em>Exit On Standard Fault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExitOnStandardFault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXIT_ON_STANDARD_FAULT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSuppressJoinFailure() <em>Suppress Join Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuppressJoinFailure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPRESS_JOIN_FAILURE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTypes() <em>Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw6Package.Literals.PROCESS;
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
		return (String)eDynamicGet(Bw6Package.PROCESS__NAME, Bw6Package.Literals.PROCESS__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(Bw6Package.PROCESS__NAME, Bw6Package.Literals.PROCESS__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetNamespace() {
		return (String)eDynamicGet(Bw6Package.PROCESS__TARGET_NAMESPACE, Bw6Package.Literals.PROCESS__TARGET_NAMESPACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetNamespace(String newTargetNamespace) {
		eDynamicSet(Bw6Package.PROCESS__TARGET_NAMESPACE, Bw6Package.Literals.PROCESS__TARGET_NAMESPACE, newTargetNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExitOnStandardFault() {
		return (Boolean)eDynamicGet(Bw6Package.PROCESS__EXIT_ON_STANDARD_FAULT, Bw6Package.Literals.PROCESS__EXIT_ON_STANDARD_FAULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExitOnStandardFault(boolean newExitOnStandardFault) {
		eDynamicSet(Bw6Package.PROCESS__EXIT_ON_STANDARD_FAULT, Bw6Package.Literals.PROCESS__EXIT_ON_STANDARD_FAULT, newExitOnStandardFault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSuppressJoinFailure() {
		return (Boolean)eDynamicGet(Bw6Package.PROCESS__SUPPRESS_JOIN_FAILURE, Bw6Package.Literals.PROCESS__SUPPRESS_JOIN_FAILURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuppressJoinFailure(boolean newSuppressJoinFailure) {
		eDynamicSet(Bw6Package.PROCESS__SUPPRESS_JOIN_FAILURE, Bw6Package.Literals.PROCESS__SUPPRESS_JOIN_FAILURE, newSuppressJoinFailure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessInfo getInfo() {
		return (ProcessInfo)eDynamicGet(Bw6Package.PROCESS__INFO, Bw6Package.Literals.PROCESS__INFO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(ProcessInfo newInfo, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInfo, Bw6Package.PROCESS__INFO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfo(ProcessInfo newInfo) {
		eDynamicSet(Bw6Package.PROCESS__INFO, Bw6Package.Literals.PROCESS__INFO, newInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessInterface getProcessInterface() {
		return (ProcessInterface)eDynamicGet(Bw6Package.PROCESS__PROCESS_INTERFACE, Bw6Package.Literals.PROCESS__PROCESS_INTERFACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessInterface(ProcessInterface newProcessInterface, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProcessInterface, Bw6Package.PROCESS__PROCESS_INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessInterface(ProcessInterface newProcessInterface) {
		eDynamicSet(Bw6Package.PROCESS__PROCESS_INTERFACE, Bw6Package.Literals.PROCESS__PROCESS_INTERFACE, newProcessInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypes() {
		return (String)eDynamicGet(Bw6Package.PROCESS__TYPES, Bw6Package.Literals.PROCESS__TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypes(String newTypes) {
		eDynamicSet(Bw6Package.PROCESS__TYPES, Bw6Package.Literals.PROCESS__TYPES, newTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Import> getImports() {
		return (EList<Import>)eDynamicGet(Bw6Package.PROCESS__IMPORTS, Bw6Package.Literals.PROCESS__IMPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartnerLink> getPartnerLinks() {
		return (EList<PartnerLink>)eDynamicGet(Bw6Package.PROCESS__PARTNER_LINKS, Bw6Package.Literals.PROCESS__PARTNER_LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Variable> getVariables() {
		return (EList<Variable>)eDynamicGet(Bw6Package.PROCESS__VARIABLES, Bw6Package.Literals.PROCESS__VARIABLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope getScope() {
		return (Scope)eDynamicGet(Bw6Package.PROCESS__SCOPE, Bw6Package.Literals.PROCESS__SCOPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newScope, Bw6Package.PROCESS__SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(Scope newScope) {
		eDynamicSet(Bw6Package.PROCESS__SCOPE, Bw6Package.Literals.PROCESS__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bw6Package.PROCESS__INFO:
				return basicSetInfo(null, msgs);
			case Bw6Package.PROCESS__PROCESS_INTERFACE:
				return basicSetProcessInterface(null, msgs);
			case Bw6Package.PROCESS__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case Bw6Package.PROCESS__PARTNER_LINKS:
				return ((InternalEList<?>)getPartnerLinks()).basicRemove(otherEnd, msgs);
			case Bw6Package.PROCESS__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case Bw6Package.PROCESS__SCOPE:
				return basicSetScope(null, msgs);
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
			case Bw6Package.PROCESS__NAME:
				return getName();
			case Bw6Package.PROCESS__TARGET_NAMESPACE:
				return getTargetNamespace();
			case Bw6Package.PROCESS__EXIT_ON_STANDARD_FAULT:
				return isExitOnStandardFault();
			case Bw6Package.PROCESS__SUPPRESS_JOIN_FAILURE:
				return isSuppressJoinFailure();
			case Bw6Package.PROCESS__INFO:
				return getInfo();
			case Bw6Package.PROCESS__PROCESS_INTERFACE:
				return getProcessInterface();
			case Bw6Package.PROCESS__TYPES:
				return getTypes();
			case Bw6Package.PROCESS__IMPORTS:
				return getImports();
			case Bw6Package.PROCESS__PARTNER_LINKS:
				return getPartnerLinks();
			case Bw6Package.PROCESS__VARIABLES:
				return getVariables();
			case Bw6Package.PROCESS__SCOPE:
				return getScope();
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
			case Bw6Package.PROCESS__NAME:
				setName((String)newValue);
				return;
			case Bw6Package.PROCESS__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case Bw6Package.PROCESS__EXIT_ON_STANDARD_FAULT:
				setExitOnStandardFault((Boolean)newValue);
				return;
			case Bw6Package.PROCESS__SUPPRESS_JOIN_FAILURE:
				setSuppressJoinFailure((Boolean)newValue);
				return;
			case Bw6Package.PROCESS__INFO:
				setInfo((ProcessInfo)newValue);
				return;
			case Bw6Package.PROCESS__PROCESS_INTERFACE:
				setProcessInterface((ProcessInterface)newValue);
				return;
			case Bw6Package.PROCESS__TYPES:
				setTypes((String)newValue);
				return;
			case Bw6Package.PROCESS__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case Bw6Package.PROCESS__PARTNER_LINKS:
				getPartnerLinks().clear();
				getPartnerLinks().addAll((Collection<? extends PartnerLink>)newValue);
				return;
			case Bw6Package.PROCESS__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case Bw6Package.PROCESS__SCOPE:
				setScope((Scope)newValue);
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
			case Bw6Package.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Bw6Package.PROCESS__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case Bw6Package.PROCESS__EXIT_ON_STANDARD_FAULT:
				setExitOnStandardFault(EXIT_ON_STANDARD_FAULT_EDEFAULT);
				return;
			case Bw6Package.PROCESS__SUPPRESS_JOIN_FAILURE:
				setSuppressJoinFailure(SUPPRESS_JOIN_FAILURE_EDEFAULT);
				return;
			case Bw6Package.PROCESS__INFO:
				setInfo((ProcessInfo)null);
				return;
			case Bw6Package.PROCESS__PROCESS_INTERFACE:
				setProcessInterface((ProcessInterface)null);
				return;
			case Bw6Package.PROCESS__TYPES:
				setTypes(TYPES_EDEFAULT);
				return;
			case Bw6Package.PROCESS__IMPORTS:
				getImports().clear();
				return;
			case Bw6Package.PROCESS__PARTNER_LINKS:
				getPartnerLinks().clear();
				return;
			case Bw6Package.PROCESS__VARIABLES:
				getVariables().clear();
				return;
			case Bw6Package.PROCESS__SCOPE:
				setScope((Scope)null);
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
			case Bw6Package.PROCESS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case Bw6Package.PROCESS__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? getTargetNamespace() != null : !TARGET_NAMESPACE_EDEFAULT.equals(getTargetNamespace());
			case Bw6Package.PROCESS__EXIT_ON_STANDARD_FAULT:
				return isExitOnStandardFault() != EXIT_ON_STANDARD_FAULT_EDEFAULT;
			case Bw6Package.PROCESS__SUPPRESS_JOIN_FAILURE:
				return isSuppressJoinFailure() != SUPPRESS_JOIN_FAILURE_EDEFAULT;
			case Bw6Package.PROCESS__INFO:
				return getInfo() != null;
			case Bw6Package.PROCESS__PROCESS_INTERFACE:
				return getProcessInterface() != null;
			case Bw6Package.PROCESS__TYPES:
				return TYPES_EDEFAULT == null ? getTypes() != null : !TYPES_EDEFAULT.equals(getTypes());
			case Bw6Package.PROCESS__IMPORTS:
				return !getImports().isEmpty();
			case Bw6Package.PROCESS__PARTNER_LINKS:
				return !getPartnerLinks().isEmpty();
			case Bw6Package.PROCESS__VARIABLES:
				return !getVariables().isEmpty();
			case Bw6Package.PROCESS__SCOPE:
				return getScope() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessImpl
