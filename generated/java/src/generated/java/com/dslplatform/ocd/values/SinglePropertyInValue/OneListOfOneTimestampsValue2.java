package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneTimestampsValue2 implements java.io.Serializable {
    public OneListOfOneTimestampsValue2(
            final java.util.List<org.joda.time.DateTime> oneListOfOneTimestamps) {
        setOneListOfOneTimestamps(oneListOfOneTimestamps);
    }

    public OneListOfOneTimestampsValue2() {
        this.oneListOfOneTimestamps = new java.util.ArrayList<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1510022957;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneTimestampsValue2)) return false;
        final OneListOfOneTimestampsValue2 other = (OneListOfOneTimestampsValue2) obj;

        if (!(this.oneListOfOneTimestamps.equals(other.oneListOfOneTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneTimestampsValue2(" + oneListOfOneTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.DateTime> oneListOfOneTimestamps;

    @JsonProperty("oneListOfOneTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.DateTime> getOneListOfOneTimestamps() {
        return oneListOfOneTimestamps;
    }

    public OneListOfOneTimestampsValue2 setOneListOfOneTimestamps(
            final java.util.List<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneTimestamps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneTimestamps = value;

        return this;
    }
}
