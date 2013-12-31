package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.SetOptBinaryInAggregate.SetOptBinaryAggregate;
import com.dslplatform.ocd.aggregates.SetOptBinaryInAggregate.repositories.SetOptBinaryAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestSetOptBinaryAggregate {
    private static ServiceLocator locator;

        private static SetOptBinaryAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestSetOptBinaryAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(SetOptBinaryAggregateRepository.class);
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
                    private final Set<byte[]> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                SetOptBinaryAggregate.class.getDeclaredField("setOptBinary").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public Set<byte[]> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                SetOptBinaryAggregate.class.getMethod("getSetOptBinary").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = SetOptBinaryAggregate.class.getMethod("setSetOptBinary", Set.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public SetOptBinaryAggregate setEtalon(final Set<byte[]> etalon) { return null; }
                }.getClass().getMethod("setEtalon", Set.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                SetOptBinaryAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                new HashSet<byte[]>(),
                new SetOptBinaryAggregate().getSetOptBinary());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new SetOptBinaryAggregate().setSetOptBinary(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"setOptBinary\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws IOException, InterruptedException, ExecutionException {
        final SetOptBinaryAggregate aggregate = new SetOptBinaryAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final SetOptBinaryAggregate persisted = repository.find(uri).get();

        assertEquals(
                new HashSet<byte[]>(),
                persisted.getSetOptBinary());

        assertEquals(
                aggregate.getSetOptBinary(),
                persisted.getSetOptBinary());
    }
}
