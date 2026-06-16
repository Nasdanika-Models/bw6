package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

public interface PartnerLink extends EObject {
    String getName();
    void setName(String value);

    String getPartnerLinkType();
    void setPartnerLinkType(String value);

    String getMyRole();
    void setMyRole(String value);

    String getPartnerRole();
    void setPartnerRole(String value);

}
