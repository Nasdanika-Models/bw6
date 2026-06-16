package org.nasdanika.models.bw6.capability;

import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.capability.emf.ResourceFactoryCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

public class Bw6ResourceFactoryCapabilityFactory extends ResourceFactoryCapabilityFactory {

    @Override
    protected Factory getResourceFactory(ResourceSet resourceSet, Loader loader, ProgressMonitor progressMonitor) {
        return new Bw6ResourceFactory();
    }

    @Override
    protected String getExtension() {
        return "bwp";
    }
}
