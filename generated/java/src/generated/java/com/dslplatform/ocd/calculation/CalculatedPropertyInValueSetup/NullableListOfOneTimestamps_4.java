package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneTimestamps_4 implements
        java.io.Serializable {
    public NullableListOfOneTimestamps_4(
            final java.util.List<org.joda.time.DateTime> nullableListOfOneTimestamps,
            final java.util.List<org.joda.time.DateTime> calculatedNullableListOfOneTimestamps,
            final java.util.List<org.joda.time.DateTime> persistedNullableListOfOneTimestamps) {
        setNullableListOfOneTimestamps(nullableListOfOneTimestamps);
        this.calculatedNullableListOfOneTimestamps = calculatedNullableListOfOneTimestamps;
        this.persistedNullableListOfOneTimestamps = persistedNullableListOfOneTimestamps;
    }

    public NullableListOfOneTimestamps_4() {
        this.calculatedNullableListOfOneTimestamps = null;
        this.persistedNullableListOfOneTimestamps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 994556076;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneTimestamps_4)) return false;
        final NullableListOfOneTimestamps_4 other = (NullableListOfOneTimestamps_4) obj;

        if (!(this.nullableListOfOneTimestamps == other.nullableListOfOneTimestamps || this.nullableListOfOneTimestamps != null
                && this.nullableListOfOneTimestamps
                        .equals(other.nullableListOfOneTimestamps)))
            return false;
        if (!(this.calculatedNullableListOfOneTimestamps == other.calculatedNullableListOfOneTimestamps || this.calculatedNullableListOfOneTimestamps != null
                && this.calculatedNullableListOfOneTimestamps
                        .equals(other.calculatedNullableListOfOneTimestamps)))
            return false;
        if (!(this.persistedNullableListOfOneTimestamps == other.persistedNullableListOfOneTimestamps || this.persistedNullableListOfOneTimestamps != null
                && this.persistedNullableListOfOneTimestamps
                        .equals(other.persistedNullableListOfOneTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneTimestamps_4(" + nullableListOfOneTimestamps
                + ',' + calculatedNullableListOfOneTimestamps + ','
                + persistedNullableListOfOneTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.DateTime> nullableListOfOneTimestamps;

    @JsonProperty("nullableListOfOneTimestamps")
    public java.util.List<org.joda.time.DateTime> getNullableListOfOneTimestamps() {
        return nullableListOfOneTimestamps;
    }

    public NullableListOfOneTimestamps_4 setNullableListOfOneTimestamps(
            final java.util.List<org.joda.time.DateTime> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneTimestamps = value;

        return this;
    }

    private final java.util.List<org.joda.time.DateTime> calculatedNullableListOfOneTimestamps;

    public java.util.List<org.joda.time.DateTime> getCalculatedNullableListOfOneTimestamps() {
        return this.calculatedNullableListOfOneTimestamps;
    }

    private final java.util.List<org.joda.time.DateTime> persistedNullableListOfOneTimestamps;

    public java.util.List<org.joda.time.DateTime> getPersistedNullableListOfOneTimestamps() {
        return this.persistedNullableListOfOneTimestamps;
    }
}
