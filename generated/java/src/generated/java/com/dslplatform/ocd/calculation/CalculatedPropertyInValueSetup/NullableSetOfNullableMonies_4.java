package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableMonies_4 implements
        java.io.Serializable {
    public NullableSetOfNullableMonies_4(
            final java.util.Set<java.math.BigDecimal> nullableSetOfNullableMonies,
            final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfNullableMonies,
            final java.util.Set<java.math.BigDecimal> persistedNullableSetOfNullableMonies) {
        setNullableSetOfNullableMonies(nullableSetOfNullableMonies);
        this.calculatedNullableSetOfNullableMonies = calculatedNullableSetOfNullableMonies;
        this.persistedNullableSetOfNullableMonies = persistedNullableSetOfNullableMonies;
    }

    public NullableSetOfNullableMonies_4() {
        this.calculatedNullableSetOfNullableMonies = null;
        this.persistedNullableSetOfNullableMonies = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 352160663;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableMonies_4)) return false;
        final NullableSetOfNullableMonies_4 other = (NullableSetOfNullableMonies_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableSetOfNullableMonies,
                other.nullableSetOfNullableMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableSetOfNullableMonies,
                other.calculatedNullableSetOfNullableMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableSetOfNullableMonies,
                other.persistedNullableSetOfNullableMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableMonies_4(" + nullableSetOfNullableMonies
                + ',' + calculatedNullableSetOfNullableMonies + ','
                + persistedNullableSetOfNullableMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.math.BigDecimal> nullableSetOfNullableMonies;

    @JsonProperty("nullableSetOfNullableMonies")
    public java.util.Set<java.math.BigDecimal> getNullableSetOfNullableMonies() {
        return nullableSetOfNullableMonies;
    }

    public NullableSetOfNullableMonies_4 setNullableSetOfNullableMonies(
            final java.util.Set<java.math.BigDecimal> value) {
        this.nullableSetOfNullableMonies = value;

        this.nullableSetOfNullableMonies = value == null
                ? null
                : com.dslplatform.ocd.calculation.Guards.setScale(
                        this.nullableSetOfNullableMonies, 2);
        return this;
    }

    private final java.util.Set<java.math.BigDecimal> calculatedNullableSetOfNullableMonies;

    public java.util.Set<java.math.BigDecimal> getCalculatedNullableSetOfNullableMonies() {
        return this.calculatedNullableSetOfNullableMonies;
    }

    private final java.util.Set<java.math.BigDecimal> persistedNullableSetOfNullableMonies;

    public java.util.Set<java.math.BigDecimal> getPersistedNullableSetOfNullableMonies() {
        return this.persistedNullableSetOfNullableMonies;
    }
}
