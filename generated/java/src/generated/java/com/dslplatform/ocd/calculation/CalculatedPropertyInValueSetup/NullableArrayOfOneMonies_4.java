package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneMonies_4 implements java.io.Serializable {
    public NullableArrayOfOneMonies_4(
            final java.math.BigDecimal[] nullableArrayOfOneMonies,
            final java.math.BigDecimal[] calculatedNullableArrayOfOneMonies,
            final java.math.BigDecimal[] persistedNullableArrayOfOneMonies) {
        setNullableArrayOfOneMonies(nullableArrayOfOneMonies);
        this.calculatedNullableArrayOfOneMonies = calculatedNullableArrayOfOneMonies;
        this.persistedNullableArrayOfOneMonies = persistedNullableArrayOfOneMonies;
    }

    public NullableArrayOfOneMonies_4() {
        this.calculatedNullableArrayOfOneMonies = null;
        this.persistedNullableArrayOfOneMonies = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 69981331;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneMonies_4)) return false;
        final NullableArrayOfOneMonies_4 other = (NullableArrayOfOneMonies_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableArrayOfOneMonies, other.nullableArrayOfOneMonies)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableArrayOfOneMonies,
                other.calculatedNullableArrayOfOneMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableArrayOfOneMonies,
                other.persistedNullableArrayOfOneMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneMonies_4(" + nullableArrayOfOneMonies + ','
                + calculatedNullableArrayOfOneMonies + ','
                + persistedNullableArrayOfOneMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] nullableArrayOfOneMonies;

    @JsonProperty("nullableArrayOfOneMonies")
    public java.math.BigDecimal[] getNullableArrayOfOneMonies() {
        return nullableArrayOfOneMonies;
    }

    public NullableArrayOfOneMonies_4 setNullableArrayOfOneMonies(
            final java.math.BigDecimal[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneMonies = value;

        this.nullableArrayOfOneMonies = value == null
                ? null
                : com.dslplatform.ocd.calculation.Guards.setScale(
                        this.nullableArrayOfOneMonies, 2);
        return this;
    }

    private final java.math.BigDecimal[] calculatedNullableArrayOfOneMonies;

    public java.math.BigDecimal[] getCalculatedNullableArrayOfOneMonies() {
        return this.calculatedNullableArrayOfOneMonies;
    }

    private final java.math.BigDecimal[] persistedNullableArrayOfOneMonies;

    public java.math.BigDecimal[] getPersistedNullableArrayOfOneMonies() {
        return this.persistedNullableArrayOfOneMonies;
    }
}
