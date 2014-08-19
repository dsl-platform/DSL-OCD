package com.dslplatform.ocd.test;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;

@RunWith(AllTests.class)
public class TestEntryPoint {

    private static final Class<?>[] TEST_CLASSES = {
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableLongsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableArrayOfOneLongsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableListOfNullableLongsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableListOfOneLongsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableLongPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableSetOfNullableLongsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableSetOfOneLongsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneArrayOfNullableLongsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneArrayOfOneLongsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneListOfNullableLongsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneListOfOneLongsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneLongPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneSetOfNullableLongsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneSetOfOneLongsPropertyTest.class
    };

    public static TestSuite suite() {
        final TestSuite suite = new TestSuite();
        for (final Class<?> clazz : TEST_CLASSES) {
            suite.addTest(new JUnit4TestAdapter(clazz));
        }
        return suite;
     }
}
