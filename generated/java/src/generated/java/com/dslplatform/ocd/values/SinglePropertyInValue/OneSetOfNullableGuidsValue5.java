package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableGuidsValue5 implements java.io.Serializable {
    public OneSetOfNullableGuidsValue5(
            final java.util.Set<java.util.UUID> oneSetOfNullableGuids) {
        setOneSetOfNullableGuids(oneSetOfNullableGuids);
    }

    public OneSetOfNullableGuidsValue5() {
        this.oneSetOfNullableGuids = new java.util.HashSet<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 141345048;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableGuidsValue5)) return false;
        final OneSetOfNullableGuidsValue5 other = (OneSetOfNullableGuidsValue5) obj;

        if (!(this.oneSetOfNullableGuids.equals(other.oneSetOfNullableGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableGuidsValue5(" + oneSetOfNullableGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> oneSetOfNullableGuids;

    @JsonProperty("oneSetOfNullableGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.UUID> getOneSetOfNullableGuids() {
        return oneSetOfNullableGuids;
    }

    public OneSetOfNullableGuidsValue5 setOneSetOfNullableGuids(
            final java.util.Set<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableGuids\" cannot be null!");
        this.oneSetOfNullableGuids = value;

        return this;
    }
}
