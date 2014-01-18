package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableGuids_1 implements
        java.io.Serializable {
    public NullableArrayOfNullableGuids_1(
            final java.util.UUID[] nullableArrayOfNullableGuids) {
        setNullableArrayOfNullableGuids(nullableArrayOfNullableGuids);
    }

    public NullableArrayOfNullableGuids_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 910269866;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableGuids_1)) return false;
        final NullableArrayOfNullableGuids_1 other = (NullableArrayOfNullableGuids_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableGuids,
                other.nullableArrayOfNullableGuids))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableGuids_1(" + nullableArrayOfNullableGuids
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.UUID[] nullableArrayOfNullableGuids;

    @JsonProperty("nullableArrayOfNullableGuids")
    public java.util.UUID[] getNullableArrayOfNullableGuids() {
        return nullableArrayOfNullableGuids;
    }

    public NullableArrayOfNullableGuids_1 setNullableArrayOfNullableGuids(
            final java.util.UUID[] value) {
        this.nullableArrayOfNullableGuids = value;

        return this;
    }
}
