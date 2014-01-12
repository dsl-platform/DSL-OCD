package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneStringsWithMaxLengthOf9Value1 implements
        java.io.Serializable {
    public NullableListOfOneStringsWithMaxLengthOf9Value1(
            final java.util.List<String> nullableListOfOneStringsWithMaxLengthOf9) {
        setNullableListOfOneStringsWithMaxLengthOf9(nullableListOfOneStringsWithMaxLengthOf9);
    }

    public NullableListOfOneStringsWithMaxLengthOf9Value1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 459851678;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneStringsWithMaxLengthOf9Value1))
            return false;
        final NullableListOfOneStringsWithMaxLengthOf9Value1 other = (NullableListOfOneStringsWithMaxLengthOf9Value1) obj;

        if (!(this.nullableListOfOneStringsWithMaxLengthOf9 == other.nullableListOfOneStringsWithMaxLengthOf9 || this.nullableListOfOneStringsWithMaxLengthOf9 != null
                && this.nullableListOfOneStringsWithMaxLengthOf9
                        .equals(other.nullableListOfOneStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneStringsWithMaxLengthOf9Value1("
                + nullableListOfOneStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> nullableListOfOneStringsWithMaxLengthOf9;

    @JsonProperty("nullableListOfOneStringsWithMaxLengthOf9")
    public java.util.List<String> getNullableListOfOneStringsWithMaxLengthOf9() {
        return nullableListOfOneStringsWithMaxLengthOf9;
    }

    public NullableListOfOneStringsWithMaxLengthOf9Value1 setNullableListOfOneStringsWithMaxLengthOf9(
            final java.util.List<String> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.nullableListOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }
}
