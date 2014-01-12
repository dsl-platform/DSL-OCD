package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneGuidsValue8 implements java.io.Serializable {
    public OneArrayOfOneGuidsValue8(
            final java.util.UUID[] oneArrayOfOneGuids) {
        setOneArrayOfOneGuids(oneArrayOfOneGuids);
    }

    public OneArrayOfOneGuidsValue8() {
        this.oneArrayOfOneGuids = new java.util.UUID[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1847463567;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneGuidsValue8)) return false;
        final OneArrayOfOneGuidsValue8 other = (OneArrayOfOneGuidsValue8) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneGuids,
                other.oneArrayOfOneGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneGuidsValue8(" + oneArrayOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] oneArrayOfOneGuids;

    @JsonProperty("oneArrayOfOneGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.UUID[] getOneArrayOfOneGuids() {
        return oneArrayOfOneGuids;
    }

    public OneArrayOfOneGuidsValue8 setOneArrayOfOneGuids(
            final java.util.UUID[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneGuids\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneGuids = value;

        return this;
    }
}
