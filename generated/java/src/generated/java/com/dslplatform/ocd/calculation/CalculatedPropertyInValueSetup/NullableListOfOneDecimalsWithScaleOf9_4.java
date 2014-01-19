package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDecimalsWithScaleOf9_4 implements
        java.io.Serializable {
    public NullableListOfOneDecimalsWithScaleOf9_4(
            final java.util.List<java.math.BigDecimal> nullableListOfOneDecimalsWithScaleOf9,
            final java.util.List<java.math.BigDecimal> calculatedNullableListOfOneDecimalsWithScaleOf9,
            final java.util.List<java.math.BigDecimal> persistedNullableListOfOneDecimalsWithScaleOf9) {
        setNullableListOfOneDecimalsWithScaleOf9(nullableListOfOneDecimalsWithScaleOf9);
        this.calculatedNullableListOfOneDecimalsWithScaleOf9 = calculatedNullableListOfOneDecimalsWithScaleOf9;
        this.persistedNullableListOfOneDecimalsWithScaleOf9 = persistedNullableListOfOneDecimalsWithScaleOf9;
    }

    public NullableListOfOneDecimalsWithScaleOf9_4() {
        this.calculatedNullableListOfOneDecimalsWithScaleOf9 = null;
        this.persistedNullableListOfOneDecimalsWithScaleOf9 = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 633391355;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDecimalsWithScaleOf9_4))
            return false;
        final NullableListOfOneDecimalsWithScaleOf9_4 other = (NullableListOfOneDecimalsWithScaleOf9_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableListOfOneDecimalsWithScaleOf9,
                other.nullableListOfOneDecimalsWithScaleOf9))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableListOfOneDecimalsWithScaleOf9,
                other.calculatedNullableListOfOneDecimalsWithScaleOf9)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableListOfOneDecimalsWithScaleOf9,
                other.persistedNullableListOfOneDecimalsWithScaleOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDecimalsWithScaleOf9_4("
                + nullableListOfOneDecimalsWithScaleOf9 + ','
                + calculatedNullableListOfOneDecimalsWithScaleOf9 + ','
                + persistedNullableListOfOneDecimalsWithScaleOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfOneDecimalsWithScaleOf9;

    @JsonProperty("nullableListOfOneDecimalsWithScaleOf9")
    public java.util.List<java.math.BigDecimal> getNullableListOfOneDecimalsWithScaleOf9() {
        return nullableListOfOneDecimalsWithScaleOf9;
    }

    public NullableListOfOneDecimalsWithScaleOf9_4 setNullableListOfOneDecimalsWithScaleOf9(
            final java.util.List<java.math.BigDecimal> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkScale(value, 9);
        this.nullableListOfOneDecimalsWithScaleOf9 = value;

        return this;
    }

    private final java.util.List<java.math.BigDecimal> calculatedNullableListOfOneDecimalsWithScaleOf9;

    public java.util.List<java.math.BigDecimal> getCalculatedNullableListOfOneDecimalsWithScaleOf9() {
        return this.calculatedNullableListOfOneDecimalsWithScaleOf9;
    }

    private final java.util.List<java.math.BigDecimal> persistedNullableListOfOneDecimalsWithScaleOf9;

    public java.util.List<java.math.BigDecimal> getPersistedNullableListOfOneDecimalsWithScaleOf9() {
        return this.persistedNullableListOfOneDecimalsWithScaleOf9;
    }
}
