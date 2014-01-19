package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableTimestamps_5 implements
        java.io.Serializable {
    public OneArrayOfNullableTimestamps_5(
            final org.joda.time.DateTime[] oneArrayOfNullableTimestamps,
            final org.joda.time.DateTime[] calculatedOneArrayOfNullableTimestamps,
            final org.joda.time.DateTime[] persistedOneArrayOfNullableTimestamps) {
        setOneArrayOfNullableTimestamps(oneArrayOfNullableTimestamps);
        this.calculatedOneArrayOfNullableTimestamps = calculatedOneArrayOfNullableTimestamps;
        this.persistedOneArrayOfNullableTimestamps = persistedOneArrayOfNullableTimestamps;
    }

    public OneArrayOfNullableTimestamps_5() {
        this.oneArrayOfNullableTimestamps = new org.joda.time.DateTime[] {};
        this.calculatedOneArrayOfNullableTimestamps = new org.joda.time.DateTime[] {};
        this.persistedOneArrayOfNullableTimestamps = new org.joda.time.DateTime[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 152039722;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableTimestamps_5)) return false;
        final OneArrayOfNullableTimestamps_5 other = (OneArrayOfNullableTimestamps_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableTimestamps,
                other.oneArrayOfNullableTimestamps))) return false;
        if (!(java.util.Arrays.equals(
                this.calculatedOneArrayOfNullableTimestamps,
                other.calculatedOneArrayOfNullableTimestamps))) return false;
        if (!(java.util.Arrays.equals(
                this.persistedOneArrayOfNullableTimestamps,
                other.persistedOneArrayOfNullableTimestamps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableTimestamps_5(" + oneArrayOfNullableTimestamps
                + ',' + calculatedOneArrayOfNullableTimestamps + ','
                + persistedOneArrayOfNullableTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime[] oneArrayOfNullableTimestamps;

    @JsonProperty("oneArrayOfNullableTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.DateTime[] getOneArrayOfNullableTimestamps() {
        return oneArrayOfNullableTimestamps;
    }

    public OneArrayOfNullableTimestamps_5 setOneArrayOfNullableTimestamps(
            final org.joda.time.DateTime[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableTimestamps\" cannot be null!");
        this.oneArrayOfNullableTimestamps = value;

        return this;
    }

    private final org.joda.time.DateTime[] calculatedOneArrayOfNullableTimestamps;

    public org.joda.time.DateTime[] getCalculatedOneArrayOfNullableTimestamps() {
        return this.calculatedOneArrayOfNullableTimestamps;
    }

    private final org.joda.time.DateTime[] persistedOneArrayOfNullableTimestamps;

    public org.joda.time.DateTime[] getPersistedOneArrayOfNullableTimestamps() {
        return this.persistedOneArrayOfNullableTimestamps;
    }
}
