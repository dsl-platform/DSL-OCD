package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableTimestampsValue3 implements
        java.io.Serializable {
    public NullableListOfNullableTimestampsValue3(
            final java.util.List<org.joda.time.DateTime> nullableListOfNullableTimestamps) {
        setNullableListOfNullableTimestamps(nullableListOfNullableTimestamps);
    }

    public NullableListOfNullableTimestampsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 716121396;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableTimestampsValue3))
            return false;
        final NullableListOfNullableTimestampsValue3 other = (NullableListOfNullableTimestampsValue3) obj;

        if (!(this.nullableListOfNullableTimestamps == other.nullableListOfNullableTimestamps || this.nullableListOfNullableTimestamps != null
                && this.nullableListOfNullableTimestamps
                        .equals(other.nullableListOfNullableTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableTimestampsValue3("
                + nullableListOfNullableTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.DateTime> nullableListOfNullableTimestamps;

    @JsonProperty("nullableListOfNullableTimestamps")
    public java.util.List<org.joda.time.DateTime> getNullableListOfNullableTimestamps() {
        return nullableListOfNullableTimestamps;
    }

    public NullableListOfNullableTimestampsValue3 setNullableListOfNullableTimestamps(
            final java.util.List<org.joda.time.DateTime> value) {
        this.nullableListOfNullableTimestamps = value;

        return this;
    }
}
