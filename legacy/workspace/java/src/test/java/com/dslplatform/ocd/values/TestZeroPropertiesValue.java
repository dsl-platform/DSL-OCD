package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.ZeroPropertiesInValue.ZeroPropertiesValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestZeroPropertiesValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestZeroPropertiesValue.class.getResourceAsStream("dsl-project.ini"));
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
        locator = null;
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /* Value objects should be equal when instantiated with default properties */
    @Test
    public void testValueEquality() {
      final ZeroPropertiesValue v1 = new ZeroPropertiesValue();
      final ZeroPropertiesValue v2 = new ZeroPropertiesValue();

      // hashCode equality implies object equality, thus hashCode must be equal
      assertEquals(v1.hashCode(), v2.hashCode());
      assertEquals(v1, v2);
    }

    /* Value objects of arity-0 should have a static hashCode */
    @Test
    public void testHashCodeStability() {
      assertEquals(
              new ZeroPropertiesValue().hashCode(),
              0x49351151);
    }
}
