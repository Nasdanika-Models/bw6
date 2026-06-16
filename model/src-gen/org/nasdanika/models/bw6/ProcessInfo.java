package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

public interface ProcessInfo extends EObject {
    boolean isCallable();
    void setCallable(boolean value);

    String getCreatedBy();
    void setCreatedBy(String value);

    String getCreationDate();
    void setCreationDate(String value);

    String getModifiedBy();
    void setModifiedBy(String value);

    String getModificationDate();
    void setModificationDate(String value);

    String getHistorySize();
    void setHistorySize(String value);

    String getFlowModel();
    void setFlowModel(String value);

    String getPoolIcon();
    void setPoolIcon(String value);

}
