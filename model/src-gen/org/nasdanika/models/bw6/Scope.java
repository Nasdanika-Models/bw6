/**
 */
package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.Scope#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Scope#getFlow <em>Flow</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw6.Bw6Package#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getScope_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Scope#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' containment reference.
	 * @see #setFlow(Flow)
	 * @see org.nasdanika.models.bw6.Bw6Package#getScope_Flow()
	 * @model containment="true"
	 * @generated
	 */
	Flow getFlow();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Scope#getFlow <em>Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' containment reference.
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(Flow value);

} // Scope
