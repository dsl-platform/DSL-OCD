package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.ArrayBinaryInValue.ArrayBinaryValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayBinaryValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestArrayBinaryValue.class.getResourceAsStream("dsl-project.ini"));
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
                byte[][].class,
                ArrayBinaryValue.class.getDeclaredField("arrayBinary").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                byte[][].class,
                ArrayBinaryValue.class.getMethod("getArrayBinary").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayBinaryValue.class,
                ArrayBinaryValue.class.getMethod("setArrayBinary", byte[][].class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertArrayEquals(
                new byte[0][],
                new ArrayBinaryValue().getArrayBinary());
    }
}
