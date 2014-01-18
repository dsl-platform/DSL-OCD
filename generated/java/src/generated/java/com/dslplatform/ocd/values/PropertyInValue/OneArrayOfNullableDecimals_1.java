package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableDecimals_1 implements java.io.Serializable {
    public OneArrayOfNullableDecimals_1(
            final java.math.BigDecimal[] oneArrayOfNullableDecimals) {
        setOneArrayOfNullableDecimals(oneArrayOfNullableDecimals);
    }

    public OneArrayOfNullableDecimals_1() {
        this.oneArrayOfNullableDecimals = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 441313651;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableDecimals_1)) return false;
        final OneArrayOfNullableDecimals_1 other = (OneArrayOfNullableDecimals_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneArrayOfNullableDecimals,
                other.oneArrayOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableDecimals_1(" + oneArrayOfNullableDecimals
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfNullableDecimals;

    @JsonProperty("oneArrayOfNullableDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfNullableDecimals() {
        return oneArrayOfNullableDecimals;
    }

    public OneArrayOfNullableDecimals_1 setOneArrayOfNullableDecimals(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDecimals\" cannot be null!");
        this.oneArrayOfNullableDecimals = value;

        return this;
    }
}
