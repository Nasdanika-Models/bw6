/**
 */
package org.nasdanika.models.bw6.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.Link;
import org.nasdanika.models.bw6.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw6.impl.SourceImpl#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.SourceImpl#getTransitionCondition <em>Transition Condition</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.SourceImpl#getTransitionConditionLanguage <em>Transition Condition Language</em>}</li>
 *   <li>{@link org.nasdanika.models.bw6.impl.SourceImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceImpl extends MinimalEObjectImpl.Container implements Source {
	/**
	 * The default value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkName()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTransitionCondition() <em>Transition Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_CONDITION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTransitionConditionLanguage() <em>Transition Condition Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionConditionLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_CONDITION_LANGUAGE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw6Package.Literals.SOURCE;
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
	public String getLinkName() {
		return (String)eDynamicGet(Bw6Package.SOURCE__LINK_NAME, Bw6Package.Literals.SOURCE__LINK_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkName(String newLinkName) {
		eDynamicSet(Bw6Package.SOURCE__LINK_NAME, Bw6Package.Literals.SOURCE__LINK_NAME, newLinkName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransitionCondition() {
		return (String)eDynamicGet(Bw6Package.SOURCE__TRANSITION_CONDITION, Bw6Package.Literals.SOURCE__TRANSITION_CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitionCondition(String newTransitionCondition) {
		eDynamicSet(Bw6Package.SOURCE__TRANSITION_CONDITION, Bw6Package.Literals.SOURCE__TRANSITION_CONDITION, newTransitionCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransitionConditionLanguage() {
		return (String)eDynamicGet(Bw6Package.SOURCE__TRANSITION_CONDITION_LANGUAGE, Bw6Package.Literals.SOURCE__TRANSITION_CONDITION_LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitionConditionLanguage(String newTransitionConditionLanguage) {
		eDynamicSet(Bw6Package.SOURCE__TRANSITION_CONDITION_LANGUAGE, Bw6Package.Literals.SOURCE__TRANSITION_CONDITION_LANGUAGE, newTransitionConditionLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getLink() {
		return (Link)eDynamicGet(Bw6Package.SOURCE__LINK, Bw6Package.Literals.SOURCE__LINK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetLink() {
		return (Link)eDynamicGet(Bw6Package.SOURCE__LINK, Bw6Package.Literals.SOURCE__LINK, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLink(Link newLink) {
		eDynamicSet(Bw6Package.SOURCE__LINK, Bw6Package.Literals.SOURCE__LINK, newLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bw6Package.SOURCE__LINK_NAME:
				return getLinkName();
			case Bw6Package.SOURCE__TRANSITION_CONDITION:
				return getTransitionCondition();
			case Bw6Package.SOURCE__TRANSITION_CONDITION_LANGUAGE:
				return getTransitionConditionLanguage();
			case Bw6Package.SOURCE__LINK:
				if (resolve) return getLink();
				return basicGetLink();
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
			case Bw6Package.SOURCE__LINK_NAME:
				setLinkName((String)newValue);
				return;
			case Bw6Package.SOURCE__TRANSITION_CONDITION:
				setTransitionCondition((String)newValue);
				return;
			case Bw6Package.SOURCE__TRANSITION_CONDITION_LANGUAGE:
				setTransitionConditionLanguage((String)newValue);
				return;
			case Bw6Package.SOURCE__LINK:
				setLink((Link)newValue);
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
			case Bw6Package.SOURCE__LINK_NAME:
				setLinkName(LINK_NAME_EDEFAULT);
				return;
			case Bw6Package.SOURCE__TRANSITION_CONDITION:
				setTransitionCondition(TRANSITION_CONDITION_EDEFAULT);
				return;
			case Bw6Package.SOURCE__TRANSITION_CONDITION_LANGUAGE:
				setTransitionConditionLanguage(TRANSITION_CONDITION_LANGUAGE_EDEFAULT);
				return;
			case Bw6Package.SOURCE__LINK:
				setLink((Link)null);
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
			case Bw6Package.SOURCE__LINK_NAME:
				return LINK_NAME_EDEFAULT == null ? getLinkName() != null : !LINK_NAME_EDEFAULT.equals(getLinkName());
			case Bw6Package.SOURCE__TRANSITION_CONDITION:
				return TRANSITION_CONDITION_EDEFAULT == null ? getTransitionCondition() != null : !TRANSITION_CONDITION_EDEFAULT.equals(getTransitionCondition());
			case Bw6Package.SOURCE__TRANSITION_CONDITION_LANGUAGE:
				return TRANSITION_CONDITION_LANGUAGE_EDEFAULT == null ? getTransitionConditionLanguage() != null : !TRANSITION_CONDITION_LANGUAGE_EDEFAULT.equals(getTransitionConditionLanguage());
			case Bw6Package.SOURCE__LINK:
				return basicGetLink() != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceImpl
