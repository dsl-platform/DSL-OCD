package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.ArrayOptBinaryInValue.ArrayOptBinaryValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayOptBinaryValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestArrayOptBinaryValue.class.getResourceAsStream("dsl-project.ini"));
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
                ArrayOptBinaryValue.class.getDeclaredField("arrayOptBinary").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                byte[][].class,
                ArrayOptBinaryValue.class.getMethod("getArrayOptBinary").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayOptBinaryValue.class,
                ArrayOptBinaryValue.class.getMethod("setArrayOptBinary", byte[][].class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertArrayEquals(
                new byte[0][],
                new ArrayOptBinaryValue().getArrayOptBinary());
    }
}
