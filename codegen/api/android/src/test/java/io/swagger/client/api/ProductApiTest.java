package io.swagger.client.api;

import io.swagger.client.ApiClient;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductApi
 */
public class ProductApiTest {

    private ProductApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ProductApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void productCountTest() {
        String where = null;
        // InlineResponse2002 response = api.productCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void productCreateTest() {
        Product data = null;
        // Product response = api.productCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void productCreateChangeStreamGetProductsChangeStreamTest() {
        String options = null;
        // File response = api.productCreateChangeStreamGetProductsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void productCreateChangeStreamPostProductsChangeStreamTest() {
        String options = null;
        // File response = api.productCreateChangeStreamPostProductsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void productDeleteByIdTest() {
        String id = null;
        // Object response = api.productDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void productExistsGetProductsidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.productExistsGetProductsidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void productExistsHeadProductsidTest() {
        String id = null;
        // InlineResponse200 response = api.productExistsHeadProductsid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void productFindTest() {
        String filter = null;
        // List<Product> response = api.productFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void productFindByIdTest() {
        String id = null;
        String filter = null;
        // Product response = api.productFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void productFindOneTest() {
        String filter = null;
        // Product response = api.productFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void productPatchOrCreateTest() {
        Product data = null;
        // Product response = api.productPatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void productPrototypePatchAttributesTest() {
        String id = null;
        Product data = null;
        // Product response = api.productPrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void productReplaceByIdPostProductsidReplaceTest() {
        String id = null;
        Product data = null;
        // Product response = api.productReplaceByIdPostProductsidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void productReplaceByIdPutProductsidTest() {
        String id = null;
        Product data = null;
        // Product response = api.productReplaceByIdPutProductsid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void productReplaceOrCreatePostProductsReplaceOrCreateTest() {
        Product data = null;
        // Product response = api.productReplaceOrCreatePostProductsReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void productReplaceOrCreatePutProductsTest() {
        Product data = null;
        // Product response = api.productReplaceOrCreatePutProducts(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void productUpdateAllTest() {
        String where = null;
        Product data = null;
        // InlineResponse2001 response = api.productUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void productUpsertWithWhereTest() {
        String where = null;
        Product data = null;
        // Product response = api.productUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
