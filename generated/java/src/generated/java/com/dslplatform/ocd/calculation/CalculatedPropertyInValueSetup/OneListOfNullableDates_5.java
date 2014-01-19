package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableDates_5 implements java.io.Serializable {
    public OneListOfNullableDates_5(
            final java.util.List<org.joda.time.LocalDate> oneListOfNullableDates,
            final java.util.List<org.joda.time.LocalDate> calculatedOneListOfNullableDates,
            final java.util.List<org.joda.time.LocalDate> persistedOneListOfNullableDates) {
        setOneListOfNullableDates(oneListOfNullableDates);
        this.calculatedOneListOfNullableDates = calculatedOneListOfNullableDates;
        this.persistedOneListOfNullableDates = persistedOneListOfNullableDates;
    }

    public OneListOfNullableDates_5() {
        this.oneListOfNullableDates = new java.util.ArrayList<org.joda.time.LocalDate>();
        this.calculatedOneListOfNullableDates = new java.util.ArrayList<org.joda.time.LocalDate>();
        this.persistedOneListOfNullableDates = new java.util.ArrayList<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1187525563;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableDates_5)) return false;
        final OneListOfNullableDates_5 other = (OneListOfNullableDates_5) obj;

        if (!(this.oneListOfNullableDates.equals(other.oneListOfNullableDates)))
            return false;
        if (!(this.calculatedOneListOfNullableDates
                .equals(other.calculatedOneListOfNullableDates))) return false;
        if (!(this.persistedOneListOfNullableDates
                .equals(other.persistedOneListOfNullableDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableDates_5(" + oneListOfNullableDates + ','
                + calculatedOneListOfNullableDates + ','
                + persistedOneListOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> oneListOfNullableDates;

    @JsonProperty("oneListOfNullableDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.LocalDate> getOneListOfNullableDates() {
        return oneListOfNullableDates;
    }

    public OneListOfNullableDates_5 setOneListOfNullableDates(
            final java.util.List<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableDates\" cannot be null!");
        this.oneListOfNullableDates = value;

        return this;
    }

    private final java.util.List<org.joda.time.LocalDate> calculatedOneListOfNullableDates;

    public java.util.List<org.joda.time.LocalDate> getCalculatedOneListOfNullableDates() {
        return this.calculatedOneListOfNullableDates;
    }

    private final java.util.List<org.joda.time.LocalDate> persistedOneListOfNullableDates;

    public java.util.List<org.joda.time.LocalDate> getPersistedOneListOfNullableDates() {
        return this.persistedOneListOfNullableDates;
    }
}
