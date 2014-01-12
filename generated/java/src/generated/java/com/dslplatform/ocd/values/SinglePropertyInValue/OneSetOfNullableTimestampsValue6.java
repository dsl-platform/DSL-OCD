package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableTimestampsValue6 implements
        java.io.Serializable {
    public OneSetOfNullableTimestampsValue6(
            final java.util.Set<org.joda.time.DateTime> oneSetOfNullableTimestamps) {
        setOneSetOfNullableTimestamps(oneSetOfNullableTimestamps);
    }

    public OneSetOfNullableTimestampsValue6() {
        this.oneSetOfNullableTimestamps = new java.util.HashSet<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 412592030;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableTimestampsValue6)) return false;
        final OneSetOfNullableTimestampsValue6 other = (OneSetOfNullableTimestampsValue6) obj;

        if (!(this.oneSetOfNullableTimestamps
                .equals(other.oneSetOfNullableTimestamps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableTimestampsValue6(" + oneSetOfNullableTimestamps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> oneSetOfNullableTimestamps;

    @JsonProperty("oneSetOfNullableTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.DateTime> getOneSetOfNullableTimestamps() {
        return oneSetOfNullableTimestamps;
    }

    public OneSetOfNullableTimestampsValue6 setOneSetOfNullableTimestamps(
            final java.util.Set<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableTimestamps\" cannot be null!");
        this.oneSetOfNullableTimestamps = value;

        return this;
    }
}
