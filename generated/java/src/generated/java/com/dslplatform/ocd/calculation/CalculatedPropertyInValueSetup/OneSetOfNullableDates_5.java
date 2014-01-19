package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableDates_5 implements java.io.Serializable {
    public OneSetOfNullableDates_5(
            final java.util.Set<org.joda.time.LocalDate> oneSetOfNullableDates,
            final java.util.Set<org.joda.time.LocalDate> calculatedOneSetOfNullableDates,
            final java.util.Set<org.joda.time.LocalDate> persistedOneSetOfNullableDates) {
        setOneSetOfNullableDates(oneSetOfNullableDates);
        this.calculatedOneSetOfNullableDates = calculatedOneSetOfNullableDates;
        this.persistedOneSetOfNullableDates = persistedOneSetOfNullableDates;
    }

    public OneSetOfNullableDates_5() {
        this.oneSetOfNullableDates = new java.util.HashSet<org.joda.time.LocalDate>();
        this.calculatedOneSetOfNullableDates = new java.util.HashSet<org.joda.time.LocalDate>();
        this.persistedOneSetOfNullableDates = new java.util.HashSet<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 625882841;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableDates_5)) return false;
        final OneSetOfNullableDates_5 other = (OneSetOfNullableDates_5) obj;

        if (!(this.oneSetOfNullableDates.equals(other.oneSetOfNullableDates)))
            return false;
        if (!(this.calculatedOneSetOfNullableDates
                .equals(other.calculatedOneSetOfNullableDates))) return false;
        if (!(this.persistedOneSetOfNullableDates
                .equals(other.persistedOneSetOfNullableDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableDates_5(" + oneSetOfNullableDates + ','
                + calculatedOneSetOfNullableDates + ','
                + persistedOneSetOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> oneSetOfNullableDates;

    @JsonProperty("oneSetOfNullableDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.LocalDate> getOneSetOfNullableDates() {
        return oneSetOfNullableDates;
    }

    public OneSetOfNullableDates_5 setOneSetOfNullableDates(
            final java.util.Set<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableDates\" cannot be null!");
        this.oneSetOfNullableDates = value;

        return this;
    }

    private final java.util.Set<org.joda.time.LocalDate> calculatedOneSetOfNullableDates;

    public java.util.Set<org.joda.time.LocalDate> getCalculatedOneSetOfNullableDates() {
        return this.calculatedOneSetOfNullableDates;
    }

    private final java.util.Set<org.joda.time.LocalDate> persistedOneSetOfNullableDates;

    public java.util.Set<org.joda.time.LocalDate> getPersistedOneSetOfNullableDates() {
        return this.persistedOneSetOfNullableDates;
    }
}
