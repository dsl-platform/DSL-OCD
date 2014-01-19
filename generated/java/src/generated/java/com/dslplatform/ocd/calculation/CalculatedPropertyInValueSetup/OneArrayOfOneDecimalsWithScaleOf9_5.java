package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneDecimalsWithScaleOf9_5 implements
        java.io.Serializable {
    public OneArrayOfOneDecimalsWithScaleOf9_5(
            final java.math.BigDecimal[] oneArrayOfOneDecimalsWithScaleOf9,
            final java.math.BigDecimal[] calculatedOneArrayOfOneDecimalsWithScaleOf9,
            final java.math.BigDecimal[] persistedOneArrayOfOneDecimalsWithScaleOf9) {
        setOneArrayOfOneDecimalsWithScaleOf9(oneArrayOfOneDecimalsWithScaleOf9);
        this.calculatedOneArrayOfOneDecimalsWithScaleOf9 = calculatedOneArrayOfOneDecimalsWithScaleOf9;
        this.persistedOneArrayOfOneDecimalsWithScaleOf9 = persistedOneArrayOfOneDecimalsWithScaleOf9;
    }

    public OneArrayOfOneDecimalsWithScaleOf9_5() {
        this.oneArrayOfOneDecimalsWithScaleOf9 = new java.math.BigDecimal[] {};
        this.calculatedOneArrayOfOneDecimalsWithScaleOf9 = new java.math.BigDecimal[] {};
        this.persistedOneArrayOfOneDecimalsWithScaleOf9 = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1904875980;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneDecimalsWithScaleOf9_5))
            return false;
        final OneArrayOfOneDecimalsWithScaleOf9_5 other = (OneArrayOfOneDecimalsWithScaleOf9_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneArrayOfOneDecimalsWithScaleOf9,
                other.oneArrayOfOneDecimalsWithScaleOf9))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneArrayOfOneDecimalsWithScaleOf9,
                other.calculatedOneArrayOfOneDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneArrayOfOneDecimalsWithScaleOf9,
                other.persistedOneArrayOfOneDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneDecimalsWithScaleOf9_5("
                + oneArrayOfOneDecimalsWithScaleOf9 + ','
                + calculatedOneArrayOfOneDecimalsWithScaleOf9 + ','
                + persistedOneArrayOfOneDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfOneDecimalsWithScaleOf9;

    @JsonProperty("oneArrayOfOneDecimalsWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfOneDecimalsWithScaleOf9() {
        return oneArrayOfOneDecimalsWithScaleOf9;
    }

    public OneArrayOfOneDecimalsWithScaleOf9_5 setOneArrayOfOneDecimalsWithScaleOf9(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.oneArrayOfOneDecimalsWithScaleOf9 = value;

        return this;
    }

    private final java.math.BigDecimal[] calculatedOneArrayOfOneDecimalsWithScaleOf9;

    public java.math.BigDecimal[] getCalculatedOneArrayOfOneDecimalsWithScaleOf9() {
        return this.calculatedOneArrayOfOneDecimalsWithScaleOf9;
    }

    private final java.math.BigDecimal[] persistedOneArrayOfOneDecimalsWithScaleOf9;

    public java.math.BigDecimal[] getPersistedOneArrayOfOneDecimalsWithScaleOf9() {
        return this.persistedOneArrayOfOneDecimalsWithScaleOf9;
    }
}
