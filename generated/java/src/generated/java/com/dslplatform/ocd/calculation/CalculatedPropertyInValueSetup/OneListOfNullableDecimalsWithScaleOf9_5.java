package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableDecimalsWithScaleOf9_5 implements
        java.io.Serializable {
    public OneListOfNullableDecimalsWithScaleOf9_5(
            final java.util.List<java.math.BigDecimal> oneListOfNullableDecimalsWithScaleOf9,
            final java.util.List<java.math.BigDecimal> calculatedOneListOfNullableDecimalsWithScaleOf9,
            final java.util.List<java.math.BigDecimal> persistedOneListOfNullableDecimalsWithScaleOf9) {
        setOneListOfNullableDecimalsWithScaleOf9(oneListOfNullableDecimalsWithScaleOf9);
        this.calculatedOneListOfNullableDecimalsWithScaleOf9 = calculatedOneListOfNullableDecimalsWithScaleOf9;
        this.persistedOneListOfNullableDecimalsWithScaleOf9 = persistedOneListOfNullableDecimalsWithScaleOf9;
    }

    public OneListOfNullableDecimalsWithScaleOf9_5() {
        this.oneListOfNullableDecimalsWithScaleOf9 = new java.util.ArrayList<java.math.BigDecimal>();
        this.calculatedOneListOfNullableDecimalsWithScaleOf9 = new java.util.ArrayList<java.math.BigDecimal>();
        this.persistedOneListOfNullableDecimalsWithScaleOf9 = new java.util.ArrayList<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1152504044;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableDecimalsWithScaleOf9_5))
            return false;
        final OneListOfNullableDecimalsWithScaleOf9_5 other = (OneListOfNullableDecimalsWithScaleOf9_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneListOfNullableDecimalsWithScaleOf9,
                other.oneListOfNullableDecimalsWithScaleOf9))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneListOfNullableDecimalsWithScaleOf9,
                other.calculatedOneListOfNullableDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneListOfNullableDecimalsWithScaleOf9,
                other.persistedOneListOfNullableDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableDecimalsWithScaleOf9_5("
                + oneListOfNullableDecimalsWithScaleOf9 + ','
                + calculatedOneListOfNullableDecimalsWithScaleOf9 + ','
                + persistedOneListOfNullableDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> oneListOfNullableDecimalsWithScaleOf9;

    @JsonProperty("oneListOfNullableDecimalsWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.math.BigDecimal> getOneListOfNullableDecimalsWithScaleOf9() {
        return oneListOfNullableDecimalsWithScaleOf9;
    }

    public OneListOfNullableDecimalsWithScaleOf9_5 setOneListOfNullableDecimalsWithScaleOf9(
            final java.util.List<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.oneListOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }

    private final java.util.List<java.math.BigDecimal> calculatedOneListOfNullableDecimalsWithScaleOf9;

    public java.util.List<java.math.BigDecimal> getCalculatedOneListOfNullableDecimalsWithScaleOf9() {
        return this.calculatedOneListOfNullableDecimalsWithScaleOf9;
    }

    private final java.util.List<java.math.BigDecimal> persistedOneListOfNullableDecimalsWithScaleOf9;

    public java.util.List<java.math.BigDecimal> getPersistedOneListOfNullableDecimalsWithScaleOf9() {
        return this.persistedOneListOfNullableDecimalsWithScaleOf9;
    }
}
