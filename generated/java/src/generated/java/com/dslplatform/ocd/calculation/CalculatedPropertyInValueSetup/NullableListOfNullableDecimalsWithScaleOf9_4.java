package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableDecimalsWithScaleOf9_4 implements
        java.io.Serializable {
    public NullableListOfNullableDecimalsWithScaleOf9_4(
            final java.util.List<java.math.BigDecimal> nullableListOfNullableDecimalsWithScaleOf9,
            final java.util.List<java.math.BigDecimal> calculatedNullableListOfNullableDecimalsWithScaleOf9,
            final java.util.List<java.math.BigDecimal> persistedNullableListOfNullableDecimalsWithScaleOf9) {
        setNullableListOfNullableDecimalsWithScaleOf9(nullableListOfNullableDecimalsWithScaleOf9);
        this.calculatedNullableListOfNullableDecimalsWithScaleOf9 = calculatedNullableListOfNullableDecimalsWithScaleOf9;
        this.persistedNullableListOfNullableDecimalsWithScaleOf9 = persistedNullableListOfNullableDecimalsWithScaleOf9;
    }

    public NullableListOfNullableDecimalsWithScaleOf9_4() {
        this.calculatedNullableListOfNullableDecimalsWithScaleOf9 = null;
        this.persistedNullableListOfNullableDecimalsWithScaleOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 563717306;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableDecimalsWithScaleOf9_4))
            return false;
        final NullableListOfNullableDecimalsWithScaleOf9_4 other = (NullableListOfNullableDecimalsWithScaleOf9_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableListOfNullableDecimalsWithScaleOf9,
                other.nullableListOfNullableDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableListOfNullableDecimalsWithScaleOf9,
                other.calculatedNullableListOfNullableDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableListOfNullableDecimalsWithScaleOf9,
                other.persistedNullableListOfNullableDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableDecimalsWithScaleOf9_4("
                + nullableListOfNullableDecimalsWithScaleOf9 + ','
                + calculatedNullableListOfNullableDecimalsWithScaleOf9 + ','
                + persistedNullableListOfNullableDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfNullableDecimalsWithScaleOf9;

    @JsonProperty("nullableListOfNullableDecimalsWithScaleOf9")
    public java.util.List<java.math.BigDecimal> getNullableListOfNullableDecimalsWithScaleOf9() {
        return nullableListOfNullableDecimalsWithScaleOf9;
    }

    public NullableListOfNullableDecimalsWithScaleOf9_4 setNullableListOfNullableDecimalsWithScaleOf9(
            final java.util.List<java.math.BigDecimal> value) {
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.nullableListOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }

    private final java.util.List<java.math.BigDecimal> calculatedNullableListOfNullableDecimalsWithScaleOf9;

    public java.util.List<java.math.BigDecimal> getCalculatedNullableListOfNullableDecimalsWithScaleOf9() {
        return this.calculatedNullableListOfNullableDecimalsWithScaleOf9;
    }

    private final java.util.List<java.math.BigDecimal> persistedNullableListOfNullableDecimalsWithScaleOf9;

    public java.util.List<java.math.BigDecimal> getPersistedNullableListOfNullableDecimalsWithScaleOf9() {
        return this.persistedNullableListOfNullableDecimalsWithScaleOf9;
    }
}
