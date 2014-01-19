package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableTimestamp_4 implements java.io.Serializable {
    public NullableTimestamp_4(
            final org.joda.time.DateTime nullableTimestamp,
            final org.joda.time.DateTime calculatedNullableTimestamp,
            final org.joda.time.DateTime persistedNullableTimestamp) {
        setNullableTimestamp(nullableTimestamp);
        this.calculatedNullableTimestamp = calculatedNullableTimestamp;
        this.persistedNullableTimestamp = persistedNullableTimestamp;
    }

    public NullableTimestamp_4() {
        this.calculatedNullableTimestamp = null;
        this.persistedNullableTimestamp = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1927300922;
        result = prime
                * result
                + (this.nullableTimestamp != null ? this.nullableTimestamp
                        .hashCode() : 0);
        result = prime
                * result
                + (this.calculatedNullableTimestamp != null
                        ? this.calculatedNullableTimestamp.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableTimestamp != null
                        ? this.persistedNullableTimestamp.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableTimestamp_4)) return false;
        final NullableTimestamp_4 other = (NullableTimestamp_4) obj;

        if (!(this.nullableTimestamp == other.nullableTimestamp || this.nullableTimestamp != null
                && this.nullableTimestamp.equals(other.nullableTimestamp)))
            return false;
        if (!(this.calculatedNullableTimestamp == other.calculatedNullableTimestamp || this.calculatedNullableTimestamp != null
                && this.calculatedNullableTimestamp
                        .equals(other.calculatedNullableTimestamp)))
            return false;
        if (!(this.persistedNullableTimestamp == other.persistedNullableTimestamp || this.persistedNullableTimestamp != null
                && this.persistedNullableTimestamp
                        .equals(other.persistedNullableTimestamp)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableTimestamp_4(" + nullableTimestamp + ','
                + calculatedNullableTimestamp + ','
                + persistedNullableTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime nullableTimestamp;

    @JsonProperty("nullableTimestamp")
    public org.joda.time.DateTime getNullableTimestamp() {
        return nullableTimestamp;
    }

    public NullableTimestamp_4 setNullableTimestamp(
            final org.joda.time.DateTime value) {
        this.nullableTimestamp = value;

        return this;
    }

    private final org.joda.time.DateTime calculatedNullableTimestamp;

    public org.joda.time.DateTime getCalculatedNullableTimestamp() {
        return this.calculatedNullableTimestamp;
    }

    private final org.joda.time.DateTime persistedNullableTimestamp;

    public org.joda.time.DateTime getPersistedNullableTimestamp() {
        return this.persistedNullableTimestamp;
    }
}
