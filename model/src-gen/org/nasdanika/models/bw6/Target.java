package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

public interface Target extends EObject {
    String getLinkName();
    void setLinkName(String value);

    Link getLink();
    void setLink(Link value);

}
