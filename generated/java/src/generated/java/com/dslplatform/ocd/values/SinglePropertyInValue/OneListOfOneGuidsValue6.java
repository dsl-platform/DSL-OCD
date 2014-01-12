package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneGuidsValue6 implements java.io.Serializable {
    public OneListOfOneGuidsValue6(
            final java.util.List<java.util.UUID> oneListOfOneGuids) {
        setOneListOfOneGuids(oneListOfOneGuids);
    }

    public OneListOfOneGuidsValue6() {
        this.oneListOfOneGuids = new java.util.ArrayList<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1677520544;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneGuidsValue6)) return false;
        final OneListOfOneGuidsValue6 other = (OneListOfOneGuidsValue6) obj;

        if (!(this.oneListOfOneGuids.equals(other.oneListOfOneGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneGuidsValue6(" + oneListOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> oneListOfOneGuids;

    @JsonProperty("oneListOfOneGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.UUID> getOneListOfOneGuids() {
        return oneListOfOneGuids;
    }

    public OneListOfOneGuidsValue6 setOneListOfOneGuids(
            final java.util.List<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneGuids\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneGuids = value;

        return this;
    }
}
