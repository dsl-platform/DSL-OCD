package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ListStringWithSurrogateInAggregate.ListStringWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.ListStringWithSurrogateInAggregate.repositories.ListStringWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestListStringWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static ListStringWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestListStringWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ListStringWithSurrogateAggregateRepository.class);
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
                    private final List<String> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                ListStringWithSurrogateAggregate.class.getDeclaredField("listString").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public List<String> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                ListStringWithSurrogateAggregate.class.getMethod("getListString").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = ListStringWithSurrogateAggregate.class.getMethod("setListString", List.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public ListStringWithSurrogateAggregate setEtalon(final List<String> etalon) { return null; }
                }.getClass().getMethod("setEtalon", List.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                ListStringWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                new ArrayList<String>(0),
                new ListStringWithSurrogateAggregate().getListString());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ListStringWithSurrogateAggregate().setListString(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"listString\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final ListStringWithSurrogateAggregate aggregate = new ListStringWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ListStringWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getListString(),
                persisted.getListString());
    }
}
