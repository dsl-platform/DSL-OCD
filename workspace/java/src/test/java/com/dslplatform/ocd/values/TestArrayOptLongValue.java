package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.ArrayOptLongInValue.ArrayOptLongValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayOptLongValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestArrayOptLongValue.class.getResourceAsStream("dsl-project.ini"));
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
                Long[].class,
                ArrayOptLongValue.class.getDeclaredField("arrayOptLong").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                Long[].class,
                ArrayOptLongValue.class.getMethod("getArrayOptLong").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayOptLongValue.class,
                ArrayOptLongValue.class.getMethod("setArrayOptLong", Long[].class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertArrayEquals(
                new Long[0],
                new ArrayOptLongValue().getArrayOptLong());
    }
}
