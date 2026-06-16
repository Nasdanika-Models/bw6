package org.nasdanika.models.bw6;

import org.eclipse.emf.ecore.EFactory;

public interface Bw6Factory extends EFactory {
    Bw6Factory eINSTANCE = org.nasdanika.models.bw6.impl.Bw6FactoryImpl.init();

    Process createProcess();
    ProcessInfo createProcessInfo();
    ProcessInterface createProcessInterface();
    Import createImport();
    PartnerLink createPartnerLink();
    Variable createVariable();
    Scope createScope();
    Flow createFlow();
    Link createLink();
    Source createSource();
    Target createTarget();
    ActivityExtension createActivityExtension();
    ReceiveEvent createReceiveEvent();
    EmptyActivity createEmptyActivity();

    Bw6Package getBw6Package();
}
