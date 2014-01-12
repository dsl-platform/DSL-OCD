package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneDoublesValue1 implements
        java.io.Serializable {
    public NullableSetOfOneDoublesValue1(
            final java.util.Set<Double> nullableSetOfOneDoubles) {
        setNullableSetOfOneDoubles(nullableSetOfOneDoubles);
    }

    public NullableSetOfOneDoublesValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1830358922;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneDoublesValue1)) return false;
        final NullableSetOfOneDoublesValue1 other = (NullableSetOfOneDoublesValue1) obj;

        if (!(this.nullableSetOfOneDoubles == other.nullableSetOfOneDoubles || this.nullableSetOfOneDoubles != null
                && this.nullableSetOfOneDoubles
                        .equals(other.nullableSetOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneDoublesValue1(" + nullableSetOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> nullableSetOfOneDoubles;

    @JsonProperty("nullableSetOfOneDoubles")
    public java.util.Set<Double> getNullableSetOfOneDoubles() {
        return nullableSetOfOneDoubles;
    }

    public NullableSetOfOneDoublesValue1 setNullableSetOfOneDoubles(
            final java.util.Set<Double> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneDoubles = value;

        return this;
    }
}
