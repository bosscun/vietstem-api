package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Faq;
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
 * API tests for FaqApi
 */
public class FaqApiTest {

    private FaqApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FaqApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void faqCountTest() {
        String where = null;
        // InlineResponse2002 response = api.faqCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void faqCreateTest() {
        Faq data = null;
        // Faq response = api.faqCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void faqCreateChangeStreamGetFaqsChangeStreamTest() {
        String options = null;
        // File response = api.faqCreateChangeStreamGetFaqsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void faqCreateChangeStreamPostFaqsChangeStreamTest() {
        String options = null;
        // File response = api.faqCreateChangeStreamPostFaqsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void faqDeleteByIdTest() {
        String id = null;
        // Object response = api.faqDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void faqExistsGetFaqsidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.faqExistsGetFaqsidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void faqExistsHeadFaqsidTest() {
        String id = null;
        // InlineResponse200 response = api.faqExistsHeadFaqsid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void faqFindTest() {
        String filter = null;
        // List<Faq> response = api.faqFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void faqFindByIdTest() {
        String id = null;
        String filter = null;
        // Faq response = api.faqFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void faqFindOneTest() {
        String filter = null;
        // Faq response = api.faqFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void faqPatchOrCreateTest() {
        Faq data = null;
        // Faq response = api.faqPatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void faqPrototypePatchAttributesTest() {
        String id = null;
        Faq data = null;
        // Faq response = api.faqPrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void faqReplaceByIdPostFaqsidReplaceTest() {
        String id = null;
        Faq data = null;
        // Faq response = api.faqReplaceByIdPostFaqsidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void faqReplaceByIdPutFaqsidTest() {
        String id = null;
        Faq data = null;
        // Faq response = api.faqReplaceByIdPutFaqsid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void faqReplaceOrCreatePostFaqsReplaceOrCreateTest() {
        Faq data = null;
        // Faq response = api.faqReplaceOrCreatePostFaqsReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void faqReplaceOrCreatePutFaqsTest() {
        Faq data = null;
        // Faq response = api.faqReplaceOrCreatePutFaqs(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void faqUpdateAllTest() {
        String where = null;
        Faq data = null;
        // InlineResponse2001 response = api.faqUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void faqUpsertWithWhereTest() {
        String where = null;
        Faq data = null;
        // Faq response = api.faqUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
