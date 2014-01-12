package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableTimestampValue3 implements java.io.Serializable {
    public NullableTimestampValue3(
            final org.joda.time.DateTime nullableTimestamp) {
        setNullableTimestamp(nullableTimestamp);
    }

    public NullableTimestampValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 814103979;
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

        if (!(obj instanceof NullableTimestampValue3)) return false;
        final NullableTimestampValue3 other = (NullableTimestampValue3) obj;

        if (!(this.nullableTimestamp == other.nullableTimestamp || this.nullableTimestamp != null
                && this.nullableTimestamp.equals(other.nullableTimestamp)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableTimestampValue3(" + nullableTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime nullableTimestamp;

    @JsonProperty("nullableTimestamp")
    public org.joda.time.DateTime getNullableTimestamp() {
        return nullableTimestamp;
    }

    public NullableTimestampValue3 setNullableTimestamp(
            final org.joda.time.DateTime value) {
        this.nullableTimestamp = value;

        return this;
    }
}
