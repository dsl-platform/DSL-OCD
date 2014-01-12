package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableBinariesValue1 implements
        java.io.Serializable {
    public NullableSetOfNullableBinariesValue1(
            final java.util.Set<byte[]> nullableSetOfNullableBinaries) {
        setNullableSetOfNullableBinaries(nullableSetOfNullableBinaries);
    }

    public NullableSetOfNullableBinariesValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2019449572;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableBinariesValue1))
            return false;
        final NullableSetOfNullableBinariesValue1 other = (NullableSetOfNullableBinariesValue1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.nullableSetOfNullableBinaries,
                other.nullableSetOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableBinariesValue1("
                + nullableSetOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> nullableSetOfNullableBinaries;

    @JsonProperty("nullableSetOfNullableBinaries")
    public java.util.Set<byte[]> getNullableSetOfNullableBinaries() {
        return nullableSetOfNullableBinaries;
    }

    public NullableSetOfNullableBinariesValue1 setNullableSetOfNullableBinaries(
            final java.util.Set<byte[]> value) {
        this.nullableSetOfNullableBinaries = value;

        return this;
    }
}
