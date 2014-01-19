package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableMonies_5 implements java.io.Serializable {
    public OneArrayOfNullableMonies_5(
            final java.math.BigDecimal[] oneArrayOfNullableMonies,
            final java.math.BigDecimal[] calculatedOneArrayOfNullableMonies,
            final java.math.BigDecimal[] persistedOneArrayOfNullableMonies) {
        setOneArrayOfNullableMonies(oneArrayOfNullableMonies);
        this.calculatedOneArrayOfNullableMonies = calculatedOneArrayOfNullableMonies;
        this.persistedOneArrayOfNullableMonies = persistedOneArrayOfNullableMonies;
    }

    public OneArrayOfNullableMonies_5() {
        this.oneArrayOfNullableMonies = new java.math.BigDecimal[] {};
        this.calculatedOneArrayOfNullableMonies = new java.math.BigDecimal[] {};
        this.persistedOneArrayOfNullableMonies = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1073358366;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableMonies_5)) return false;
        final OneArrayOfNullableMonies_5 other = (OneArrayOfNullableMonies_5) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.oneArrayOfNullableMonies, other.oneArrayOfNullableMonies)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedOneArrayOfNullableMonies,
                other.calculatedOneArrayOfNullableMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedOneArrayOfNullableMonies,
                other.persistedOneArrayOfNullableMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableMonies_5(" + oneArrayOfNullableMonies + ','
                + calculatedOneArrayOfNullableMonies + ','
                + persistedOneArrayOfNullableMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfNullableMonies;

    @JsonProperty("oneArrayOfNullableMonies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfNullableMonies() {
        return oneArrayOfNullableMonies;
    }

    public OneArrayOfNullableMonies_5 setOneArrayOfNullableMonies(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableMonies\" cannot be null!");
        this.oneArrayOfNullableMonies = value;

        this.oneArrayOfNullableMonies = com.dslplatform.ocd.calculation.Guards
                .setScale(this.oneArrayOfNullableMonies, 2);
        return this;
    }

    private final java.math.BigDecimal[] calculatedOneArrayOfNullableMonies;

    public java.math.BigDecimal[] getCalculatedOneArrayOfNullableMonies() {
        return this.calculatedOneArrayOfNullableMonies;
    }

    private final java.math.BigDecimal[] persistedOneArrayOfNullableMonies;

    public java.math.BigDecimal[] getPersistedOneArrayOfNullableMonies() {
        return this.persistedOneArrayOfNullableMonies;
    }
}
