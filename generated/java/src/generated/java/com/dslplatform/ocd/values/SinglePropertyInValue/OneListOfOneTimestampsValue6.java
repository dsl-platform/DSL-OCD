package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneTimestampsValue6 implements java.io.Serializable {
    public OneListOfOneTimestampsValue6(
            final java.util.List<org.joda.time.DateTime> oneListOfOneTimestamps) {
        setOneListOfOneTimestamps(oneListOfOneTimestamps);
    }

    public OneListOfOneTimestampsValue6() {
        this.oneListOfOneTimestamps = new java.util.ArrayList<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 459345511;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneTimestampsValue6)) return false;
        final OneListOfOneTimestampsValue6 other = (OneListOfOneTimestampsValue6) obj;

        if (!(this.oneListOfOneTimestamps.equals(other.oneListOfOneTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneTimestampsValue6(" + oneListOfOneTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.DateTime> oneListOfOneTimestamps;

    @JsonProperty("oneListOfOneTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.DateTime> getOneListOfOneTimestamps() {
        return oneListOfOneTimestamps;
    }

    public OneListOfOneTimestampsValue6 setOneListOfOneTimestamps(
            final java.util.List<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneTimestamps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneTimestamps = value;

        return this;
    }
}
