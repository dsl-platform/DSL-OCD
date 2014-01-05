package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.SetOptDoubleWithSurrogateInAggregate.SetOptDoubleWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.SetOptDoubleWithSurrogateInAggregate.repositories.SetOptDoubleWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestSetOptDoubleWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static SetOptDoubleWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestSetOptDoubleWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(SetOptDoubleWithSurrogateAggregateRepository.class);
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
                    private final Set<Double> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                SetOptDoubleWithSurrogateAggregate.class.getDeclaredField("setOptDouble").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public Set<Double> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                SetOptDoubleWithSurrogateAggregate.class.getMethod("getSetOptDouble").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = SetOptDoubleWithSurrogateAggregate.class.getMethod("setSetOptDouble", Set.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public SetOptDoubleWithSurrogateAggregate setEtalon(final Set<Double> etalon) { return null; }
                }.getClass().getMethod("setEtalon", Set.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                SetOptDoubleWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                new HashSet<Double>(0),
                new SetOptDoubleWithSurrogateAggregate().getSetOptDouble());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new SetOptDoubleWithSurrogateAggregate().setSetOptDouble(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"setOptDouble\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final SetOptDoubleWithSurrogateAggregate aggregate = new SetOptDoubleWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final SetOptDoubleWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getSetOptDouble(),
                persisted.getSetOptDouble());
    }
}