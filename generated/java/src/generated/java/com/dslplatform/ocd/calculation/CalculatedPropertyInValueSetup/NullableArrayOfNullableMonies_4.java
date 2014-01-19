package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableMonies_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableMonies_4(
            final java.math.BigDecimal[] nullableArrayOfNullableMonies,
            final java.math.BigDecimal[] calculatedNullableArrayOfNullableMonies,
            final java.math.BigDecimal[] persistedNullableArrayOfNullableMonies) {
        setNullableArrayOfNullableMonies(nullableArrayOfNullableMonies);
        this.calculatedNullableArrayOfNullableMonies = calculatedNullableArrayOfNullableMonies;
        this.persistedNullableArrayOfNullableMonies = persistedNullableArrayOfNullableMonies;
    }

    public NullableArrayOfNullableMonies_4() {
        this.calculatedNullableArrayOfNullableMonies = null;
        this.persistedNullableArrayOfNullableMonies = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 220229422;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableMonies_4)) return false;
        final NullableArrayOfNullableMonies_4 other = (NullableArrayOfNullableMonies_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableArrayOfNullableMonies,
                other.nullableArrayOfNullableMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableArrayOfNullableMonies,
                other.calculatedNullableArrayOfNullableMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableArrayOfNullableMonies,
                other.persistedNullableArrayOfNullableMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableMonies_4("
                + nullableArrayOfNullableMonies + ','
                + calculatedNullableArrayOfNullableMonies + ','
                + persistedNullableArrayOfNullableMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] nullableArrayOfNullableMonies;

    @JsonProperty("nullableArrayOfNullableMonies")
    public java.math.BigDecimal[] getNullableArrayOfNullableMonies() {
        return nullableArrayOfNullableMonies;
    }

    public NullableArrayOfNullableMonies_4 setNullableArrayOfNullableMonies(
            final java.math.BigDecimal[] value) {
        this.nullableArrayOfNullableMonies = value;

        this.nullableArrayOfNullableMonies = value == null
                ? null
                : com.dslplatform.ocd.calculation.Guards.setScale(
                        this.nullableArrayOfNullableMonies, 2);
        return this;
    }

    private final java.math.BigDecimal[] calculatedNullableArrayOfNullableMonies;

    public java.math.BigDecimal[] getCalculatedNullableArrayOfNullableMonies() {
        return this.calculatedNullableArrayOfNullableMonies;
    }

    private final java.math.BigDecimal[] persistedNullableArrayOfNullableMonies;

    public java.math.BigDecimal[] getPersistedNullableArrayOfNullableMonies() {
        return this.persistedNullableArrayOfNullableMonies;
    }
}
