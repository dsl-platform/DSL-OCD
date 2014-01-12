package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableDecimalsWithScaleOf9Value4 implements
        java.io.Serializable {
    public OneArrayOfNullableDecimalsWithScaleOf9Value4(
            final java.math.BigDecimal[] oneArrayOfNullableDecimalsWithScaleOf9) {
        setOneArrayOfNullableDecimalsWithScaleOf9(oneArrayOfNullableDecimalsWithScaleOf9);
    }

    public OneArrayOfNullableDecimalsWithScaleOf9Value4() {
        this.oneArrayOfNullableDecimalsWithScaleOf9 = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1810885998;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableDecimalsWithScaleOf9Value4))
            return false;
        final OneArrayOfNullableDecimalsWithScaleOf9Value4 other = (OneArrayOfNullableDecimalsWithScaleOf9Value4) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneArrayOfNullableDecimalsWithScaleOf9,
                other.oneArrayOfNullableDecimalsWithScaleOf9))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableDecimalsWithScaleOf9Value4("
                + oneArrayOfNullableDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfNullableDecimalsWithScaleOf9;

    @JsonProperty("oneArrayOfNullableDecimalsWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfNullableDecimalsWithScaleOf9() {
        return oneArrayOfNullableDecimalsWithScaleOf9;
    }

    public OneArrayOfNullableDecimalsWithScaleOf9Value4 setOneArrayOfNullableDecimalsWithScaleOf9(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkScale(value, 9);
        this.oneArrayOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }
}
