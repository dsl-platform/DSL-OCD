package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneDecimals_5 implements java.io.Serializable {
    public OneArrayOfOneDecimals_5(
            final java.math.BigDecimal[] oneArrayOfOneDecimals,
            final java.math.BigDecimal[] calculatedOneArrayOfOneDecimals,
            final java.math.BigDecimal[] persistedOneArrayOfOneDecimals) {
        setOneArrayOfOneDecimals(oneArrayOfOneDecimals);
        this.calculatedOneArrayOfOneDecimals = calculatedOneArrayOfOneDecimals;
        this.persistedOneArrayOfOneDecimals = persistedOneArrayOfOneDecimals;
    }

    public OneArrayOfOneDecimals_5() {
        this.oneArrayOfOneDecimals = new java.math.BigDecimal[] {};
        this.calculatedOneArrayOfOneDecimals = new java.math.BigDecimal[] {};
        this.persistedOneArrayOfOneDecimals = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1453704606;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneDecimals_5)) return false;
        final OneArrayOfOneDecimals_5 other = (OneArrayOfOneDecimals_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneArrayOfOneDecimals, other.oneArrayOfOneDecimals)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneArrayOfOneDecimals,
                other.calculatedOneArrayOfOneDecimals))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneArrayOfOneDecimals,
                other.persistedOneArrayOfOneDecimals))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneDecimals_5(" + oneArrayOfOneDecimals + ','
                + calculatedOneArrayOfOneDecimals + ','
                + persistedOneArrayOfOneDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfOneDecimals;

    @JsonProperty("oneArrayOfOneDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfOneDecimals() {
        return oneArrayOfOneDecimals;
    }

    public OneArrayOfOneDecimals_5 setOneArrayOfOneDecimals(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDecimals\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneDecimals = value;

        return this;
    }

    private final java.math.BigDecimal[] calculatedOneArrayOfOneDecimals;

    public java.math.BigDecimal[] getCalculatedOneArrayOfOneDecimals() {
        return this.calculatedOneArrayOfOneDecimals;
    }

    private final java.math.BigDecimal[] persistedOneArrayOfOneDecimals;

    public java.math.BigDecimal[] getPersistedOneArrayOfOneDecimals() {
        return this.persistedOneArrayOfOneDecimals;
    }
}
