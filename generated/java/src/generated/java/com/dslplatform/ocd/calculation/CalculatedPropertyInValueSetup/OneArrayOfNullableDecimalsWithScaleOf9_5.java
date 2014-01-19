package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableDecimalsWithScaleOf9_5 implements
        java.io.Serializable {
    public OneArrayOfNullableDecimalsWithScaleOf9_5(
            final java.math.BigDecimal[] oneArrayOfNullableDecimalsWithScaleOf9,
            final java.math.BigDecimal[] calculatedOneArrayOfNullableDecimalsWithScaleOf9,
            final java.math.BigDecimal[] persistedOneArrayOfNullableDecimalsWithScaleOf9) {
        setOneArrayOfNullableDecimalsWithScaleOf9(oneArrayOfNullableDecimalsWithScaleOf9);
        this.calculatedOneArrayOfNullableDecimalsWithScaleOf9 = calculatedOneArrayOfNullableDecimalsWithScaleOf9;
        this.persistedOneArrayOfNullableDecimalsWithScaleOf9 = persistedOneArrayOfNullableDecimalsWithScaleOf9;
    }

    public OneArrayOfNullableDecimalsWithScaleOf9_5() {
        this.oneArrayOfNullableDecimalsWithScaleOf9 = new java.math.BigDecimal[] {};
        this.calculatedOneArrayOfNullableDecimalsWithScaleOf9 = new java.math.BigDecimal[] {};
        this.persistedOneArrayOfNullableDecimalsWithScaleOf9 = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1092540777;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableDecimalsWithScaleOf9_5))
            return false;
        final OneArrayOfNullableDecimalsWithScaleOf9_5 other = (OneArrayOfNullableDecimalsWithScaleOf9_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneArrayOfNullableDecimalsWithScaleOf9,
                other.oneArrayOfNullableDecimalsWithScaleOf9))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneArrayOfNullableDecimalsWithScaleOf9,
                other.calculatedOneArrayOfNullableDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneArrayOfNullableDecimalsWithScaleOf9,
                other.persistedOneArrayOfNullableDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableDecimalsWithScaleOf9_5("
                + oneArrayOfNullableDecimalsWithScaleOf9 + ','
                + calculatedOneArrayOfNullableDecimalsWithScaleOf9 + ','
                + persistedOneArrayOfNullableDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfNullableDecimalsWithScaleOf9;

    @JsonProperty("oneArrayOfNullableDecimalsWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfNullableDecimalsWithScaleOf9() {
        return oneArrayOfNullableDecimalsWithScaleOf9;
    }

    public OneArrayOfNullableDecimalsWithScaleOf9_5 setOneArrayOfNullableDecimalsWithScaleOf9(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.oneArrayOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }

    private final java.math.BigDecimal[] calculatedOneArrayOfNullableDecimalsWithScaleOf9;

    public java.math.BigDecimal[] getCalculatedOneArrayOfNullableDecimalsWithScaleOf9() {
        return this.calculatedOneArrayOfNullableDecimalsWithScaleOf9;
    }

    private final java.math.BigDecimal[] persistedOneArrayOfNullableDecimalsWithScaleOf9;

    public java.math.BigDecimal[] getPersistedOneArrayOfNullableDecimalsWithScaleOf9() {
        return this.persistedOneArrayOfNullableDecimalsWithScaleOf9;
    }
}
