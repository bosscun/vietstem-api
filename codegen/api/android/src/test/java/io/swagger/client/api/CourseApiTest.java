package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Course;
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
 * API tests for CourseApi
 */
public class CourseApiTest {

    private CourseApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CourseApi.class);
    }

    /**
     * Count instances of the model matched by where from the data source.
     *
     * 
     */
    @Test
    public void courseCountTest() {
        String where = null;
        // InlineResponse2002 response = api.courseCount(where);

        // TODO: test validations
    }
    /**
     * Create a new instance of the model and persist it into the data source.
     *
     * 
     */
    @Test
    public void courseCreateTest() {
        Course data = null;
        // Course response = api.courseCreate(data);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void courseCreateChangeStreamGetCoursesChangeStreamTest() {
        String options = null;
        // File response = api.courseCreateChangeStreamGetCoursesChangeStream(options);

        // TODO: test validations
    }
    /**
     * Create a change stream.
     *
     * 
     */
    @Test
    public void courseCreateChangeStreamPostCoursesChangeStreamTest() {
        String options = null;
        // File response = api.courseCreateChangeStreamPostCoursesChangeStream(options);

        // TODO: test validations
    }
    /**
     * Delete a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void courseDeleteByIdTest() {
        String id = null;
        // Object response = api.courseDeleteById(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void courseExistsGetCoursesidExistsTest() {
        String id = null;
        // InlineResponse200 response = api.courseExistsGetCoursesidExists(id);

        // TODO: test validations
    }
    /**
     * Check whether a model instance exists in the data source.
     *
     * 
     */
    @Test
    public void courseExistsHeadCoursesidTest() {
        String id = null;
        // InlineResponse200 response = api.courseExistsHeadCoursesid(id);

        // TODO: test validations
    }
    /**
     * Find all instances of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void courseFindTest() {
        String filter = null;
        // List<Course> response = api.courseFind(filter);

        // TODO: test validations
    }
    /**
     * Find a model instance by {{id}} from the data source.
     *
     * 
     */
    @Test
    public void courseFindByIdTest() {
        String id = null;
        String filter = null;
        // Course response = api.courseFindById(id, filter);

        // TODO: test validations
    }
    /**
     * Find first instance of the model matched by filter from the data source.
     *
     * 
     */
    @Test
    public void courseFindOneTest() {
        String filter = null;
        // Course response = api.courseFindOne(filter);

        // TODO: test validations
    }
    /**
     * Patch an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void coursePatchOrCreateTest() {
        Course data = null;
        // Course response = api.coursePatchOrCreate(data);

        // TODO: test validations
    }
    /**
     * Patch attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void coursePrototypePatchAttributesTest() {
        String id = null;
        Course data = null;
        // Course response = api.coursePrototypePatchAttributes(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void courseReplaceByIdPostCoursesidReplaceTest() {
        String id = null;
        Course data = null;
        // Course response = api.courseReplaceByIdPostCoursesidReplace(id, data);

        // TODO: test validations
    }
    /**
     * Replace attributes for a model instance and persist it into the data source.
     *
     * 
     */
    @Test
    public void courseReplaceByIdPutCoursesidTest() {
        String id = null;
        Course data = null;
        // Course response = api.courseReplaceByIdPutCoursesid(id, data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void courseReplaceOrCreatePostCoursesReplaceOrCreateTest() {
        Course data = null;
        // Course response = api.courseReplaceOrCreatePostCoursesReplaceOrCreate(data);

        // TODO: test validations
    }
    /**
     * Replace an existing model instance or insert a new one into the data source.
     *
     * 
     */
    @Test
    public void courseReplaceOrCreatePutCoursesTest() {
        Course data = null;
        // Course response = api.courseReplaceOrCreatePutCourses(data);

        // TODO: test validations
    }
    /**
     * Update instances of the model matched by {{where}} from the data source.
     *
     * 
     */
    @Test
    public void courseUpdateAllTest() {
        String where = null;
        Course data = null;
        // InlineResponse2001 response = api.courseUpdateAll(where, data);

        // TODO: test validations
    }
    /**
     * Update an existing model instance or insert a new one into the data source based on the where criteria.
     *
     * 
     */
    @Test
    public void courseUpsertWithWhereTest() {
        String where = null;
        Course data = null;
        // Course response = api.courseUpsertWithWhere(where, data);

        // TODO: test validations
    }
}
