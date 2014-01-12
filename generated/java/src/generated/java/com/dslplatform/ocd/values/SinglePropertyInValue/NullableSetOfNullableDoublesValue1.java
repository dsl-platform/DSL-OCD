package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableDoublesValue1 implements
        java.io.Serializable {
    public NullableSetOfNullableDoublesValue1(
            final java.util.Set<Double> nullableSetOfNullableDoubles) {
        setNullableSetOfNullableDoubles(nullableSetOfNullableDoubles);
    }

    public NullableSetOfNullableDoublesValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 230581429;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableDoublesValue1)) return false;
        final NullableSetOfNullableDoublesValue1 other = (NullableSetOfNullableDoublesValue1) obj;

        if (!(this.nullableSetOfNullableDoubles == other.nullableSetOfNullableDoubles || this.nullableSetOfNullableDoubles != null
                && this.nullableSetOfNullableDoubles
                        .equals(other.nullableSetOfNullableDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableDoublesValue1("
                + nullableSetOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> nullableSetOfNullableDoubles;

    @JsonProperty("nullableSetOfNullableDoubles")
    public java.util.Set<Double> getNullableSetOfNullableDoubles() {
        return nullableSetOfNullableDoubles;
    }

    public NullableSetOfNullableDoublesValue1 setNullableSetOfNullableDoubles(
            final java.util.Set<Double> value) {
        this.nullableSetOfNullableDoubles = value;

        return this;
    }
}
