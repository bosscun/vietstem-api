package io.swagger.client.api;

import io.swagger.client.ApiClient;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.Submissions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubmissionsApi
 */
public class SubmissionsApiTest {

    private SubmissionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SubmissionsApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void submissionsCountTest() {
        String where = null;
        // InlineResponse2002 response = api.submissionsCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void submissionsCreateTest() {
        Submissions data = null;
        // Submissions response = api.submissionsCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void submissionsCreateChangeStreamGetSubmissionsChangeStreamTest() {
        String options = null;
        // File response = api.submissionsCreateChangeStreamGetSubmissionsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void submissionsCreateChangeStreamPostSubmissionsChangeStreamTest() {
        String options = null;
        // File response = api.submissionsCreateChangeStreamPostSubmissionsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void submissionsDeleteByIdTest() {
        String id = null;
        // Object response = api.submissionsDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void submissionsExistsGetSubmissionsidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.submissionsExistsGetSubmissionsidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void submissionsExistsHeadSubmissionsidTest() {
        String id = null;
        // InlineResponse200 response = api.submissionsExistsHeadSubmissionsid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void submissionsFindTest() {
        String filter = null;
        // List<Submissions> response = api.submissionsFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void submissionsFindByIdTest() {
        String id = null;
        String filter = null;
        // Submissions response = api.submissionsFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void submissionsFindOneTest() {
        String filter = null;
        // Submissions response = api.submissionsFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void submissionsPatchOrCreateTest() {
        Submissions data = null;
        // Submissions response = api.submissionsPatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void submissionsPrototypePatchAttributesTest() {
        String id = null;
        Submissions data = null;
        // Submissions response = api.submissionsPrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void submissionsReplaceByIdPostSubmissionsidReplaceTest() {
        String id = null;
        Submissions data = null;
        // Submissions response = api.submissionsReplaceByIdPostSubmissionsidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void submissionsReplaceByIdPutSubmissionsidTest() {
        String id = null;
        Submissions data = null;
        // Submissions response = api.submissionsReplaceByIdPutSubmissionsid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void submissionsReplaceOrCreatePostSubmissionsReplaceOrCreateTest() {
        Submissions data = null;
        // Submissions response = api.submissionsReplaceOrCreatePostSubmissionsReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void submissionsReplaceOrCreatePutSubmissionsTest() {
        Submissions data = null;
        // Submissions response = api.submissionsReplaceOrCreatePutSubmissions(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void submissionsUpdateAllTest() {
        String where = null;
        Submissions data = null;
        // InlineResponse2001 response = api.submissionsUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void submissionsUpsertWithWhereTest() {
        String where = null;
        Submissions data = null;
        // Submissions response = api.submissionsUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
