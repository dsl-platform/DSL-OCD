package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneDates_4 implements java.io.Serializable {
    public NullableArrayOfOneDates_4(
            final org.joda.time.LocalDate[] nullableArrayOfOneDates,
            final org.joda.time.LocalDate[] calculatedNullableArrayOfOneDates,
            final org.joda.time.LocalDate[] persistedNullableArrayOfOneDates) {
        setNullableArrayOfOneDates(nullableArrayOfOneDates);
        this.calculatedNullableArrayOfOneDates = calculatedNullableArrayOfOneDates;
        this.persistedNullableArrayOfOneDates = persistedNullableArrayOfOneDates;
    }

    public NullableArrayOfOneDates_4() {
        this.calculatedNullableArrayOfOneDates = null;
        this.persistedNullableArrayOfOneDates = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 806047341;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneDates_4)) return false;
        final NullableArrayOfOneDates_4 other = (NullableArrayOfOneDates_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneDates,
                other.nullableArrayOfOneDates))) return false;
        if (!(this.calculatedNullableArrayOfOneDates == other.calculatedNullableArrayOfOneDates || this.calculatedNullableArrayOfOneDates != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneDates,
                        other.calculatedNullableArrayOfOneDates)))
            return false;
        if (!(this.persistedNullableArrayOfOneDates == other.persistedNullableArrayOfOneDates || this.persistedNullableArrayOfOneDates != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneDates,
                        other.persistedNullableArrayOfOneDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneDates_4(" + nullableArrayOfOneDates + ','
                + calculatedNullableArrayOfOneDates + ','
                + persistedNullableArrayOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] nullableArrayOfOneDates;

    @JsonProperty("nullableArrayOfOneDates")
    public org.joda.time.LocalDate[] getNullableArrayOfOneDates() {
        return nullableArrayOfOneDates;
    }

    public NullableArrayOfOneDates_4 setNullableArrayOfOneDates(
            final org.joda.time.LocalDate[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneDates = value;

        return this;
    }

    private final org.joda.time.LocalDate[] calculatedNullableArrayOfOneDates;

    public org.joda.time.LocalDate[] getCalculatedNullableArrayOfOneDates() {
        return this.calculatedNullableArrayOfOneDates;
    }

    private final org.joda.time.LocalDate[] persistedNullableArrayOfOneDates;

    public org.joda.time.LocalDate[] getPersistedNullableArrayOfOneDates() {
        return this.persistedNullableArrayOfOneDates;
    }
}
