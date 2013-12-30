package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OptArrayUUIDInValue.OptArrayUUIDValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptArrayUUIDValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestOptArrayUUIDValue.class.getResourceAsStream("dsl-project.ini"));
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
//        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
//        locator = null;
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFieldType() throws NoSuchFieldException {
        assertEquals(
                java.util.UUID[].class,
                OptArrayUUIDValue.class.getDeclaredField("optArrayUUID").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                java.util.UUID[].class,
                OptArrayUUIDValue.class.getMethod("getOptArrayUUID").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                OptArrayUUIDValue.class,
                OptArrayUUIDValue.class.getMethod("setOptArrayUUID", java.util.UUID[].class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertNull(new OptArrayUUIDValue().getOptArrayUUID());
    }
}
