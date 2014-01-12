package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableDoublesValue2 implements
        java.io.Serializable {
    public NullableSetOfNullableDoublesValue2(
            final java.util.Set<Double> nullableSetOfNullableDoubles) {
        setNullableSetOfNullableDoubles(nullableSetOfNullableDoubles);
    }

    public NullableSetOfNullableDoublesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1335502512;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableDoublesValue2)) return false;
        final NullableSetOfNullableDoublesValue2 other = (NullableSetOfNullableDoublesValue2) obj;

        if (!(this.nullableSetOfNullableDoubles == other.nullableSetOfNullableDoubles || this.nullableSetOfNullableDoubles != null
                && this.nullableSetOfNullableDoubles
                        .equals(other.nullableSetOfNullableDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableDoublesValue2("
                + nullableSetOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> nullableSetOfNullableDoubles;

    @JsonProperty("nullableSetOfNullableDoubles")
    public java.util.Set<Double> getNullableSetOfNullableDoubles() {
        return nullableSetOfNullableDoubles;
    }

    public NullableSetOfNullableDoublesValue2 setNullableSetOfNullableDoubles(
            final java.util.Set<Double> value) {
        this.nullableSetOfNullableDoubles = value;

        return this;
    }
}
