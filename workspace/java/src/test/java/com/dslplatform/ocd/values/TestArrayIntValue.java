package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.ArrayIntInValue.ArrayIntValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayIntValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestArrayIntValue.class.getResourceAsStream("dsl-project.ini"));
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
                int[].class,
                ArrayIntValue.class.getDeclaredField("arrayInt").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                int[].class,
                ArrayIntValue.class.getMethod("getArrayInt").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayIntValue.class,
                ArrayIntValue.class.getMethod("setArrayInt", int[].class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertArrayEquals(
                new int[0],
                new ArrayIntValue().getArrayInt());
    }
}
