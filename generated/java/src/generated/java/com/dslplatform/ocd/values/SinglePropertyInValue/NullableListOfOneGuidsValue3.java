package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneGuidsValue3 implements java.io.Serializable {
    public NullableListOfOneGuidsValue3(
            final java.util.List<java.util.UUID> nullableListOfOneGuids) {
        setNullableListOfOneGuids(nullableListOfOneGuids);
    }

    public NullableListOfOneGuidsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1307822846;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneGuidsValue3)) return false;
        final NullableListOfOneGuidsValue3 other = (NullableListOfOneGuidsValue3) obj;

        if (!(this.nullableListOfOneGuids == other.nullableListOfOneGuids || this.nullableListOfOneGuids != null
                && this.nullableListOfOneGuids
                        .equals(other.nullableListOfOneGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneGuidsValue3(" + nullableListOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> nullableListOfOneGuids;

    @JsonProperty("nullableListOfOneGuids")
    public java.util.List<java.util.UUID> getNullableListOfOneGuids() {
        return nullableListOfOneGuids;
    }

    public NullableListOfOneGuidsValue3 setNullableListOfOneGuids(
            final java.util.List<java.util.UUID> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneGuids = value;

        return this;
    }
}
