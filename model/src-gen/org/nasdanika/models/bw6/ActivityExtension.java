package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EObject;

public interface ActivityExtension extends Activity {
    String getInputVariable();
    void setInputVariable(String value);

    String getOutputVariable();
    void setOutputVariable(String value);

    String getExpression();
    void setExpression(String value);

    String getExpressionLanguage();
    void setExpressionLanguage(String value);

    String getInputBindings();
    void setInputBindings(String value);

    String getConfig();
    void setConfig(String value);

    String getActivityTypeId();
    void setActivityTypeId(String value);

}
