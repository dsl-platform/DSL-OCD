package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableGuidsValue2 implements java.io.Serializable {
    public OneListOfNullableGuidsValue2(
            final java.util.List<java.util.UUID> oneListOfNullableGuids) {
        setOneListOfNullableGuids(oneListOfNullableGuids);
    }

    public OneListOfNullableGuidsValue2() {
        this.oneListOfNullableGuids = new java.util.ArrayList<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 5117201;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableGuidsValue2)) return false;
        final OneListOfNullableGuidsValue2 other = (OneListOfNullableGuidsValue2) obj;

        if (!(this.oneListOfNullableGuids.equals(other.oneListOfNullableGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableGuidsValue2(" + oneListOfNullableGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> oneListOfNullableGuids;

    @JsonProperty("oneListOfNullableGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.UUID> getOneListOfNullableGuids() {
        return oneListOfNullableGuids;
    }

    public OneListOfNullableGuidsValue2 setOneListOfNullableGuids(
            final java.util.List<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableGuids\" cannot be null!");
        this.oneListOfNullableGuids = value;

        return this;
    }
}
