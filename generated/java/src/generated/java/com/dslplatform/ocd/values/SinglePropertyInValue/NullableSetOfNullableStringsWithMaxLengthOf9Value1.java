package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableStringsWithMaxLengthOf9Value1 implements
        java.io.Serializable {
    public NullableSetOfNullableStringsWithMaxLengthOf9Value1(
            final java.util.Set<String> nullableSetOfNullableStringsWithMaxLengthOf9) {
        setNullableSetOfNullableStringsWithMaxLengthOf9(nullableSetOfNullableStringsWithMaxLengthOf9);
    }

    public NullableSetOfNullableStringsWithMaxLengthOf9Value1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 832203059;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableStringsWithMaxLengthOf9Value1))
            return false;
        final NullableSetOfNullableStringsWithMaxLengthOf9Value1 other = (NullableSetOfNullableStringsWithMaxLengthOf9Value1) obj;

        if (!(this.nullableSetOfNullableStringsWithMaxLengthOf9 == other.nullableSetOfNullableStringsWithMaxLengthOf9 || this.nullableSetOfNullableStringsWithMaxLengthOf9 != null
                && this.nullableSetOfNullableStringsWithMaxLengthOf9
                        .equals(other.nullableSetOfNullableStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableStringsWithMaxLengthOf9Value1("
                + nullableSetOfNullableStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("nullableSetOfNullableStringsWithMaxLengthOf9")
    public java.util.Set<String> getNullableSetOfNullableStringsWithMaxLengthOf9() {
        return nullableSetOfNullableStringsWithMaxLengthOf9;
    }

    public NullableSetOfNullableStringsWithMaxLengthOf9Value1 setNullableSetOfNullableStringsWithMaxLengthOf9(
            final java.util.Set<String> value) {
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.nullableSetOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }
}
