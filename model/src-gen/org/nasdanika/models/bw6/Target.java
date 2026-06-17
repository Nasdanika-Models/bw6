/**
 */
package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.Target#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Target#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw6.Bw6Package#getTarget()
 * @model
 * @generated
 */
public interface Target extends EObject {
	/**
	 * Returns the value of the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Name</em>' attribute.
	 * @see #setLinkName(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getTarget_LinkName()
	 * @model unique="false"
	 * @generated
	 */
	String getLinkName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Target#getLinkName <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Name</em>' attribute.
	 * @see #getLinkName()
	 * @generated
	 */
	void setLinkName(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Link)
	 * @see org.nasdanika.models.bw6.Bw6Package#getTarget_Link()
	 * @model
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Target#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

} // Target
