package org.nasdanika.models.bw6;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public interface Flow extends EObject {
    String getName();
    void setName(String value);

    EList<Link> getLinks();

    EList<Activity> getActivities();

}
