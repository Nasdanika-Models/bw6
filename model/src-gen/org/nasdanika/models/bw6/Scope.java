package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

public interface Scope extends EObject {
    String getName();
    void setName(String value);

    Flow getFlow();
    void setFlow(Flow value);

}
