package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneGuidsValue3 implements
        java.io.Serializable {
    public NullableArrayOfOneGuidsValue3(
            final java.util.UUID[] nullableArrayOfOneGuids) {
        setNullableArrayOfOneGuids(nullableArrayOfOneGuids);
    }

    public NullableArrayOfOneGuidsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1966111935;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneGuidsValue3)) return false;
        final NullableArrayOfOneGuidsValue3 other = (NullableArrayOfOneGuidsValue3) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneGuids,
                other.nullableArrayOfOneGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneGuidsValue3(" + nullableArrayOfOneGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] nullableArrayOfOneGuids;

    @JsonProperty("nullableArrayOfOneGuids")
    public java.util.UUID[] getNullableArrayOfOneGuids() {
        return nullableArrayOfOneGuids;
    }

    public NullableArrayOfOneGuidsValue3 setNullableArrayOfOneGuids(
            final java.util.UUID[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneGuids = value;

        return this;
    }
}
