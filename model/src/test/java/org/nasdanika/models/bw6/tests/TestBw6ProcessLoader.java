package org.nasdanika.models.bw6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.InputStream;

import org.junit.jupiter.api.Test;
import org.nasdanika.models.bw6.Flow;
import org.nasdanika.models.bw6.Link;
import org.nasdanika.models.bw6.Process;
import org.nasdanika.models.bw6.loader.Bw6ProcessLoader;

class TestBw6ProcessLoader {

    @Test
    void testLoadSampleProcess() throws Exception {
        try (InputStream inputStream = getClass().getResourceAsStream("/sample-process.bwp")) {
            assertNotNull(inputStream);
            Process process = new Bw6ProcessLoader().load(inputStream, "sample-process.bwp");
            assertNotNull(process);
            assertEquals("SampleProcess", process.getName());
            assertEquals("http://xmlns.example.com/sample", process.getTargetNamespace());
            assertFalse(process.isExitOnStandardFault());
            assertTrue(process.isSuppressJoinFailure());
            assertNotNull(process.getInfo());
            assertFalse(process.getInfo().isCallable());
            assertEquals(3, process.getVariables().size());

            Flow flow = process.getScope().getFlow();
            assertNotNull(flow);
            assertEquals(3, flow.getActivities().size());
            assertEquals(2, flow.getLinks().size());

            for (Link link : flow.getLinks()) {
                assertNotNull(link.getSource());
                assertNotNull(link.getTarget());
            }

            assertNotNull(flow.getActivities().get(0).getSources().get(0).getLink());
            assertNotNull(flow.getActivities().get(1).getTargets().get(0).getLink());
            assertNotNull(flow.getActivities().get(2).getTargets().get(0).getLink());
        }
    }
}
