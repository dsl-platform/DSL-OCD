package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableDecimalsValue5 implements
        java.io.Serializable {
    public OneArrayOfNullableDecimalsValue5(
            final java.math.BigDecimal[] oneArrayOfNullableDecimals) {
        setOneArrayOfNullableDecimals(oneArrayOfNullableDecimals);
    }

    public OneArrayOfNullableDecimalsValue5() {
        this.oneArrayOfNullableDecimals = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2009971715;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableDecimalsValue5)) return false;
        final OneArrayOfNullableDecimalsValue5 other = (OneArrayOfNullableDecimalsValue5) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneArrayOfNullableDecimals,
                other.oneArrayOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableDecimalsValue5(" + oneArrayOfNullableDecimals
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfNullableDecimals;

    @JsonProperty("oneArrayOfNullableDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfNullableDecimals() {
        return oneArrayOfNullableDecimals;
    }

    public OneArrayOfNullableDecimalsValue5 setOneArrayOfNullableDecimals(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDecimals\" cannot be null!");
        this.oneArrayOfNullableDecimals = value;

        return this;
    }
}
