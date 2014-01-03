package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptArrayMapWithSurrogateInAggregate.OptArrayMapWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptArrayMapWithSurrogateInAggregate.repositories.OptArrayMapWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptArrayMapWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptArrayMapWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptArrayMapWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptArrayMapWithSurrogateAggregateRepository.class);
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
                OptArrayMapWithSurrogateAggregate.class.getDeclaredField("optArrayMap").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public Map<String, String>[] getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                OptArrayMapWithSurrogateAggregate.class.getMethod("getOptArrayMap").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = OptArrayMapWithSurrogateAggregate.class.getMethod("setOptArrayMap", Map[].class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public OptArrayMapWithSurrogateAggregate setEtalon(final Map<String, String>[] etalon) { return null; }
                }.getClass().getMethod("setEtalon", Map[].class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                OptArrayMapWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptArrayMapWithSurrogateAggregate().getOptArrayMap());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptArrayMapWithSurrogateAggregate value = new OptArrayMapWithSurrogateAggregate();
        assertSame(value.setOptArrayMap(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptArrayMapWithSurrogateAggregate aggregate = new OptArrayMapWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptArrayMapWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptArrayMap(),
                persisted.getOptArrayMap());
    }
}
