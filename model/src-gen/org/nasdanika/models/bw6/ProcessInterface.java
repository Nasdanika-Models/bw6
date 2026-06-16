package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

public interface ProcessInterface extends EObject {
    String getContext();
    void setContext(String value);

    String getInput();
    void setInput(String value);

    String getOutput();
    void setOutput(String value);

}
