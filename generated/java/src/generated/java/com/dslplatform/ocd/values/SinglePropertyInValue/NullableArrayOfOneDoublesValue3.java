package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneDoublesValue3 implements
        java.io.Serializable {
    public NullableArrayOfOneDoublesValue3(
            final double[] nullableArrayOfOneDoubles) {
        setNullableArrayOfOneDoubles(nullableArrayOfOneDoubles);
    }

    public NullableArrayOfOneDoublesValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 663758051;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneDoublesValue3)) return false;
        final NullableArrayOfOneDoublesValue3 other = (NullableArrayOfOneDoublesValue3) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneDoubles,
                other.nullableArrayOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneDoublesValue3(" + nullableArrayOfOneDoubles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double[] nullableArrayOfOneDoubles;

    @JsonProperty("nullableArrayOfOneDoubles")
    public double[] getNullableArrayOfOneDoubles() {
        return nullableArrayOfOneDoubles;
    }

    public NullableArrayOfOneDoublesValue3 setNullableArrayOfOneDoubles(
            final double[] value) {
        this.nullableArrayOfOneDoubles = value;

        return this;
    }
}
