package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableTimestamps_1 implements
        java.io.Serializable {
    public OneArrayOfNullableTimestamps_1(
            final org.joda.time.DateTime[] oneArrayOfNullableTimestamps) {
        setOneArrayOfNullableTimestamps(oneArrayOfNullableTimestamps);
    }

    public OneArrayOfNullableTimestamps_1() {
        this.oneArrayOfNullableTimestamps = new org.joda.time.DateTime[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2121408190;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableTimestamps_1)) return false;
        final OneArrayOfNullableTimestamps_1 other = (OneArrayOfNullableTimestamps_1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableTimestamps,
                other.oneArrayOfNullableTimestamps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableTimestamps_1(" + oneArrayOfNullableTimestamps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime[] oneArrayOfNullableTimestamps;

    @JsonProperty("oneArrayOfNullableTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.DateTime[] getOneArrayOfNullableTimestamps() {
        return oneArrayOfNullableTimestamps;
    }

    public OneArrayOfNullableTimestamps_1 setOneArrayOfNullableTimestamps(
            final org.joda.time.DateTime[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableTimestamps\" cannot be null!");
        this.oneArrayOfNullableTimestamps = value;

        return this;
    }
}
