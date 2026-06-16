package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

public interface ReceiveEvent extends Activity {
    boolean isCreateInstance();
    void setCreateInstance(boolean value);

    int getEventTimeout();
    void setEventTimeout(int value);

    String getVariable();
    void setVariable(String value);

    String getEventSource();
    void setEventSource(String value);

}
