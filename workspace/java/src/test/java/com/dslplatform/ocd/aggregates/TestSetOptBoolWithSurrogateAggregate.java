package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.SetOptBoolWithSurrogateInAggregate.SetOptBoolWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.SetOptBoolWithSurrogateInAggregate.repositories.SetOptBoolWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestSetOptBoolWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static SetOptBoolWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestSetOptBoolWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(SetOptBoolWithSurrogateAggregateRepository.class);
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
                    private final Set<Boolean> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                SetOptBoolWithSurrogateAggregate.class.getDeclaredField("setOptBool").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public Set<Boolean> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                SetOptBoolWithSurrogateAggregate.class.getMethod("getSetOptBool").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = SetOptBoolWithSurrogateAggregate.class.getMethod("setSetOptBool", Set.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public SetOptBoolWithSurrogateAggregate setEtalon(final Set<Boolean> etalon) { return null; }
                }.getClass().getMethod("setEtalon", Set.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                SetOptBoolWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                new HashSet<Boolean>(0),
                new SetOptBoolWithSurrogateAggregate().getSetOptBool());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new SetOptBoolWithSurrogateAggregate().setSetOptBool(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"setOptBool\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final SetOptBoolWithSurrogateAggregate aggregate = new SetOptBoolWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final SetOptBoolWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getSetOptBool(),
                persisted.getSetOptBool());
    }
}
