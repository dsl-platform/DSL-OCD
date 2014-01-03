package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptListIntWithSurrogateInAggregate.OptListIntWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptListIntWithSurrogateInAggregate.repositories.OptListIntWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptListIntWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptListIntWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptListIntWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptListIntWithSurrogateAggregateRepository.class);
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
                    private final List<Integer> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                OptListIntWithSurrogateAggregate.class.getDeclaredField("optListInt").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public List<Integer> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                OptListIntWithSurrogateAggregate.class.getMethod("getOptListInt").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = OptListIntWithSurrogateAggregate.class.getMethod("setOptListInt", List.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public OptListIntWithSurrogateAggregate setEtalon(final List<Integer> etalon) { return null; }
                }.getClass().getMethod("setEtalon", List.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                OptListIntWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptListIntWithSurrogateAggregate().getOptListInt());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptListIntWithSurrogateAggregate value = new OptListIntWithSurrogateAggregate();
        assertSame(value.setOptListInt(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptListIntWithSurrogateAggregate aggregate = new OptListIntWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptListIntWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptListInt(),
                persisted.getOptListInt());
    }
}
