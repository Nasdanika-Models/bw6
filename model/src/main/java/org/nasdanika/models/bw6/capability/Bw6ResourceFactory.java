package org.nasdanika.models.bw6.capability;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class Bw6ResourceFactory extends ResourceFactoryImpl {

    @Override
    public Resource createResource(URI uri) {
        return new Bw6Resource(uri);
    }
}
