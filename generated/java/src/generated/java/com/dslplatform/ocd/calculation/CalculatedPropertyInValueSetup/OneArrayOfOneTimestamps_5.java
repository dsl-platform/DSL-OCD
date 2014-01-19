package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneTimestamps_5 implements java.io.Serializable {
    public OneArrayOfOneTimestamps_5(
            final org.joda.time.DateTime[] oneArrayOfOneTimestamps,
            final org.joda.time.DateTime[] calculatedOneArrayOfOneTimestamps,
            final org.joda.time.DateTime[] persistedOneArrayOfOneTimestamps) {
        setOneArrayOfOneTimestamps(oneArrayOfOneTimestamps);
        this.calculatedOneArrayOfOneTimestamps = calculatedOneArrayOfOneTimestamps;
        this.persistedOneArrayOfOneTimestamps = persistedOneArrayOfOneTimestamps;
    }

    public OneArrayOfOneTimestamps_5() {
        this.oneArrayOfOneTimestamps = new org.joda.time.DateTime[] {};
        this.calculatedOneArrayOfOneTimestamps = new org.joda.time.DateTime[] {};
        this.persistedOneArrayOfOneTimestamps = new org.joda.time.DateTime[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1125156565;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneTimestamps_5)) return false;
        final OneArrayOfOneTimestamps_5 other = (OneArrayOfOneTimestamps_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneTimestamps,
                other.oneArrayOfOneTimestamps))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneTimestamps,
                other.calculatedOneArrayOfOneTimestamps))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneTimestamps,
                other.persistedOneArrayOfOneTimestamps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneTimestamps_5(" + oneArrayOfOneTimestamps + ','
                + calculatedOneArrayOfOneTimestamps + ','
                + persistedOneArrayOfOneTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime[] oneArrayOfOneTimestamps;

    @JsonProperty("oneArrayOfOneTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.DateTime[] getOneArrayOfOneTimestamps() {
        return oneArrayOfOneTimestamps;
    }

    public OneArrayOfOneTimestamps_5 setOneArrayOfOneTimestamps(
            final org.joda.time.DateTime[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneTimestamps\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneTimestamps = value;

        return this;
    }

    private final org.joda.time.DateTime[] calculatedOneArrayOfOneTimestamps;

    public org.joda.time.DateTime[] getCalculatedOneArrayOfOneTimestamps() {
        return this.calculatedOneArrayOfOneTimestamps;
    }

    private final org.joda.time.DateTime[] persistedOneArrayOfOneTimestamps;

    public org.joda.time.DateTime[] getPersistedOneArrayOfOneTimestamps() {
        return this.persistedOneArrayOfOneTimestamps;
    }
}
