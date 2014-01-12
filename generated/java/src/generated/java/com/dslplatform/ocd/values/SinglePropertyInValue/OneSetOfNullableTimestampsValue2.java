package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableTimestampsValue2 implements
        java.io.Serializable {
    public OneSetOfNullableTimestampsValue2(
            final java.util.Set<org.joda.time.DateTime> oneSetOfNullableTimestamps) {
        setOneSetOfNullableTimestamps(oneSetOfNullableTimestamps);
    }

    public OneSetOfNullableTimestampsValue2() {
        this.oneSetOfNullableTimestamps = new java.util.HashSet<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1913006798;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableTimestampsValue2)) return false;
        final OneSetOfNullableTimestampsValue2 other = (OneSetOfNullableTimestampsValue2) obj;

        if (!(this.oneSetOfNullableTimestamps
                .equals(other.oneSetOfNullableTimestamps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableTimestampsValue2(" + oneSetOfNullableTimestamps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> oneSetOfNullableTimestamps;

    @JsonProperty("oneSetOfNullableTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.DateTime> getOneSetOfNullableTimestamps() {
        return oneSetOfNullableTimestamps;
    }

    public OneSetOfNullableTimestampsValue2 setOneSetOfNullableTimestamps(
            final java.util.Set<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableTimestamps\" cannot be null!");
        this.oneSetOfNullableTimestamps = value;

        return this;
    }
}
