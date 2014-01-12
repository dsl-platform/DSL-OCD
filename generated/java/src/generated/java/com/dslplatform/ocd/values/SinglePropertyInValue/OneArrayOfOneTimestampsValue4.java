package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneTimestampsValue4 implements
        java.io.Serializable {
    public OneArrayOfOneTimestampsValue4(
            final org.joda.time.DateTime[] oneArrayOfOneTimestamps) {
        setOneArrayOfOneTimestamps(oneArrayOfOneTimestamps);
    }

    public OneArrayOfOneTimestampsValue4() {
        this.oneArrayOfOneTimestamps = new org.joda.time.DateTime[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 246314656;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneTimestampsValue4)) return false;
        final OneArrayOfOneTimestampsValue4 other = (OneArrayOfOneTimestampsValue4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneTimestamps,
                other.oneArrayOfOneTimestamps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneTimestampsValue4(" + oneArrayOfOneTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime[] oneArrayOfOneTimestamps;

    @JsonProperty("oneArrayOfOneTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.DateTime[] getOneArrayOfOneTimestamps() {
        return oneArrayOfOneTimestamps;
    }

    public OneArrayOfOneTimestampsValue4 setOneArrayOfOneTimestamps(
            final org.joda.time.DateTime[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneTimestamps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneTimestamps = value;

        return this;
    }
}
