package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneDecimals_4 implements java.io.Serializable {
    public NullableSetOfOneDecimals_4(
            final java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimals,
            final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfOneDecimals,
            final java.util.Set<java.math.BigDecimal> persistedNullableSetOfOneDecimals) {
        setNullableSetOfOneDecimals(nullableSetOfOneDecimals);
        this.calculatedNullableSetOfOneDecimals = calculatedNullableSetOfOneDecimals;
        this.persistedNullableSetOfOneDecimals = persistedNullableSetOfOneDecimals;
    }

    public NullableSetOfOneDecimals_4() {
        this.calculatedNullableSetOfOneDecimals = null;
        this.persistedNullableSetOfOneDecimals = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 889400081;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneDecimals_4)) return false;
        final NullableSetOfOneDecimals_4 other = (NullableSetOfOneDecimals_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableSetOfOneDecimals, other.nullableSetOfOneDecimals)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableSetOfOneDecimals,
                other.calculatedNullableSetOfOneDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableSetOfOneDecimals,
                other.persistedNullableSetOfOneDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneDecimals_4(" + nullableSetOfOneDecimals + ','
                + calculatedNullableSetOfOneDecimals + ','
                + persistedNullableSetOfOneDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimals;

    @JsonProperty("nullableSetOfOneDecimals")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfOneDecimals() {
        return nullableSetOfOneDecimals;
    }

    public NullableSetOfOneDecimals_4 setNullableSetOfOneDecimals(
            final java.util.Set<java.math.BigDecimal> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneDecimals = value;

        return this;
    }

    private final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfOneDecimals;

    public java.util.Set<java.math.BigDecimal> getCalculatedNullableSetOfOneDecimals() {
        return this.calculatedNullableSetOfOneDecimals;
    }

    private final java.util.Set<java.math.BigDecimal> persistedNullableSetOfOneDecimals;

    public java.util.Set<java.math.BigDecimal> getPersistedNullableSetOfOneDecimals() {
        return this.persistedNullableSetOfOneDecimals;
    }
}
