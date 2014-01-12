package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableGuidsValue2 implements
        java.io.Serializable {
    public NullableListOfNullableGuidsValue2(
            final java.util.List<java.util.UUID> nullableListOfNullableGuids) {
        setNullableListOfNullableGuids(nullableListOfNullableGuids);
    }

    public NullableListOfNullableGuidsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1962143970;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableGuidsValue2)) return false;
        final NullableListOfNullableGuidsValue2 other = (NullableListOfNullableGuidsValue2) obj;

        if (!(this.nullableListOfNullableGuids == other.nullableListOfNullableGuids || this.nullableListOfNullableGuids != null
                && this.nullableListOfNullableGuids
                        .equals(other.nullableListOfNullableGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableGuidsValue2("
                + nullableListOfNullableGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> nullableListOfNullableGuids;

    @JsonProperty("nullableListOfNullableGuids")
    public java.util.List<java.util.UUID> getNullableListOfNullableGuids() {
        return nullableListOfNullableGuids;
    }

    public NullableListOfNullableGuidsValue2 setNullableListOfNullableGuids(
            final java.util.List<java.util.UUID> value) {
        this.nullableListOfNullableGuids = value;

        return this;
    }
}
