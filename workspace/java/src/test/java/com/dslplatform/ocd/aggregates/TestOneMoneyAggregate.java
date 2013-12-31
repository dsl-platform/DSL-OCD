package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OneMoneyInAggregate.OneMoneyAggregate;
import com.dslplatform.ocd.aggregates.OneMoneyInAggregate.repositories.OneMoneyAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneMoneyAggregate {
    private static ServiceLocator locator;

        private static OneMoneyAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOneMoneyAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OneMoneyAggregateRepository.class);
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
                java.math.BigDecimal.class,
                OneMoneyAggregate.class.getDeclaredField("oneMoney").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                java.math.BigDecimal.class,
                OneMoneyAggregate.class.getMethod("getOneMoney").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OneMoneyAggregate.class,
                OneMoneyAggregate.class.getMethod("setOneMoney", java.math.BigDecimal.class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                java.math.BigDecimal.ZERO.setScale(2),
                new OneMoneyAggregate().getOneMoney());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new OneMoneyAggregate().setOneMoney(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"oneMoney\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws IOException, InterruptedException, ExecutionException {
        final OneMoneyAggregate aggregate = new OneMoneyAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OneMoneyAggregate persisted = repository.find(uri).get();

        assertEquals(
                java.math.BigDecimal.ZERO.setScale(2),
                persisted.getOneMoney());

        assertEquals(
                aggregate.getOneMoney(),
                persisted.getOneMoney());
    }
}
