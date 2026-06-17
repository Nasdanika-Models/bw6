/**
 */
package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.ProcessInterface#getContext <em>Context</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.ProcessInterface#getInput <em>Input</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.ProcessInterface#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw6.Bw6Package#getProcessInterface()
 * @model
 * @generated
 */
public interface ProcessInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcessInterface_Context()
	 * @model unique="false"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.ProcessInterface#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcessInterface_Input()
	 * @model unique="false"
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.ProcessInterface#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getProcessInterface_Output()
	 * @model unique="false"
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.ProcessInterface#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

} // ProcessInterface
