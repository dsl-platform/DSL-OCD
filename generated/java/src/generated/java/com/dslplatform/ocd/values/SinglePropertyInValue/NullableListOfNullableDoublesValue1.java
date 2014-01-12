package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableDoublesValue1 implements
        java.io.Serializable {
    public NullableListOfNullableDoublesValue1(
            final java.util.List<Double> nullableListOfNullableDoubles) {
        setNullableListOfNullableDoubles(nullableListOfNullableDoubles);
    }

    public NullableListOfNullableDoublesValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1435965557;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableDoublesValue1))
            return false;
        final NullableListOfNullableDoublesValue1 other = (NullableListOfNullableDoublesValue1) obj;

        if (!(this.nullableListOfNullableDoubles == other.nullableListOfNullableDoubles || this.nullableListOfNullableDoubles != null
                && this.nullableListOfNullableDoubles
                        .equals(other.nullableListOfNullableDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableDoublesValue1("
                + nullableListOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> nullableListOfNullableDoubles;

    @JsonProperty("nullableListOfNullableDoubles")
    public java.util.List<Double> getNullableListOfNullableDoubles() {
        return nullableListOfNullableDoubles;
    }

    public NullableListOfNullableDoublesValue1 setNullableListOfNullableDoubles(
            final java.util.List<Double> value) {
        this.nullableListOfNullableDoubles = value;

        return this;
    }
}
