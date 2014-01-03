package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ArrayBoolInAggregate.ArrayBoolAggregate;
import com.dslplatform.ocd.aggregates.ArrayBoolInAggregate.repositories.ArrayBoolAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayBoolAggregate {
    private static ServiceLocator locator;

        private static ArrayBoolAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestArrayBoolAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ArrayBoolAggregateRepository.class);
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
                boolean[].class,
                ArrayBoolAggregate.class.getDeclaredField("arrayBool").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                boolean[].class,
                ArrayBoolAggregate.class.getMethod("getArrayBool").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayBoolAggregate.class,
                ArrayBoolAggregate.class.getMethod("setArrayBool", boolean[].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        AssertExtensions.assertArrayEquals(
                new boolean[0],
                new ArrayBoolAggregate().getArrayBool());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ArrayBoolAggregate().setArrayBool(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"arrayBool\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final ArrayBoolAggregate aggregate = new ArrayBoolAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ArrayBoolAggregate persisted = repository.find(uri).get();

        AssertExtensions.assertArrayEquals(
                aggregate.getArrayBool(),
                persisted.getArrayBool());
    }
}