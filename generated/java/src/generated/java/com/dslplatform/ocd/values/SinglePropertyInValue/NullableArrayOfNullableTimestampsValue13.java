package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableTimestampsValue13 implements
        java.io.Serializable {
    public NullableArrayOfNullableTimestampsValue13(
            final org.joda.time.DateTime[] nullableArrayOfNullableTimestamps) {
        setNullableArrayOfNullableTimestamps(nullableArrayOfNullableTimestamps);
    }

    public NullableArrayOfNullableTimestampsValue13() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 14365590;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableTimestampsValue13))
            return false;
        final NullableArrayOfNullableTimestampsValue13 other = (NullableArrayOfNullableTimestampsValue13) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableTimestamps,
                other.nullableArrayOfNullableTimestamps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableTimestampsValue13("
                + nullableArrayOfNullableTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime[] nullableArrayOfNullableTimestamps;

    @JsonProperty("nullableArrayOfNullableTimestamps")
    public org.joda.time.DateTime[] getNullableArrayOfNullableTimestamps() {
        return nullableArrayOfNullableTimestamps;
    }

    public NullableArrayOfNullableTimestampsValue13 setNullableArrayOfNullableTimestamps(
            final org.joda.time.DateTime[] value) {
        this.nullableArrayOfNullableTimestamps = value;

        return this;
    }
}
