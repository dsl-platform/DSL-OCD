package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OptMoneyInValue.OptMoneyValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptMoneyValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestOptMoneyValue.class.getResourceAsStream("dsl-project.ini"));
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
                java.math.BigDecimal.class,
                OptMoneyValue.class.getDeclaredField("optMoney").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                java.math.BigDecimal.class,
                OptMoneyValue.class.getMethod("getOptMoney").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                OptMoneyValue.class,
                OptMoneyValue.class.getMethod("setOptMoney", java.math.BigDecimal.class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertNull(new OptMoneyValue().getOptMoney());
    }
}