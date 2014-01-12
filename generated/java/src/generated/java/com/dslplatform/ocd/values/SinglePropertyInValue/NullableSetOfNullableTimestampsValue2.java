package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableTimestampsValue2 implements
        java.io.Serializable {
    public NullableSetOfNullableTimestampsValue2(
            final java.util.Set<org.joda.time.DateTime> nullableSetOfNullableTimestamps) {
        setNullableSetOfNullableTimestamps(nullableSetOfNullableTimestamps);
    }

    public NullableSetOfNullableTimestampsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1955142295;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableTimestampsValue2))
            return false;
        final NullableSetOfNullableTimestampsValue2 other = (NullableSetOfNullableTimestampsValue2) obj;

        if (!(this.nullableSetOfNullableTimestamps == other.nullableSetOfNullableTimestamps || this.nullableSetOfNullableTimestamps != null
                && this.nullableSetOfNullableTimestamps
                        .equals(other.nullableSetOfNullableTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableTimestampsValue2("
                + nullableSetOfNullableTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> nullableSetOfNullableTimestamps;

    @JsonProperty("nullableSetOfNullableTimestamps")
    public java.util.Set<org.joda.time.DateTime> getNullableSetOfNullableTimestamps() {
        return nullableSetOfNullableTimestamps;
    }

    public NullableSetOfNullableTimestampsValue2 setNullableSetOfNullableTimestamps(
            final java.util.Set<org.joda.time.DateTime> value) {
        this.nullableSetOfNullableTimestamps = value;

        return this;
    }
}
