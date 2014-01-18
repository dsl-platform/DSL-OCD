package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneDoubles_1 implements java.io.Serializable {
    public NullableArrayOfOneDoubles_1(
            final double[] nullableArrayOfOneDoubles) {
        setNullableArrayOfOneDoubles(nullableArrayOfOneDoubles);
    }

    public NullableArrayOfOneDoubles_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 383886809;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneDoubles_1)) return false;
        final NullableArrayOfOneDoubles_1 other = (NullableArrayOfOneDoubles_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneDoubles,
                other.nullableArrayOfOneDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneDoubles_1(" + nullableArrayOfOneDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private double[] nullableArrayOfOneDoubles;

    @JsonProperty("nullableArrayOfOneDoubles")
    public double[] getNullableArrayOfOneDoubles() {
        return nullableArrayOfOneDoubles;
    }

    public NullableArrayOfOneDoubles_1 setNullableArrayOfOneDoubles(
            final double[] value) {
        this.nullableArrayOfOneDoubles = value;

        return this;
    }
}
