package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OptArrayOptIntInValue.OptArrayOptIntValue;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptArrayOptIntValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptArrayOptIntValue.class.getResourceAsStream("dsl-project.ini"));
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
                Integer[].class,
                OptArrayOptIntValue.class.getDeclaredField("optArrayOptInt").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                Integer[].class,
                OptArrayOptIntValue.class.getMethod("getOptArrayOptInt").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OptArrayOptIntValue.class,
                OptArrayOptIntValue.class.getMethod("setOptArrayOptInt", Integer[].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptArrayOptIntValue().getOptArrayOptInt());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptArrayOptIntValue value = new OptArrayOptIntValue();
        assertSame(value.setOptArrayOptInt(null), value);
    }

    /* Value objects should be equal when instantiated with default properties */
    @Test
    public void testValueEquality() {
      final OptArrayOptIntValue v1 = new OptArrayOptIntValue();
      final OptArrayOptIntValue v2 = new OptArrayOptIntValue();

      // hashCode equality implies object equality, thus hashCode must be equal
      assertEquals(v1.hashCode(), v2.hashCode());
      assertEquals(v1, v2);
    }
}
