package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptArrayOptMapWithSurrogateInAggregate.OptArrayOptMapWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptArrayOptMapWithSurrogateInAggregate.repositories.OptArrayOptMapWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptArrayOptMapWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptArrayOptMapWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptArrayOptMapWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptArrayOptMapWithSurrogateAggregateRepository.class);
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
                OptArrayOptMapWithSurrogateAggregate.class.getDeclaredField("optArrayOptMap").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public Map<String, String>[] getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                OptArrayOptMapWithSurrogateAggregate.class.getMethod("getOptArrayOptMap").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = OptArrayOptMapWithSurrogateAggregate.class.getMethod("setOptArrayOptMap", Map[].class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public OptArrayOptMapWithSurrogateAggregate setEtalon(final Map<String, String>[] etalon) { return null; }
                }.getClass().getMethod("setEtalon", Map[].class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                OptArrayOptMapWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptArrayOptMapWithSurrogateAggregate().getOptArrayOptMap());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptArrayOptMapWithSurrogateAggregate value = new OptArrayOptMapWithSurrogateAggregate();
        assertSame(value.setOptArrayOptMap(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptArrayOptMapWithSurrogateAggregate aggregate = new OptArrayOptMapWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptArrayOptMapWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptArrayOptMap(),
                persisted.getOptArrayOptMap());
    }
}
