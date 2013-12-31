package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ArrayBinaryInAggregate.ArrayBinaryAggregate;
import com.dslplatform.ocd.aggregates.ArrayBinaryInAggregate.repositories.ArrayBinaryAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayBinaryAggregate {
    private static ServiceLocator locator;

        private static ArrayBinaryAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestArrayBinaryAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ArrayBinaryAggregateRepository.class);
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
                byte[][].class,
                ArrayBinaryAggregate.class.getDeclaredField("arrayBinary").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                byte[][].class,
                ArrayBinaryAggregate.class.getMethod("getArrayBinary").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayBinaryAggregate.class,
                ArrayBinaryAggregate.class.getMethod("setArrayBinary", byte[][].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertArrayEquals(
                new byte[0][],
                new ArrayBinaryAggregate().getArrayBinary());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ArrayBinaryAggregate().setArrayBinary(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"arrayBinary\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws IOException, InterruptedException, ExecutionException {
        final ArrayBinaryAggregate aggregate = new ArrayBinaryAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ArrayBinaryAggregate persisted = repository.find(uri).get();

        assertArrayEquals(
                new byte[0][],
                persisted.getArrayBinary());

        assertArrayEquals(
                aggregate.getArrayBinary(),
                persisted.getArrayBinary());
    }
}
