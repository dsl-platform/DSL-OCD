package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OneMoneyInValue.OneMoneyValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneMoneyValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestOneMoneyValue.class.getResourceAsStream("dsl-project.ini"));
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
                OneMoneyValue.class.getDeclaredField("oneMoney").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                java.math.BigDecimal.class,
                OneMoneyValue.class.getMethod("getOneMoney").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                OneMoneyValue.class,
                OneMoneyValue.class.getMethod("setOneMoney", java.math.BigDecimal.class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertEquals(
                java.math.BigDecimal.ZERO.setScale(2),
                new OneMoneyValue().getOneMoney());
    }
}
