package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ArrayOptMapInAggregate.ArrayOptMapAggregate;
import com.dslplatform.ocd.aggregates.ArrayOptMapInAggregate.repositories.ArrayOptMapAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayOptMapAggregate {
    private static ServiceLocator locator;

        private static ArrayOptMapAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestArrayOptMapAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ArrayOptMapAggregateRepository.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        repository = null;
        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
        locator = null;
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    private static void cleanup()
            throws InterruptedException, ExecutionException {
        if (repository.countAll().get() > 0) {
            repository.delete(repository.findAll().get()).get();

            final long remaining = repository.countAll().get();
            assertEquals(0L, remaining);
        }
    }

    /* Testing the property field type via reflection (no instantiation) */
    @Test
    public void testPropertyFieldType() throws NoSuchFieldException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final Map<String, String>[] etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                ArrayOptMapAggregate.class.getDeclaredField("arrayOptMap").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public Map<String, String>[] getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                ArrayOptMapAggregate.class.getMethod("getArrayOptMap").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = ArrayOptMapAggregate.class.getMethod("setArrayOptMap", Map[].class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public ArrayOptMapAggregate setEtalon(final Map<String, String>[] etalon) { return null; }
                }.getClass().getMethod("setEtalon", Map[].class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                ArrayOptMapAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertArrayEquals(
                new HashMap[0],
                new ArrayOptMapAggregate().getArrayOptMap());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ArrayOptMapAggregate().setArrayOptMap(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"arrayOptMap\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final ArrayOptMapAggregate aggregate = new ArrayOptMapAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ArrayOptMapAggregate persisted = repository.find(uri).get();

        assertArrayEquals(
                aggregate.getArrayOptMap(),
                persisted.getArrayOptMap());
    }
}
