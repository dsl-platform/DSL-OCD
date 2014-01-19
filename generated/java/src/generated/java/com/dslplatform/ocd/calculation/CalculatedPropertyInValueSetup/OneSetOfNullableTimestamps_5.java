package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableTimestamps_5 implements java.io.Serializable {
    public OneSetOfNullableTimestamps_5(
            final java.util.Set<org.joda.time.DateTime> oneSetOfNullableTimestamps,
            final java.util.Set<org.joda.time.DateTime> calculatedOneSetOfNullableTimestamps,
            final java.util.Set<org.joda.time.DateTime> persistedOneSetOfNullableTimestamps) {
        setOneSetOfNullableTimestamps(oneSetOfNullableTimestamps);
        this.calculatedOneSetOfNullableTimestamps = calculatedOneSetOfNullableTimestamps;
        this.persistedOneSetOfNullableTimestamps = persistedOneSetOfNullableTimestamps;
    }

    public OneSetOfNullableTimestamps_5() {
        this.oneSetOfNullableTimestamps = new java.util.HashSet<org.joda.time.DateTime>();
        this.calculatedOneSetOfNullableTimestamps = new java.util.HashSet<org.joda.time.DateTime>();
        this.persistedOneSetOfNullableTimestamps = new java.util.HashSet<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 353878129;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableTimestamps_5)) return false;
        final OneSetOfNullableTimestamps_5 other = (OneSetOfNullableTimestamps_5) obj;

        if (!(this.oneSetOfNullableTimestamps
                .equals(other.oneSetOfNullableTimestamps))) return false;
        if (!(this.calculatedOneSetOfNullableTimestamps
                .equals(other.calculatedOneSetOfNullableTimestamps)))
            return false;
        if (!(this.persistedOneSetOfNullableTimestamps
                .equals(other.persistedOneSetOfNullableTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableTimestamps_5(" + oneSetOfNullableTimestamps
                + ',' + calculatedOneSetOfNullableTimestamps + ','
                + persistedOneSetOfNullableTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> oneSetOfNullableTimestamps;

    @JsonProperty("oneSetOfNullableTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.DateTime> getOneSetOfNullableTimestamps() {
        return oneSetOfNullableTimestamps;
    }

    public OneSetOfNullableTimestamps_5 setOneSetOfNullableTimestamps(
            final java.util.Set<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableTimestamps\" cannot be null!");
        this.oneSetOfNullableTimestamps = value;

        return this;
    }

    private final java.util.Set<org.joda.time.DateTime> calculatedOneSetOfNullableTimestamps;

    public java.util.Set<org.joda.time.DateTime> getCalculatedOneSetOfNullableTimestamps() {
        return this.calculatedOneSetOfNullableTimestamps;
    }

    private final java.util.Set<org.joda.time.DateTime> persistedOneSetOfNullableTimestamps;

    public java.util.Set<org.joda.time.DateTime> getPersistedOneSetOfNullableTimestamps() {
        return this.persistedOneSetOfNullableTimestamps;
    }
}
