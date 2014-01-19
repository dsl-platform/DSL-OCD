package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableTimestamps_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableTimestamps_4(
            final org.joda.time.DateTime[] nullableArrayOfNullableTimestamps,
            final org.joda.time.DateTime[] calculatedNullableArrayOfNullableTimestamps,
            final org.joda.time.DateTime[] persistedNullableArrayOfNullableTimestamps) {
        setNullableArrayOfNullableTimestamps(nullableArrayOfNullableTimestamps);
        this.calculatedNullableArrayOfNullableTimestamps = calculatedNullableArrayOfNullableTimestamps;
        this.persistedNullableArrayOfNullableTimestamps = persistedNullableArrayOfNullableTimestamps;
    }

    public NullableArrayOfNullableTimestamps_4() {
        this.calculatedNullableArrayOfNullableTimestamps = null;
        this.persistedNullableArrayOfNullableTimestamps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1495998010;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableTimestamps_4))
            return false;
        final NullableArrayOfNullableTimestamps_4 other = (NullableArrayOfNullableTimestamps_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableTimestamps,
                other.nullableArrayOfNullableTimestamps))) return false;
        if (!(this.calculatedNullableArrayOfNullableTimestamps == other.calculatedNullableArrayOfNullableTimestamps || this.calculatedNullableArrayOfNullableTimestamps != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableTimestamps,
                        other.calculatedNullableArrayOfNullableTimestamps)))
            return false;
        if (!(this.persistedNullableArrayOfNullableTimestamps == other.persistedNullableArrayOfNullableTimestamps || this.persistedNullableArrayOfNullableTimestamps != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableTimestamps,
                        other.persistedNullableArrayOfNullableTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableTimestamps_4("
                + nullableArrayOfNullableTimestamps + ','
                + calculatedNullableArrayOfNullableTimestamps + ','
                + persistedNullableArrayOfNullableTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime[] nullableArrayOfNullableTimestamps;

    @JsonProperty("nullableArrayOfNullableTimestamps")
    public org.joda.time.DateTime[] getNullableArrayOfNullableTimestamps() {
        return nullableArrayOfNullableTimestamps;
    }

    public NullableArrayOfNullableTimestamps_4 setNullableArrayOfNullableTimestamps(
            final org.joda.time.DateTime[] value) {
        this.nullableArrayOfNullableTimestamps = value;

        return this;
    }

    private final org.joda.time.DateTime[] calculatedNullableArrayOfNullableTimestamps;

    public org.joda.time.DateTime[] getCalculatedNullableArrayOfNullableTimestamps() {
        return this.calculatedNullableArrayOfNullableTimestamps;
    }

    private final org.joda.time.DateTime[] persistedNullableArrayOfNullableTimestamps;

    public org.joda.time.DateTime[] getPersistedNullableArrayOfNullableTimestamps() {
        return this.persistedNullableArrayOfNullableTimestamps;
    }
}
