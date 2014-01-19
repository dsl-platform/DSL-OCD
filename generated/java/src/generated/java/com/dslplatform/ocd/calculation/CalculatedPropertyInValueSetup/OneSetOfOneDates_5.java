package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneDates_5 implements java.io.Serializable {
    public OneSetOfOneDates_5(
            final java.util.Set<org.joda.time.LocalDate> oneSetOfOneDates,
            final java.util.Set<org.joda.time.LocalDate> calculatedOneSetOfOneDates,
            final java.util.Set<org.joda.time.LocalDate> persistedOneSetOfOneDates) {
        setOneSetOfOneDates(oneSetOfOneDates);
        this.calculatedOneSetOfOneDates = calculatedOneSetOfOneDates;
        this.persistedOneSetOfOneDates = persistedOneSetOfOneDates;
    }

    public OneSetOfOneDates_5() {
        this.oneSetOfOneDates = new java.util.HashSet<org.joda.time.LocalDate>();
        this.calculatedOneSetOfOneDates = new java.util.HashSet<org.joda.time.LocalDate>();
        this.persistedOneSetOfOneDates = new java.util.HashSet<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 413288018;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneDates_5)) return false;
        final OneSetOfOneDates_5 other = (OneSetOfOneDates_5) obj;

        if (!(this.oneSetOfOneDates.equals(other.oneSetOfOneDates)))
            return false;
        if (!(this.calculatedOneSetOfOneDates
                .equals(other.calculatedOneSetOfOneDates))) return false;
        if (!(this.persistedOneSetOfOneDates
                .equals(other.persistedOneSetOfOneDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneDates_5(" + oneSetOfOneDates + ','
                + calculatedOneSetOfOneDates + ',' + persistedOneSetOfOneDates
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> oneSetOfOneDates;

    @JsonProperty("oneSetOfOneDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.LocalDate> getOneSetOfOneDates() {
        return oneSetOfOneDates;
    }

    public OneSetOfOneDates_5 setOneSetOfOneDates(
            final java.util.Set<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneDates\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneDates = value;

        return this;
    }

    private final java.util.Set<org.joda.time.LocalDate> calculatedOneSetOfOneDates;

    public java.util.Set<org.joda.time.LocalDate> getCalculatedOneSetOfOneDates() {
        return this.calculatedOneSetOfOneDates;
    }

    private final java.util.Set<org.joda.time.LocalDate> persistedOneSetOfOneDates;

    public java.util.Set<org.joda.time.LocalDate> getPersistedOneSetOfOneDates() {
        return this.persistedOneSetOfOneDates;
    }
}
