package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Account;
import io.swagger.client.model.AccountAccessToken;
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
 * API tests for AccountAccessTokenApi
 */
public class AccountAccessTokenApiTest {

    private AccountAccessTokenApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountAccessTokenApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenCountTest() {
        String where = null;
        // InlineResponse2002 response = api.accountAccessTokenCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenCreateTest() {
        AccountAccessToken data = null;
        // AccountAccessToken response = api.accountAccessTokenCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void accountAccessTokenCreateChangeStreamGetAccountAccessTokensChangeStreamTest() {
        String options = null;
        // File response = api.accountAccessTokenCreateChangeStreamGetAccountAccessTokensChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void accountAccessTokenCreateChangeStreamPostAccountAccessTokensChangeStreamTest() {
        String options = null;
        // File response = api.accountAccessTokenCreateChangeStreamPostAccountAccessTokensChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenDeleteByIdTest() {
        String id = null;
        // Object response = api.accountAccessTokenDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenExistsGetAccountAccessTokensidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.accountAccessTokenExistsGetAccountAccessTokensidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenExistsHeadAccountAccessTokensidTest() {
        String id = null;
        // InlineResponse200 response = api.accountAccessTokenExistsHeadAccountAccessTokensid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenFindTest() {
        String filter = null;
        // List<AccountAccessToken> response = api.accountAccessTokenFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenFindByIdTest() {
        String id = null;
        String filter = null;
        // AccountAccessToken response = api.accountAccessTokenFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenFindOneTest() {
        String filter = null;
        // AccountAccessToken response = api.accountAccessTokenFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenPatchOrCreateTest() {
        AccountAccessToken data = null;
        // AccountAccessToken response = api.accountAccessTokenPatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Fetches belongsTo relation user.
     *
     * 
     */
    @Test
    public void accountAccessTokenPrototypeGetUserTest() {
        String id = null;
        Boolean refresh = null;
        // Account response = api.accountAccessTokenPrototypeGetUser(id, refresh);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenPrototypePatchAttributesTest() {
        String id = null;
        AccountAccessToken data = null;
        // AccountAccessToken response = api.accountAccessTokenPrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenReplaceByIdPostAccountAccessTokensidReplaceTest() {
        String id = null;
        AccountAccessToken data = null;
        // AccountAccessToken response = api.accountAccessTokenReplaceByIdPostAccountAccessTokensidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenReplaceByIdPutAccountAccessTokensidTest() {
        String id = null;
        AccountAccessToken data = null;
        // AccountAccessToken response = api.accountAccessTokenReplaceByIdPutAccountAccessTokensid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenReplaceOrCreatePostAccountAccessTokensReplaceOrCreateTest() {
        AccountAccessToken data = null;
        // AccountAccessToken response = api.accountAccessTokenReplaceOrCreatePostAccountAccessTokensReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenReplaceOrCreatePutAccountAccessTokensTest() {
        AccountAccessToken data = null;
        // AccountAccessToken response = api.accountAccessTokenReplaceOrCreatePutAccountAccessTokens(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void accountAccessTokenUpdateAllTest() {
        String where = null;
        AccountAccessToken data = null;
        // InlineResponse2001 response = api.accountAccessTokenUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void accountAccessTokenUpsertWithWhereTest() {
        String where = null;
        AccountAccessToken data = null;
        // AccountAccessToken response = api.accountAccessTokenUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
