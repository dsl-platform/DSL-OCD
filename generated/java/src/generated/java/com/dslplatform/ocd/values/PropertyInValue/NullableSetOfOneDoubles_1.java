package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneDoubles_1 implements java.io.Serializable {
    public NullableSetOfOneDoubles_1(
            final java.util.Set<Double> nullableSetOfOneDoubles) {
        setNullableSetOfOneDoubles(nullableSetOfOneDoubles);
    }

    public NullableSetOfOneDoubles_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 959485622;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneDoubles_1)) return false;
        final NullableSetOfOneDoubles_1 other = (NullableSetOfOneDoubles_1) obj;

        if (!(this.nullableSetOfOneDoubles == other.nullableSetOfOneDoubles || this.nullableSetOfOneDoubles != null
                && this.nullableSetOfOneDoubles
                        .equals(other.nullableSetOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneDoubles_1(" + nullableSetOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Double> nullableSetOfOneDoubles;

    @JsonProperty("nullableSetOfOneDoubles")
    public java.util.Set<Double> getNullableSetOfOneDoubles() {
        return nullableSetOfOneDoubles;
    }

    public NullableSetOfOneDoubles_1 setNullableSetOfOneDoubles(
            final java.util.Set<Double> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneDoubles = value;

        return this;
    }
}
