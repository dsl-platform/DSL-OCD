package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ListFloatInAggregate.ListFloatAggregate;
import com.dslplatform.ocd.aggregates.ListFloatInAggregate.repositories.ListFloatAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestListFloatAggregate {
    private static ServiceLocator locator;

        private static ListFloatAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestListFloatAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ListFloatAggregateRepository.class);
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
                new Object() {
                    @SuppressWarnings("unused")
                    private final List<Float> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                ListFloatAggregate.class.getDeclaredField("listFloat").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public List<Float> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                ListFloatAggregate.class.getMethod("getListFloat").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = ListFloatAggregate.class.getMethod("setListFloat", List.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public ListFloatAggregate setEtalon(final List<Float> etalon) { return null; }
                }.getClass().getMethod("setEtalon", List.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                ListFloatAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                new ArrayList<Float>(0),
                new ListFloatAggregate().getListFloat());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ListFloatAggregate().setListFloat(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"listFloat\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws IOException, InterruptedException, ExecutionException {
        final ListFloatAggregate aggregate = new ListFloatAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ListFloatAggregate persisted = repository.find(uri).get();

        assertEquals(
                new ArrayList<Float>(0),
                persisted.getListFloat());

        assertEquals(
                aggregate.getListFloat(),
                persisted.getListFloat());
    }
}
