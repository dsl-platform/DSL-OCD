package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneTimestamps_4 implements java.io.Serializable {
    public NullableSetOfOneTimestamps_4(
            final java.util.Set<org.joda.time.DateTime> nullableSetOfOneTimestamps,
            final java.util.Set<org.joda.time.DateTime> calculatedNullableSetOfOneTimestamps,
            final java.util.Set<org.joda.time.DateTime> persistedNullableSetOfOneTimestamps) {
        setNullableSetOfOneTimestamps(nullableSetOfOneTimestamps);
        this.calculatedNullableSetOfOneTimestamps = calculatedNullableSetOfOneTimestamps;
        this.persistedNullableSetOfOneTimestamps = persistedNullableSetOfOneTimestamps;
    }

    public NullableSetOfOneTimestamps_4() {
        this.calculatedNullableSetOfOneTimestamps = null;
        this.persistedNullableSetOfOneTimestamps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 933231346;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneTimestamps_4)) return false;
        final NullableSetOfOneTimestamps_4 other = (NullableSetOfOneTimestamps_4) obj;

        if (!(this.nullableSetOfOneTimestamps == other.nullableSetOfOneTimestamps || this.nullableSetOfOneTimestamps != null
                && this.nullableSetOfOneTimestamps
                        .equals(other.nullableSetOfOneTimestamps)))
            return false;
        if (!(this.calculatedNullableSetOfOneTimestamps == other.calculatedNullableSetOfOneTimestamps || this.calculatedNullableSetOfOneTimestamps != null
                && this.calculatedNullableSetOfOneTimestamps
                        .equals(other.calculatedNullableSetOfOneTimestamps)))
            return false;
        if (!(this.persistedNullableSetOfOneTimestamps == other.persistedNullableSetOfOneTimestamps || this.persistedNullableSetOfOneTimestamps != null
                && this.persistedNullableSetOfOneTimestamps
                        .equals(other.persistedNullableSetOfOneTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneTimestamps_4(" + nullableSetOfOneTimestamps
                + ',' + calculatedNullableSetOfOneTimestamps + ','
                + persistedNullableSetOfOneTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> nullableSetOfOneTimestamps;

    @JsonProperty("nullableSetOfOneTimestamps")
    public java.util.Set<org.joda.time.DateTime> getNullableSetOfOneTimestamps() {
        return nullableSetOfOneTimestamps;
    }

    public NullableSetOfOneTimestamps_4 setNullableSetOfOneTimestamps(
            final java.util.Set<org.joda.time.DateTime> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneTimestamps = value;

        return this;
    }

    private final java.util.Set<org.joda.time.DateTime> calculatedNullableSetOfOneTimestamps;

    public java.util.Set<org.joda.time.DateTime> getCalculatedNullableSetOfOneTimestamps() {
        return this.calculatedNullableSetOfOneTimestamps;
    }

    private final java.util.Set<org.joda.time.DateTime> persistedNullableSetOfOneTimestamps;

    public java.util.Set<org.joda.time.DateTime> getPersistedNullableSetOfOneTimestamps() {
        return this.persistedNullableSetOfOneTimestamps;
    }
}
