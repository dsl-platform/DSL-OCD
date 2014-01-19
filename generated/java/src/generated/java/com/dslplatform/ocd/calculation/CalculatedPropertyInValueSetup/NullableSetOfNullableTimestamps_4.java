package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableTimestamps_4 implements
        java.io.Serializable {
    public NullableSetOfNullableTimestamps_4(
            final java.util.Set<org.joda.time.DateTime> nullableSetOfNullableTimestamps,
            final java.util.Set<org.joda.time.DateTime> calculatedNullableSetOfNullableTimestamps,
            final java.util.Set<org.joda.time.DateTime> persistedNullableSetOfNullableTimestamps) {
        setNullableSetOfNullableTimestamps(nullableSetOfNullableTimestamps);
        this.calculatedNullableSetOfNullableTimestamps = calculatedNullableSetOfNullableTimestamps;
        this.persistedNullableSetOfNullableTimestamps = persistedNullableSetOfNullableTimestamps;
    }

    public NullableSetOfNullableTimestamps_4() {
        this.calculatedNullableSetOfNullableTimestamps = null;
        this.persistedNullableSetOfNullableTimestamps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 101581481;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableTimestamps_4)) return false;
        final NullableSetOfNullableTimestamps_4 other = (NullableSetOfNullableTimestamps_4) obj;

        if (!(this.nullableSetOfNullableTimestamps == other.nullableSetOfNullableTimestamps || this.nullableSetOfNullableTimestamps != null
                && this.nullableSetOfNullableTimestamps
                        .equals(other.nullableSetOfNullableTimestamps)))
            return false;
        if (!(this.calculatedNullableSetOfNullableTimestamps == other.calculatedNullableSetOfNullableTimestamps || this.calculatedNullableSetOfNullableTimestamps != null
                && this.calculatedNullableSetOfNullableTimestamps
                        .equals(other.calculatedNullableSetOfNullableTimestamps)))
            return false;
        if (!(this.persistedNullableSetOfNullableTimestamps == other.persistedNullableSetOfNullableTimestamps || this.persistedNullableSetOfNullableTimestamps != null
                && this.persistedNullableSetOfNullableTimestamps
                        .equals(other.persistedNullableSetOfNullableTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableTimestamps_4("
                + nullableSetOfNullableTimestamps + ','
                + calculatedNullableSetOfNullableTimestamps + ','
                + persistedNullableSetOfNullableTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> nullableSetOfNullableTimestamps;

    @JsonProperty("nullableSetOfNullableTimestamps")
    public java.util.Set<org.joda.time.DateTime> getNullableSetOfNullableTimestamps() {
        return nullableSetOfNullableTimestamps;
    }

    public NullableSetOfNullableTimestamps_4 setNullableSetOfNullableTimestamps(
            final java.util.Set<org.joda.time.DateTime> value) {
        this.nullableSetOfNullableTimestamps = value;

        return this;
    }

    private final java.util.Set<org.joda.time.DateTime> calculatedNullableSetOfNullableTimestamps;

    public java.util.Set<org.joda.time.DateTime> getCalculatedNullableSetOfNullableTimestamps() {
        return this.calculatedNullableSetOfNullableTimestamps;
    }

    private final java.util.Set<org.joda.time.DateTime> persistedNullableSetOfNullableTimestamps;

    public java.util.Set<org.joda.time.DateTime> getPersistedNullableSetOfNullableTimestamps() {
        return this.persistedNullableSetOfNullableTimestamps;
    }
}
