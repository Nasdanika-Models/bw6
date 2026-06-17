/**
 */
package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partner Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.PartnerLink#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.PartnerLink#getPartnerLinkType <em>Partner Link Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.PartnerLink#getMyRole <em>My Role</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.PartnerLink#getPartnerRole <em>Partner Role</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw6.Bw6Package#getPartnerLink()
 * @model
 * @generated
 */
public interface PartnerLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getPartnerLink_Name()
	 * @model unique="false" id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.PartnerLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Partner Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Link Type</em>' attribute.
	 * @see #setPartnerLinkType(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getPartnerLink_PartnerLinkType()
	 * @model unique="false"
	 * @generated
	 */
	String getPartnerLinkType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.PartnerLink#getPartnerLinkType <em>Partner Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Link Type</em>' attribute.
	 * @see #getPartnerLinkType()
	 * @generated
	 */
	void setPartnerLinkType(String value);

	/**
	 * Returns the value of the '<em><b>My Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Role</em>' attribute.
	 * @see #setMyRole(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getPartnerLink_MyRole()
	 * @model unique="false"
	 * @generated
	 */
	String getMyRole();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.PartnerLink#getMyRole <em>My Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Role</em>' attribute.
	 * @see #getMyRole()
	 * @generated
	 */
	void setMyRole(String value);

	/**
	 * Returns the value of the '<em><b>Partner Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Role</em>' attribute.
	 * @see #setPartnerRole(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getPartnerLink_PartnerRole()
	 * @model unique="false"
	 * @generated
	 */
	String getPartnerRole();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.PartnerLink#getPartnerRole <em>Partner Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Role</em>' attribute.
	 * @see #getPartnerRole()
	 * @generated
	 */
	void setPartnerRole(String value);

} // PartnerLink
