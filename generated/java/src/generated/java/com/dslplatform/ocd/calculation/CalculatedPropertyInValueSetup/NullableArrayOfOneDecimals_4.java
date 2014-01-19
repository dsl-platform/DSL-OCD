package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneDecimals_4 implements java.io.Serializable {
    public NullableArrayOfOneDecimals_4(
            final java.math.BigDecimal[] nullableArrayOfOneDecimals,
            final java.math.BigDecimal[] calculatedNullableArrayOfOneDecimals,
            final java.math.BigDecimal[] persistedNullableArrayOfOneDecimals) {
        setNullableArrayOfOneDecimals(nullableArrayOfOneDecimals);
        this.calculatedNullableArrayOfOneDecimals = calculatedNullableArrayOfOneDecimals;
        this.persistedNullableArrayOfOneDecimals = persistedNullableArrayOfOneDecimals;
    }

    public NullableArrayOfOneDecimals_4() {
        this.calculatedNullableArrayOfOneDecimals = null;
        this.persistedNullableArrayOfOneDecimals = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1127181940;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneDecimals_4)) return false;
        final NullableArrayOfOneDecimals_4 other = (NullableArrayOfOneDecimals_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableArrayOfOneDecimals,
                other.nullableArrayOfOneDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableArrayOfOneDecimals,
                other.calculatedNullableArrayOfOneDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableArrayOfOneDecimals,
                other.persistedNullableArrayOfOneDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneDecimals_4(" + nullableArrayOfOneDecimals
                + ',' + calculatedNullableArrayOfOneDecimals + ','
                + persistedNullableArrayOfOneDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] nullableArrayOfOneDecimals;

    @JsonProperty("nullableArrayOfOneDecimals")
    public java.math.BigDecimal[] getNullableArrayOfOneDecimals() {
        return nullableArrayOfOneDecimals;
    }

    public NullableArrayOfOneDecimals_4 setNullableArrayOfOneDecimals(
            final java.math.BigDecimal[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneDecimals = value;

        return this;
    }

    private final java.math.BigDecimal[] calculatedNullableArrayOfOneDecimals;

    public java.math.BigDecimal[] getCalculatedNullableArrayOfOneDecimals() {
        return this.calculatedNullableArrayOfOneDecimals;
    }

    private final java.math.BigDecimal[] persistedNullableArrayOfOneDecimals;

    public java.math.BigDecimal[] getPersistedNullableArrayOfOneDecimals() {
        return this.persistedNullableArrayOfOneDecimals;
    }
}
