package com.dslplatform.ocd.test;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FancyAsserts {
    public static <L, R> void assertEquals(final L left, final R right) {
        org.junit.Assert.assertEquals(equalityFailed(left, right), left, right);
    }

    private static <L, R> String equalityFailed(final L left, final R right) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected: ");
        sb.append(ReflectionToStringBuilder.toString(left));
        sb.append(", Actual: ");
        sb.append(ReflectionToStringBuilder.toString(right));
        return sb.toString();
    }
}
