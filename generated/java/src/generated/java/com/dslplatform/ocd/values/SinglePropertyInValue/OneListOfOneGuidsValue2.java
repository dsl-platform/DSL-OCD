package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneGuidsValue2 implements java.io.Serializable {
    public OneListOfOneGuidsValue2(
            final java.util.List<java.util.UUID> oneListOfOneGuids) {
        setOneListOfOneGuids(oneListOfOneGuids);
    }

    public OneListOfOneGuidsValue2() {
        this.oneListOfOneGuids = new java.util.ArrayList<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1677520548;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneGuidsValue2)) return false;
        final OneListOfOneGuidsValue2 other = (OneListOfOneGuidsValue2) obj;

        if (!(this.oneListOfOneGuids.equals(other.oneListOfOneGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneGuidsValue2(" + oneListOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> oneListOfOneGuids;

    @JsonProperty("oneListOfOneGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.UUID> getOneListOfOneGuids() {
        return oneListOfOneGuids;
    }

    public OneListOfOneGuidsValue2 setOneListOfOneGuids(
            final java.util.List<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneGuids\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneGuids = value;

        return this;
    }
}
