/**
 */
package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.Variable#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Variable#getElement <em>Element</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Variable#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Variable#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Variable#isInternal <em>Internal</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Variable#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Variable#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw6.Bw6Package#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getVariable_Name()
	 * @model unique="false" id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see #setElement(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getVariable_Element()
	 * @model unique="false"
	 * @generated
	 */
	String getElement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Variable#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(String value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see #setMessageType(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getVariable_MessageType()
	 * @model unique="false"
	 * @generated
	 */
	String getMessageType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Variable#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getVariable_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal</em>' attribute.
	 * @see #setInternal(boolean)
	 * @see org.nasdanika.models.bw6.Bw6Package#getVariable_Internal()
	 * @model unique="false"
	 * @generated
	 */
	boolean isInternal();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Variable#isInternal <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal</em>' attribute.
	 * @see #isInternal()
	 * @generated
	 */
	void setInternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getVariable_Parameter()
	 * @model unique="false"
	 * @generated
	 */
	String getParameter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Variable#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getVariable_DefaultValue()
	 * @model unique="false"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Variable#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // Variable
