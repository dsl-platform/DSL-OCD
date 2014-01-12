package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDoublesValue1 implements
        java.io.Serializable {
    public NullableListOfOneDoublesValue1(
            final java.util.List<Double> nullableListOfOneDoubles) {
        setNullableListOfOneDoubles(nullableListOfOneDoubles);
    }

    public NullableListOfOneDoublesValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 168540608;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDoublesValue1)) return false;
        final NullableListOfOneDoublesValue1 other = (NullableListOfOneDoublesValue1) obj;

        if (!(this.nullableListOfOneDoubles == other.nullableListOfOneDoubles || this.nullableListOfOneDoubles != null
                && this.nullableListOfOneDoubles
                        .equals(other.nullableListOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDoublesValue1(" + nullableListOfOneDoubles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> nullableListOfOneDoubles;

    @JsonProperty("nullableListOfOneDoubles")
    public java.util.List<Double> getNullableListOfOneDoubles() {
        return nullableListOfOneDoubles;
    }

    public NullableListOfOneDoublesValue1 setNullableListOfOneDoubles(
            final java.util.List<Double> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneDoubles = value;

        return this;
    }
}
