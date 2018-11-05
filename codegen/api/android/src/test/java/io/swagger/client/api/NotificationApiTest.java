package io.swagger.client.api;

import io.swagger.client.ApiClient;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.Notification;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationApi
 */
public class NotificationApiTest {

    private NotificationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NotificationApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void notificationCountTest() {
        String where = null;
        // InlineResponse2002 response = api.notificationCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void notificationCreateTest() {
        Notification data = null;
        // Notification response = api.notificationCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void notificationCreateChangeStreamGetNotificationsChangeStreamTest() {
        String options = null;
        // File response = api.notificationCreateChangeStreamGetNotificationsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void notificationCreateChangeStreamPostNotificationsChangeStreamTest() {
        String options = null;
        // File response = api.notificationCreateChangeStreamPostNotificationsChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void notificationDeleteByIdTest() {
        String id = null;
        // Object response = api.notificationDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void notificationExistsGetNotificationsidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.notificationExistsGetNotificationsidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void notificationExistsHeadNotificationsidTest() {
        String id = null;
        // InlineResponse200 response = api.notificationExistsHeadNotificationsid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void notificationFindTest() {
        String filter = null;
        // List<Notification> response = api.notificationFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void notificationFindByIdTest() {
        String id = null;
        String filter = null;
        // Notification response = api.notificationFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void notificationFindOneTest() {
        String filter = null;
        // Notification response = api.notificationFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void notificationPatchOrCreateTest() {
        Notification data = null;
        // Notification response = api.notificationPatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void notificationPrototypePatchAttributesTest() {
        String id = null;
        Notification data = null;
        // Notification response = api.notificationPrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void notificationReplaceByIdPostNotificationsidReplaceTest() {
        String id = null;
        Notification data = null;
        // Notification response = api.notificationReplaceByIdPostNotificationsidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void notificationReplaceByIdPutNotificationsidTest() {
        String id = null;
        Notification data = null;
        // Notification response = api.notificationReplaceByIdPutNotificationsid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void notificationReplaceOrCreatePostNotificationsReplaceOrCreateTest() {
        Notification data = null;
        // Notification response = api.notificationReplaceOrCreatePostNotificationsReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void notificationReplaceOrCreatePutNotificationsTest() {
        Notification data = null;
        // Notification response = api.notificationReplaceOrCreatePutNotifications(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void notificationUpdateAllTest() {
        String where = null;
        Notification data = null;
        // InlineResponse2001 response = api.notificationUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void notificationUpsertWithWhereTest() {
        String where = null;
        Notification data = null;
        // Notification response = api.notificationUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
