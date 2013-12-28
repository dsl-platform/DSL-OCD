package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.test.TypeTester;
import com.dslplatform.ocd.values.OptListUUIDInValue.OptListUUIDValue;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptListUUIDValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        locator = Bootstrap.init(TestOptListUUIDValue.class.getResourceAsStream("dsl-project.ini"));
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
        locator = null;
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFieldType() throws NoSuchFieldException {
        assertTrue(TypeTester.testField(OptListUUIDValue.class, "optListUUID")
                .resultEquals(List.class, UUID.class));
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testGetter(OptListUUIDValue.class, "getOptListUUID")
                .resultEquals(List.class, UUID.class));
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testSetter(OptListUUIDValue.class, "setOptListUUID", List.class, UUID.class)
                .resultEquals(OptListUUIDValue.class));
    }
}