package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDoubles_1 implements java.io.Serializable {
    public NullableListOfOneDoubles_1(
            final java.util.List<Double> nullableListOfOneDoubles) {
        setNullableListOfOneDoubles(nullableListOfOneDoubles);
    }

    public NullableListOfOneDoubles_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 736946012;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDoubles_1)) return false;
        final NullableListOfOneDoubles_1 other = (NullableListOfOneDoubles_1) obj;

        if (!(this.nullableListOfOneDoubles == other.nullableListOfOneDoubles || this.nullableListOfOneDoubles != null
                && this.nullableListOfOneDoubles
                        .equals(other.nullableListOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDoubles_1(" + nullableListOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> nullableListOfOneDoubles;

    @JsonProperty("nullableListOfOneDoubles")
    public java.util.List<Double> getNullableListOfOneDoubles() {
        return nullableListOfOneDoubles;
    }

    public NullableListOfOneDoubles_1 setNullableListOfOneDoubles(
            final java.util.List<Double> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneDoubles = value;

        return this;
    }
}
