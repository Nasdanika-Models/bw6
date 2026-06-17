/**
 */
package org.nasdanika.models.bw6;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * The root element of a BW 6.x process file (.bwp).
 * Corresponds to bpws:process in the WS-BPEL 2.0 namespace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.Process#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Process#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Process#isExitOnStandardFault <em>Exit On Standard Fault</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Process#isSuppressJoinFailure <em>Suppress Join Failure</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Process#getInfo <em>Info</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Process#getProcessInterface <em>Process Interface</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Process#getTypes <em>Types</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Process#getImports <em>Imports</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Process#getPartnerLinks <em>Partner Links</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Process#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Process#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw6.Bw6Package#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcess_Name()
	 * @model unique="false" id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcess_TargetNamespace()
	 * @model unique="false"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Process#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Exit On Standard Fault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit On Standard Fault</em>' attribute.
	 * @see #setExitOnStandardFault(boolean)
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcess_ExitOnStandardFault()
	 * @model unique="false"
	 * @generated
	 */
	boolean isExitOnStandardFault();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Process#isExitOnStandardFault <em>Exit On Standard Fault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit On Standard Fault</em>' attribute.
	 * @see #isExitOnStandardFault()
	 * @generated
	 */
	void setExitOnStandardFault(boolean value);

	/**
	 * Returns the value of the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress Join Failure</em>' attribute.
	 * @see #setSuppressJoinFailure(boolean)
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcess_SuppressJoinFailure()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSuppressJoinFailure();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Process#isSuppressJoinFailure <em>Suppress Join Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress Join Failure</em>' attribute.
	 * @see #isSuppressJoinFailure()
	 * @generated
	 */
	void setSuppressJoinFailure(boolean value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(ProcessInfo)
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcess_Info()
	 * @model containment="true"
	 * @generated
	 */
	ProcessInfo getInfo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Process#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(ProcessInfo value);

	/**
	 * Returns the value of the '<em><b>Process Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Interface</em>' containment reference.
	 * @see #setProcessInterface(ProcessInterface)
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcess_ProcessInterface()
	 * @model containment="true"
	 * @generated
	 */
	ProcessInterface getProcessInterface();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Process#getProcessInterface <em>Process Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Interface</em>' containment reference.
	 * @see #getProcessInterface()
	 * @generated
	 */
	void setProcessInterface(ProcessInterface value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute.
	 * @see #setTypes(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcess_Types()
	 * @model unique="false"
	 * @generated
	 */
	String getTypes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Process#getTypes <em>Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' attribute.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw6.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcess_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Partner Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw6.PartnerLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Links</em>' containment reference list.
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcess_PartnerLinks()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<PartnerLink> getPartnerLinks();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw6.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcess_Variables()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(Scope)
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcess_Scope()
	 * @model containment="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Process#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

} // Process
