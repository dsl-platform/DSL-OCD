package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OptListOptMapInValue.OptListOptMapValue;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptListOptMapValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestOptListOptMapValue.class.getResourceAsStream("dsl-project.ini"));
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
                    private final List<Map<String, String>> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                OptListOptMapValue.class.getDeclaredField("optListOptMap").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public List<Map<String, String>> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                OptListOptMapValue.class.getMethod("getOptListOptMap").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        final Method method = OptListOptMapValue.class.getMethod("setOptListOptMap", List.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public OptListOptMapValue setEtalon(final List<Map<String, String>> etalon) { return null; }
                }.getClass().getMethod("setEtalon", List.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                OptListOptMapValue.class,
                method.getGenericReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertNull(new OptListOptMapValue().getOptListOptMap());
    }
}