package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneGuidsValue11 implements
        java.io.Serializable {
    public NullableArrayOfOneGuidsValue11(
            final java.util.UUID[] nullableArrayOfOneGuids) {
        setNullableArrayOfOneGuids(nullableArrayOfOneGuids);
    }

    public NullableArrayOfOneGuidsValue11() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 665673878;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneGuidsValue11)) return false;
        final NullableArrayOfOneGuidsValue11 other = (NullableArrayOfOneGuidsValue11) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneGuids,
                other.nullableArrayOfOneGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneGuidsValue11(" + nullableArrayOfOneGuids
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] nullableArrayOfOneGuids;

    @JsonProperty("nullableArrayOfOneGuids")
    public java.util.UUID[] getNullableArrayOfOneGuids() {
        return nullableArrayOfOneGuids;
    }

    public NullableArrayOfOneGuidsValue11 setNullableArrayOfOneGuids(
            final java.util.UUID[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneGuids = value;

        return this;
    }
}
