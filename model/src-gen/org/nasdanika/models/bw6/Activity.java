package org.nasdanika.models.bw6;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public interface Activity extends EObject {
    String getName();
    void setName(String value);

    String getXpdlId();
    void setXpdlId(String value);

    EList<Link> getOutgoingLinks();

    EList<Link> getIncomingLinks();

    EList<Source> getSources();

    EList<Target> getTargets();

}
