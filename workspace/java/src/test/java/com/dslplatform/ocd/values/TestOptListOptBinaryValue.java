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
//        locator = Bootstrap.init(TestOptListOptBinaryValue.class.getResourceAsStream("dsl-project.ini"));
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
                new Object() {
                    @SuppressWarnings("unused")
                    private final List<byte[]> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                OptListOptBinaryValue.class.getDeclaredField("optListOptBinary").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public List<byte[]> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                OptListOptBinaryValue.class.getMethod("getOptListOptBinary").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
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

    @Test
    public void testDefaultPropertyValue() {
        assertNull(new OptListOptBinaryValue().getOptListOptBinary());
    }
}