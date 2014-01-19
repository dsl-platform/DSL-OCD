package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDates_4 implements java.io.Serializable {
    public NullableListOfOneDates_4(
            final java.util.List<org.joda.time.LocalDate> nullableListOfOneDates,
            final java.util.List<org.joda.time.LocalDate> calculatedNullableListOfOneDates,
            final java.util.List<org.joda.time.LocalDate> persistedNullableListOfOneDates) {
        setNullableListOfOneDates(nullableListOfOneDates);
        this.calculatedNullableListOfOneDates = calculatedNullableListOfOneDates;
        this.persistedNullableListOfOneDates = persistedNullableListOfOneDates;
    }

    public NullableListOfOneDates_4() {
        this.calculatedNullableListOfOneDates = null;
        this.persistedNullableListOfOneDates = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2037212104;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDates_4)) return false;
        final NullableListOfOneDates_4 other = (NullableListOfOneDates_4) obj;

        if (!(this.nullableListOfOneDates == other.nullableListOfOneDates || this.nullableListOfOneDates != null
                && this.nullableListOfOneDates
                        .equals(other.nullableListOfOneDates))) return false;
        if (!(this.calculatedNullableListOfOneDates == other.calculatedNullableListOfOneDates || this.calculatedNullableListOfOneDates != null
                && this.calculatedNullableListOfOneDates
                        .equals(other.calculatedNullableListOfOneDates)))
            return false;
        if (!(this.persistedNullableListOfOneDates == other.persistedNullableListOfOneDates || this.persistedNullableListOfOneDates != null
                && this.persistedNullableListOfOneDates
                        .equals(other.persistedNullableListOfOneDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDates_4(" + nullableListOfOneDates + ','
                + calculatedNullableListOfOneDates + ','
                + persistedNullableListOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> nullableListOfOneDates;

    @JsonProperty("nullableListOfOneDates")
    public java.util.List<org.joda.time.LocalDate> getNullableListOfOneDates() {
        return nullableListOfOneDates;
    }

    public NullableListOfOneDates_4 setNullableListOfOneDates(
            final java.util.List<org.joda.time.LocalDate> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneDates = value;

        return this;
    }

    private final java.util.List<org.joda.time.LocalDate> calculatedNullableListOfOneDates;

    public java.util.List<org.joda.time.LocalDate> getCalculatedNullableListOfOneDates() {
        return this.calculatedNullableListOfOneDates;
    }

    private final java.util.List<org.joda.time.LocalDate> persistedNullableListOfOneDates;

    public java.util.List<org.joda.time.LocalDate> getPersistedNullableListOfOneDates() {
        return this.persistedNullableListOfOneDates;
    }
}
