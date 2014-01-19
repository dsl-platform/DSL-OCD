package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneDates_5 implements java.io.Serializable {
    public OneListOfOneDates_5(
            final java.util.List<org.joda.time.LocalDate> oneListOfOneDates,
            final java.util.List<org.joda.time.LocalDate> calculatedOneListOfOneDates,
            final java.util.List<org.joda.time.LocalDate> persistedOneListOfOneDates) {
        setOneListOfOneDates(oneListOfOneDates);
        this.calculatedOneListOfOneDates = calculatedOneListOfOneDates;
        this.persistedOneListOfOneDates = persistedOneListOfOneDates;
    }

    public OneListOfOneDates_5() {
        this.oneListOfOneDates = new java.util.ArrayList<org.joda.time.LocalDate>();
        this.calculatedOneListOfOneDates = new java.util.ArrayList<org.joda.time.LocalDate>();
        this.persistedOneListOfOneDates = new java.util.ArrayList<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 3288894;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneDates_5)) return false;
        final OneListOfOneDates_5 other = (OneListOfOneDates_5) obj;

        if (!(this.oneListOfOneDates.equals(other.oneListOfOneDates)))
            return false;
        if (!(this.calculatedOneListOfOneDates
                .equals(other.calculatedOneListOfOneDates))) return false;
        if (!(this.persistedOneListOfOneDates
                .equals(other.persistedOneListOfOneDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneDates_5(" + oneListOfOneDates + ','
                + calculatedOneListOfOneDates + ','
                + persistedOneListOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> oneListOfOneDates;

    @JsonProperty("oneListOfOneDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.LocalDate> getOneListOfOneDates() {
        return oneListOfOneDates;
    }

    public OneListOfOneDates_5 setOneListOfOneDates(
            final java.util.List<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneDates\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneDates = value;

        return this;
    }

    private final java.util.List<org.joda.time.LocalDate> calculatedOneListOfOneDates;

    public java.util.List<org.joda.time.LocalDate> getCalculatedOneListOfOneDates() {
        return this.calculatedOneListOfOneDates;
    }

    private final java.util.List<org.joda.time.LocalDate> persistedOneListOfOneDates;

    public java.util.List<org.joda.time.LocalDate> getPersistedOneListOfOneDates() {
        return this.persistedOneListOfOneDates;
    }
}
