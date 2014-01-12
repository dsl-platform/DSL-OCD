package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableDoublesValue5 implements
        java.io.Serializable {
    public NullableArrayOfNullableDoublesValue5(
            final Double[] nullableArrayOfNullableDoubles) {
        setNullableArrayOfNullableDoubles(nullableArrayOfNullableDoubles);
    }

    public NullableArrayOfNullableDoublesValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1757807118;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableDoublesValue5))
            return false;
        final NullableArrayOfNullableDoublesValue5 other = (NullableArrayOfNullableDoublesValue5) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableDoubles,
                other.nullableArrayOfNullableDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableDoublesValue5("
                + nullableArrayOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Double[] nullableArrayOfNullableDoubles;

    @JsonProperty("nullableArrayOfNullableDoubles")
    public Double[] getNullableArrayOfNullableDoubles() {
        return nullableArrayOfNullableDoubles;
    }

    public NullableArrayOfNullableDoublesValue5 setNullableArrayOfNullableDoubles(
            final Double[] value) {
        this.nullableArrayOfNullableDoubles = value;

        return this;
    }
}
