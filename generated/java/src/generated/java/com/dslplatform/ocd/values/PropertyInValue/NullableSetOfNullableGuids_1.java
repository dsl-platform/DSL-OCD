package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableGuids_1 implements java.io.Serializable {
    public NullableSetOfNullableGuids_1(
            final java.util.Set<java.util.UUID> nullableSetOfNullableGuids) {
        setNullableSetOfNullableGuids(nullableSetOfNullableGuids);
    }

    public NullableSetOfNullableGuids_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1428733877;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableGuids_1)) return false;
        final NullableSetOfNullableGuids_1 other = (NullableSetOfNullableGuids_1) obj;

        if (!(this.nullableSetOfNullableGuids == other.nullableSetOfNullableGuids || this.nullableSetOfNullableGuids != null
                && this.nullableSetOfNullableGuids
                        .equals(other.nullableSetOfNullableGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableGuids_1(" + nullableSetOfNullableGuids
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> nullableSetOfNullableGuids;

    @JsonProperty("nullableSetOfNullableGuids")
    public java.util.Set<java.util.UUID> getNullableSetOfNullableGuids() {
        return nullableSetOfNullableGuids;
    }

    public NullableSetOfNullableGuids_1 setNullableSetOfNullableGuids(
            final java.util.Set<java.util.UUID> value) {
        this.nullableSetOfNullableGuids = value;

        return this;
    }
}
