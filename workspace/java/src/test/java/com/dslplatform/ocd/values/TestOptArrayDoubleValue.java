package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OptArrayDoubleInValue.OptArrayDoubleValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptArrayDoubleValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestOptArrayDoubleValue.class.getResourceAsStream("dsl-project.ini"));
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
                double[].class,
                OptArrayDoubleValue.class.getDeclaredField("optArrayDouble").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                double[].class,
                OptArrayDoubleValue.class.getMethod("getOptArrayDouble").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                OptArrayDoubleValue.class,
                OptArrayDoubleValue.class.getMethod("setOptArrayDouble", double[].class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertNull(new OptArrayDoubleValue().getOptArrayDouble());
    }
}
