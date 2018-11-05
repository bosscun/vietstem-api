package io.swagger.client.api;

import io.swagger.client.ApiClient;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.Installation;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstallationApi
 */
public class InstallationApiTest {

    private InstallationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(InstallationApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void installationCountTest() {
        String where = null;
        // InlineResponse2002 response = api.installationCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void installationCreateTest() {
        Installation data = null;
        // Installation response = api.installationCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void installationCreateChangeStreamGetInstallationsChangeStreamTest() {
        String options = null;
        // File response = api.installationCreateChangeStreamGetInstallationsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void installationCreateChangeStreamPostInstallationsChangeStreamTest() {
        String options = null;
        // File response = api.installationCreateChangeStreamPostInstallationsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void installationDeleteByIdTest() {
        String id = null;
        // Object response = api.installationDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void installationExistsGetInstallationsidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.installationExistsGetInstallationsidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void installationExistsHeadInstallationsidTest() {
        String id = null;
        // InlineResponse200 response = api.installationExistsHeadInstallationsid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void installationFindTest() {
        String filter = null;
        // List<Installation> response = api.installationFind(filter);

        // TODO: test validations
    }
    /**
     * Find installations by application id
     *
     * 
     */
    @Test
    public void installationFindByAppTest() {
        String deviceType = null;
        String appId = null;
        String appVersion = null;
        // Object response = api.installationFindByApp(deviceType, appId, appVersion);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void installationFindByIdTest() {
        String id = null;
        String filter = null;
        // Installation response = api.installationFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find installations by subscriptions
     *
     * 
     */
    @Test
    public void installationFindBySubscriptionsTest() {
        String deviceType = null;
        String subscriptions = null;
        // Object response = api.installationFindBySubscriptions(deviceType, subscriptions);

        // TODO: test validations
    }
    /**
     * Find installations by user id
     *
     * 
     */
    @Test
    public void installationFindByUserTest() {
        String deviceType = null;
        String userId = null;
        // Object response = api.installationFindByUser(deviceType, userId);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void installationFindOneTest() {
        String filter = null;
        // Installation response = api.installationFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void installationPatchOrCreateTest() {
        Installation data = null;
        // Installation response = api.installationPatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void installationPrototypePatchAttributesTest() {
        String id = null;
        Installation data = null;
        // Installation response = api.installationPrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void installationReplaceByIdPostInstallationsidReplaceTest() {
        String id = null;
        Installation data = null;
        // Installation response = api.installationReplaceByIdPostInstallationsidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void installationReplaceByIdPutInstallationsidTest() {
        String id = null;
        Installation data = null;
        // Installation response = api.installationReplaceByIdPutInstallationsid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void installationReplaceOrCreatePostInstallationsReplaceOrCreateTest() {
        Installation data = null;
        // Installation response = api.installationReplaceOrCreatePostInstallationsReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void installationReplaceOrCreatePutInstallationsTest() {
        Installation data = null;
        // Installation response = api.installationReplaceOrCreatePutInstallations(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void installationUpdateAllTest() {
        String where = null;
        Installation data = null;
        // InlineResponse2001 response = api.installationUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void installationUpsertWithWhereTest() {
        String where = null;
        Installation data = null;
        // Installation response = api.installationUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
