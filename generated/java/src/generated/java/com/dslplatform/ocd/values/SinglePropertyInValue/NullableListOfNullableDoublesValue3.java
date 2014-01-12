package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableDoublesValue3 implements
        java.io.Serializable {
    public NullableListOfNullableDoublesValue3(
            final java.util.List<Double> nullableListOfNullableDoubles) {
        setNullableListOfNullableDoubles(nullableListOfNullableDoubles);
    }

    public NullableListOfNullableDoublesValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1435965559;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableDoublesValue3))
            return false;
        final NullableListOfNullableDoublesValue3 other = (NullableListOfNullableDoublesValue3) obj;

        if (!(this.nullableListOfNullableDoubles == other.nullableListOfNullableDoubles || this.nullableListOfNullableDoubles != null
                && this.nullableListOfNullableDoubles
                        .equals(other.nullableListOfNullableDoubles)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableDoublesValue3("
                + nullableListOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> nullableListOfNullableDoubles;

    @JsonProperty("nullableListOfNullableDoubles")
    public java.util.List<Double> getNullableListOfNullableDoubles() {
        return nullableListOfNullableDoubles;
    }

    public NullableListOfNullableDoublesValue3 setNullableListOfNullableDoubles(
            final java.util.List<Double> value) {
        this.nullableListOfNullableDoubles = value;

        return this;
    }
}
