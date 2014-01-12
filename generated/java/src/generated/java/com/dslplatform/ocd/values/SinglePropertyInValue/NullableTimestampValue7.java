package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableTimestampValue7 implements java.io.Serializable {
    public NullableTimestampValue7(
            final org.joda.time.DateTime nullableTimestamp) {
        setNullableTimestamp(nullableTimestamp);
    }

    public NullableTimestampValue7() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 814103975;
        result = prime
                * result
                + (this.nullableTimestamp != null ? this.nullableTimestamp
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableTimestampValue7)) return false;
        final NullableTimestampValue7 other = (NullableTimestampValue7) obj;

        if (!(this.nullableTimestamp == other.nullableTimestamp || this.nullableTimestamp != null
                && this.nullableTimestamp.equals(other.nullableTimestamp)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableTimestampValue7(" + nullableTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime nullableTimestamp;

    @JsonProperty("nullableTimestamp")
    public org.joda.time.DateTime getNullableTimestamp() {
        return nullableTimestamp;
    }

    public NullableTimestampValue7 setNullableTimestamp(
            final org.joda.time.DateTime value) {
        this.nullableTimestamp = value;

        return this;
    }
}
