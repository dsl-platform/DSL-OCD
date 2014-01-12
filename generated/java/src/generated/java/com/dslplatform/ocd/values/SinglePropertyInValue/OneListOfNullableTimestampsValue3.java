package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableTimestampsValue3 implements
        java.io.Serializable {
    public OneListOfNullableTimestampsValue3(
            final java.util.List<org.joda.time.DateTime> oneListOfNullableTimestamps) {
        setOneListOfNullableTimestamps(oneListOfNullableTimestamps);
    }

    public OneListOfNullableTimestampsValue3() {
        this.oneListOfNullableTimestamps = new java.util.ArrayList<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1614442459;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableTimestampsValue3)) return false;
        final OneListOfNullableTimestampsValue3 other = (OneListOfNullableTimestampsValue3) obj;

        if (!(this.oneListOfNullableTimestamps
                .equals(other.oneListOfNullableTimestamps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableTimestampsValue3("
                + oneListOfNullableTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.DateTime> oneListOfNullableTimestamps;

    @JsonProperty("oneListOfNullableTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.DateTime> getOneListOfNullableTimestamps() {
        return oneListOfNullableTimestamps;
    }

    public OneListOfNullableTimestampsValue3 setOneListOfNullableTimestamps(
            final java.util.List<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableTimestamps\" cannot be null!");
        this.oneListOfNullableTimestamps = value;

        return this;
    }
}
