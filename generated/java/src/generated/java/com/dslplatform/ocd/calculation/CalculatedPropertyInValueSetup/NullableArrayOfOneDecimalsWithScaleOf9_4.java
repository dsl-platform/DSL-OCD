package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneDecimalsWithScaleOf9_4 implements
        java.io.Serializable {
    public NullableArrayOfOneDecimalsWithScaleOf9_4(
            final java.math.BigDecimal[] nullableArrayOfOneDecimalsWithScaleOf9,
            final java.math.BigDecimal[] calculatedNullableArrayOfOneDecimalsWithScaleOf9,
            final java.math.BigDecimal[] persistedNullableArrayOfOneDecimalsWithScaleOf9) {
        setNullableArrayOfOneDecimalsWithScaleOf9(nullableArrayOfOneDecimalsWithScaleOf9);
        this.calculatedNullableArrayOfOneDecimalsWithScaleOf9 = calculatedNullableArrayOfOneDecimalsWithScaleOf9;
        this.persistedNullableArrayOfOneDecimalsWithScaleOf9 = persistedNullableArrayOfOneDecimalsWithScaleOf9;
    }

    public NullableArrayOfOneDecimalsWithScaleOf9_4() {
        this.calculatedNullableArrayOfOneDecimalsWithScaleOf9 = null;
        this.persistedNullableArrayOfOneDecimalsWithScaleOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1094933694;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneDecimalsWithScaleOf9_4))
            return false;
        final NullableArrayOfOneDecimalsWithScaleOf9_4 other = (NullableArrayOfOneDecimalsWithScaleOf9_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableArrayOfOneDecimalsWithScaleOf9,
                other.nullableArrayOfOneDecimalsWithScaleOf9))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableArrayOfOneDecimalsWithScaleOf9,
                other.calculatedNullableArrayOfOneDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableArrayOfOneDecimalsWithScaleOf9,
                other.persistedNullableArrayOfOneDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneDecimalsWithScaleOf9_4("
                + nullableArrayOfOneDecimalsWithScaleOf9 + ','
                + calculatedNullableArrayOfOneDecimalsWithScaleOf9 + ','
                + persistedNullableArrayOfOneDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] nullableArrayOfOneDecimalsWithScaleOf9;

    @JsonProperty("nullableArrayOfOneDecimalsWithScaleOf9")
    public java.math.BigDecimal[] getNullableArrayOfOneDecimalsWithScaleOf9() {
        return nullableArrayOfOneDecimalsWithScaleOf9;
    }

    public NullableArrayOfOneDecimalsWithScaleOf9_4 setNullableArrayOfOneDecimalsWithScaleOf9(
            final java.math.BigDecimal[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.nullableArrayOfOneDecimalsWithScaleOf9 = value;

        return this;
    }

    private final java.math.BigDecimal[] calculatedNullableArrayOfOneDecimalsWithScaleOf9;

    public java.math.BigDecimal[] getCalculatedNullableArrayOfOneDecimalsWithScaleOf9() {
        return this.calculatedNullableArrayOfOneDecimalsWithScaleOf9;
    }

    private final java.math.BigDecimal[] persistedNullableArrayOfOneDecimalsWithScaleOf9;

    public java.math.BigDecimal[] getPersistedNullableArrayOfOneDecimalsWithScaleOf9() {
        return this.persistedNullableArrayOfOneDecimalsWithScaleOf9;
    }
}
