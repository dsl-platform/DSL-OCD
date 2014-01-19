package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneTimestamps_4 implements
        java.io.Serializable {
    public NullableArrayOfOneTimestamps_4(
            final org.joda.time.DateTime[] nullableArrayOfOneTimestamps,
            final org.joda.time.DateTime[] calculatedNullableArrayOfOneTimestamps,
            final org.joda.time.DateTime[] persistedNullableArrayOfOneTimestamps) {
        setNullableArrayOfOneTimestamps(nullableArrayOfOneTimestamps);
        this.calculatedNullableArrayOfOneTimestamps = calculatedNullableArrayOfOneTimestamps;
        this.persistedNullableArrayOfOneTimestamps = persistedNullableArrayOfOneTimestamps;
    }

    public NullableArrayOfOneTimestamps_4() {
        this.calculatedNullableArrayOfOneTimestamps = null;
        this.persistedNullableArrayOfOneTimestamps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 829795833;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneTimestamps_4)) return false;
        final NullableArrayOfOneTimestamps_4 other = (NullableArrayOfOneTimestamps_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneTimestamps,
                other.nullableArrayOfOneTimestamps))) return false;
        if (!(this.calculatedNullableArrayOfOneTimestamps == other.calculatedNullableArrayOfOneTimestamps || this.calculatedNullableArrayOfOneTimestamps != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneTimestamps,
                        other.calculatedNullableArrayOfOneTimestamps)))
            return false;
        if (!(this.persistedNullableArrayOfOneTimestamps == other.persistedNullableArrayOfOneTimestamps || this.persistedNullableArrayOfOneTimestamps != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneTimestamps,
                        other.persistedNullableArrayOfOneTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneTimestamps_4(" + nullableArrayOfOneTimestamps
                + ',' + calculatedNullableArrayOfOneTimestamps + ','
                + persistedNullableArrayOfOneTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime[] nullableArrayOfOneTimestamps;

    @JsonProperty("nullableArrayOfOneTimestamps")
    public org.joda.time.DateTime[] getNullableArrayOfOneTimestamps() {
        return nullableArrayOfOneTimestamps;
    }

    public NullableArrayOfOneTimestamps_4 setNullableArrayOfOneTimestamps(
            final org.joda.time.DateTime[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneTimestamps = value;

        return this;
    }

    private final org.joda.time.DateTime[] calculatedNullableArrayOfOneTimestamps;

    public org.joda.time.DateTime[] getCalculatedNullableArrayOfOneTimestamps() {
        return this.calculatedNullableArrayOfOneTimestamps;
    }

    private final org.joda.time.DateTime[] persistedNullableArrayOfOneTimestamps;

    public org.joda.time.DateTime[] getPersistedNullableArrayOfOneTimestamps() {
        return this.persistedNullableArrayOfOneTimestamps;
    }
}
