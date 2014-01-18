package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableDoubles_1 implements
        java.io.Serializable {
    public NullableListOfNullableDoubles_1(
            final java.util.List<Double> nullableListOfNullableDoubles) {
        setNullableListOfNullableDoubles(nullableListOfNullableDoubles);
    }

    public NullableListOfNullableDoubles_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1641698409;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableDoubles_1)) return false;
        final NullableListOfNullableDoubles_1 other = (NullableListOfNullableDoubles_1) obj;

        if (!(this.nullableListOfNullableDoubles == other.nullableListOfNullableDoubles || this.nullableListOfNullableDoubles != null
                && this.nullableListOfNullableDoubles
                        .equals(other.nullableListOfNullableDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableDoubles_1("
                + nullableListOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> nullableListOfNullableDoubles;

    @JsonProperty("nullableListOfNullableDoubles")
    public java.util.List<Double> getNullableListOfNullableDoubles() {
        return nullableListOfNullableDoubles;
    }

    public NullableListOfNullableDoubles_1 setNullableListOfNullableDoubles(
            final java.util.List<Double> value) {
        this.nullableListOfNullableDoubles = value;

        return this;
    }
}
