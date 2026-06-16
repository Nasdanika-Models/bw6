package org.nasdanika.models.bw6.capability;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.capability.emf.EPackageCapabilityFactory;
import org.nasdanika.models.bw6.Bw6Package;

public class Bw6EPackageResourceSetCapabilityFactory extends EPackageCapabilityFactory {

    @Override
    protected EPackage getEPackage() {
        return Bw6Package.eINSTANCE;
    }

    @Override
    protected URI getDocumentationURI() {
        return URI.createURI("https://bw6.models.nasdanika.org/");
    }
}
