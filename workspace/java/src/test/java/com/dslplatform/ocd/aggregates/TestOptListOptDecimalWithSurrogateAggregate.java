package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptListOptDecimalWithSurrogateInAggregate.OptListOptDecimalWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptListOptDecimalWithSurrogateInAggregate.repositories.OptListOptDecimalWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptListOptDecimalWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptListOptDecimalWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptListOptDecimalWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptListOptDecimalWithSurrogateAggregateRepository.class);
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
                    private final List<java.math.BigDecimal> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                OptListOptDecimalWithSurrogateAggregate.class.getDeclaredField("optListOptDecimal").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public List<java.math.BigDecimal> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                OptListOptDecimalWithSurrogateAggregate.class.getMethod("getOptListOptDecimal").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = OptListOptDecimalWithSurrogateAggregate.class.getMethod("setOptListOptDecimal", List.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public OptListOptDecimalWithSurrogateAggregate setEtalon(final List<java.math.BigDecimal> etalon) { return null; }
                }.getClass().getMethod("setEtalon", List.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                OptListOptDecimalWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptListOptDecimalWithSurrogateAggregate().getOptListOptDecimal());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptListOptDecimalWithSurrogateAggregate value = new OptListOptDecimalWithSurrogateAggregate();
        assertSame(value.setOptListOptDecimal(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptListOptDecimalWithSurrogateAggregate aggregate = new OptListOptDecimalWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptListOptDecimalWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptListOptDecimal(),
                persisted.getOptListOptDecimal());
    }
}
