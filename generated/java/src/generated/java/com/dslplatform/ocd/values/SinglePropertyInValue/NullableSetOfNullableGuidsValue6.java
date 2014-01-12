package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableGuidsValue6 implements
        java.io.Serializable {
    public NullableSetOfNullableGuidsValue6(
            final java.util.Set<java.util.UUID> nullableSetOfNullableGuids) {
        setNullableSetOfNullableGuids(nullableSetOfNullableGuids);
    }

    public NullableSetOfNullableGuidsValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 806763808;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableGuidsValue6)) return false;
        final NullableSetOfNullableGuidsValue6 other = (NullableSetOfNullableGuidsValue6) obj;

        if (!(this.nullableSetOfNullableGuids == other.nullableSetOfNullableGuids || this.nullableSetOfNullableGuids != null
                && this.nullableSetOfNullableGuids
                        .equals(other.nullableSetOfNullableGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableGuidsValue6(" + nullableSetOfNullableGuids
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> nullableSetOfNullableGuids;

    @JsonProperty("nullableSetOfNullableGuids")
    public java.util.Set<java.util.UUID> getNullableSetOfNullableGuids() {
        return nullableSetOfNullableGuids;
    }

    public NullableSetOfNullableGuidsValue6 setNullableSetOfNullableGuids(
            final java.util.Set<java.util.UUID> value) {
        this.nullableSetOfNullableGuids = value;

        return this;
    }
}
