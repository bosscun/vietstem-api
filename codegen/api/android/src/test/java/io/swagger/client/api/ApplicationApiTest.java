package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Application;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationApi
 */
public class ApplicationApiTest {

    private ApplicationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ApplicationApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void applicationCountTest() {
        String where = null;
        // InlineResponse2002 response = api.applicationCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void applicationCreateTest() {
        Application data = null;
        // Application response = api.applicationCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void applicationCreateChangeStreamGetApplicationsChangeStreamTest() {
        String options = null;
        // File response = api.applicationCreateChangeStreamGetApplicationsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void applicationCreateChangeStreamPostApplicationsChangeStreamTest() {
        String options = null;
        // File response = api.applicationCreateChangeStreamPostApplicationsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void applicationDeleteByIdTest() {
        String id = null;
        // Object response = api.applicationDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void applicationExistsGetApplicationsidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.applicationExistsGetApplicationsidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void applicationExistsHeadApplicationsidTest() {
        String id = null;
        // InlineResponse200 response = api.applicationExistsHeadApplicationsid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void applicationFindTest() {
        String filter = null;
        // List<Application> response = api.applicationFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void applicationFindByIdTest() {
        String id = null;
        String filter = null;
        // Application response = api.applicationFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void applicationFindOneTest() {
        String filter = null;
        // Application response = api.applicationFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void applicationPatchOrCreateTest() {
        Application data = null;
        // Application response = api.applicationPatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void applicationPrototypePatchAttributesTest() {
        String id = null;
        Application data = null;
        // Application response = api.applicationPrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void applicationReplaceByIdPostApplicationsidReplaceTest() {
        String id = null;
        Application data = null;
        // Application response = api.applicationReplaceByIdPostApplicationsidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void applicationReplaceByIdPutApplicationsidTest() {
        String id = null;
        Application data = null;
        // Application response = api.applicationReplaceByIdPutApplicationsid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void applicationReplaceOrCreatePostApplicationsReplaceOrCreateTest() {
        Application data = null;
        // Application response = api.applicationReplaceOrCreatePostApplicationsReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void applicationReplaceOrCreatePutApplicationsTest() {
        Application data = null;
        // Application response = api.applicationReplaceOrCreatePutApplications(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void applicationUpdateAllTest() {
        String where = null;
        Application data = null;
        // InlineResponse2001 response = api.applicationUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void applicationUpsertWithWhereTest() {
        String where = null;
        Application data = null;
        // Application response = api.applicationUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
