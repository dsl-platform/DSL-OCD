package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneDoublesValue4 implements
        java.io.Serializable {
    public NullableArrayOfOneDoublesValue4(
            final double[] nullableArrayOfOneDoubles) {
        setNullableArrayOfOneDoubles(nullableArrayOfOneDoubles);
    }

    public NullableArrayOfOneDoublesValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 663758056;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneDoublesValue4)) return false;
        final NullableArrayOfOneDoublesValue4 other = (NullableArrayOfOneDoublesValue4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneDoubles,
                other.nullableArrayOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneDoublesValue4(" + nullableArrayOfOneDoubles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double[] nullableArrayOfOneDoubles;

    @JsonProperty("nullableArrayOfOneDoubles")
    public double[] getNullableArrayOfOneDoubles() {
        return nullableArrayOfOneDoubles;
    }

    public NullableArrayOfOneDoublesValue4 setNullableArrayOfOneDoubles(
            final double[] value) {
        this.nullableArrayOfOneDoubles = value;

        return this;
    }
}
