package org.nasdanika.models.bw6.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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

public class Bw6AdapterFactory extends AdapterFactoryImpl {
    protected static Bw6Package modelPackage;

    public Bw6AdapterFactory() {
        if (modelPackage == null) {
            modelPackage = Bw6Package.eINSTANCE;
        }
    }

    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    protected Bw6Switch<Adapter> modelSwitch = new Bw6Switch<>() {
        @Override
        public Adapter caseProcess(Process object) {
            return createProcessAdapter();
        }
        @Override
        public Adapter caseProcessInfo(ProcessInfo object) {
            return createProcessInfoAdapter();
        }
        @Override
        public Adapter caseProcessInterface(ProcessInterface object) {
            return createProcessInterfaceAdapter();
        }
        @Override
        public Adapter caseImport(Import object) {
            return createImportAdapter();
        }
        @Override
        public Adapter casePartnerLink(PartnerLink object) {
            return createPartnerLinkAdapter();
        }
        @Override
        public Adapter caseVariable(Variable object) {
            return createVariableAdapter();
        }
        @Override
        public Adapter caseScope(Scope object) {
            return createScopeAdapter();
        }
        @Override
        public Adapter caseFlow(Flow object) {
            return createFlowAdapter();
        }
        @Override
        public Adapter caseLink(Link object) {
            return createLinkAdapter();
        }
        @Override
        public Adapter caseActivity(Activity object) {
            return createActivityAdapter();
        }
        @Override
        public Adapter caseSource(Source object) {
            return createSourceAdapter();
        }
        @Override
        public Adapter caseTarget(Target object) {
            return createTargetAdapter();
        }
        @Override
        public Adapter caseActivityExtension(ActivityExtension object) {
            return createActivityExtensionAdapter();
        }
        @Override
        public Adapter caseReceiveEvent(ReceiveEvent object) {
            return createReceiveEventAdapter();
        }
        @Override
        public Adapter caseEmptyActivity(EmptyActivity object) {
            return createEmptyActivityAdapter();
        }
        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }

    public Adapter createProcessAdapter() {
        return null;
    }

    public Adapter createProcessInfoAdapter() {
        return null;
    }

    public Adapter createProcessInterfaceAdapter() {
        return null;
    }

    public Adapter createImportAdapter() {
        return null;
    }

    public Adapter createPartnerLinkAdapter() {
        return null;
    }

    public Adapter createVariableAdapter() {
        return null;
    }

    public Adapter createScopeAdapter() {
        return null;
    }

    public Adapter createFlowAdapter() {
        return null;
    }

    public Adapter createLinkAdapter() {
        return null;
    }

    public Adapter createActivityAdapter() {
        return null;
    }

    public Adapter createSourceAdapter() {
        return null;
    }

    public Adapter createTargetAdapter() {
        return null;
    }

    public Adapter createActivityExtensionAdapter() {
        return null;
    }

    public Adapter createReceiveEventAdapter() {
        return null;
    }

    public Adapter createEmptyActivityAdapter() {
        return null;
    }

    public Adapter createEObjectAdapter() {
        return null;
    }
}
