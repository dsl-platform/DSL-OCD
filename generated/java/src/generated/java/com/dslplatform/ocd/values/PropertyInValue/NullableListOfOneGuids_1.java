package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneGuids_1 implements java.io.Serializable {
    public NullableListOfOneGuids_1(
            final java.util.List<java.util.UUID> nullableListOfOneGuids) {
        setNullableListOfOneGuids(nullableListOfOneGuids);
    }

    public NullableListOfOneGuids_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 138833288;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneGuids_1)) return false;
        final NullableListOfOneGuids_1 other = (NullableListOfOneGuids_1) obj;

        if (!(this.nullableListOfOneGuids == other.nullableListOfOneGuids || this.nullableListOfOneGuids != null
                && this.nullableListOfOneGuids
                        .equals(other.nullableListOfOneGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneGuids_1(" + nullableListOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> nullableListOfOneGuids;

    @JsonProperty("nullableListOfOneGuids")
    public java.util.List<java.util.UUID> getNullableListOfOneGuids() {
        return nullableListOfOneGuids;
    }

    public NullableListOfOneGuids_1 setNullableListOfOneGuids(
            final java.util.List<java.util.UUID> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneGuids = value;

        return this;
    }
}