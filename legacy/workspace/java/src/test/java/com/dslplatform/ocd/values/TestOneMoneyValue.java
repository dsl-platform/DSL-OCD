package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OneMoneyInValue.OneMoneyValue;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneMoneyValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOneMoneyValue.class.getResourceAsStream("dsl-project.ini"));
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
        locator = null;
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /* Testing the property field type via reflection (no instantiation) */
    @Test
    public void testPropertyFieldType() throws NoSuchFieldException {
        assertEquals(
                java.math.BigDecimal.class,
                OneMoneyValue.class.getDeclaredField("oneMoney").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                java.math.BigDecimal.class,
                OneMoneyValue.class.getMethod("getOneMoney").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OneMoneyValue.class,
                OneMoneyValue.class.getMethod("setOneMoney", java.math.BigDecimal.class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                java.math.BigDecimal.ZERO.setScale(2),
                new OneMoneyValue().getOneMoney());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new OneMoneyValue().setOneMoney(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"oneMoney\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Value objects should be equal when instantiated with default properties */
    @Test
    public void testValueEquality() {
      final OneMoneyValue v1 = new OneMoneyValue();
      final OneMoneyValue v2 = new OneMoneyValue();

      // hashCode equality implies object equality, thus hashCode must be equal
      assertEquals(v1.hashCode(), v2.hashCode());
      assertEquals(v1, v2);
    }
}