package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableDecimalsValue3 implements
        java.io.Serializable {
    public OneArrayOfNullableDecimalsValue3(
            final java.math.BigDecimal[] oneArrayOfNullableDecimals) {
        setOneArrayOfNullableDecimals(oneArrayOfNullableDecimals);
    }

    public OneArrayOfNullableDecimalsValue3() {
        this.oneArrayOfNullableDecimals = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1203402661;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableDecimalsValue3)) return false;
        final OneArrayOfNullableDecimalsValue3 other = (OneArrayOfNullableDecimalsValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneArrayOfNullableDecimals,
                other.oneArrayOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableDecimalsValue3(" + oneArrayOfNullableDecimals
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfNullableDecimals;

    @JsonProperty("oneArrayOfNullableDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfNullableDecimals() {
        return oneArrayOfNullableDecimals;
    }

    public OneArrayOfNullableDecimalsValue3 setOneArrayOfNullableDecimals(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDecimals\" cannot be null!");
        this.oneArrayOfNullableDecimals = value;

        return this;
    }
}
