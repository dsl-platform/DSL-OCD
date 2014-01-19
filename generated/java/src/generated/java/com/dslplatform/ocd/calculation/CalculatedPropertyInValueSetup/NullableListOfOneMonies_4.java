package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneMonies_4 implements java.io.Serializable {
    public NullableListOfOneMonies_4(
            final java.util.List<java.math.BigDecimal> nullableListOfOneMonies,
            final java.util.List<java.math.BigDecimal> calculatedNullableListOfOneMonies,
            final java.util.List<java.math.BigDecimal> persistedNullableListOfOneMonies) {
        setNullableListOfOneMonies(nullableListOfOneMonies);
        this.calculatedNullableListOfOneMonies = calculatedNullableListOfOneMonies;
        this.persistedNullableListOfOneMonies = persistedNullableListOfOneMonies;
    }

    public NullableListOfOneMonies_4() {
        this.calculatedNullableListOfOneMonies = null;
        this.persistedNullableListOfOneMonies = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 24213220;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneMonies_4)) return false;
        final NullableListOfOneMonies_4 other = (NullableListOfOneMonies_4) obj;

        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.nullableListOfOneMonies, other.nullableListOfOneMonies)))
            return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.calculatedNullableListOfOneMonies,
                other.calculatedNullableListOfOneMonies))) return false;
        if (!(com.dslplatform.ocd.calculation.Guards.compareBigDecimal(
                this.persistedNullableListOfOneMonies,
                other.persistedNullableListOfOneMonies))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneMonies_4(" + nullableListOfOneMonies + ','
                + calculatedNullableListOfOneMonies + ','
                + persistedNullableListOfOneMonies + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.math.BigDecimal> nullableListOfOneMonies;

    @JsonProperty("nullableListOfOneMonies")
    public java.util.List<java.math.BigDecimal> getNullableListOfOneMonies() {
        return nullableListOfOneMonies;
    }

    public NullableListOfOneMonies_4 setNullableListOfOneMonies(
            final java.util.List<java.math.BigDecimal> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneMonies = value;

        this.nullableListOfOneMonies = value == null
                ? null
                : com.dslplatform.ocd.calculation.Guards.setScale(
                        this.nullableListOfOneMonies, 2);
        return this;
    }

    private final java.util.List<java.math.BigDecimal> calculatedNullableListOfOneMonies;

    public java.util.List<java.math.BigDecimal> getCalculatedNullableListOfOneMonies() {
        return this.calculatedNullableListOfOneMonies;
    }

    private final java.util.List<java.math.BigDecimal> persistedNullableListOfOneMonies;

    public java.util.List<java.math.BigDecimal> getPersistedNullableListOfOneMonies() {
        return this.persistedNullableListOfOneMonies;
    }
}
