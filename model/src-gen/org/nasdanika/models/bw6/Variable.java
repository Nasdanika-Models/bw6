package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

public interface Variable extends EObject {
    String getName();
    void setName(String value);

    String getElement();
    void setElement(String value);

    String getMessageType();
    void setMessageType(String value);

    String getType();
    void setType(String value);

    boolean isInternal();
    void setInternal(boolean value);

    String getParameter();
    void setParameter(String value);

    String getDefaultValue();
    void setDefaultValue(String value);

}
