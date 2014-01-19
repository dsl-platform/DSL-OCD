package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableDecimals_4 implements
        java.io.Serializable {
    public NullableSetOfNullableDecimals_4(
            final java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimals,
            final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfNullableDecimals,
            final java.util.Set<java.math.BigDecimal> persistedNullableSetOfNullableDecimals) {
        setNullableSetOfNullableDecimals(nullableSetOfNullableDecimals);
        this.calculatedNullableSetOfNullableDecimals = calculatedNullableSetOfNullableDecimals;
        this.persistedNullableSetOfNullableDecimals = persistedNullableSetOfNullableDecimals;
    }

    public NullableSetOfNullableDecimals_4() {
        this.calculatedNullableSetOfNullableDecimals = null;
        this.persistedNullableSetOfNullableDecimals = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1495174050;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableDecimals_4)) return false;
        final NullableSetOfNullableDecimals_4 other = (NullableSetOfNullableDecimals_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableSetOfNullableDecimals,
                other.nullableSetOfNullableDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableSetOfNullableDecimals,
                other.calculatedNullableSetOfNullableDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableSetOfNullableDecimals,
                other.persistedNullableSetOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableDecimals_4("
                + nullableSetOfNullableDecimals + ','
                + calculatedNullableSetOfNullableDecimals + ','
                + persistedNullableSetOfNullableDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimals;

    @JsonProperty("nullableSetOfNullableDecimals")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfNullableDecimals() {
        return nullableSetOfNullableDecimals;
    }

    public NullableSetOfNullableDecimals_4 setNullableSetOfNullableDecimals(
            final java.util.Set<java.math.BigDecimal> value) {
        this.nullableSetOfNullableDecimals = value;

        return this;
    }

    private final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfNullableDecimals;

    public java.util.Set<java.math.BigDecimal> getCalculatedNullableSetOfNullableDecimals() {
        return this.calculatedNullableSetOfNullableDecimals;
    }

    private final java.util.Set<java.math.BigDecimal> persistedNullableSetOfNullableDecimals;

    public java.util.Set<java.math.BigDecimal> getPersistedNullableSetOfNullableDecimals() {
        return this.persistedNullableSetOfNullableDecimals;
    }
}
