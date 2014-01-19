package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneDates_5 implements java.io.Serializable {
    public OneArrayOfOneDates_5(
            final org.joda.time.LocalDate[] oneArrayOfOneDates,
            final org.joda.time.LocalDate[] calculatedOneArrayOfOneDates,
            final org.joda.time.LocalDate[] persistedOneArrayOfOneDates) {
        setOneArrayOfOneDates(oneArrayOfOneDates);
        this.calculatedOneArrayOfOneDates = calculatedOneArrayOfOneDates;
        this.persistedOneArrayOfOneDates = persistedOneArrayOfOneDates;
    }

    public OneArrayOfOneDates_5() {
        this.oneArrayOfOneDates = new org.joda.time.LocalDate[] {};
        this.calculatedOneArrayOfOneDates = new org.joda.time.LocalDate[] {};
        this.persistedOneArrayOfOneDates = new org.joda.time.LocalDate[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 854774435;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneDates_5)) return false;
        final OneArrayOfOneDates_5 other = (OneArrayOfOneDates_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneDates,
                other.oneArrayOfOneDates))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneDates,
                other.calculatedOneArrayOfOneDates))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneDates,
                other.persistedOneArrayOfOneDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneDates_5(" + oneArrayOfOneDates + ','
                + calculatedOneArrayOfOneDates + ','
                + persistedOneArrayOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] oneArrayOfOneDates;

    @JsonProperty("oneArrayOfOneDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.LocalDate[] getOneArrayOfOneDates() {
        return oneArrayOfOneDates;
    }

    public OneArrayOfOneDates_5 setOneArrayOfOneDates(
            final org.joda.time.LocalDate[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDates\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneDates = value;

        return this;
    }

    private final org.joda.time.LocalDate[] calculatedOneArrayOfOneDates;

    public org.joda.time.LocalDate[] getCalculatedOneArrayOfOneDates() {
        return this.calculatedOneArrayOfOneDates;
    }

    private final org.joda.time.LocalDate[] persistedOneArrayOfOneDates;

    public org.joda.time.LocalDate[] getPersistedOneArrayOfOneDates() {
        return this.persistedOneArrayOfOneDates;
    }
}
