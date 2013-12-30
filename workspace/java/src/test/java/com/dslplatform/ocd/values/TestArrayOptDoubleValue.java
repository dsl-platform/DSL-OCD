package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.ArrayOptDoubleInValue.ArrayOptDoubleValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayOptDoubleValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestArrayOptDoubleValue.class.getResourceAsStream("dsl-project.ini"));
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
                Double[].class,
                ArrayOptDoubleValue.class.getDeclaredField("arrayOptDouble").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                Double[].class,
                ArrayOptDoubleValue.class.getMethod("getArrayOptDouble").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayOptDoubleValue.class,
                ArrayOptDoubleValue.class.getMethod("setArrayOptDouble", Double[].class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        AssertExtensions.assertArrayEquals(
                new Double[0],
                new ArrayOptDoubleValue().getArrayOptDouble(),
                0.0);
    }
}
