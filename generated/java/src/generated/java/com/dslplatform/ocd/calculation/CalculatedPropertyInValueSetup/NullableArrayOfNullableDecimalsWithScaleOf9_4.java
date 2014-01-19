package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableDecimalsWithScaleOf9_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableDecimalsWithScaleOf9_4(
            final java.math.BigDecimal[] nullableArrayOfNullableDecimalsWithScaleOf9,
            final java.math.BigDecimal[] calculatedNullableArrayOfNullableDecimalsWithScaleOf9,
            final java.math.BigDecimal[] persistedNullableArrayOfNullableDecimalsWithScaleOf9) {
        setNullableArrayOfNullableDecimalsWithScaleOf9(nullableArrayOfNullableDecimalsWithScaleOf9);
        this.calculatedNullableArrayOfNullableDecimalsWithScaleOf9 = calculatedNullableArrayOfNullableDecimalsWithScaleOf9;
        this.persistedNullableArrayOfNullableDecimalsWithScaleOf9 = persistedNullableArrayOfNullableDecimalsWithScaleOf9;
    }

    public NullableArrayOfNullableDecimalsWithScaleOf9_4() {
        this.calculatedNullableArrayOfNullableDecimalsWithScaleOf9 = null;
        this.persistedNullableArrayOfNullableDecimalsWithScaleOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 503940007;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableDecimalsWithScaleOf9_4))
            return false;
        final NullableArrayOfNullableDecimalsWithScaleOf9_4 other = (NullableArrayOfNullableDecimalsWithScaleOf9_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableArrayOfNullableDecimalsWithScaleOf9,
                other.nullableArrayOfNullableDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableArrayOfNullableDecimalsWithScaleOf9,
                other.calculatedNullableArrayOfNullableDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableArrayOfNullableDecimalsWithScaleOf9,
                other.persistedNullableArrayOfNullableDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableDecimalsWithScaleOf9_4("
                + nullableArrayOfNullableDecimalsWithScaleOf9 + ','
                + calculatedNullableArrayOfNullableDecimalsWithScaleOf9 + ','
                + persistedNullableArrayOfNullableDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] nullableArrayOfNullableDecimalsWithScaleOf9;

    @JsonProperty("nullableArrayOfNullableDecimalsWithScaleOf9")
    public java.math.BigDecimal[] getNullableArrayOfNullableDecimalsWithScaleOf9() {
        return nullableArrayOfNullableDecimalsWithScaleOf9;
    }

    public NullableArrayOfNullableDecimalsWithScaleOf9_4 setNullableArrayOfNullableDecimalsWithScaleOf9(
            final java.math.BigDecimal[] value) {
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.nullableArrayOfNullableDecimalsWithScaleOf9 = value;

        return this;
    }

    private final java.math.BigDecimal[] calculatedNullableArrayOfNullableDecimalsWithScaleOf9;

    public java.math.BigDecimal[] getCalculatedNullableArrayOfNullableDecimalsWithScaleOf9() {
        return this.calculatedNullableArrayOfNullableDecimalsWithScaleOf9;
    }

    private final java.math.BigDecimal[] persistedNullableArrayOfNullableDecimalsWithScaleOf9;

    public java.math.BigDecimal[] getPersistedNullableArrayOfNullableDecimalsWithScaleOf9() {
        return this.persistedNullableArrayOfNullableDecimalsWithScaleOf9;
    }
}
