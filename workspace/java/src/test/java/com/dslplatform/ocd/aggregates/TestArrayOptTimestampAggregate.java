package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ArrayOptTimestampInAggregate.ArrayOptTimestampAggregate;
import com.dslplatform.ocd.aggregates.ArrayOptTimestampInAggregate.repositories.ArrayOptTimestampAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayOptTimestampAggregate {
    private static ServiceLocator locator;

        private static ArrayOptTimestampAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestArrayOptTimestampAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ArrayOptTimestampAggregateRepository.class);
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
                org.joda.time.DateTime[].class,
                ArrayOptTimestampAggregate.class.getDeclaredField("arrayOptTimestamp").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                org.joda.time.DateTime[].class,
                ArrayOptTimestampAggregate.class.getMethod("getArrayOptTimestamp").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayOptTimestampAggregate.class,
                ArrayOptTimestampAggregate.class.getMethod("setArrayOptTimestamp", org.joda.time.DateTime[].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertArrayEquals(
                new org.joda.time.DateTime[0],
                new ArrayOptTimestampAggregate().getArrayOptTimestamp());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ArrayOptTimestampAggregate().setArrayOptTimestamp(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"arrayOptTimestamp\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws IOException, InterruptedException, ExecutionException {
        final ArrayOptTimestampAggregate aggregate = new ArrayOptTimestampAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ArrayOptTimestampAggregate persisted = repository.find(uri).get();

        assertArrayEquals(
                new org.joda.time.DateTime[0],
                persisted.getArrayOptTimestamp());

        assertArrayEquals(
                aggregate.getArrayOptTimestamp(),
                persisted.getArrayOptTimestamp());
    }
}
