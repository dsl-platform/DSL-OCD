package com.dslplatform.ocd.test;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;

@RunWith(AllTests.class)
public class TestEntryPoint {

    private static final Class<?>[] TEST_CLASSES = {
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableTextsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableArrayOfOneTextsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableListOfNullableTextsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableListOfOneTextsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableSetOfNullableTextsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableSetOfOneTextsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableTextPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneArrayOfNullableTextsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneArrayOfOneTextsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneListOfNullableTextsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneListOfOneTextsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneSetOfNullableTextsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneSetOfOneTextsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneTextPropertyTest.class
    };

    public static TestSuite suite() {
        final TestSuite suite = new TestSuite();
        for (final Class<?> clazz : TEST_CLASSES) {
            suite.addTest(new JUnit4TestAdapter(clazz));
        }
        return suite;
     }
}
