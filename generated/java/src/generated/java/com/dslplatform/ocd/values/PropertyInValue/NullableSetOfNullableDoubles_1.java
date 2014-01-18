package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableDoubles_1 implements
        java.io.Serializable {
    public NullableSetOfNullableDoubles_1(
            final java.util.Set<Double> nullableSetOfNullableDoubles) {
        setNullableSetOfNullableDoubles(nullableSetOfNullableDoubles);
    }

    public NullableSetOfNullableDoubles_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 524226887;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableDoubles_1)) return false;
        final NullableSetOfNullableDoubles_1 other = (NullableSetOfNullableDoubles_1) obj;

        if (!(this.nullableSetOfNullableDoubles == other.nullableSetOfNullableDoubles || this.nullableSetOfNullableDoubles != null
                && this.nullableSetOfNullableDoubles
                        .equals(other.nullableSetOfNullableDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableDoubles_1(" + nullableSetOfNullableDoubles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> nullableSetOfNullableDoubles;

    @JsonProperty("nullableSetOfNullableDoubles")
    public java.util.Set<Double> getNullableSetOfNullableDoubles() {
        return nullableSetOfNullableDoubles;
    }

    public NullableSetOfNullableDoubles_1 setNullableSetOfNullableDoubles(
            final java.util.Set<Double> value) {
        this.nullableSetOfNullableDoubles = value;

        return this;
    }
}
