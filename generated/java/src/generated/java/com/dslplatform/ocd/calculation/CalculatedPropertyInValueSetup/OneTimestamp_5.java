package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneTimestamp_5 implements java.io.Serializable {
    public OneTimestamp_5(
            final org.joda.time.DateTime oneTimestamp,
            final org.joda.time.DateTime calculatedOneTimestamp,
            final org.joda.time.DateTime persistedOneTimestamp) {
        setOneTimestamp(oneTimestamp);
        this.calculatedOneTimestamp = calculatedOneTimestamp;
        this.persistedOneTimestamp = persistedOneTimestamp;
    }

    public OneTimestamp_5() {
        this.oneTimestamp = new org.joda.time.DateTime();
        this.calculatedOneTimestamp = new org.joda.time.DateTime();
        this.persistedOneTimestamp = new org.joda.time.DateTime();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1633304226;
        result = prime
                * result
                + (this.oneTimestamp != null ? this.oneTimestamp.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedOneTimestamp != null
                        ? this.calculatedOneTimestamp.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedOneTimestamp != null
                        ? this.persistedOneTimestamp.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneTimestamp_5)) return false;
        final OneTimestamp_5 other = (OneTimestamp_5) obj;

        if (!(this.oneTimestamp.equals(other.oneTimestamp))) return false;
        if (!(this.calculatedOneTimestamp.equals(other.calculatedOneTimestamp)))
            return false;
        if (!(this.persistedOneTimestamp.equals(other.persistedOneTimestamp)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneTimestamp_5(" + oneTimestamp + ',' + calculatedOneTimestamp
                + ',' + persistedOneTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime oneTimestamp;

    @JsonProperty("oneTimestamp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.DateTime getOneTimestamp() {
        return oneTimestamp;
    }

    public OneTimestamp_5 setOneTimestamp(final org.joda.time.DateTime value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneTimestamp\" cannot be null!");
        this.oneTimestamp = value;

        return this;
    }

    private final org.joda.time.DateTime calculatedOneTimestamp;

    public org.joda.time.DateTime getCalculatedOneTimestamp() {
        return this.calculatedOneTimestamp;
    }

    private final org.joda.time.DateTime persistedOneTimestamp;

    public org.joda.time.DateTime getPersistedOneTimestamp() {
        return this.persistedOneTimestamp;
    }
}
