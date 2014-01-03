package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptSetDateWithSurrogateInAggregate.OptSetDateWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptSetDateWithSurrogateInAggregate.repositories.OptSetDateWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptSetDateWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptSetDateWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptSetDateWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptSetDateWithSurrogateAggregateRepository.class);
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
                    private final Set<org.joda.time.LocalDate> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                OptSetDateWithSurrogateAggregate.class.getDeclaredField("optSetDate").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public Set<org.joda.time.LocalDate> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                OptSetDateWithSurrogateAggregate.class.getMethod("getOptSetDate").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = OptSetDateWithSurrogateAggregate.class.getMethod("setOptSetDate", Set.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public OptSetDateWithSurrogateAggregate setEtalon(final Set<org.joda.time.LocalDate> etalon) { return null; }
                }.getClass().getMethod("setEtalon", Set.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                OptSetDateWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptSetDateWithSurrogateAggregate().getOptSetDate());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptSetDateWithSurrogateAggregate value = new OptSetDateWithSurrogateAggregate();
        assertSame(value.setOptSetDate(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptSetDateWithSurrogateAggregate aggregate = new OptSetDateWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptSetDateWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptSetDate(),
                persisted.getOptSetDate());
    }
}
