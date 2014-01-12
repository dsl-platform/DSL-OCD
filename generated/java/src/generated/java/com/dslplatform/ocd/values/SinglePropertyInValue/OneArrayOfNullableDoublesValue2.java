package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableDoublesValue2 implements
        java.io.Serializable {
    public OneArrayOfNullableDoublesValue2(
            final Double[] oneArrayOfNullableDoubles) {
        setOneArrayOfNullableDoubles(oneArrayOfNullableDoubles);
    }

    public OneArrayOfNullableDoublesValue2() {
        this.oneArrayOfNullableDoubles = new Double[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 946810150;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableDoublesValue2)) return false;
        final OneArrayOfNullableDoublesValue2 other = (OneArrayOfNullableDoublesValue2) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableDoubles,
                other.oneArrayOfNullableDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableDoublesValue2(" + oneArrayOfNullableDoubles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Double[] oneArrayOfNullableDoubles;

    @JsonProperty("oneArrayOfNullableDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Double[] getOneArrayOfNullableDoubles() {
        return oneArrayOfNullableDoubles;
    }

    public OneArrayOfNullableDoublesValue2 setOneArrayOfNullableDoubles(
            final Double[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDoubles\" cannot be null!");
        this.oneArrayOfNullableDoubles = value;

        return this;
    }
}
