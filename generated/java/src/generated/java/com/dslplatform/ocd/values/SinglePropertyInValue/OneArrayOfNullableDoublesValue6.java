package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableDoublesValue6 implements
        java.io.Serializable {
    public OneArrayOfNullableDoublesValue6(
            final Double[] oneArrayOfNullableDoubles) {
        setOneArrayOfNullableDoubles(oneArrayOfNullableDoubles);
    }

    public OneArrayOfNullableDoublesValue6() {
        this.oneArrayOfNullableDoubles = new Double[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 946810154;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableDoublesValue6)) return false;
        final OneArrayOfNullableDoublesValue6 other = (OneArrayOfNullableDoublesValue6) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableDoubles,
                other.oneArrayOfNullableDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableDoublesValue6(" + oneArrayOfNullableDoubles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Double[] oneArrayOfNullableDoubles;

    @JsonProperty("oneArrayOfNullableDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Double[] getOneArrayOfNullableDoubles() {
        return oneArrayOfNullableDoubles;
    }

    public OneArrayOfNullableDoublesValue6 setOneArrayOfNullableDoubles(
            final Double[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDoubles\" cannot be null!");
        this.oneArrayOfNullableDoubles = value;

        return this;
    }
}
