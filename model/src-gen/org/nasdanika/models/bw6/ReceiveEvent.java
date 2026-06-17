/**
 */
package org.nasdanika.models.bw6;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.ReceiveEvent#isCreateInstance <em>Create Instance</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.ReceiveEvent#getEventTimeout <em>Event Timeout</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.ReceiveEvent#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.ReceiveEvent#getEventSource <em>Event Source</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw6.Bw6Package#getReceiveEvent()
 * @model
 * @generated
 */
public interface ReceiveEvent extends Activity {
	/**
	 * Returns the value of the '<em><b>Create Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Instance</em>' attribute.
	 * @see #setCreateInstance(boolean)
	 * @see org.nasdanika.models.bw6.Bw6Package#getReceiveEvent_CreateInstance()
	 * @model unique="false"
	 * @generated
	 */
	boolean isCreateInstance();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.ReceiveEvent#isCreateInstance <em>Create Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Instance</em>' attribute.
	 * @see #isCreateInstance()
	 * @generated
	 */
	void setCreateInstance(boolean value);

	/**
	 * Returns the value of the '<em><b>Event Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Timeout</em>' attribute.
	 * @see #setEventTimeout(int)
	 * @see org.nasdanika.models.bw6.Bw6Package#getReceiveEvent_EventTimeout()
	 * @model unique="false"
	 * @generated
	 */
	int getEventTimeout();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.ReceiveEvent#getEventTimeout <em>Event Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Timeout</em>' attribute.
	 * @see #getEventTimeout()
	 * @generated
	 */
	void setEventTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getReceiveEvent_Variable()
	 * @model unique="false"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.ReceiveEvent#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Event Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Source</em>' attribute.
	 * @see #setEventSource(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getReceiveEvent_EventSource()
	 * @model unique="false"
	 * @generated
	 */
	String getEventSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.ReceiveEvent#getEventSource <em>Event Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Source</em>' attribute.
	 * @see #getEventSource()
	 * @generated
	 */
	void setEventSource(String value);

} // ReceiveEvent
