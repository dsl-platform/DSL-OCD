package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableDecimalWithScaleOf9_4 implements
        java.io.Serializable {
    public NullableDecimalWithScaleOf9_4(
            final java.math.BigDecimal nullableDecimalWithScaleOf9,
            final java.math.BigDecimal calculatedNullableDecimalWithScaleOf9,
            final java.math.BigDecimal persistedNullableDecimalWithScaleOf9) {
        setNullableDecimalWithScaleOf9(nullableDecimalWithScaleOf9);
        this.calculatedNullableDecimalWithScaleOf9 = calculatedNullableDecimalWithScaleOf9;
        this.persistedNullableDecimalWithScaleOf9 = persistedNullableDecimalWithScaleOf9;
    }

    public NullableDecimalWithScaleOf9_4() {
        this.calculatedNullableDecimalWithScaleOf9 = null;
        this.persistedNullableDecimalWithScaleOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 679386521;
        result = prime * result + (0);
        result = prime * result + (0);
        result = prime * result + (0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableDecimalWithScaleOf9_4)) return false;
        final NullableDecimalWithScaleOf9_4 other = (NullableDecimalWithScaleOf9_4) obj;

        if (!(this.nullableDecimalWithScaleOf9 == other.nullableDecimalWithScaleOf9 || this.nullableDecimalWithScaleOf9 != null
                && this.nullableDecimalWithScaleOf9
                        .compareTo(other.nullableDecimalWithScaleOf9) == 0))
            return false;
        if (!(this.calculatedNullableDecimalWithScaleOf9 == other.calculatedNullableDecimalWithScaleOf9 || this.calculatedNullableDecimalWithScaleOf9 != null
                && this.calculatedNullableDecimalWithScaleOf9
                        .compareTo(other.calculatedNullableDecimalWithScaleOf9) == 0))
            return false;
        if (!(this.persistedNullableDecimalWithScaleOf9 == other.persistedNullableDecimalWithScaleOf9 || this.persistedNullableDecimalWithScaleOf9 != null
                && this.persistedNullableDecimalWithScaleOf9
                        .compareTo(other.persistedNullableDecimalWithScaleOf9) == 0))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableDecimalWithScaleOf9_4(" + nullableDecimalWithScaleOf9
                + ',' + calculatedNullableDecimalWithScaleOf9 + ','
                + persistedNullableDecimalWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal nullableDecimalWithScaleOf9;

    @JsonProperty("nullableDecimalWithScaleOf9")
    public java.math.BigDecimal getNullableDecimalWithScaleOf9() {
        return nullableDecimalWithScaleOf9;
    }

    public NullableDecimalWithScaleOf9_4 setNullableDecimalWithScaleOf9(
            final java.math.BigDecimal value) {
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.nullableDecimalWithScaleOf9 = value;

        return this;
    }

    private final java.math.BigDecimal calculatedNullableDecimalWithScaleOf9;

    public java.math.BigDecimal getCalculatedNullableDecimalWithScaleOf9() {
        return this.calculatedNullableDecimalWithScaleOf9;
    }

    private final java.math.BigDecimal persistedNullableDecimalWithScaleOf9;

    public java.math.BigDecimal getPersistedNullableDecimalWithScaleOf9() {
        return this.persistedNullableDecimalWithScaleOf9;
    }
}
