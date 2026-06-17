/**
 */
package org.nasdanika.models.bw6;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.Activity#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Activity#getXpdlId <em>Xpdl Id</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Activity#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Activity#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Activity#getSources <em>Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.Activity#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw6.Bw6Package#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getActivity_Name()
	 * @model unique="false" id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Xpdl Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpdl Id</em>' attribute.
	 * @see #setXpdlId(String)
	 * @see org.nasdanika.models.bw6.Bw6Package#getActivity_XpdlId()
	 * @model unique="false"
	 * @generated
	 */
	String getXpdlId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw6.Activity#getXpdlId <em>Xpdl Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpdl Id</em>' attribute.
	 * @see #getXpdlId()
	 * @generated
	 */
	void setXpdlId(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw6.Link}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.bw6.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see org.nasdanika.models.bw6.Bw6Package#getActivity_OutgoingLinks()
	 * @see org.nasdanika.models.bw6.Link#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Link> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw6.Link}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.bw6.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see org.nasdanika.models.bw6.Bw6Package#getActivity_IncomingLinks()
	 * @see org.nasdanika.models.bw6.Link#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Link> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw6.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see org.nasdanika.models.bw6.Bw6Package#getActivity_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw6.Target}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see org.nasdanika.models.bw6.Bw6Package#getActivity_Targets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Target> getTargets();

} // Activity
