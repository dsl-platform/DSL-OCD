package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneDate_5 implements java.io.Serializable {
    public OneDate_5(
            final org.joda.time.LocalDate oneDate,
            final org.joda.time.LocalDate calculatedOneDate,
            final org.joda.time.LocalDate persistedOneDate) {
        setOneDate(oneDate);
        this.calculatedOneDate = calculatedOneDate;
        this.persistedOneDate = persistedOneDate;
    }

    public OneDate_5() {
        this.oneDate = new org.joda.time.LocalDate();
        this.calculatedOneDate = new org.joda.time.LocalDate();
        this.persistedOneDate = new org.joda.time.LocalDate();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1900790354;
        result = prime * result
                + (this.oneDate != null ? this.oneDate.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedOneDate != null ? this.calculatedOneDate
                        .hashCode() : 0);
        result = prime
                * result
                + (this.persistedOneDate != null ? this.persistedOneDate
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneDate_5)) return false;
        final OneDate_5 other = (OneDate_5) obj;

        if (!(this.oneDate.equals(other.oneDate))) return false;
        if (!(this.calculatedOneDate.equals(other.calculatedOneDate)))
            return false;
        if (!(this.persistedOneDate.equals(other.persistedOneDate)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneDate_5(" + oneDate + ',' + calculatedOneDate + ','
                + persistedOneDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate oneDate;

    @JsonProperty("oneDate")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.LocalDate getOneDate() {
        return oneDate;
    }

    public OneDate_5 setOneDate(final org.joda.time.LocalDate value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneDate\" cannot be null!");
        this.oneDate = value;

        return this;
    }

    private final org.joda.time.LocalDate calculatedOneDate;

    public org.joda.time.LocalDate getCalculatedOneDate() {
        return this.calculatedOneDate;
    }

    private final org.joda.time.LocalDate persistedOneDate;

    public org.joda.time.LocalDate getPersistedOneDate() {
        return this.persistedOneDate;
    }
}
