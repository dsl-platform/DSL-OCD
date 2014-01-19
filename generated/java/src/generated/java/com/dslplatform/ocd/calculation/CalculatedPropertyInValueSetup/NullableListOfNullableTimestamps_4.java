package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableTimestamps_4 implements
        java.io.Serializable {
    public NullableListOfNullableTimestamps_4(
            final java.util.List<org.joda.time.DateTime> nullableListOfNullableTimestamps,
            final java.util.List<org.joda.time.DateTime> calculatedNullableListOfNullableTimestamps,
            final java.util.List<org.joda.time.DateTime> persistedNullableListOfNullableTimestamps) {
        setNullableListOfNullableTimestamps(nullableListOfNullableTimestamps);
        this.calculatedNullableListOfNullableTimestamps = calculatedNullableListOfNullableTimestamps;
        this.persistedNullableListOfNullableTimestamps = persistedNullableListOfNullableTimestamps;
    }

    public NullableListOfNullableTimestamps_4() {
        this.calculatedNullableListOfNullableTimestamps = null;
        this.persistedNullableListOfNullableTimestamps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1080358317;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableTimestamps_4)) return false;
        final NullableListOfNullableTimestamps_4 other = (NullableListOfNullableTimestamps_4) obj;

        if (!(this.nullableListOfNullableTimestamps == other.nullableListOfNullableTimestamps || this.nullableListOfNullableTimestamps != null
                && this.nullableListOfNullableTimestamps
                        .equals(other.nullableListOfNullableTimestamps)))
            return false;
        if (!(this.calculatedNullableListOfNullableTimestamps == other.calculatedNullableListOfNullableTimestamps || this.calculatedNullableListOfNullableTimestamps != null
                && this.calculatedNullableListOfNullableTimestamps
                        .equals(other.calculatedNullableListOfNullableTimestamps)))
            return false;
        if (!(this.persistedNullableListOfNullableTimestamps == other.persistedNullableListOfNullableTimestamps || this.persistedNullableListOfNullableTimestamps != null
                && this.persistedNullableListOfNullableTimestamps
                        .equals(other.persistedNullableListOfNullableTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableTimestamps_4("
                + nullableListOfNullableTimestamps + ','
                + calculatedNullableListOfNullableTimestamps + ','
                + persistedNullableListOfNullableTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.DateTime> nullableListOfNullableTimestamps;

    @JsonProperty("nullableListOfNullableTimestamps")
    public java.util.List<org.joda.time.DateTime> getNullableListOfNullableTimestamps() {
        return nullableListOfNullableTimestamps;
    }

    public NullableListOfNullableTimestamps_4 setNullableListOfNullableTimestamps(
            final java.util.List<org.joda.time.DateTime> value) {
        this.nullableListOfNullableTimestamps = value;

        return this;
    }

    private final java.util.List<org.joda.time.DateTime> calculatedNullableListOfNullableTimestamps;

    public java.util.List<org.joda.time.DateTime> getCalculatedNullableListOfNullableTimestamps() {
        return this.calculatedNullableListOfNullableTimestamps;
    }

    private final java.util.List<org.joda.time.DateTime> persistedNullableListOfNullableTimestamps;

    public java.util.List<org.joda.time.DateTime> getPersistedNullableListOfNullableTimestamps() {
        return this.persistedNullableListOfNullableTimestamps;
    }
}
