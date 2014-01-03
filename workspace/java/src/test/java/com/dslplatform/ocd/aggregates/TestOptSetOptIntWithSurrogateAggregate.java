package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptSetOptIntWithSurrogateInAggregate.OptSetOptIntWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptSetOptIntWithSurrogateInAggregate.repositories.OptSetOptIntWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptSetOptIntWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptSetOptIntWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptSetOptIntWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptSetOptIntWithSurrogateAggregateRepository.class);
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
                    private final Set<Integer> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                OptSetOptIntWithSurrogateAggregate.class.getDeclaredField("optSetOptInt").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public Set<Integer> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                OptSetOptIntWithSurrogateAggregate.class.getMethod("getOptSetOptInt").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = OptSetOptIntWithSurrogateAggregate.class.getMethod("setOptSetOptInt", Set.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public OptSetOptIntWithSurrogateAggregate setEtalon(final Set<Integer> etalon) { return null; }
                }.getClass().getMethod("setEtalon", Set.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                OptSetOptIntWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptSetOptIntWithSurrogateAggregate().getOptSetOptInt());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptSetOptIntWithSurrogateAggregate value = new OptSetOptIntWithSurrogateAggregate();
        assertSame(value.setOptSetOptInt(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptSetOptIntWithSurrogateAggregate aggregate = new OptSetOptIntWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptSetOptIntWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptSetOptInt(),
                persisted.getOptSetOptInt());
    }
}
