package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneDecimalsWithScaleOf9_4 implements
        java.io.Serializable {
    public NullableSetOfOneDecimalsWithScaleOf9_4(
            final java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimalsWithScaleOf9,
            final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfOneDecimalsWithScaleOf9,
            final java.util.Set<java.math.BigDecimal> persistedNullableSetOfOneDecimalsWithScaleOf9) {
        setNullableSetOfOneDecimalsWithScaleOf9(nullableSetOfOneDecimalsWithScaleOf9);
        this.calculatedNullableSetOfOneDecimalsWithScaleOf9 = calculatedNullableSetOfOneDecimalsWithScaleOf9;
        this.persistedNullableSetOfOneDecimalsWithScaleOf9 = persistedNullableSetOfOneDecimalsWithScaleOf9;
    }

    public NullableSetOfOneDecimalsWithScaleOf9_4() {
        this.calculatedNullableSetOfOneDecimalsWithScaleOf9 = null;
        this.persistedNullableSetOfOneDecimalsWithScaleOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2037119749;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneDecimalsWithScaleOf9_4))
            return false;
        final NullableSetOfOneDecimalsWithScaleOf9_4 other = (NullableSetOfOneDecimalsWithScaleOf9_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableSetOfOneDecimalsWithScaleOf9,
                other.nullableSetOfOneDecimalsWithScaleOf9))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableSetOfOneDecimalsWithScaleOf9,
                other.calculatedNullableSetOfOneDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableSetOfOneDecimalsWithScaleOf9,
                other.persistedNullableSetOfOneDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneDecimalsWithScaleOf9_4("
                + nullableSetOfOneDecimalsWithScaleOf9 + ','
                + calculatedNullableSetOfOneDecimalsWithScaleOf9 + ','
                + persistedNullableSetOfOneDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimalsWithScaleOf9;

    @JsonProperty("nullableSetOfOneDecimalsWithScaleOf9")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfOneDecimalsWithScaleOf9() {
        return nullableSetOfOneDecimalsWithScaleOf9;
    }

    public NullableSetOfOneDecimalsWithScaleOf9_4 setNullableSetOfOneDecimalsWithScaleOf9(
            final java.util.Set<java.math.BigDecimal> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.nullableSetOfOneDecimalsWithScaleOf9 = value;

        return this;
    }

    private final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfOneDecimalsWithScaleOf9;

    public java.util.Set<java.math.BigDecimal> getCalculatedNullableSetOfOneDecimalsWithScaleOf9() {
        return this.calculatedNullableSetOfOneDecimalsWithScaleOf9;
    }

    private final java.util.Set<java.math.BigDecimal> persistedNullableSetOfOneDecimalsWithScaleOf9;

    public java.util.Set<java.math.BigDecimal> getPersistedNullableSetOfOneDecimalsWithScaleOf9() {
        return this.persistedNullableSetOfOneDecimalsWithScaleOf9;
    }
}
