package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ArrayIntInAggregate.ArrayIntAggregate;
import com.dslplatform.ocd.aggregates.ArrayIntInAggregate.repositories.ArrayIntAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayIntAggregate {
    private static ServiceLocator locator;

        private static ArrayIntAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestArrayIntAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ArrayIntAggregateRepository.class);
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
                int[].class,
                ArrayIntAggregate.class.getDeclaredField("arrayInt").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                int[].class,
                ArrayIntAggregate.class.getMethod("getArrayInt").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayIntAggregate.class,
                ArrayIntAggregate.class.getMethod("setArrayInt", int[].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertArrayEquals(
                new int[0],
                new ArrayIntAggregate().getArrayInt());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ArrayIntAggregate().setArrayInt(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"arrayInt\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws IOException, InterruptedException, ExecutionException {
        final ArrayIntAggregate aggregate = new ArrayIntAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ArrayIntAggregate persisted = repository.find(uri).get();

        assertArrayEquals(
                new int[0],
                persisted.getArrayInt());

        assertArrayEquals(
                aggregate.getArrayInt(),
                persisted.getArrayInt());
    }
}
