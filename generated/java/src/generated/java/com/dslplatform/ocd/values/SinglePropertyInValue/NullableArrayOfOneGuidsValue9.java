package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneGuidsValue9 implements
        java.io.Serializable {
    public NullableArrayOfOneGuidsValue9(
            final java.util.UUID[] nullableArrayOfOneGuids) {
        setNullableArrayOfOneGuids(nullableArrayOfOneGuids);
    }

    public NullableArrayOfOneGuidsValue9() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1966111929;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneGuidsValue9)) return false;
        final NullableArrayOfOneGuidsValue9 other = (NullableArrayOfOneGuidsValue9) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneGuids,
                other.nullableArrayOfOneGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneGuidsValue9(" + nullableArrayOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] nullableArrayOfOneGuids;

    @JsonProperty("nullableArrayOfOneGuids")
    public java.util.UUID[] getNullableArrayOfOneGuids() {
        return nullableArrayOfOneGuids;
    }

    public NullableArrayOfOneGuidsValue9 setNullableArrayOfOneGuids(
            final java.util.UUID[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneGuids = value;

        return this;
    }
}
