package io.swagger.client.api;

import io.swagger.client.ApiClient;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.Post;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PostApi
 */
public class PostApiTest {

    private PostApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PostApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void postCountTest() {
        String where = null;
        // InlineResponse2002 response = api.postCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void postCreateTest() {
        Post data = null;
        // Post response = api.postCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void postCreateChangeStreamGetPostsChangeStreamTest() {
        String options = null;
        // File response = api.postCreateChangeStreamGetPostsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void postCreateChangeStreamPostPostsChangeStreamTest() {
        String options = null;
        // File response = api.postCreateChangeStreamPostPostsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void postDeleteByIdTest() {
        String id = null;
        // Object response = api.postDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void postExistsGetPostsidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.postExistsGetPostsidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void postExistsHeadPostsidTest() {
        String id = null;
        // InlineResponse200 response = api.postExistsHeadPostsid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void postFindTest() {
        String filter = null;
        // List<Post> response = api.postFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void postFindByIdTest() {
        String id = null;
        String filter = null;
        // Post response = api.postFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void postFindOneTest() {
        String filter = null;
        // Post response = api.postFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void postPatchOrCreateTest() {
        Post data = null;
        // Post response = api.postPatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void postPrototypePatchAttributesTest() {
        String id = null;
        Post data = null;
        // Post response = api.postPrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void postReplaceByIdPostPostsidReplaceTest() {
        String id = null;
        Post data = null;
        // Post response = api.postReplaceByIdPostPostsidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void postReplaceByIdPutPostsidTest() {
        String id = null;
        Post data = null;
        // Post response = api.postReplaceByIdPutPostsid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void postReplaceOrCreatePostPostsReplaceOrCreateTest() {
        Post data = null;
        // Post response = api.postReplaceOrCreatePostPostsReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void postReplaceOrCreatePutPostsTest() {
        Post data = null;
        // Post response = api.postReplaceOrCreatePutPosts(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void postUpdateAllTest() {
        String where = null;
        Post data = null;
        // InlineResponse2001 response = api.postUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void postUpsertWithWhereTest() {
        String where = null;
        Post data = null;
        // Post response = api.postUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
