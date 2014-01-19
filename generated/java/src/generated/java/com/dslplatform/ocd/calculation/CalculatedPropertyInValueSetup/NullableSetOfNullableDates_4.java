package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableDates_4 implements java.io.Serializable {
    public NullableSetOfNullableDates_4(
            final java.util.Set<org.joda.time.LocalDate> nullableSetOfNullableDates,
            final java.util.Set<org.joda.time.LocalDate> calculatedNullableSetOfNullableDates,
            final java.util.Set<org.joda.time.LocalDate> persistedNullableSetOfNullableDates) {
        setNullableSetOfNullableDates(nullableSetOfNullableDates);
        this.calculatedNullableSetOfNullableDates = calculatedNullableSetOfNullableDates;
        this.persistedNullableSetOfNullableDates = persistedNullableSetOfNullableDates;
    }

    public NullableSetOfNullableDates_4() {
        this.calculatedNullableSetOfNullableDates = null;
        this.persistedNullableSetOfNullableDates = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 656869477;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableDates_4)) return false;
        final NullableSetOfNullableDates_4 other = (NullableSetOfNullableDates_4) obj;

        if (!(this.nullableSetOfNullableDates == other.nullableSetOfNullableDates || this.nullableSetOfNullableDates != null
                && this.nullableSetOfNullableDates
                        .equals(other.nullableSetOfNullableDates)))
            return false;
        if (!(this.calculatedNullableSetOfNullableDates == other.calculatedNullableSetOfNullableDates || this.calculatedNullableSetOfNullableDates != null
                && this.calculatedNullableSetOfNullableDates
                        .equals(other.calculatedNullableSetOfNullableDates)))
            return false;
        if (!(this.persistedNullableSetOfNullableDates == other.persistedNullableSetOfNullableDates || this.persistedNullableSetOfNullableDates != null
                && this.persistedNullableSetOfNullableDates
                        .equals(other.persistedNullableSetOfNullableDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableDates_4(" + nullableSetOfNullableDates
                + ',' + calculatedNullableSetOfNullableDates + ','
                + persistedNullableSetOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> nullableSetOfNullableDates;

    @JsonProperty("nullableSetOfNullableDates")
    public java.util.Set<org.joda.time.LocalDate> getNullableSetOfNullableDates() {
        return nullableSetOfNullableDates;
    }

    public NullableSetOfNullableDates_4 setNullableSetOfNullableDates(
            final java.util.Set<org.joda.time.LocalDate> value) {
        this.nullableSetOfNullableDates = value;

        return this;
    }

    private final java.util.Set<org.joda.time.LocalDate> calculatedNullableSetOfNullableDates;

    public java.util.Set<org.joda.time.LocalDate> getCalculatedNullableSetOfNullableDates() {
        return this.calculatedNullableSetOfNullableDates;
    }

    private final java.util.Set<org.joda.time.LocalDate> persistedNullableSetOfNullableDates;

    public java.util.Set<org.joda.time.LocalDate> getPersistedNullableSetOfNullableDates() {
        return this.persistedNullableSetOfNullableDates;
    }
}
