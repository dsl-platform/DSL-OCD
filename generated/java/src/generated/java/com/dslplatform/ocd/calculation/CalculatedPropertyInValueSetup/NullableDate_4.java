package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableDate_4 implements java.io.Serializable {
    public NullableDate_4(
            final org.joda.time.LocalDate nullableDate,
            final org.joda.time.LocalDate calculatedNullableDate,
            final org.joda.time.LocalDate persistedNullableDate) {
        setNullableDate(nullableDate);
        this.calculatedNullableDate = calculatedNullableDate;
        this.persistedNullableDate = persistedNullableDate;
    }

    public NullableDate_4() {
        this.calculatedNullableDate = null;
        this.persistedNullableDate = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1103183876;
        result = prime
                * result
                + (this.nullableDate != null ? this.nullableDate.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedNullableDate != null
                        ? this.calculatedNullableDate.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableDate != null
                        ? this.persistedNullableDate.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableDate_4)) return false;
        final NullableDate_4 other = (NullableDate_4) obj;

        if (!(this.nullableDate == other.nullableDate || this.nullableDate != null
                && this.nullableDate.equals(other.nullableDate))) return false;
        if (!(this.calculatedNullableDate == other.calculatedNullableDate || this.calculatedNullableDate != null
                && this.calculatedNullableDate
                        .equals(other.calculatedNullableDate))) return false;
        if (!(this.persistedNullableDate == other.persistedNullableDate || this.persistedNullableDate != null
                && this.persistedNullableDate
                        .equals(other.persistedNullableDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableDate_4(" + nullableDate + ',' + calculatedNullableDate
                + ',' + persistedNullableDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate nullableDate;

    @JsonProperty("nullableDate")
    public org.joda.time.LocalDate getNullableDate() {
        return nullableDate;
    }

    public NullableDate_4 setNullableDate(final org.joda.time.LocalDate value) {
        this.nullableDate = value;

        return this;
    }

    private final org.joda.time.LocalDate calculatedNullableDate;

    public org.joda.time.LocalDate getCalculatedNullableDate() {
        return this.calculatedNullableDate;
    }

    private final org.joda.time.LocalDate persistedNullableDate;

    public org.joda.time.LocalDate getPersistedNullableDate() {
        return this.persistedNullableDate;
    }
}
