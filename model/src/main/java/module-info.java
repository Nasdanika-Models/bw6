import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.bw6.capability.Bw6EPackageResourceSetCapabilityFactory;
import org.nasdanika.models.bw6.capability.Bw6ResourceFactoryCapabilityFactory;

module org.nasdanika.models.bw6 {
    exports org.nasdanika.models.bw6;
    exports org.nasdanika.models.bw6.impl;
    exports org.nasdanika.models.bw6.loader;
    exports org.nasdanika.models.bw6.util;

    requires transitive org.eclipse.emf.ecore;
    requires transitive org.eclipse.emf.common;
    requires transitive org.nasdanika.graph;
    requires transitive java.xml;

    provides CapabilityFactory with
        Bw6EPackageResourceSetCapabilityFactory,
        Bw6ResourceFactoryCapabilityFactory;
}
