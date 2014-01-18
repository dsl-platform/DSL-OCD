package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableTimestamp_1 implements java.io.Serializable {
    public NullableTimestamp_1(
            final org.joda.time.DateTime nullableTimestamp) {
        setNullableTimestamp(nullableTimestamp);
    }

    public NullableTimestamp_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1927300917;
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

        if (!(obj instanceof NullableTimestamp_1)) return false;
        final NullableTimestamp_1 other = (NullableTimestamp_1) obj;

        if (!(this.nullableTimestamp == other.nullableTimestamp || this.nullableTimestamp != null
                && this.nullableTimestamp.equals(other.nullableTimestamp)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableTimestamp_1(" + nullableTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime nullableTimestamp;

    @JsonProperty("nullableTimestamp")
    public org.joda.time.DateTime getNullableTimestamp() {
        return nullableTimestamp;
    }

    public NullableTimestamp_1 setNullableTimestamp(
            final org.joda.time.DateTime value) {
        this.nullableTimestamp = value;

        return this;
    }
}
