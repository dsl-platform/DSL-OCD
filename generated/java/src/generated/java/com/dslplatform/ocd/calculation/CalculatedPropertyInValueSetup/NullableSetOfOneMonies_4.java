package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneMonies_4 implements java.io.Serializable {
    public NullableSetOfOneMonies_4(
            final java.util.Set<java.math.BigDecimal> nullableSetOfOneMonies,
            final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfOneMonies,
            final java.util.Set<java.math.BigDecimal> persistedNullableSetOfOneMonies) {
        setNullableSetOfOneMonies(nullableSetOfOneMonies);
        this.calculatedNullableSetOfOneMonies = calculatedNullableSetOfOneMonies;
        this.persistedNullableSetOfOneMonies = persistedNullableSetOfOneMonies;
    }

    public NullableSetOfOneMonies_4() {
        this.calculatedNullableSetOfOneMonies = null;
        this.persistedNullableSetOfOneMonies = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1989218434;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneMonies_4)) return false;
        final NullableSetOfOneMonies_4 other = (NullableSetOfOneMonies_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableSetOfOneMonies, other.nullableSetOfOneMonies)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableSetOfOneMonies,
                other.calculatedNullableSetOfOneMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableSetOfOneMonies,
                other.persistedNullableSetOfOneMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneMonies_4(" + nullableSetOfOneMonies + ','
                + calculatedNullableSetOfOneMonies + ','
                + persistedNullableSetOfOneMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfOneMonies;

    @JsonProperty("nullableSetOfOneMonies")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfOneMonies() {
        return nullableSetOfOneMonies;
    }

    public NullableSetOfOneMonies_4 setNullableSetOfOneMonies(
            final java.util.Set<java.math.BigDecimal> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneMonies = value;

        this.nullableSetOfOneMonies = value == null
                ? null
                : com.dslplatform.ocd.calculation.Guards.setScale(
                        this.nullableSetOfOneMonies, 2);
        return this;
    }

    private final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfOneMonies;

    public java.util.Set<java.math.BigDecimal> getCalculatedNullableSetOfOneMonies() {
        return this.calculatedNullableSetOfOneMonies;
    }

    private final java.util.Set<java.math.BigDecimal> persistedNullableSetOfOneMonies;

    public java.util.Set<java.math.BigDecimal> getPersistedNullableSetOfOneMonies() {
        return this.persistedNullableSetOfOneMonies;
    }
}
