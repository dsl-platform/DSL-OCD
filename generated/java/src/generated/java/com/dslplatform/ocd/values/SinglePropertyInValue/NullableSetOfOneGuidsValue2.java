package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneGuidsValue2 implements java.io.Serializable {
    public NullableSetOfOneGuidsValue2(
            final java.util.Set<java.util.UUID> nullableSetOfOneGuids) {
        setNullableSetOfOneGuids(nullableSetOfOneGuids);
    }

    public NullableSetOfOneGuidsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 988913383;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneGuidsValue2)) return false;
        final NullableSetOfOneGuidsValue2 other = (NullableSetOfOneGuidsValue2) obj;

        if (!(this.nullableSetOfOneGuids == other.nullableSetOfOneGuids || this.nullableSetOfOneGuids != null
                && this.nullableSetOfOneGuids
                        .equals(other.nullableSetOfOneGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneGuidsValue2(" + nullableSetOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> nullableSetOfOneGuids;

    @JsonProperty("nullableSetOfOneGuids")
    public java.util.Set<java.util.UUID> getNullableSetOfOneGuids() {
        return nullableSetOfOneGuids;
    }

    public NullableSetOfOneGuidsValue2 setNullableSetOfOneGuids(
            final java.util.Set<java.util.UUID> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneGuids = value;

        return this;
    }
}
