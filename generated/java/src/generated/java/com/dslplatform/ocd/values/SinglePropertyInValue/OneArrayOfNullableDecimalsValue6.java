package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableDecimalsValue6 implements
        java.io.Serializable {
    public OneArrayOfNullableDecimalsValue6(
            final java.math.BigDecimal[] oneArrayOfNullableDecimals) {
        setOneArrayOfNullableDecimals(oneArrayOfNullableDecimals);
    }

    public OneArrayOfNullableDecimalsValue6() {
        this.oneArrayOfNullableDecimals = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 443887774;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableDecimalsValue6)) return false;
        final OneArrayOfNullableDecimalsValue6 other = (OneArrayOfNullableDecimalsValue6) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneArrayOfNullableDecimals,
                other.oneArrayOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableDecimalsValue6(" + oneArrayOfNullableDecimals
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfNullableDecimals;

    @JsonProperty("oneArrayOfNullableDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfNullableDecimals() {
        return oneArrayOfNullableDecimals;
    }

    public OneArrayOfNullableDecimalsValue6 setOneArrayOfNullableDecimals(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDecimals\" cannot be null!");
        this.oneArrayOfNullableDecimals = value;

        return this;
    }
}
