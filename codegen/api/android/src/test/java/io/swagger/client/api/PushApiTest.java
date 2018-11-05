package io.swagger.client.api;

import io.swagger.client.ApiClient;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.Push;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PushApi
 */
public class PushApiTest {

    private PushApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PushApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void pushCountTest() {
        String where = null;
        // InlineResponse2002 response = api.pushCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void pushCreateTest() {
        Push data = null;
        // Push response = api.pushCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void pushCreateChangeStreamGetPushChangeStreamTest() {
        String options = null;
        // File response = api.pushCreateChangeStreamGetPushChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void pushCreateChangeStreamPostPushChangeStreamTest() {
        String options = null;
        // File response = api.pushCreateChangeStreamPostPushChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void pushDeleteByIdTest() {
        String id = null;
        // Object response = api.pushDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void pushExistsGetPushidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.pushExistsGetPushidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void pushExistsHeadPushidTest() {
        String id = null;
        // InlineResponse200 response = api.pushExistsHeadPushid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void pushFindTest() {
        String filter = null;
        // List<Push> response = api.pushFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void pushFindByIdTest() {
        String id = null;
        String filter = null;
        // Push response = api.pushFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void pushFindOneTest() {
        String filter = null;
        // Push response = api.pushFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void pushPatchOrCreateTest() {
        Push data = null;
        // Push response = api.pushPatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void pushPrototypePatchAttributesTest() {
        String id = null;
        Push data = null;
        // Push response = api.pushPrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void pushReplaceByIdPostPushidReplaceTest() {
        String id = null;
        Push data = null;
        // Push response = api.pushReplaceByIdPostPushidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void pushReplaceByIdPutPushidTest() {
        String id = null;
        Push data = null;
        // Push response = api.pushReplaceByIdPutPushid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void pushReplaceOrCreatePostPushReplaceOrCreateTest() {
        Push data = null;
        // Push response = api.pushReplaceOrCreatePostPushReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void pushReplaceOrCreatePutPushTest() {
        Push data = null;
        // Push response = api.pushReplaceOrCreatePutPush(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void pushUpdateAllTest() {
        String where = null;
        Push data = null;
        // InlineResponse2001 response = api.pushUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void pushUpsertWithWhereTest() {
        String where = null;
        Push data = null;
        // Push response = api.pushUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
