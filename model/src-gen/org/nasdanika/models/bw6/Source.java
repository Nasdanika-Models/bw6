/**
 */
package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.Source#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Source#getTransitionCondition <em>Transition Condition</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Source#getTransitionConditionLanguage <em>Transition Condition Language</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Source#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw6.Bw6Package#getSource()
 * @model
 * @generated
 */
public interface Source extends EObject {
	/**
	 * Returns the value of the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Name</em>' attribute.
	 * @see #setLinkName(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getSource_LinkName()
	 * @model unique="false"
	 * @generated
	 */
	String getLinkName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Source#getLinkName <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Name</em>' attribute.
	 * @see #getLinkName()
	 * @generated
	 */
	void setLinkName(String value);

	/**
	 * Returns the value of the '<em><b>Transition Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Condition</em>' attribute.
	 * @see #setTransitionCondition(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getSource_TransitionCondition()
	 * @model unique="false"
	 * @generated
	 */
	String getTransitionCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Source#getTransitionCondition <em>Transition Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Condition</em>' attribute.
	 * @see #getTransitionCondition()
	 * @generated
	 */
	void setTransitionCondition(String value);

	/**
	 * Returns the value of the '<em><b>Transition Condition Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Condition Language</em>' attribute.
	 * @see #setTransitionConditionLanguage(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getSource_TransitionConditionLanguage()
	 * @model unique="false"
	 * @generated
	 */
	String getTransitionConditionLanguage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Source#getTransitionConditionLanguage <em>Transition Condition Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Condition Language</em>' attribute.
	 * @see #getTransitionConditionLanguage()
	 * @generated
	 */
	void setTransitionConditionLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Link)
	 * @see org.nasdanika.models.bw6.Bw6Package#getSource_Link()
	 * @model
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Source#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

} // Source
