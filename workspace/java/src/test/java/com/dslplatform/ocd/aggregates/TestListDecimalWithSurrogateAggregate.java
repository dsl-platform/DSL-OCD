package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ListDecimalWithSurrogateInAggregate.ListDecimalWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.ListDecimalWithSurrogateInAggregate.repositories.ListDecimalWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestListDecimalWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static ListDecimalWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestListDecimalWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ListDecimalWithSurrogateAggregateRepository.class);
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
                ListDecimalWithSurrogateAggregate.class.getDeclaredField("listDecimal").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public List<java.math.BigDecimal> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                ListDecimalWithSurrogateAggregate.class.getMethod("getListDecimal").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = ListDecimalWithSurrogateAggregate.class.getMethod("setListDecimal", List.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public ListDecimalWithSurrogateAggregate setEtalon(final List<java.math.BigDecimal> etalon) { return null; }
                }.getClass().getMethod("setEtalon", List.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                ListDecimalWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                new ArrayList<java.math.BigDecimal>(0),
                new ListDecimalWithSurrogateAggregate().getListDecimal());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ListDecimalWithSurrogateAggregate().setListDecimal(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"listDecimal\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final ListDecimalWithSurrogateAggregate aggregate = new ListDecimalWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ListDecimalWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getListDecimal(),
                persisted.getListDecimal());
    }
}
