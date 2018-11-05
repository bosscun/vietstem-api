package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Company;
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
 * API tests for CompanyApi
 */
public class CompanyApiTest {

    private CompanyApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CompanyApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void companyCountTest() {
        String where = null;
        // InlineResponse2002 response = api.companyCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void companyCreateTest() {
        Company data = null;
        // Company response = api.companyCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void companyCreateChangeStreamGetCompaniesChangeStreamTest() {
        String options = null;
        // File response = api.companyCreateChangeStreamGetCompaniesChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void companyCreateChangeStreamPostCompaniesChangeStreamTest() {
        String options = null;
        // File response = api.companyCreateChangeStreamPostCompaniesChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void companyDeleteByIdTest() {
        String id = null;
        // Object response = api.companyDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void companyExistsGetCompaniesidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.companyExistsGetCompaniesidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void companyExistsHeadCompaniesidTest() {
        String id = null;
        // InlineResponse200 response = api.companyExistsHeadCompaniesid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void companyFindTest() {
        String filter = null;
        // List<Company> response = api.companyFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void companyFindByIdTest() {
        String id = null;
        String filter = null;
        // Company response = api.companyFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void companyFindOneTest() {
        String filter = null;
        // Company response = api.companyFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void companyPatchOrCreateTest() {
        Company data = null;
        // Company response = api.companyPatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void companyPrototypePatchAttributesTest() {
        String id = null;
        Company data = null;
        // Company response = api.companyPrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void companyReplaceByIdPostCompaniesidReplaceTest() {
        String id = null;
        Company data = null;
        // Company response = api.companyReplaceByIdPostCompaniesidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void companyReplaceByIdPutCompaniesidTest() {
        String id = null;
        Company data = null;
        // Company response = api.companyReplaceByIdPutCompaniesid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void companyReplaceOrCreatePostCompaniesReplaceOrCreateTest() {
        Company data = null;
        // Company response = api.companyReplaceOrCreatePostCompaniesReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void companyReplaceOrCreatePutCompaniesTest() {
        Company data = null;
        // Company response = api.companyReplaceOrCreatePutCompanies(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void companyUpdateAllTest() {
        String where = null;
        Company data = null;
        // InlineResponse2001 response = api.companyUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void companyUpsertWithWhereTest() {
        String where = null;
        Company data = null;
        // Company response = api.companyUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
