package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ArrayOptDecimalInAggregate.ArrayOptDecimalAggregate;
import com.dslplatform.ocd.aggregates.ArrayOptDecimalInAggregate.repositories.ArrayOptDecimalAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayOptDecimalAggregate {
    private static ServiceLocator locator;

        private static ArrayOptDecimalAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestArrayOptDecimalAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ArrayOptDecimalAggregateRepository.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        repository = null;
        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
        locator = null;
    }

    @Before
    public void setUp() throws Exception {
        if (repository.countAll().get() > 0) {
          repository.delete(repository.findAll().get()).get();

          final long remaining = repository.countAll().get();
          assertEquals(0L, remaining);
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    /* Testing the property field type via reflection (no instantiation) */
    @Test
    public void testPropertyFieldType() throws NoSuchFieldException {
        assertEquals(
                java.math.BigDecimal[].class,
                ArrayOptDecimalAggregate.class.getDeclaredField("arrayOptDecimal").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                java.math.BigDecimal[].class,
                ArrayOptDecimalAggregate.class.getMethod("getArrayOptDecimal").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayOptDecimalAggregate.class,
                ArrayOptDecimalAggregate.class.getMethod("setArrayOptDecimal", java.math.BigDecimal[].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertArrayEquals(
                new java.math.BigDecimal[0],
                new ArrayOptDecimalAggregate().getArrayOptDecimal());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ArrayOptDecimalAggregate().setArrayOptDecimal(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"arrayOptDecimal\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws IOException, InterruptedException, ExecutionException {
        final ArrayOptDecimalAggregate aggregate = new ArrayOptDecimalAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ArrayOptDecimalAggregate persisted = repository.find(uri).get();

        assertArrayEquals(
                new java.math.BigDecimal[0],
                persisted.getArrayOptDecimal());

        assertArrayEquals(
                aggregate.getArrayOptDecimal(),
                persisted.getArrayOptDecimal());
    }
}
