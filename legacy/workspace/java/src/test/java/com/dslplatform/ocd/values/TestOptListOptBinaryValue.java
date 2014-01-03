package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OptListOptBinaryInValue.OptListOptBinaryValue;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptListOptBinaryValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptListOptBinaryValue.class.getResourceAsStream("dsl-project.ini"));
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
                new Object() {
                    @SuppressWarnings("unused")
                    private final List<byte[]> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                OptListOptBinaryValue.class.getDeclaredField("optListOptBinary").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public List<byte[]> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                OptListOptBinaryValue.class.getMethod("getOptListOptBinary").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = OptListOptBinaryValue.class.getMethod("setOptListOptBinary", List.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public OptListOptBinaryValue setEtalon(final List<byte[]> etalon) { return null; }
                }.getClass().getMethod("setEtalon", List.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                OptListOptBinaryValue.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptListOptBinaryValue().getOptListOptBinary());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptListOptBinaryValue value = new OptListOptBinaryValue();
        assertSame(value.setOptListOptBinary(null), value);
    }

    /* Value objects should be equal when instantiated with default properties */
    @Test
    public void testValueEquality() {
      final OptListOptBinaryValue v1 = new OptListOptBinaryValue();
      final OptListOptBinaryValue v2 = new OptListOptBinaryValue();

      // hashCode equality implies object equality, thus hashCode must be equal
      assertEquals(v1.hashCode(), v2.hashCode());
      assertEquals(v1, v2);
    }
}
