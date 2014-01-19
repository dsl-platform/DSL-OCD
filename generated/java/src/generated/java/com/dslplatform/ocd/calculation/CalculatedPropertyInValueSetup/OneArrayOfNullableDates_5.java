package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableDates_5 implements java.io.Serializable {
    public OneArrayOfNullableDates_5(
            final org.joda.time.LocalDate[] oneArrayOfNullableDates,
            final org.joda.time.LocalDate[] calculatedOneArrayOfNullableDates,
            final org.joda.time.LocalDate[] persistedOneArrayOfNullableDates) {
        setOneArrayOfNullableDates(oneArrayOfNullableDates);
        this.calculatedOneArrayOfNullableDates = calculatedOneArrayOfNullableDates;
        this.persistedOneArrayOfNullableDates = persistedOneArrayOfNullableDates;
    }

    public OneArrayOfNullableDates_5() {
        this.oneArrayOfNullableDates = new org.joda.time.LocalDate[] {};
        this.calculatedOneArrayOfNullableDates = new org.joda.time.LocalDate[] {};
        this.persistedOneArrayOfNullableDates = new org.joda.time.LocalDate[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1257966036;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableDates_5)) return false;
        final OneArrayOfNullableDates_5 other = (OneArrayOfNullableDates_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableDates,
                other.oneArrayOfNullableDates))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfNullableDates,
                other.calculatedOneArrayOfNullableDates))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableDates,
                other.persistedOneArrayOfNullableDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableDates_5(" + oneArrayOfNullableDates + ','
                + calculatedOneArrayOfNullableDates + ','
                + persistedOneArrayOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] oneArrayOfNullableDates;

    @JsonProperty("oneArrayOfNullableDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.LocalDate[] getOneArrayOfNullableDates() {
        return oneArrayOfNullableDates;
    }

    public OneArrayOfNullableDates_5 setOneArrayOfNullableDates(
            final org.joda.time.LocalDate[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDates\" cannot be null!");
        this.oneArrayOfNullableDates = value;

        return this;
    }

    private final org.joda.time.LocalDate[] calculatedOneArrayOfNullableDates;

    public org.joda.time.LocalDate[] getCalculatedOneArrayOfNullableDates() {
        return this.calculatedOneArrayOfNullableDates;
    }

    private final org.joda.time.LocalDate[] persistedOneArrayOfNullableDates;

    public org.joda.time.LocalDate[] getPersistedOneArrayOfNullableDates() {
        return this.persistedOneArrayOfNullableDates;
    }
}
