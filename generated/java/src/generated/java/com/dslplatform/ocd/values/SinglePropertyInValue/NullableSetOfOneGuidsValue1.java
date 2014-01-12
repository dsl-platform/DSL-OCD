package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneGuidsValue1 implements java.io.Serializable {
    public NullableSetOfOneGuidsValue1(
            final java.util.Set<java.util.UUID> nullableSetOfOneGuids) {
        setNullableSetOfOneGuids(nullableSetOfOneGuids);
    }

    public NullableSetOfOneGuidsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 988913382;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneGuidsValue1)) return false;
        final NullableSetOfOneGuidsValue1 other = (NullableSetOfOneGuidsValue1) obj;

        if (!(this.nullableSetOfOneGuids == other.nullableSetOfOneGuids || this.nullableSetOfOneGuids != null
                && this.nullableSetOfOneGuids
                        .equals(other.nullableSetOfOneGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneGuidsValue1(" + nullableSetOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> nullableSetOfOneGuids;

    @JsonProperty("nullableSetOfOneGuids")
    public java.util.Set<java.util.UUID> getNullableSetOfOneGuids() {
        return nullableSetOfOneGuids;
    }

    public NullableSetOfOneGuidsValue1 setNullableSetOfOneGuids(
            final java.util.Set<java.util.UUID> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneGuids = value;

        return this;
    }
}
