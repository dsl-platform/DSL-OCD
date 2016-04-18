package com.dslplatform.ocd.test;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class FancyAsserts {

	public static <L, R> void assertEquals(L left, R right) {
		org.junit.Assert.assertEquals(equalityFailed(left, right), left, right);
	}

	private static <L, R> String equalityFailed(L left, R right) {
		StringBuilder sb = new StringBuilder();
		sb.append("Expected: ");
		sb.append(ReflectionToStringBuilder.toString(left));
		sb.append(", Actual: ");
		sb.append(ReflectionToStringBuilder.toString(right));
		return sb.toString();
	}

}
