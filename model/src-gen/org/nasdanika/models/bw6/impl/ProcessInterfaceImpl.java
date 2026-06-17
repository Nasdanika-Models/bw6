/**
 */
package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.ProcessInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessInterfaceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessInterfaceImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.ProcessInterfaceImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessInterfaceImpl extends MinimalEObjectImpl.Container implements ProcessInterface {
	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw6Package.Literals.PROCESS_INTERFACE;
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
	public String getContext() {
		return (String)eDynamicGet(Bw6Package.PROCESS_INTERFACE__CONTEXT, Bw6Package.Literals.PROCESS_INTERFACE__CONTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(String newContext) {
		eDynamicSet(Bw6Package.PROCESS_INTERFACE__CONTEXT, Bw6Package.Literals.PROCESS_INTERFACE__CONTEXT, newContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInput() {
		return (String)eDynamicGet(Bw6Package.PROCESS_INTERFACE__INPUT, Bw6Package.Literals.PROCESS_INTERFACE__INPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInput(String newInput) {
		eDynamicSet(Bw6Package.PROCESS_INTERFACE__INPUT, Bw6Package.Literals.PROCESS_INTERFACE__INPUT, newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutput() {
		return (String)eDynamicGet(Bw6Package.PROCESS_INTERFACE__OUTPUT, Bw6Package.Literals.PROCESS_INTERFACE__OUTPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput(String newOutput) {
		eDynamicSet(Bw6Package.PROCESS_INTERFACE__OUTPUT, Bw6Package.Literals.PROCESS_INTERFACE__OUTPUT, newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bw6Package.PROCESS_INTERFACE__CONTEXT:
				return getContext();
			case Bw6Package.PROCESS_INTERFACE__INPUT:
				return getInput();
			case Bw6Package.PROCESS_INTERFACE__OUTPUT:
				return getOutput();
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
			case Bw6Package.PROCESS_INTERFACE__CONTEXT:
				setContext((String)newValue);
				return;
			case Bw6Package.PROCESS_INTERFACE__INPUT:
				setInput((String)newValue);
				return;
			case Bw6Package.PROCESS_INTERFACE__OUTPUT:
				setOutput((String)newValue);
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
			case Bw6Package.PROCESS_INTERFACE__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case Bw6Package.PROCESS_INTERFACE__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case Bw6Package.PROCESS_INTERFACE__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
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
			case Bw6Package.PROCESS_INTERFACE__CONTEXT:
				return CONTEXT_EDEFAULT == null ? getContext() != null : !CONTEXT_EDEFAULT.equals(getContext());
			case Bw6Package.PROCESS_INTERFACE__INPUT:
				return INPUT_EDEFAULT == null ? getInput() != null : !INPUT_EDEFAULT.equals(getInput());
			case Bw6Package.PROCESS_INTERFACE__OUTPUT:
				return OUTPUT_EDEFAULT == null ? getOutput() != null : !OUTPUT_EDEFAULT.equals(getOutput());
		}
		return super.eIsSet(featureID);
	}

} //ProcessInterfaceImpl
