package io.swagger.client.api;

import io.swagger.client.ApiClient;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.Role;
import io.swagger.client.model.RoleMapping;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoleMappingApi
 */
public class RoleMappingApiTest {

    private RoleMappingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RoleMappingApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void roleMappingCountTest() {
        String where = null;
        // InlineResponse2002 response = api.roleMappingCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void roleMappingCreateTest() {
        RoleMapping data = null;
        // RoleMapping response = api.roleMappingCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void roleMappingCreateChangeStreamGetRoleMappingsChangeStreamTest() {
        String options = null;
        // File response = api.roleMappingCreateChangeStreamGetRoleMappingsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void roleMappingCreateChangeStreamPostRoleMappingsChangeStreamTest() {
        String options = null;
        // File response = api.roleMappingCreateChangeStreamPostRoleMappingsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void roleMappingDeleteByIdTest() {
        String id = null;
        // Object response = api.roleMappingDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void roleMappingExistsGetRoleMappingsidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.roleMappingExistsGetRoleMappingsidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void roleMappingExistsHeadRoleMappingsidTest() {
        String id = null;
        // InlineResponse200 response = api.roleMappingExistsHeadRoleMappingsid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void roleMappingFindTest() {
        String filter = null;
        // List<RoleMapping> response = api.roleMappingFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void roleMappingFindByIdTest() {
        String id = null;
        String filter = null;
        // RoleMapping response = api.roleMappingFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void roleMappingFindOneTest() {
        String filter = null;
        // RoleMapping response = api.roleMappingFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void roleMappingPatchOrCreateTest() {
        RoleMapping data = null;
        // RoleMapping response = api.roleMappingPatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Fetches belongsTo relation role.
     *
     * 
     */
    @Test
    public void roleMappingPrototypeGetRoleTest() {
        String id = null;
        Boolean refresh = null;
        // Role response = api.roleMappingPrototypeGetRole(id, refresh);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void roleMappingPrototypePatchAttributesTest() {
        String id = null;
        RoleMapping data = null;
        // RoleMapping response = api.roleMappingPrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void roleMappingReplaceByIdPostRoleMappingsidReplaceTest() {
        String id = null;
        RoleMapping data = null;
        // RoleMapping response = api.roleMappingReplaceByIdPostRoleMappingsidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void roleMappingReplaceByIdPutRoleMappingsidTest() {
        String id = null;
        RoleMapping data = null;
        // RoleMapping response = api.roleMappingReplaceByIdPutRoleMappingsid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void roleMappingReplaceOrCreatePostRoleMappingsReplaceOrCreateTest() {
        RoleMapping data = null;
        // RoleMapping response = api.roleMappingReplaceOrCreatePostRoleMappingsReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void roleMappingReplaceOrCreatePutRoleMappingsTest() {
        RoleMapping data = null;
        // RoleMapping response = api.roleMappingReplaceOrCreatePutRoleMappings(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void roleMappingUpdateAllTest() {
        String where = null;
        RoleMapping data = null;
        // InlineResponse2001 response = api.roleMappingUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void roleMappingUpsertWithWhereTest() {
        String where = null;
        RoleMapping data = null;
        // RoleMapping response = api.roleMappingUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
