package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableGuidsValue6 implements
        java.io.Serializable {
    public NullableListOfNullableGuidsValue6(
            final java.util.List<java.util.UUID> nullableListOfNullableGuids) {
        setNullableListOfNullableGuids(nullableListOfNullableGuids);
    }

    public NullableListOfNullableGuidsValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1962143974;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableGuidsValue6)) return false;
        final NullableListOfNullableGuidsValue6 other = (NullableListOfNullableGuidsValue6) obj;

        if (!(this.nullableListOfNullableGuids == other.nullableListOfNullableGuids || this.nullableListOfNullableGuids != null
                && this.nullableListOfNullableGuids
                        .equals(other.nullableListOfNullableGuids)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableGuidsValue6("
                + nullableListOfNullableGuids + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.util.UUID> nullableListOfNullableGuids;

    @JsonProperty("nullableListOfNullableGuids")
    public java.util.List<java.util.UUID> getNullableListOfNullableGuids() {
        return nullableListOfNullableGuids;
    }

    public NullableListOfNullableGuidsValue6 setNullableListOfNullableGuids(
            final java.util.List<java.util.UUID> value) {
        this.nullableListOfNullableGuids = value;

        return this;
    }
}
