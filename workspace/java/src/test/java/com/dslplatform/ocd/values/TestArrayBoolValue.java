package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.ArrayBoolInValue.ArrayBoolValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayBoolValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestArrayBoolValue.class.getResourceAsStream("dsl-project.ini"));
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
                boolean[].class,
                ArrayBoolValue.class.getDeclaredField("arrayBool").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                boolean[].class,
                ArrayBoolValue.class.getMethod("getArrayBool").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayBoolValue.class,
                ArrayBoolValue.class.getMethod("setArrayBool", boolean[].class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        AssertExtensions.assertArrayEquals(
                new boolean[0],
                new ArrayBoolValue().getArrayBool());
    }
}
