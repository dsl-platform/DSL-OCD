package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableStringsWithMaxLengthOf9Value2 implements
        java.io.Serializable {
    public NullableSetOfNullableStringsWithMaxLengthOf9Value2(
            final java.util.Set<String> nullableSetOfNullableStringsWithMaxLengthOf9) {
        setNullableSetOfNullableStringsWithMaxLengthOf9(nullableSetOfNullableStringsWithMaxLengthOf9);
    }

    public NullableSetOfNullableStringsWithMaxLengthOf9Value2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1235487586;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableStringsWithMaxLengthOf9Value2))
            return false;
        final NullableSetOfNullableStringsWithMaxLengthOf9Value2 other = (NullableSetOfNullableStringsWithMaxLengthOf9Value2) obj;

        if (!(this.nullableSetOfNullableStringsWithMaxLengthOf9 == other.nullableSetOfNullableStringsWithMaxLengthOf9 || this.nullableSetOfNullableStringsWithMaxLengthOf9 != null
                && this.nullableSetOfNullableStringsWithMaxLengthOf9
                        .equals(other.nullableSetOfNullableStringsWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableStringsWithMaxLengthOf9Value2("
                + nullableSetOfNullableStringsWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> nullableSetOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("nullableSetOfNullableStringsWithMaxLengthOf9")
    public java.util.Set<String> getNullableSetOfNullableStringsWithMaxLengthOf9() {
        return nullableSetOfNullableStringsWithMaxLengthOf9;
    }

    public NullableSetOfNullableStringsWithMaxLengthOf9Value2 setNullableSetOfNullableStringsWithMaxLengthOf9(
            final java.util.Set<String> value) {
        if (value != null)
            com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.nullableSetOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }
}
