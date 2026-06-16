package org.nasdanika.models.bw6.capability;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.xml.stream.XMLStreamException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.models.bw6.Process;
import org.nasdanika.models.bw6.loader.Bw6ProcessLoader;

public class Bw6Resource extends ResourceImpl {

    public Bw6Resource(URI uri) {
        super(uri);
    }

    @Override
    protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
        Bw6ProcessLoader loader = new Bw6ProcessLoader();
        try (inputStream) {
            Process process = loader.load(inputStream, getURI().toString());
            if (process != null) {
                getContents().add(process);
            }
        } catch (XMLStreamException e) {
            throw new NasdanikaException(e);
        }
    }
}
