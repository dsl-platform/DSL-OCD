package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableDates_4 implements
        java.io.Serializable {
    public NullableListOfNullableDates_4(
            final java.util.List<org.joda.time.LocalDate> nullableListOfNullableDates,
            final java.util.List<org.joda.time.LocalDate> calculatedNullableListOfNullableDates,
            final java.util.List<org.joda.time.LocalDate> persistedNullableListOfNullableDates) {
        setNullableListOfNullableDates(nullableListOfNullableDates);
        this.calculatedNullableListOfNullableDates = calculatedNullableListOfNullableDates;
        this.persistedNullableListOfNullableDates = persistedNullableListOfNullableDates;
    }

    public NullableListOfNullableDates_4() {
        this.calculatedNullableListOfNullableDates = null;
        this.persistedNullableListOfNullableDates = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 458296859;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableDates_4)) return false;
        final NullableListOfNullableDates_4 other = (NullableListOfNullableDates_4) obj;

        if (!(this.nullableListOfNullableDates == other.nullableListOfNullableDates || this.nullableListOfNullableDates != null
                && this.nullableListOfNullableDates
                        .equals(other.nullableListOfNullableDates)))
            return false;
        if (!(this.calculatedNullableListOfNullableDates == other.calculatedNullableListOfNullableDates || this.calculatedNullableListOfNullableDates != null
                && this.calculatedNullableListOfNullableDates
                        .equals(other.calculatedNullableListOfNullableDates)))
            return false;
        if (!(this.persistedNullableListOfNullableDates == other.persistedNullableListOfNullableDates || this.persistedNullableListOfNullableDates != null
                && this.persistedNullableListOfNullableDates
                        .equals(other.persistedNullableListOfNullableDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableDates_4(" + nullableListOfNullableDates
                + ',' + calculatedNullableListOfNullableDates + ','
                + persistedNullableListOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> nullableListOfNullableDates;

    @JsonProperty("nullableListOfNullableDates")
    public java.util.List<org.joda.time.LocalDate> getNullableListOfNullableDates() {
        return nullableListOfNullableDates;
    }

    public NullableListOfNullableDates_4 setNullableListOfNullableDates(
            final java.util.List<org.joda.time.LocalDate> value) {
        this.nullableListOfNullableDates = value;

        return this;
    }

    private final java.util.List<org.joda.time.LocalDate> calculatedNullableListOfNullableDates;

    public java.util.List<org.joda.time.LocalDate> getCalculatedNullableListOfNullableDates() {
        return this.calculatedNullableListOfNullableDates;
    }

    private final java.util.List<org.joda.time.LocalDate> persistedNullableListOfNullableDates;

    public java.util.List<org.joda.time.LocalDate> getPersistedNullableListOfNullableDates() {
        return this.persistedNullableListOfNullableDates;
    }
}
