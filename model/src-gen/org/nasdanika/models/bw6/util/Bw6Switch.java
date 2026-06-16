package org.nasdanika.models.bw6.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.bw6.Activity;
import org.nasdanika.models.bw6.ActivityExtension;
import org.nasdanika.models.bw6.Bw6Package;
import org.nasdanika.models.bw6.EmptyActivity;
import org.nasdanika.models.bw6.Flow;
import org.nasdanika.models.bw6.Import;
import org.nasdanika.models.bw6.Link;
import org.nasdanika.models.bw6.PartnerLink;
import org.nasdanika.models.bw6.Process;
import org.nasdanika.models.bw6.ProcessInfo;
import org.nasdanika.models.bw6.ProcessInterface;
import org.nasdanika.models.bw6.ReceiveEvent;
import org.nasdanika.models.bw6.Scope;
import org.nasdanika.models.bw6.Source;
import org.nasdanika.models.bw6.Target;
import org.nasdanika.models.bw6.Variable;

public class Bw6Switch<T> extends Switch<T> {
    protected static Bw6Package modelPackage;

    public Bw6Switch() {
        if (modelPackage == null) {
            modelPackage = Bw6Package.eINSTANCE;
        }
    }

    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case Bw6Package.PROCESS: {
                Process process = (Process)theEObject;
                T result = caseProcess(process);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.PROCESS_INFO: {
                ProcessInfo processInfo = (ProcessInfo)theEObject;
                T result = caseProcessInfo(processInfo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.PROCESS_INTERFACE: {
                ProcessInterface processInterface = (ProcessInterface)theEObject;
                T result = caseProcessInterface(processInterface);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.IMPORT: {
                Import imprt = (Import)theEObject;
                T result = caseImport(imprt);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.PARTNER_LINK: {
                PartnerLink partnerLink = (PartnerLink)theEObject;
                T result = casePartnerLink(partnerLink);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.VARIABLE: {
                Variable variable = (Variable)theEObject;
                T result = caseVariable(variable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.SCOPE: {
                Scope scope = (Scope)theEObject;
                T result = caseScope(scope);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.FLOW: {
                Flow flow = (Flow)theEObject;
                T result = caseFlow(flow);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.LINK: {
                Link link = (Link)theEObject;
                T result = caseLink(link);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.ACTIVITY: {
                Activity activity = (Activity)theEObject;
                T result = caseActivity(activity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.SOURCE: {
                Source source = (Source)theEObject;
                T result = caseSource(source);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.TARGET: {
                Target target = (Target)theEObject;
                T result = caseTarget(target);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.ACTIVITY_EXTENSION: {
                ActivityExtension activityExtension = (ActivityExtension)theEObject;
                T result = caseActivityExtension(activityExtension);
                if (result == null) result = caseActivity(activityExtension);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.RECEIVE_EVENT: {
                ReceiveEvent receiveEvent = (ReceiveEvent)theEObject;
                T result = caseReceiveEvent(receiveEvent);
                if (result == null) result = caseActivity(receiveEvent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Bw6Package.EMPTY_ACTIVITY: {
                EmptyActivity emptyActivity = (EmptyActivity)theEObject;
                T result = caseEmptyActivity(emptyActivity);
                if (result == null) result = caseActivity(emptyActivity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    public T caseProcess(Process object) {
        return null;
    }

    public T caseProcessInfo(ProcessInfo object) {
        return null;
    }

    public T caseProcessInterface(ProcessInterface object) {
        return null;
    }

    public T caseImport(Import object) {
        return null;
    }

    public T casePartnerLink(PartnerLink object) {
        return null;
    }

    public T caseVariable(Variable object) {
        return null;
    }

    public T caseScope(Scope object) {
        return null;
    }

    public T caseFlow(Flow object) {
        return null;
    }

    public T caseLink(Link object) {
        return null;
    }

    public T caseActivity(Activity object) {
        return null;
    }

    public T caseSource(Source object) {
        return null;
    }

    public T caseTarget(Target object) {
        return null;
    }

    public T caseActivityExtension(ActivityExtension object) {
        return null;
    }

    public T caseReceiveEvent(ReceiveEvent object) {
        return null;
    }

    public T caseEmptyActivity(EmptyActivity object) {
        return null;
    }

    @Override
    public T defaultCase(EObject object) {
        return null;
    }
}
