package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableTimestamps_5 implements
        java.io.Serializable {
    public OneListOfNullableTimestamps_5(
            final java.util.List<org.joda.time.DateTime> oneListOfNullableTimestamps,
            final java.util.List<org.joda.time.DateTime> calculatedOneListOfNullableTimestamps,
            final java.util.List<org.joda.time.DateTime> persistedOneListOfNullableTimestamps) {
        setOneListOfNullableTimestamps(oneListOfNullableTimestamps);
        this.calculatedOneListOfNullableTimestamps = calculatedOneListOfNullableTimestamps;
        this.persistedOneListOfNullableTimestamps = persistedOneListOfNullableTimestamps;
    }

    public OneListOfNullableTimestamps_5() {
        this.oneListOfNullableTimestamps = new java.util.ArrayList<org.joda.time.DateTime>();
        this.calculatedOneListOfNullableTimestamps = new java.util.ArrayList<org.joda.time.DateTime>();
        this.persistedOneListOfNullableTimestamps = new java.util.ArrayList<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1891213385;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableTimestamps_5)) return false;
        final OneListOfNullableTimestamps_5 other = (OneListOfNullableTimestamps_5) obj;

        if (!(this.oneListOfNullableTimestamps
                .equals(other.oneListOfNullableTimestamps))) return false;
        if (!(this.calculatedOneListOfNullableTimestamps
                .equals(other.calculatedOneListOfNullableTimestamps)))
            return false;
        if (!(this.persistedOneListOfNullableTimestamps
                .equals(other.persistedOneListOfNullableTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableTimestamps_5(" + oneListOfNullableTimestamps
                + ',' + calculatedOneListOfNullableTimestamps + ','
                + persistedOneListOfNullableTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.DateTime> oneListOfNullableTimestamps;

    @JsonProperty("oneListOfNullableTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.DateTime> getOneListOfNullableTimestamps() {
        return oneListOfNullableTimestamps;
    }

    public OneListOfNullableTimestamps_5 setOneListOfNullableTimestamps(
            final java.util.List<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableTimestamps\" cannot be null!");
        this.oneListOfNullableTimestamps = value;

        return this;
    }

    private final java.util.List<org.joda.time.DateTime> calculatedOneListOfNullableTimestamps;

    public java.util.List<org.joda.time.DateTime> getCalculatedOneListOfNullableTimestamps() {
        return this.calculatedOneListOfNullableTimestamps;
    }

    private final java.util.List<org.joda.time.DateTime> persistedOneListOfNullableTimestamps;

    public java.util.List<org.joda.time.DateTime> getPersistedOneListOfNullableTimestamps() {
        return this.persistedOneListOfNullableTimestamps;
    }
}
