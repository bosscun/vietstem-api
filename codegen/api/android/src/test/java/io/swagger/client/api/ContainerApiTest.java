package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.XAny;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContainerApi
 */
public class ContainerApiTest {

    private ContainerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ContainerApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void containerCreateContainerTest() {
        Object options = null;
        // Object response = api.containerCreateContainer(options);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void containerDestroyContainerTest() {
        String container = null;
        // InlineResponse2003 response = api.containerDestroyContainer(container);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void containerDownloadTest() {
        String container = null;
        String file = null;
        // Void response = api.containerDownload(container, file);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void containerGetContainerTest() {
        String container = null;
        // Object response = api.containerGetContainer(container);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void containerGetContainersTest() {
        // List<XAny> response = api.containerGetContainers();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void containerGetFileTest() {
        String container = null;
        String file = null;
        // Object response = api.containerGetFile(container, file);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void containerGetFilesTest() {
        String container = null;
        // List<XAny> response = api.containerGetFiles(container);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void containerRemoveFileTest() {
        String container = null;
        String file = null;
        // InlineResponse2003 response = api.containerRemoveFile(container, file);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void containerUploadTest() {
        String container = null;
        // InlineResponse2004 response = api.containerUpload(container);

        // TODO: test validations
    }
}
