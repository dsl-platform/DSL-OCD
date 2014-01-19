package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableDates_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableDates_4(
            final org.joda.time.LocalDate[] nullableArrayOfNullableDates,
            final org.joda.time.LocalDate[] calculatedNullableArrayOfNullableDates,
            final org.joda.time.LocalDate[] persistedNullableArrayOfNullableDates) {
        setNullableArrayOfNullableDates(nullableArrayOfNullableDates);
        this.calculatedNullableArrayOfNullableDates = calculatedNullableArrayOfNullableDates;
        this.persistedNullableArrayOfNullableDates = persistedNullableArrayOfNullableDates;
    }

    public NullableArrayOfNullableDates_4() {
        this.calculatedNullableArrayOfNullableDates = null;
        this.persistedNullableArrayOfNullableDates = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 6406782;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableDates_4)) return false;
        final NullableArrayOfNullableDates_4 other = (NullableArrayOfNullableDates_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableDates,
                other.nullableArrayOfNullableDates))) return false;
        if (!(this.calculatedNullableArrayOfNullableDates == other.calculatedNullableArrayOfNullableDates || this.calculatedNullableArrayOfNullableDates != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableDates,
                        other.calculatedNullableArrayOfNullableDates)))
            return false;
        if (!(this.persistedNullableArrayOfNullableDates == other.persistedNullableArrayOfNullableDates || this.persistedNullableArrayOfNullableDates != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableDates,
                        other.persistedNullableArrayOfNullableDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableDates_4(" + nullableArrayOfNullableDates
                + ',' + calculatedNullableArrayOfNullableDates + ','
                + persistedNullableArrayOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] nullableArrayOfNullableDates;

    @JsonProperty("nullableArrayOfNullableDates")
    public org.joda.time.LocalDate[] getNullableArrayOfNullableDates() {
        return nullableArrayOfNullableDates;
    }

    public NullableArrayOfNullableDates_4 setNullableArrayOfNullableDates(
            final org.joda.time.LocalDate[] value) {
        this.nullableArrayOfNullableDates = value;

        return this;
    }

    private final org.joda.time.LocalDate[] calculatedNullableArrayOfNullableDates;

    public org.joda.time.LocalDate[] getCalculatedNullableArrayOfNullableDates() {
        return this.calculatedNullableArrayOfNullableDates;
    }

    private final org.joda.time.LocalDate[] persistedNullableArrayOfNullableDates;

    public org.joda.time.LocalDate[] getPersistedNullableArrayOfNullableDates() {
        return this.persistedNullableArrayOfNullableDates;
    }
}
