package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

public interface Link extends EObject {
    String getName();
    void setName(String value);

    String getLinkType();
    void setLinkType(String value);

    String getLabel();
    void setLabel(String value);

    Activity getSource();
    void setSource(Activity value);

    Activity getTarget();
    void setTarget(Activity value);

}
