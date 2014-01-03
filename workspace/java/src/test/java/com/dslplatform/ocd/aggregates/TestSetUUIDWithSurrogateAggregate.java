package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.SetUUIDWithSurrogateInAggregate.SetUUIDWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.SetUUIDWithSurrogateInAggregate.repositories.SetUUIDWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestSetUUIDWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static SetUUIDWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestSetUUIDWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(SetUUIDWithSurrogateAggregateRepository.class);
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
                    private final Set<java.util.UUID> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                SetUUIDWithSurrogateAggregate.class.getDeclaredField("setUUID").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public Set<java.util.UUID> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                SetUUIDWithSurrogateAggregate.class.getMethod("getSetUUID").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = SetUUIDWithSurrogateAggregate.class.getMethod("setSetUUID", Set.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public SetUUIDWithSurrogateAggregate setEtalon(final Set<java.util.UUID> etalon) { return null; }
                }.getClass().getMethod("setEtalon", Set.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                SetUUIDWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                new HashSet<java.util.UUID>(0),
                new SetUUIDWithSurrogateAggregate().getSetUUID());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new SetUUIDWithSurrogateAggregate().setSetUUID(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"setUUID\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final SetUUIDWithSurrogateAggregate aggregate = new SetUUIDWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final SetUUIDWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getSetUUID(),
                persisted.getSetUUID());
    }
}
