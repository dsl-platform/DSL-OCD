package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptListDecimalWithSurrogateInAggregate.OptListDecimalWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptListDecimalWithSurrogateInAggregate.repositories.OptListDecimalWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptListDecimalWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptListDecimalWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptListDecimalWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptListDecimalWithSurrogateAggregateRepository.class);
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
                OptListDecimalWithSurrogateAggregate.class.getDeclaredField("optListDecimal").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public List<java.math.BigDecimal> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                OptListDecimalWithSurrogateAggregate.class.getMethod("getOptListDecimal").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = OptListDecimalWithSurrogateAggregate.class.getMethod("setOptListDecimal", List.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public OptListDecimalWithSurrogateAggregate setEtalon(final List<java.math.BigDecimal> etalon) { return null; }
                }.getClass().getMethod("setEtalon", List.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                OptListDecimalWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptListDecimalWithSurrogateAggregate().getOptListDecimal());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptListDecimalWithSurrogateAggregate value = new OptListDecimalWithSurrogateAggregate();
        assertSame(value.setOptListDecimal(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptListDecimalWithSurrogateAggregate aggregate = new OptListDecimalWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptListDecimalWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptListDecimal(),
                persisted.getOptListDecimal());
    }
}
