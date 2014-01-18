package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneGuids_1 implements java.io.Serializable {
    public OneSetOfOneGuids_1(
            final java.util.Set<java.util.UUID> oneSetOfOneGuids) {
        setOneSetOfOneGuids(oneSetOfOneGuids);
    }

    public OneSetOfOneGuids_1() {
        this.oneSetOfOneGuids = new java.util.HashSet<java.util.UUID>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 368030889;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneGuids_1)) return false;
        final OneSetOfOneGuids_1 other = (OneSetOfOneGuids_1) obj;

        if (!(this.oneSetOfOneGuids.equals(other.oneSetOfOneGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneGuids_1(" + oneSetOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> oneSetOfOneGuids;

    @JsonProperty("oneSetOfOneGuids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.util.UUID> getOneSetOfOneGuids() {
        return oneSetOfOneGuids;
    }

    public OneSetOfOneGuids_1 setOneSetOfOneGuids(
            final java.util.Set<java.util.UUID> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneGuids\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneGuids = value;

        return this;
    }
}
