package com.dslplatform.ocd.javaasserts;

import org.junit.Assert;

public class TimestampAsserts {
// TODO: update generator before regenerating
    static void assertSingleEqualsZeroDelta(final String message, final org.joda.time.DateTime expected, final org.joda.time.DateTime actual){

        final StringBuilder failMsg = new StringBuilder();
        failMsg.append(message)
            .append("expected was: ")
            .append("\"" + expected + "\"")
            .append(", but actual was: ")
            .append("\"" + actual + "\"")
            .append("[WARNING - not using a delta duration, comparing two instants directly]")
            ;

        if(expected == actual) {
            return;
        } else{
            failMsg.append("; Different instances.");
        }

        if(expected != null && actual != null) {
            if(expected.getMillis() == actual.getMillis() ){
                if(org.joda.time.field.FieldUtils.equals(expected.getChronology(), actual.getChronology())){
                    return;
                }else{
                    failMsg.append("; Chronologies: ")
                    .append(expected.getChronology())
                    .append(" vs. ")
                    .append(actual.getChronology())
                    ;
                }
            } else{
                if(expected.getMillis() != actual.getMillis()){
                    failMsg.append("; Millis: ")
                        .append(expected.getMillis())
                        .append(" vs. ")
                        .append(actual.getMillis())
                        ;
                }
            }
        }

        if(expected.getChronology() != null && actual.getChronology() != null){
            if(expected.getChronology().getZone().getOffset(0) == actual.getChronology().getZone().getOffset(0)){
                return;
            }else{
                failMsg.append("; Chronology offsets: ")
                .append(expected.getChronology().getZone().getOffset(0))
                .append(" vs. ")
                .append(actual.getChronology().getZone().getOffset(0))
                ;
            }
        } else{
            failMsg.append("; One of the chronologies is null. ");
        }

        Assert.fail(failMsg.toString());
    }

    static void assertSingleEquals(final String message, final org.joda.time.DateTime expected, final org.joda.time.DateTime actual, final org.joda.time.Duration delta) {
        if (delta == org.joda.time.Duration.ZERO) {
            assertSingleEqualsZeroDelta(message, expected, actual);
            return;
        }

        if (expected.isBefore(actual) && expected.plus(delta).isAfter(actual)) return;
        Assert.fail(message + "expected was \"" + expected + "\", but actual was \"" + actual + "\" (using delta duration of \"" + delta + "\")");
    }

    static void assertOneEquals(final String message, final org.joda.time.DateTime expected, final org.joda.time.DateTime actual, final org.joda.time.Duration delta) {
        if (expected == null) Assert.fail(message + "expected was <null> - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
        if (expected == actual) return;
        if (actual == null) Assert.fail(message + "expected was \"" + expected + "\", but actual was <null>");
        assertSingleEquals(message, expected, actual, delta);
    }

    public static void assertOneEquals(final org.joda.time.DateTime expected, final org.joda.time.DateTime actual, final org.joda.time.Duration delta) {
        assertOneEquals("OneTimestamp mismatch: ", expected, actual, delta);
    }

    public static void assertOneEquals(final org.joda.time.DateTime expected, final org.joda.time.DateTime actual) {
        assertOneEquals(expected, actual, org.joda.time.Duration.ZERO);
    }

    private static void assertNullableEquals(final String message, final org.joda.time.DateTime expected, final org.joda.time.DateTime actual, final org.joda.time.Duration delta) {
        if (expected == actual) return;
        if (expected == null) Assert.fail(message + "expected was <null>, but actual was \"" + actual + "\"");
        if (actual == null) Assert.fail(message + "expected was \"" + expected + "\", but actual was <null>");
        assertSingleEquals(message, expected, actual, delta);
    }

    public static void assertNullableEquals(final org.joda.time.DateTime expected, final org.joda.time.DateTime actual, final org.joda.time.Duration delta) {
        assertNullableEquals("NullableTimestamp mismatch: ", expected, actual, delta);
    }

    public static void assertNullableEquals(final org.joda.time.DateTime expected, final org.joda.time.DateTime actual) {
        assertNullableEquals(expected, actual, org.joda.time.Duration.ZERO);
    }

    private static void assertArrayOfOneEquals(final String message, final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals, final org.joda.time.Duration delta) {
        if (expecteds.length != actuals.length) {
            Assert.fail(message + "expecteds was an array of length " + expecteds.length + ", but actuals was an array of length " + actuals.length);
        }

        for (int i = 0; i < expecteds.length; i++) {
            assertOneEquals(message + "element mismatch occurred at index " + i + ": ", expecteds[i], actuals[i], delta);
        }
    }

    private static void assertOneArrayOfOneEquals(final String message, final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals, final org.joda.time.Duration delta) {
        if (expecteds == null) Assert.fail(message + "expecteds was <null> - WARNING: This is a preconditions failure in expecteds, this assertion will never succeed!");
        for (int i = 0; i < expecteds.length; i ++) {
            if (expecteds[i] == null) {
                Assert.fail(message + "expecteds contained a <null> element at index " + i + " - WARNING: This is a preconditions failure in expecteds, this assertion will never succeed!");
            }
        }
        if (expecteds == actuals) return;
        if (actuals == null) Assert.fail(message + "expecteds was an array of length " + expecteds.length + ", but actuals was <null>");
        assertArrayOfOneEquals(message, expecteds, actuals, delta);
    }

    public static void assertOneArrayOfOneEquals(final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals, final org.joda.time.Duration delta) {
        assertOneArrayOfOneEquals("OneArrayOfOneTimestamp mismatch: ", expecteds, actuals, delta);
    }

    public static void assertOneArrayOfOneEquals(final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals) {
        assertOneArrayOfOneEquals(expecteds, actuals, org.joda.time.Duration.ZERO);
    }

    private static void assertNullableArrayOfOneEquals(final String message, final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals, final org.joda.time.Duration delta) {
        if (expecteds == actuals) return;
        if (expecteds == null) Assert.fail(message + "expecteds was <null>, but actuals was an array of length " + actuals.length);
        if (actuals == null) Assert.fail(message + " expecteds was an array of length " + expecteds.length + ", but actuals was <null>");
        assertArrayOfOneEquals(message, expecteds, actuals, delta);
    }

    public static void assertNullableArrayOfOneEquals(final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals, final org.joda.time.Duration delta) {
        assertNullableArrayOfOneEquals("NullableArrayOfOneTimestamp mismatch: ", expecteds, actuals, delta);
    }

    public static void assertNullableArrayOfOneEquals(final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals) {
        assertNullableArrayOfOneEquals(expecteds, actuals, org.joda.time.Duration.ZERO);
    }

    private static void assertArrayOfNullableEquals(final String message, final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals, final org.joda.time.Duration delta) {
        if (expecteds.length != actuals.length) {
            Assert.fail(message + "expecteds was an array of length " + expecteds.length + ", but actuals was an array of length " + actuals.length);
        }

        for (int i = 0; i < expecteds.length; i++) {
            assertNullableEquals(message + "element mismatch occurred at index " + i + ": ", expecteds[i], actuals[i], delta);
        }
    }

    private static void assertOneArrayOfNullableEquals(final String message, final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals, final org.joda.time.Duration delta) {
        if (expecteds == null) Assert.fail(message + "expecteds was <null> - WARNING: This is a preconditions failure in expecteds, this assertion will never succeed!");
        if (expecteds == actuals) return;
        if (actuals == null) Assert.fail(message + "expecteds was an array of length " + expecteds.length + ", but actuals was <null>");
        assertArrayOfNullableEquals(message, expecteds, actuals, delta);
    }

    public static void assertOneArrayOfNullableEquals(final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals, final org.joda.time.Duration delta) {
        assertOneArrayOfNullableEquals("OneArrayOfNullableTimestamp mismatch: ", expecteds, actuals, delta);
    }

    public static void assertOneArrayOfNullableEquals(final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals) {
        assertOneArrayOfNullableEquals(expecteds, actuals, org.joda.time.Duration.ZERO);
    }

    private static void assertNullableArrayOfNullableEquals(final String message, final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals, final org.joda.time.Duration delta) {
        if (expecteds == actuals) return;
        if (expecteds == null) Assert.fail(message + "expecteds was <null>, but actuals was an array of length " + actuals.length);
        if (actuals == null) Assert.fail(message + " expecteds was an array of length " + expecteds.length + ", but actuals was <null>");
        assertArrayOfNullableEquals(message, expecteds, actuals, delta);
    }

    public static void assertNullableArrayOfNullableEquals(final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals, final org.joda.time.Duration delta) {
        assertNullableArrayOfNullableEquals("NullableArrayOfNullableTimestamp mismatch: ", expecteds, actuals, delta);
    }

    public static void assertNullableArrayOfNullableEquals(final org.joda.time.DateTime[] expecteds, final org.joda.time.DateTime[] actuals) {
        assertNullableArrayOfNullableEquals(expecteds, actuals, org.joda.time.Duration.ZERO);
    }

    private static void assertListOfOneEquals(final String message, final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        final int expectedsSize = expecteds.size();
        final int actualsSize = actuals.size();
        if (expectedsSize != actualsSize) {
            Assert.fail(message + "expecteds was a list of size " + expectedsSize + ", but actuals was a list of size " + actualsSize);
        }

        final java.util.Iterator<org.joda.time.DateTime> expectedsIterator = expecteds.iterator();
        final java.util.Iterator<org.joda.time.DateTime> actualsIterator = actuals.iterator();
        for (int i = 0; i < expectedsSize; i++) {
            final org.joda.time.DateTime expected = expectedsIterator.next();
            final org.joda.time.DateTime actual = actualsIterator.next();
            assertOneEquals(message + "element mismatch occurred at index " + i + ": ", expected, actual, delta);
        }
    }

    private static void assertOneListOfOneEquals(final String message, final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        int i = 0;
        for (final org.joda.time.DateTime expected : expecteds) {
            if (expected == null) {
                Assert.fail(message + "element mismatch occurred at index " + i + ": expected was <null> - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
            }
            i++;
        }
        if (expecteds == actuals) return;
        if (actuals == null) Assert.fail(message + "expecteds was a list of size " + expecteds.size() + ", but actuals was <null>");
        assertListOfOneEquals(message, expecteds, actuals, delta);
    }

    public static void assertOneListOfOneEquals(final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        assertOneListOfOneEquals("OneListOfOneTimestamp mismatch: ", expecteds, actuals, delta);
    }

    public static void assertOneListOfOneEquals(final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals) {
        assertOneListOfOneEquals(expecteds, actuals, org.joda.time.Duration.ZERO);
    }

    private static void assertNullableListOfOneEquals(final String message, final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        if (expecteds == actuals) return;
        if (expecteds == null) Assert.fail(message + "expecteds was <null>, but actuals was a list of size " + actuals.size());
        if (actuals == null) Assert.fail(message + " expecteds was a list of size " + expecteds.size() + ", but actuals was <null>");
        assertListOfOneEquals(message, expecteds, actuals, delta);
    }

    public static void assertNullableListOfOneEquals(final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        assertNullableListOfOneEquals("NullableListOfOneTimestamp mismatch: ", expecteds, actuals, delta);
    }

    public static void assertNullableListOfOneEquals(final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals) {
        assertNullableListOfOneEquals(expecteds, actuals, org.joda.time.Duration.ZERO);
    }

    private static void assertListOfNullableEquals(final String message, final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        final int expectedsSize = expecteds.size();
        final int actualsSize = actuals.size();
        if (expectedsSize != actualsSize) {
            Assert.fail(message + "expecteds was a list of size " + expectedsSize + ", but actuals was a list of size " + actualsSize);
        }

        final java.util.Iterator<org.joda.time.DateTime> expectedsIterator = expecteds.iterator();
        final java.util.Iterator<org.joda.time.DateTime> actualsIterator = actuals.iterator();
        for (int i = 0; i < expectedsSize; i++) {
            final org.joda.time.DateTime expected = expectedsIterator.next();
            final org.joda.time.DateTime actual = actualsIterator.next();
            assertNullableEquals(message + "element mismatch occurred at index " + i + ": ", expected, actual, delta);
        }
    }

    private static void assertOneListOfNullableEquals(final String message, final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        if (expecteds == null) Assert.fail(message + "expecteds was <null> - WARNING: This is a preconditions failure in expecteds, this assertion will never succeed!");
        if (expecteds == actuals) return;
        if (actuals == null) Assert.fail(message + "expecteds was a list of size " + expecteds.size() + ", but actuals was <null>");
        assertListOfNullableEquals(message, expecteds, actuals, delta);
    }

    public static void assertOneListOfNullableEquals(final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        assertOneListOfNullableEquals("OneListOfNullableTimestamp mismatch: ", expecteds, actuals, delta);
    }

    public static void assertOneListOfNullableEquals(final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals) {
        assertOneListOfNullableEquals(expecteds, actuals, org.joda.time.Duration.ZERO);
    }

    private static void assertNullableListOfNullableEquals(final String message, final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        if (expecteds == actuals) return;
        if (expecteds == null) Assert.fail(message + "expecteds was <null>, but actuals was a list of size " + actuals.size());
        if (actuals == null) Assert.fail(message + " expecteds was a list of size " + expecteds.size() + ", but actuals was <null>");
        assertListOfNullableEquals(message, expecteds, actuals, delta);
    }

    public static void assertNullableListOfNullableEquals(final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        assertNullableListOfNullableEquals("NullableListOfNullableTimestamp mismatch: ", expecteds, actuals, delta);
    }

    public static void assertNullableListOfNullableEquals(final java.util.List<org.joda.time.DateTime> expecteds, final java.util.List<org.joda.time.DateTime> actuals) {
        assertNullableListOfNullableEquals(expecteds, actuals, org.joda.time.Duration.ZERO);
    }

    private static void assertSetOfOneEquals(final String message, final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        if (actuals.contains(null)) {
            Assert.fail(message + "actuals contained a <null> element");
        }

        final int expectedsSize = expecteds.size();
        final int actualsSize = actuals.size();
        if (expectedsSize != actualsSize) {
            Assert.fail(message + "expecteds was a set of size " + expectedsSize + ", but actuals was a set of size " + actualsSize);
        }

        expectedsLoop: for (final org.joda.time.DateTime expected : expecteds) {
            if (actuals.contains(expected)) continue;
            for (final org.joda.time.DateTime actual : actuals) {
                try {
                    assertOneEquals(expected, actual, delta);
                    continue expectedsLoop;
                }
                catch (final AssertionError e) {}
            }
            Assert.fail(message + "actuals did not contain the expecteds element \"" + expected + "\"");
        }
    }

    private static void assertOneSetOfOneEquals(final String message, final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        if (expecteds.contains(null)) {
            Assert.fail(message + "expecteds contained a <null> element - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
        }
        if (expecteds == actuals) return;
        if (actuals == null) Assert.fail(message + "expecteds was a set of size " + expecteds.size() + ", but actuals was <null>");
        assertSetOfOneEquals(message, expecteds, actuals, delta);
    }

    public static void assertOneSetOfOneEquals(final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        assertOneSetOfOneEquals("OneSetOfOneTimestamp mismatch: ", expecteds, actuals, delta);
    }

    public static void assertOneSetOfOneEquals(final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals) {
        assertOneSetOfOneEquals(expecteds, actuals, org.joda.time.Duration.ZERO);
    }

    private static void assertNullableSetOfOneEquals(final String message, final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        if (expecteds == actuals) return;
        if (expecteds == null) Assert.fail(message + "expecteds was <null>, but actuals was a set of size " + actuals.size());
        if (actuals == null) Assert.fail(message + " expecteds was a set of size " + expecteds.size() + ", but actuals was <null>");
        assertSetOfOneEquals(message, expecteds, actuals, delta);
    }

    public static void assertNullableSetOfOneEquals(final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        assertNullableSetOfOneEquals("NullableSetOfOneTimestamp mismatch: ", expecteds, actuals, delta);
    }

    public static void assertNullableSetOfOneEquals(final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals) {
        assertNullableSetOfOneEquals(expecteds, actuals, org.joda.time.Duration.ZERO);
    }

    private static void assertSetOfNullableEquals(final String message, final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        final int expectedsSize = expecteds.size();
        final int actualsSize = actuals.size();
        if (expectedsSize != actualsSize) {
            Assert.fail(message + "expecteds was a set of size " + expectedsSize + ", but actuals was a set of size " + actualsSize);
        }

        expectedsLoop: for (final org.joda.time.DateTime expected : expecteds) {
            if (actuals.contains(expected)) continue;
            for (final org.joda.time.DateTime actual : actuals) {
                try {
                    assertNullableEquals(expected, actual, delta);
                    continue expectedsLoop;
                }
                catch (final AssertionError e) {}
            }
            Assert.fail(message + "actuals did not contain the expecteds element \"" + expected + "\"");
        }
    }

    private static void assertOneSetOfNullableEquals(final String message, final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        if (expecteds == null) Assert.fail(message + "expecteds was <null> - WARNING: This is a preconditions failure in expecteds, this assertion will never succeed!");
        if (expecteds == actuals) return;
        if (actuals == null) Assert.fail(message + "expecteds was a set of size " + expecteds.size() + ", but actuals was <null>");
        assertSetOfNullableEquals(message, expecteds, actuals, delta);
    }

    public static void assertOneSetOfNullableEquals(final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        assertOneSetOfNullableEquals("OneSetOfNullableTimestamp mismatch: ", expecteds, actuals, delta);
    }

    public static void assertOneSetOfNullableEquals(final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals) {
        assertOneSetOfNullableEquals(expecteds, actuals, org.joda.time.Duration.ZERO);
    }

    private static void assertNullableSetOfNullableEquals(final String message, final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        if (expecteds == actuals) return;
        if (expecteds == null) Assert.fail(message + "expecteds was <null>, but actuals was a set of size " + actuals.size());
        if (actuals == null) Assert.fail(message + " expecteds was a set of size " + expecteds.size() + ", but actuals was <null>");
        assertSetOfNullableEquals(message, expecteds, actuals, delta);
    }

    public static void assertNullableSetOfNullableEquals(final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals, final org.joda.time.Duration delta) {
        assertNullableSetOfNullableEquals("NullableSetOfNullableTimestamp mismatch: ", expecteds, actuals, delta);
    }

    public static void assertNullableSetOfNullableEquals(final java.util.Set<org.joda.time.DateTime> expecteds, final java.util.Set<org.joda.time.DateTime> actuals) {
        assertNullableSetOfNullableEquals(expecteds, actuals, org.joda.time.Duration.ZERO);
    }
}