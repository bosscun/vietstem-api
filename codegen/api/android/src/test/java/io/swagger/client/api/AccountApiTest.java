package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Account;
import io.swagger.client.model.AccountAccessToken;
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
 * API tests for AccountApi
 */
public class AccountApiTest {

    private AccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountApi.class);
    }

    /**
     * Change a user&#39;s password.
     *
     * 
     */
    @Test
    public void accountChangePasswordTest() {
        String oldPassword = null;
        String newPassword = null;
        // Void response = api.accountChangePassword(oldPassword, newPassword);

        // TODO: test validations
    }
    /**
     * Confirm a user registration with identity verification token.
     *
     * 
     */
    @Test
    public void accountConfirmTest() {
        String uid = null;
        String token = null;
        String redirect = null;
        // Void response = api.accountConfirm(uid, token, redirect);

        // TODO: test validations
    }
    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void accountCountTest() {
        String where = null;
        // InlineResponse2002 response = api.accountCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void accountCreateTest() {
        Account data = null;
        // Account response = api.accountCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void accountCreateChangeStreamGetAccountsChangeStreamTest() {
        String options = null;
        // File response = api.accountCreateChangeStreamGetAccountsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void accountCreateChangeStreamPostAccountsChangeStreamTest() {
        String options = null;
        // File response = api.accountCreateChangeStreamPostAccountsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void accountDeleteByIdTest() {
        String id = null;
        // Object response = api.accountDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void accountExistsGetAccountsidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.accountExistsGetAccountsidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void accountExistsHeadAccountsidTest() {
        String id = null;
        // InlineResponse200 response = api.accountExistsHeadAccountsid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void accountFindTest() {
        String filter = null;
        // List<Account> response = api.accountFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void accountFindByIdTest() {
        String id = null;
        String filter = null;
        // Account response = api.accountFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void accountFindOneTest() {
        String filter = null;
        // Account response = api.accountFindOne(filter);

        // TODO: test validations
    }
    /**
     * Login a user with username/email and password.
     *
     * 
     */
    @Test
    public void accountLoginTest() {
        Object credentials = null;
        String include = null;
        // Object response = api.accountLogin(credentials, include);

        // TODO: test validations
    }
    /**
     * Logout a user with access token.
     *
     * 
     */
    @Test
    public void accountLogoutTest() {
        // Void response = api.accountLogout();

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void accountPatchOrCreateTest() {
        Account data = null;
        // Account response = api.accountPatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Counts accessTokens of Account.
     *
     * 
     */
    @Test
    public void accountPrototypeCountAccessTokensTest() {
        String id = null;
        String where = null;
        // InlineResponse2002 response = api.accountPrototypeCountAccessTokens(id, where);

        // TODO: test validations
    }
    /**
     * Counts roles of Account.
     *
     * 
     */
    @Test
    public void accountPrototypeCountRolesTest() {
        String id = null;
        String where = null;
        // InlineResponse2002 response = api.accountPrototypeCountRoles(id, where);

        // TODO: test validations
    }
    /**
     * Creates a new instance in accessTokens of this model.
     *
     * 
     */
    @Test
    public void accountPrototypeCreateAccessTokensTest() {
        String id = null;
        AccountAccessToken data = null;
        // AccountAccessToken response = api.accountPrototypeCreateAccessTokens(id, data);

        // TODO: test validations
    }
    /**
     * Creates a new instance in roles of this model.
     *
     * 
     */
    @Test
    public void accountPrototypeCreateRolesTest() {
        String id = null;
        Role data = null;
        // Role response = api.accountPrototypeCreateRoles(id, data);

        // TODO: test validations
    }
    /**
     * Deletes all accessTokens of this model.
     *
     * 
     */
    @Test
    public void accountPrototypeDeleteAccessTokensTest() {
        String id = null;
        // Void response = api.accountPrototypeDeleteAccessTokens(id);

        // TODO: test validations
    }
    /**
     * Deletes all roles of this model.
     *
     * 
     */
    @Test
    public void accountPrototypeDeleteRolesTest() {
        String id = null;
        // Void response = api.accountPrototypeDeleteRoles(id);

        // TODO: test validations
    }
    /**
     * Delete a related item by id for accessTokens.
     *
     * 
     */
    @Test
    public void accountPrototypeDestroyByIdAccessTokensTest() {
        String id = null;
        String fk = null;
        // Void response = api.accountPrototypeDestroyByIdAccessTokens(id, fk);

        // TODO: test validations
    }
    /**
     * Delete a related item by id for roles.
     *
     * 
     */
    @Test
    public void accountPrototypeDestroyByIdRolesTest() {
        String id = null;
        String fk = null;
        // Void response = api.accountPrototypeDestroyByIdRoles(id, fk);

        // TODO: test validations
    }
    /**
     * Check the existence of roles relation to an item by id.
     *
     * 
     */
    @Test
    public void accountPrototypeExistsRolesTest() {
        String id = null;
        String fk = null;
        // Boolean response = api.accountPrototypeExistsRoles(id, fk);

        // TODO: test validations
    }
    /**
     * Find a related item by id for accessTokens.
     *
     * 
     */
    @Test
    public void accountPrototypeFindByIdAccessTokensTest() {
        String id = null;
        String fk = null;
        // AccountAccessToken response = api.accountPrototypeFindByIdAccessTokens(id, fk);

        // TODO: test validations
    }
    /**
     * Find a related item by id for roles.
     *
     * 
     */
    @Test
    public void accountPrototypeFindByIdRolesTest() {
        String id = null;
        String fk = null;
        // Role response = api.accountPrototypeFindByIdRoles(id, fk);

        // TODO: test validations
    }
    /**
     * Queries accessTokens of Account.
     *
     * 
     */
    @Test
    public void accountPrototypeGetAccessTokensTest() {
        String id = null;
        String filter = null;
        // List<AccountAccessToken> response = api.accountPrototypeGetAccessTokens(id, filter);

        // TODO: test validations
    }
    /**
     * Queries roles of Account.
     *
     * 
     */
    @Test
    public void accountPrototypeGetRolesTest() {
        String id = null;
        String filter = null;
        // List<Role> response = api.accountPrototypeGetRoles(id, filter);

        // TODO: test validations
    }
    /**
     * Add a related item by id for roles.
     *
     * 
     */
    @Test
    public void accountPrototypeLinkRolesTest() {
        String id = null;
        String fk = null;
        RoleMapping data = null;
        // RoleMapping response = api.accountPrototypeLinkRoles(id, fk, data);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void accountPrototypePatchAttributesTest() {
        String id = null;
        Account data = null;
        // Account response = api.accountPrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Remove the roles relation to an item by id.
     *
     * 
     */
    @Test
    public void accountPrototypeUnlinkRolesTest() {
        String id = null;
        String fk = null;
        // Void response = api.accountPrototypeUnlinkRoles(id, fk);

        // TODO: test validations
    }
    /**
     * Update a related item by id for accessTokens.
     *
     * 
     */
    @Test
    public void accountPrototypeUpdateByIdAccessTokensTest() {
        String id = null;
        String fk = null;
        AccountAccessToken data = null;
        // AccountAccessToken response = api.accountPrototypeUpdateByIdAccessTokens(id, fk, data);

        // TODO: test validations
    }
    /**
     * Update a related item by id for roles.
     *
     * 
     */
    @Test
    public void accountPrototypeUpdateByIdRolesTest() {
        String id = null;
        String fk = null;
        Role data = null;
        // Role response = api.accountPrototypeUpdateByIdRoles(id, fk, data);

        // TODO: test validations
    }
    /**
     * Trigger user&#39;s identity verification with configured verifyOptions
     *
     * 
     */
    @Test
    public void accountPrototypeVerifyTest() {
        String id = null;
        // Void response = api.accountPrototypeVerify(id);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void accountReplaceByIdPostAccountsidReplaceTest() {
        String id = null;
        Account data = null;
        // Account response = api.accountReplaceByIdPostAccountsidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void accountReplaceByIdPutAccountsidTest() {
        String id = null;
        Account data = null;
        // Account response = api.accountReplaceByIdPutAccountsid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void accountReplaceOrCreatePostAccountsReplaceOrCreateTest() {
        Account data = null;
        // Account response = api.accountReplaceOrCreatePostAccountsReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void accountReplaceOrCreatePutAccountsTest() {
        Account data = null;
        // Account response = api.accountReplaceOrCreatePutAccounts(data);

        // TODO: test validations
    }
    /**
     * Reset password for a user with email.
     *
     * 
     */
    @Test
    public void accountResetPasswordTest() {
        Object options = null;
        // Void response = api.accountResetPassword(options);

        // TODO: test validations
    }
    /**
     * Reset user&#39;s password via a password-reset token.
     *
     * 
     */
    @Test
    public void accountSetPasswordTest() {
        String newPassword = null;
        // Void response = api.accountSetPassword(newPassword);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void accountUpdateAllTest() {
        String where = null;
        Account data = null;
        // InlineResponse2001 response = api.accountUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void accountUpsertWithWhereTest() {
        String where = null;
        Account data = null;
        // Account response = api.accountUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
