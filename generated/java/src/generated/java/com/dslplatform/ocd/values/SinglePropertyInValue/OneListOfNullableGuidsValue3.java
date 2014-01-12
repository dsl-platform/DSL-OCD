package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableGuidsValue3 implements java.io.Serializable {
    public OneListOfNullableGuidsValue3(
            final java.util.List<java.util.UUID> oneListOfNullableGuids) {
        setOneListOfNullableGuids(oneListOfNullableGuids);
    }

    public OneListOfNullableGuidsValue3() {
        this.oneListOfNullableGuids = new java.util.ArrayList<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1571201142;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableGuidsValue3)) return false;
        final OneListOfNullableGuidsValue3 other = (OneListOfNullableGuidsValue3) obj;

        if (!(this.oneListOfNullableGuids.equals(other.oneListOfNullableGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableGuidsValue3(" + oneListOfNullableGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> oneListOfNullableGuids;

    @JsonProperty("oneListOfNullableGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.util.UUID> getOneListOfNullableGuids() {
        return oneListOfNullableGuids;
    }

    public OneListOfNullableGuidsValue3 setOneListOfNullableGuids(
            final java.util.List<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableGuids\" cannot be null!");
        this.oneListOfNullableGuids = value;

        return this;
    }
}
