package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableDoublesValue2 implements
        java.io.Serializable {
    public NullableArrayOfNullableDoublesValue2(
            final Double[] nullableArrayOfNullableDoubles) {
        setNullableArrayOfNullableDoubles(nullableArrayOfNullableDoubles);
    }

    public NullableArrayOfNullableDoublesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 164507183;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableDoublesValue2))
            return false;
        final NullableArrayOfNullableDoublesValue2 other = (NullableArrayOfNullableDoublesValue2) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableDoubles,
                other.nullableArrayOfNullableDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableDoublesValue2("
                + nullableArrayOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Double[] nullableArrayOfNullableDoubles;

    @JsonProperty("nullableArrayOfNullableDoubles")
    public Double[] getNullableArrayOfNullableDoubles() {
        return nullableArrayOfNullableDoubles;
    }

    public NullableArrayOfNullableDoublesValue2 setNullableArrayOfNullableDoubles(
            final Double[] value) {
        this.nullableArrayOfNullableDoubles = value;

        return this;
    }
}
