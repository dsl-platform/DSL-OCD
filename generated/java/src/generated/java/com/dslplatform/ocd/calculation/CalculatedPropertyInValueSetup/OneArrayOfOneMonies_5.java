package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneMonies_5 implements java.io.Serializable {
    public OneArrayOfOneMonies_5(
            final java.math.BigDecimal[] oneArrayOfOneMonies,
            final java.math.BigDecimal[] calculatedOneArrayOfOneMonies,
            final java.math.BigDecimal[] persistedOneArrayOfOneMonies) {
        setOneArrayOfOneMonies(oneArrayOfOneMonies);
        this.calculatedOneArrayOfOneMonies = calculatedOneArrayOfOneMonies;
        this.persistedOneArrayOfOneMonies = persistedOneArrayOfOneMonies;
    }

    public OneArrayOfOneMonies_5() {
        this.oneArrayOfOneMonies = new java.math.BigDecimal[] {};
        this.calculatedOneArrayOfOneMonies = new java.math.BigDecimal[] {};
        this.persistedOneArrayOfOneMonies = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 735457911;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneMonies_5)) return false;
        final OneArrayOfOneMonies_5 other = (OneArrayOfOneMonies_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneArrayOfOneMonies, other.oneArrayOfOneMonies)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneArrayOfOneMonies,
                other.calculatedOneArrayOfOneMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneArrayOfOneMonies,
                other.persistedOneArrayOfOneMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneMonies_5(" + oneArrayOfOneMonies + ','
                + calculatedOneArrayOfOneMonies + ','
                + persistedOneArrayOfOneMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfOneMonies;

    @JsonProperty("oneArrayOfOneMonies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfOneMonies() {
        return oneArrayOfOneMonies;
    }

    public OneArrayOfOneMonies_5 setOneArrayOfOneMonies(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneMonies\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneMonies = value;

        this.oneArrayOfOneMonies = com.dslplatform.ocd.calculation.Guards
                .setScale(this.oneArrayOfOneMonies, 2);
        return this;
    }

    private final java.math.BigDecimal[] calculatedOneArrayOfOneMonies;

    public java.math.BigDecimal[] getCalculatedOneArrayOfOneMonies() {
        return this.calculatedOneArrayOfOneMonies;
    }

    private final java.math.BigDecimal[] persistedOneArrayOfOneMonies;

    public java.math.BigDecimal[] getPersistedOneArrayOfOneMonies() {
        return this.persistedOneArrayOfOneMonies;
    }
}
