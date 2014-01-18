package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneGuids_1 implements java.io.Serializable {
    public NullableSetOfOneGuids_1(
            final java.util.Set<java.util.UUID> nullableSetOfOneGuids) {
        setNullableSetOfOneGuids(nullableSetOfOneGuids);
    }

    public NullableSetOfOneGuids_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1512872498;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneGuids_1)) return false;
        final NullableSetOfOneGuids_1 other = (NullableSetOfOneGuids_1) obj;

        if (!(this.nullableSetOfOneGuids == other.nullableSetOfOneGuids || this.nullableSetOfOneGuids != null
                && this.nullableSetOfOneGuids
                        .equals(other.nullableSetOfOneGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneGuids_1(" + nullableSetOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.UUID> nullableSetOfOneGuids;

    @JsonProperty("nullableSetOfOneGuids")
    public java.util.Set<java.util.UUID> getNullableSetOfOneGuids() {
        return nullableSetOfOneGuids;
    }

    public NullableSetOfOneGuids_1 setNullableSetOfOneGuids(
            final java.util.Set<java.util.UUID> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneGuids = value;

        return this;
    }
}
