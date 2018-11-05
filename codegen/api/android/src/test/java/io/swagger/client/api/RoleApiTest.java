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
 * API tests for RoleApi
 */
public class RoleApiTest {

    private RoleApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RoleApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void roleCountTest() {
        String where = null;
        // InlineResponse2002 response = api.roleCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void roleCreateTest() {
        Role data = null;
        // Role response = api.roleCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void roleCreateChangeStreamGetRolesChangeStreamTest() {
        String options = null;
        // File response = api.roleCreateChangeStreamGetRolesChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void roleCreateChangeStreamPostRolesChangeStreamTest() {
        String options = null;
        // File response = api.roleCreateChangeStreamPostRolesChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void roleDeleteByIdTest() {
        String id = null;
        // Object response = api.roleDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void roleExistsGetRolesidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.roleExistsGetRolesidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void roleExistsHeadRolesidTest() {
        String id = null;
        // InlineResponse200 response = api.roleExistsHeadRolesid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void roleFindTest() {
        String filter = null;
        // List<Role> response = api.roleFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void roleFindByIdTest() {
        String id = null;
        String filter = null;
        // Role response = api.roleFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void roleFindOneTest() {
        String filter = null;
        // Role response = api.roleFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void rolePatchOrCreateTest() {
        Role data = null;
        // Role response = api.rolePatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Counts principals of Role.
     *
     * 
     */
    @Test
    public void rolePrototypeCountPrincipalsTest() {
        String id = null;
        String where = null;
        // InlineResponse2002 response = api.rolePrototypeCountPrincipals(id, where);

        // TODO: test validations
    }
    /**
     * Creates a new instance in principals of this model.
     *
     * 
     */
    @Test
    public void rolePrototypeCreatePrincipalsTest() {
        String id = null;
        RoleMapping data = null;
        // RoleMapping response = api.rolePrototypeCreatePrincipals(id, data);

        // TODO: test validations
    }
    /**
     * Deletes all principals of this model.
     *
     * 
     */
    @Test
    public void rolePrototypeDeletePrincipalsTest() {
        String id = null;
        // Void response = api.rolePrototypeDeletePrincipals(id);

        // TODO: test validations
    }
    /**
     * Delete a related item by id for principals.
     *
     * 
     */
    @Test
    public void rolePrototypeDestroyByIdPrincipalsTest() {
        String id = null;
        String fk = null;
        // Void response = api.rolePrototypeDestroyByIdPrincipals(id, fk);

        // TODO: test validations
    }
    /**
     * Find a related item by id for principals.
     *
     * 
     */
    @Test
    public void rolePrototypeFindByIdPrincipalsTest() {
        String id = null;
        String fk = null;
        // RoleMapping response = api.rolePrototypeFindByIdPrincipals(id, fk);

        // TODO: test validations
    }
    /**
     * Queries principals of Role.
     *
     * 
     */
    @Test
    public void rolePrototypeGetPrincipalsTest() {
        String id = null;
        String filter = null;
        // List<RoleMapping> response = api.rolePrototypeGetPrincipals(id, filter);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void rolePrototypePatchAttributesTest() {
        String id = null;
        Role data = null;
        // Role response = api.rolePrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Update a related item by id for principals.
     *
     * 
     */
    @Test
    public void rolePrototypeUpdateByIdPrincipalsTest() {
        String id = null;
        String fk = null;
        RoleMapping data = null;
        // RoleMapping response = api.rolePrototypeUpdateByIdPrincipals(id, fk, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void roleReplaceByIdPostRolesidReplaceTest() {
        String id = null;
        Role data = null;
        // Role response = api.roleReplaceByIdPostRolesidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void roleReplaceByIdPutRolesidTest() {
        String id = null;
        Role data = null;
        // Role response = api.roleReplaceByIdPutRolesid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void roleReplaceOrCreatePostRolesReplaceOrCreateTest() {
        Role data = null;
        // Role response = api.roleReplaceOrCreatePostRolesReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void roleReplaceOrCreatePutRolesTest() {
        Role data = null;
        // Role response = api.roleReplaceOrCreatePutRoles(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void roleUpdateAllTest() {
        String where = null;
        Role data = null;
        // InlineResponse2001 response = api.roleUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void roleUpsertWithWhereTest() {
        String where = null;
        Role data = null;
        // Role response = api.roleUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
