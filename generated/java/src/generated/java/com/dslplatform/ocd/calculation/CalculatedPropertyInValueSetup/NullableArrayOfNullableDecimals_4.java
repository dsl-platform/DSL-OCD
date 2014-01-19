package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableDecimals_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableDecimals_4(
            final java.math.BigDecimal[] nullableArrayOfNullableDecimals,
            final java.math.BigDecimal[] calculatedNullableArrayOfNullableDecimals,
            final java.math.BigDecimal[] persistedNullableArrayOfNullableDecimals) {
        setNullableArrayOfNullableDecimals(nullableArrayOfNullableDecimals);
        this.calculatedNullableArrayOfNullableDecimals = calculatedNullableArrayOfNullableDecimals;
        this.persistedNullableArrayOfNullableDecimals = persistedNullableArrayOfNullableDecimals;
    }

    public NullableArrayOfNullableDecimals_4() {
        this.calculatedNullableArrayOfNullableDecimals = null;
        this.persistedNullableArrayOfNullableDecimals = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 6244167;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableDecimals_4)) return false;
        final NullableArrayOfNullableDecimals_4 other = (NullableArrayOfNullableDecimals_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableArrayOfNullableDecimals,
                other.nullableArrayOfNullableDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableArrayOfNullableDecimals,
                other.calculatedNullableArrayOfNullableDecimals)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableArrayOfNullableDecimals,
                other.persistedNullableArrayOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableDecimals_4("
                + nullableArrayOfNullableDecimals + ','
                + calculatedNullableArrayOfNullableDecimals + ','
                + persistedNullableArrayOfNullableDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] nullableArrayOfNullableDecimals;

    @JsonProperty("nullableArrayOfNullableDecimals")
    public java.math.BigDecimal[] getNullableArrayOfNullableDecimals() {
        return nullableArrayOfNullableDecimals;
    }

    public NullableArrayOfNullableDecimals_4 setNullableArrayOfNullableDecimals(
            final java.math.BigDecimal[] value) {
        this.nullableArrayOfNullableDecimals = value;

        return this;
    }

    private final java.math.BigDecimal[] calculatedNullableArrayOfNullableDecimals;

    public java.math.BigDecimal[] getCalculatedNullableArrayOfNullableDecimals() {
        return this.calculatedNullableArrayOfNullableDecimals;
    }

    private final java.math.BigDecimal[] persistedNullableArrayOfNullableDecimals;

    public java.math.BigDecimal[] getPersistedNullableArrayOfNullableDecimals() {
        return this.persistedNullableArrayOfNullableDecimals;
    }
}
