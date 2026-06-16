package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

public interface Source extends EObject {
    String getLinkName();
    void setLinkName(String value);

    String getTransitionCondition();
    void setTransitionCondition(String value);

    String getTransitionConditionLanguage();
    void setTransitionConditionLanguage(String value);

    Link getLink();
    void setLink(Link value);

}
