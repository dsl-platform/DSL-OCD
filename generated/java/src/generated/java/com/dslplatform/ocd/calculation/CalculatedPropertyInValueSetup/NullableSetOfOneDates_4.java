package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneDates_4 implements java.io.Serializable {
    public NullableSetOfOneDates_4(
            final java.util.Set<org.joda.time.LocalDate> nullableSetOfOneDates,
            final java.util.Set<org.joda.time.LocalDate> calculatedNullableSetOfOneDates,
            final java.util.Set<org.joda.time.LocalDate> persistedNullableSetOfOneDates) {
        setNullableSetOfOneDates(nullableSetOfOneDates);
        this.calculatedNullableSetOfOneDates = calculatedNullableSetOfOneDates;
        this.persistedNullableSetOfOneDates = persistedNullableSetOfOneDates;
    }

    public NullableSetOfOneDates_4() {
        this.calculatedNullableSetOfOneDates = null;
        this.persistedNullableSetOfOneDates = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1498141362;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneDates_4)) return false;
        final NullableSetOfOneDates_4 other = (NullableSetOfOneDates_4) obj;

        if (!(this.nullableSetOfOneDates == other.nullableSetOfOneDates || this.nullableSetOfOneDates != null
                && this.nullableSetOfOneDates
                        .equals(other.nullableSetOfOneDates))) return false;
        if (!(this.calculatedNullableSetOfOneDates == other.calculatedNullableSetOfOneDates || this.calculatedNullableSetOfOneDates != null
                && this.calculatedNullableSetOfOneDates
                        .equals(other.calculatedNullableSetOfOneDates)))
            return false;
        if (!(this.persistedNullableSetOfOneDates == other.persistedNullableSetOfOneDates || this.persistedNullableSetOfOneDates != null
                && this.persistedNullableSetOfOneDates
                        .equals(other.persistedNullableSetOfOneDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneDates_4(" + nullableSetOfOneDates + ','
                + calculatedNullableSetOfOneDates + ','
                + persistedNullableSetOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> nullableSetOfOneDates;

    @JsonProperty("nullableSetOfOneDates")
    public java.util.Set<org.joda.time.LocalDate> getNullableSetOfOneDates() {
        return nullableSetOfOneDates;
    }

    public NullableSetOfOneDates_4 setNullableSetOfOneDates(
            final java.util.Set<org.joda.time.LocalDate> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneDates = value;

        return this;
    }

    private final java.util.Set<org.joda.time.LocalDate> calculatedNullableSetOfOneDates;

    public java.util.Set<org.joda.time.LocalDate> getCalculatedNullableSetOfOneDates() {
        return this.calculatedNullableSetOfOneDates;
    }

    private final java.util.Set<org.joda.time.LocalDate> persistedNullableSetOfOneDates;

    public java.util.Set<org.joda.time.LocalDate> getPersistedNullableSetOfOneDates() {
        return this.persistedNullableSetOfOneDates;
    }
}
