package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OneUUIDInValue.OneUUIDValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneUUIDValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestOneUUIDValue.class.getResourceAsStream("dsl-project.ini"));
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
                java.util.UUID.class,
                OneUUIDValue.class.getDeclaredField("oneUUID").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                java.util.UUID.class,
                OneUUIDValue.class.getMethod("getOneUUID").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                OneUUIDValue.class,
                OneUUIDValue.class.getMethod("setOneUUID", java.util.UUID.class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertNotNull(new OneUUIDValue().getOneUUID());
    }
}