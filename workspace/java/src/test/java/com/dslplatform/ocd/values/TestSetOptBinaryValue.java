package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.SetOptBinaryInValue.SetOptBinaryValue;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestSetOptBinaryValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestSetOptBinaryValue.class.getResourceAsStream("dsl-project.ini"));
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
                    private final Set<byte[]> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                SetOptBinaryValue.class.getDeclaredField("setOptBinary").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public Set<byte[]> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                SetOptBinaryValue.class.getMethod("getSetOptBinary").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        final Method method = SetOptBinaryValue.class.getMethod("setSetOptBinary", Set.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public SetOptBinaryValue setEtalon(final Set<byte[]> etalon) { return null; }
                }.getClass().getMethod("setEtalon", Set.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                SetOptBinaryValue.class,
                method.getGenericReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertEquals(
                new HashSet<byte[]>(),
                new SetOptBinaryValue().getSetOptBinary());
    }
}