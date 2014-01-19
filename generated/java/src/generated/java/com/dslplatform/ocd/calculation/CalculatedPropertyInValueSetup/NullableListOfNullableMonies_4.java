package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableMonies_4 implements
        java.io.Serializable {
    public NullableListOfNullableMonies_4(
            final java.util.List<java.math.BigDecimal> nullableListOfNullableMonies,
            final java.util.List<java.math.BigDecimal> calculatedNullableListOfNullableMonies,
            final java.util.List<java.math.BigDecimal> persistedNullableListOfNullableMonies) {
        setNullableListOfNullableMonies(nullableListOfNullableMonies);
        this.calculatedNullableListOfNullableMonies = calculatedNullableListOfNullableMonies;
        this.persistedNullableListOfNullableMonies = persistedNullableListOfNullableMonies;
    }

    public NullableListOfNullableMonies_4() {
        this.calculatedNullableListOfNullableMonies = null;
        this.persistedNullableListOfNullableMonies = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 361916857;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableMonies_4)) return false;
        final NullableListOfNullableMonies_4 other = (NullableListOfNullableMonies_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableListOfNullableMonies,
                other.nullableListOfNullableMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableListOfNullableMonies,
                other.calculatedNullableListOfNullableMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableListOfNullableMonies,
                other.persistedNullableListOfNullableMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableMonies_4(" + nullableListOfNullableMonies
                + ',' + calculatedNullableListOfNullableMonies + ','
                + persistedNullableListOfNullableMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfNullableMonies;

    @JsonProperty("nullableListOfNullableMonies")
    public java.util.List<java.math.BigDecimal> getNullableListOfNullableMonies() {
        return nullableListOfNullableMonies;
    }

    public NullableListOfNullableMonies_4 setNullableListOfNullableMonies(
            final java.util.List<java.math.BigDecimal> value) {
        this.nullableListOfNullableMonies = value;

        this.nullableListOfNullableMonies = value == null
                ? null
                : com.dslplatform.ocd.calculation.Guards.setScale(
                        this.nullableListOfNullableMonies, 2);
        return this;
    }

    private final java.util.List<java.math.BigDecimal> calculatedNullableListOfNullableMonies;

    public java.util.List<java.math.BigDecimal> getCalculatedNullableListOfNullableMonies() {
        return this.calculatedNullableListOfNullableMonies;
    }

    private final java.util.List<java.math.BigDecimal> persistedNullableListOfNullableMonies;

    public java.util.List<java.math.BigDecimal> getPersistedNullableListOfNullableMonies() {
        return this.persistedNullableListOfNullableMonies;
    }
}
