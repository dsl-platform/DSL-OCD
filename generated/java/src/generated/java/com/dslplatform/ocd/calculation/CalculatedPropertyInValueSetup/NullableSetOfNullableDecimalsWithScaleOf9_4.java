package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableDecimalsWithScaleOf9_4 implements
        java.io.Serializable {
    public NullableSetOfNullableDecimalsWithScaleOf9_4(
            final java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimalsWithScaleOf9,
            final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfNullableDecimalsWithScaleOf9,
            final java.util.Set<java.math.BigDecimal> persistedNullableSetOfNullableDecimalsWithScaleOf9) {
        setNullableSetOfNullableDecimalsWithScaleOf9(nullableSetOfNullableDecimalsWithScaleOf9);
        this.calculatedNullableSetOfNullableDecimalsWithScaleOf9 = calculatedNullableSetOfNullableDecimalsWithScaleOf9;
        this.persistedNullableSetOfNullableDecimalsWithScaleOf9 = persistedNullableSetOfNullableDecimalsWithScaleOf9;
    }

    public NullableSetOfNullableDecimalsWithScaleOf9_4() {
        this.calculatedNullableSetOfNullableDecimalsWithScaleOf9 = null;
        this.persistedNullableSetOfNullableDecimalsWithScaleOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1211996400;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableDecimalsWithScaleOf9_4))
            return false;
        final NullableSetOfNullableDecimalsWithScaleOf9_4 other = (NullableSetOfNullableDecimalsWithScaleOf9_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableSetOfNullableDecimalsWithScaleOf9,
                other.nullableSetOfNullableDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableSetOfNullableDecimalsWithScaleOf9,
                other.calculatedNullableSetOfNullableDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableSetOfNullableDecimalsWithScaleOf9,
                other.persistedNullableSetOfNullableDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableDecimalsWithScaleOf9_4("
                + nullableSetOfNullableDecimalsWithScaleOf9 + ','
                + calculatedNullableSetOfNullableDecimalsWithScaleOf9 + ','
                + persistedNullableSetOfNullableDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimalsWithScaleOf9;

    @JsonProperty("nullableSetOfNullableDecimalsWithScaleOf9")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfNullableDecimalsWithScaleOf9() {
        return nullableSetOfNullableDecimalsWithScaleOf9;
    }

    public NullableSetOfNullableDecimalsWithScaleOf9_4 setNullableSetOfNullableDecimalsWithScaleOf9(
            final java.util.Set<java.math.BigDecimal> value) {
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.nullableSetOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }

    private final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfNullableDecimalsWithScaleOf9;

    public java.util.Set<java.math.BigDecimal> getCalculatedNullableSetOfNullableDecimalsWithScaleOf9() {
        return this.calculatedNullableSetOfNullableDecimalsWithScaleOf9;
    }

    private final java.util.Set<java.math.BigDecimal> persistedNullableSetOfNullableDecimalsWithScaleOf9;

    public java.util.Set<java.math.BigDecimal> getPersistedNullableSetOfNullableDecimalsWithScaleOf9() {
        return this.persistedNullableSetOfNullableDecimalsWithScaleOf9;
    }
}
