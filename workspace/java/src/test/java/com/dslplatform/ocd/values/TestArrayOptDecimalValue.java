package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.ArrayOptDecimalInValue.ArrayOptDecimalValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayOptDecimalValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestArrayOptDecimalValue.class.getResourceAsStream("dsl-project.ini"));
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
                java.math.BigDecimal[].class,
                ArrayOptDecimalValue.class.getDeclaredField("arrayOptDecimal").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                java.math.BigDecimal[].class,
                ArrayOptDecimalValue.class.getMethod("getArrayOptDecimal").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayOptDecimalValue.class,
                ArrayOptDecimalValue.class.getMethod("setArrayOptDecimal", java.math.BigDecimal[].class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertArrayEquals(
                new java.math.BigDecimal[0],
                new ArrayOptDecimalValue().getArrayOptDecimal());
    }
}
