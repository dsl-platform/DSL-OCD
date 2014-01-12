package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneGuidsValue5 implements java.io.Serializable {
    public OneSetOfOneGuidsValue5(
            final java.util.Set<java.util.UUID> oneSetOfOneGuids) {
        setOneSetOfOneGuids(oneSetOfOneGuids);
    }

    public OneSetOfOneGuidsValue5() {
        this.oneSetOfOneGuids = new java.util.HashSet<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1232006745;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneGuidsValue5)) return false;
        final OneSetOfOneGuidsValue5 other = (OneSetOfOneGuidsValue5) obj;

        if (!(this.oneSetOfOneGuids.equals(other.oneSetOfOneGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneGuidsValue5(" + oneSetOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> oneSetOfOneGuids;

    @JsonProperty("oneSetOfOneGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.UUID> getOneSetOfOneGuids() {
        return oneSetOfOneGuids;
    }

    public OneSetOfOneGuidsValue5 setOneSetOfOneGuids(
            final java.util.Set<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneGuids\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneGuids = value;

        return this;
    }
}
