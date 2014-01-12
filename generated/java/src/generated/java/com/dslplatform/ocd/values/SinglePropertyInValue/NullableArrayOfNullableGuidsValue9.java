package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableGuidsValue9 implements
        java.io.Serializable {
    public NullableArrayOfNullableGuidsValue9(
            final java.util.UUID[] nullableArrayOfNullableGuids) {
        setNullableArrayOfNullableGuids(nullableArrayOfNullableGuids);
    }

    public NullableArrayOfNullableGuidsValue9() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1398195822;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableGuidsValue9)) return false;
        final NullableArrayOfNullableGuidsValue9 other = (NullableArrayOfNullableGuidsValue9) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableGuids,
                other.nullableArrayOfNullableGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableGuidsValue9("
                + nullableArrayOfNullableGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] nullableArrayOfNullableGuids;

    @JsonProperty("nullableArrayOfNullableGuids")
    public java.util.UUID[] getNullableArrayOfNullableGuids() {
        return nullableArrayOfNullableGuids;
    }

    public NullableArrayOfNullableGuidsValue9 setNullableArrayOfNullableGuids(
            final java.util.UUID[] value) {
        this.nullableArrayOfNullableGuids = value;

        return this;
    }
}
