package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

public interface Import extends EObject {
    String getImportType();
    void setImportType(String value);

    String getNamespace();
    void setNamespace(String value);

    String getLocation();
    void setLocation(String value);

}
