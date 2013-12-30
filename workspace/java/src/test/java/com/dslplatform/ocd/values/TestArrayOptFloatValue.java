package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.ArrayOptFloatInValue.ArrayOptFloatValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayOptFloatValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestArrayOptFloatValue.class.getResourceAsStream("dsl-project.ini"));
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
                Float[].class,
                ArrayOptFloatValue.class.getDeclaredField("arrayOptFloat").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                Float[].class,
                ArrayOptFloatValue.class.getMethod("getArrayOptFloat").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayOptFloatValue.class,
                ArrayOptFloatValue.class.getMethod("setArrayOptFloat", Float[].class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        AssertExtensions.assertArrayEquals(
                new Float[0],
                new ArrayOptFloatValue().getArrayOptFloat(),
                0.0f);
    }
}
