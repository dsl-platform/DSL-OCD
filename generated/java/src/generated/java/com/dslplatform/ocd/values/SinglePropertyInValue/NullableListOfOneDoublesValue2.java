package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDoublesValue2 implements
        java.io.Serializable {
    public NullableListOfOneDoublesValue2(
            final java.util.List<Double> nullableListOfOneDoubles) {
        setNullableListOfOneDoubles(nullableListOfOneDoubles);
    }

    public NullableListOfOneDoublesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1397543333;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDoublesValue2)) return false;
        final NullableListOfOneDoublesValue2 other = (NullableListOfOneDoublesValue2) obj;

        if (!(this.nullableListOfOneDoubles == other.nullableListOfOneDoubles || this.nullableListOfOneDoubles != null
                && this.nullableListOfOneDoubles
                        .equals(other.nullableListOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDoublesValue2(" + nullableListOfOneDoubles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> nullableListOfOneDoubles;

    @JsonProperty("nullableListOfOneDoubles")
    public java.util.List<Double> getNullableListOfOneDoubles() {
        return nullableListOfOneDoubles;
    }

    public NullableListOfOneDoublesValue2 setNullableListOfOneDoubles(
            final java.util.List<Double> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneDoubles = value;

        return this;
    }
}
