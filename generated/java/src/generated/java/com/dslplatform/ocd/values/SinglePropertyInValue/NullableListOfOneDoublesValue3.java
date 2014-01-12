package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDoublesValue3 implements
        java.io.Serializable {
    public NullableListOfOneDoublesValue3(
            final java.util.List<Double> nullableListOfOneDoubles) {
        setNullableListOfOneDoubles(nullableListOfOneDoubles);
    }

    public NullableListOfOneDoublesValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1331340022;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDoublesValue3)) return false;
        final NullableListOfOneDoublesValue3 other = (NullableListOfOneDoublesValue3) obj;

        if (!(this.nullableListOfOneDoubles == other.nullableListOfOneDoubles || this.nullableListOfOneDoubles != null
                && this.nullableListOfOneDoubles
                        .equals(other.nullableListOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDoublesValue3(" + nullableListOfOneDoubles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> nullableListOfOneDoubles;

    @JsonProperty("nullableListOfOneDoubles")
    public java.util.List<Double> getNullableListOfOneDoubles() {
        return nullableListOfOneDoubles;
    }

    public NullableListOfOneDoublesValue3 setNullableListOfOneDoubles(
            final java.util.List<Double> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneDoubles = value;

        return this;
    }
}
