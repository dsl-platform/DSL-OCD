package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableDecimalsWithScaleOf9_5 implements
        java.io.Serializable {
    public OneSetOfNullableDecimalsWithScaleOf9_5(
            final java.util.Set<java.math.BigDecimal> oneSetOfNullableDecimalsWithScaleOf9,
            final java.util.Set<java.math.BigDecimal> calculatedOneSetOfNullableDecimalsWithScaleOf9,
            final java.util.Set<java.math.BigDecimal> persistedOneSetOfNullableDecimalsWithScaleOf9) {
        setOneSetOfNullableDecimalsWithScaleOf9(oneSetOfNullableDecimalsWithScaleOf9);
        this.calculatedOneSetOfNullableDecimalsWithScaleOf9 = calculatedOneSetOfNullableDecimalsWithScaleOf9;
        this.persistedOneSetOfNullableDecimalsWithScaleOf9 = persistedOneSetOfNullableDecimalsWithScaleOf9;
    }

    public OneSetOfNullableDecimalsWithScaleOf9_5() {
        this.oneSetOfNullableDecimalsWithScaleOf9 = new java.util.HashSet<java.math.BigDecimal>();
        this.calculatedOneSetOfNullableDecimalsWithScaleOf9 = new java.util.HashSet<java.math.BigDecimal>();
        this.persistedOneSetOfNullableDecimalsWithScaleOf9 = new java.util.HashSet<java.math.BigDecimal>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1244027644;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableDecimalsWithScaleOf9_5))
            return false;
        final OneSetOfNullableDecimalsWithScaleOf9_5 other = (OneSetOfNullableDecimalsWithScaleOf9_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneSetOfNullableDecimalsWithScaleOf9,
                other.oneSetOfNullableDecimalsWithScaleOf9))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneSetOfNullableDecimalsWithScaleOf9,
                other.calculatedOneSetOfNullableDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneSetOfNullableDecimalsWithScaleOf9,
                other.persistedOneSetOfNullableDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableDecimalsWithScaleOf9_5("
                + oneSetOfNullableDecimalsWithScaleOf9 + ','
                + calculatedOneSetOfNullableDecimalsWithScaleOf9 + ','
                + persistedOneSetOfNullableDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> oneSetOfNullableDecimalsWithScaleOf9;

    @JsonProperty("oneSetOfNullableDecimalsWithScaleOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.math.BigDecimal> getOneSetOfNullableDecimalsWithScaleOf9() {
        return oneSetOfNullableDecimalsWithScaleOf9;
    }

    public OneSetOfNullableDecimalsWithScaleOf9_5 setOneSetOfNullableDecimalsWithScaleOf9(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableDecimalsWithScaleOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.oneSetOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }

    private final java.util.Set<java.math.BigDecimal> calculatedOneSetOfNullableDecimalsWithScaleOf9;

    public java.util.Set<java.math.BigDecimal> getCalculatedOneSetOfNullableDecimalsWithScaleOf9() {
        return this.calculatedOneSetOfNullableDecimalsWithScaleOf9;
    }

    private final java.util.Set<java.math.BigDecimal> persistedOneSetOfNullableDecimalsWithScaleOf9;

    public java.util.Set<java.math.BigDecimal> getPersistedOneSetOfNullableDecimalsWithScaleOf9() {
        return this.persistedOneSetOfNullableDecimalsWithScaleOf9;
    }
}
