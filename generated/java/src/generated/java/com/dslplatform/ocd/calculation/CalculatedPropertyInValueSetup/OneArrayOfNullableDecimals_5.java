package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableDecimals_5 implements java.io.Serializable {
    public OneArrayOfNullableDecimals_5(
            final java.math.BigDecimal[] oneArrayOfNullableDecimals,
            final java.math.BigDecimal[] calculatedOneArrayOfNullableDecimals,
            final java.math.BigDecimal[] persistedOneArrayOfNullableDecimals) {
        setOneArrayOfNullableDecimals(oneArrayOfNullableDecimals);
        this.calculatedOneArrayOfNullableDecimals = calculatedOneArrayOfNullableDecimals;
        this.persistedOneArrayOfNullableDecimals = persistedOneArrayOfNullableDecimals;
    }

    public OneArrayOfNullableDecimals_5() {
        this.oneArrayOfNullableDecimals = new java.math.BigDecimal[] {};
        this.calculatedOneArrayOfNullableDecimals = new java.math.BigDecimal[] {};
        this.persistedOneArrayOfNullableDecimals = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1528054817;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableDecimals_5)) return false;
        final OneArrayOfNullableDecimals_5 other = (OneArrayOfNullableDecimals_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneArrayOfNullableDecimals,
                other.oneArrayOfNullableDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneArrayOfNullableDecimals,
                other.calculatedOneArrayOfNullableDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneArrayOfNullableDecimals,
                other.persistedOneArrayOfNullableDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableDecimals_5(" + oneArrayOfNullableDecimals
                + ',' + calculatedOneArrayOfNullableDecimals + ','
                + persistedOneArrayOfNullableDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfNullableDecimals;

    @JsonProperty("oneArrayOfNullableDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfNullableDecimals() {
        return oneArrayOfNullableDecimals;
    }

    public OneArrayOfNullableDecimals_5 setOneArrayOfNullableDecimals(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDecimals\" cannot be null!");
        this.oneArrayOfNullableDecimals = value;

        return this;
    }

    private final java.math.BigDecimal[] calculatedOneArrayOfNullableDecimals;

    public java.math.BigDecimal[] getCalculatedOneArrayOfNullableDecimals() {
        return this.calculatedOneArrayOfNullableDecimals;
    }

    private final java.math.BigDecimal[] persistedOneArrayOfNullableDecimals;

    public java.math.BigDecimal[] getPersistedOneArrayOfNullableDecimals() {
        return this.persistedOneArrayOfNullableDecimals;
    }
}
