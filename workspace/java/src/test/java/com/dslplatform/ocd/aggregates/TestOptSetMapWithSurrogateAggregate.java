package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptSetMapWithSurrogateInAggregate.OptSetMapWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptSetMapWithSurrogateInAggregate.repositories.OptSetMapWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptSetMapWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptSetMapWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptSetMapWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptSetMapWithSurrogateAggregateRepository.class);
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
                    private final Set<Map<String, String>> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                OptSetMapWithSurrogateAggregate.class.getDeclaredField("optSetMap").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public Set<Map<String, String>> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                OptSetMapWithSurrogateAggregate.class.getMethod("getOptSetMap").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = OptSetMapWithSurrogateAggregate.class.getMethod("setOptSetMap", Set.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public OptSetMapWithSurrogateAggregate setEtalon(final Set<Map<String, String>> etalon) { return null; }
                }.getClass().getMethod("setEtalon", Set.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                OptSetMapWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptSetMapWithSurrogateAggregate().getOptSetMap());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptSetMapWithSurrogateAggregate value = new OptSetMapWithSurrogateAggregate();
        assertSame(value.setOptSetMap(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptSetMapWithSurrogateAggregate aggregate = new OptSetMapWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptSetMapWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptSetMap(),
                persisted.getOptSetMap());
    }
}
