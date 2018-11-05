package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Ask;
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
 * API tests for AskApi
 */
public class AskApiTest {

    private AskApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AskApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void askCountTest() {
        String where = null;
        // InlineResponse2002 response = api.askCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void askCreateTest() {
        Ask data = null;
        // Ask response = api.askCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void askCreateChangeStreamGetAsksChangeStreamTest() {
        String options = null;
        // File response = api.askCreateChangeStreamGetAsksChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void askCreateChangeStreamPostAsksChangeStreamTest() {
        String options = null;
        // File response = api.askCreateChangeStreamPostAsksChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void askDeleteByIdTest() {
        String id = null;
        // Object response = api.askDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void askExistsGetAsksidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.askExistsGetAsksidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void askExistsHeadAsksidTest() {
        String id = null;
        // InlineResponse200 response = api.askExistsHeadAsksid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void askFindTest() {
        String filter = null;
        // List<Ask> response = api.askFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void askFindByIdTest() {
        String id = null;
        String filter = null;
        // Ask response = api.askFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void askFindOneTest() {
        String filter = null;
        // Ask response = api.askFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void askPatchOrCreateTest() {
        Ask data = null;
        // Ask response = api.askPatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void askPrototypePatchAttributesTest() {
        String id = null;
        Ask data = null;
        // Ask response = api.askPrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void askReplaceByIdPostAsksidReplaceTest() {
        String id = null;
        Ask data = null;
        // Ask response = api.askReplaceByIdPostAsksidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void askReplaceByIdPutAsksidTest() {
        String id = null;
        Ask data = null;
        // Ask response = api.askReplaceByIdPutAsksid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void askReplaceOrCreatePostAsksReplaceOrCreateTest() {
        Ask data = null;
        // Ask response = api.askReplaceOrCreatePostAsksReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void askReplaceOrCreatePutAsksTest() {
        Ask data = null;
        // Ask response = api.askReplaceOrCreatePutAsks(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void askUpdateAllTest() {
        String where = null;
        Ask data = null;
        // InlineResponse2001 response = api.askUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void askUpsertWithWhereTest() {
        String where = null;
        Ask data = null;
        // Ask response = api.askUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
