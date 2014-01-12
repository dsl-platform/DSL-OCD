package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableBinariesValue1 implements
        java.io.Serializable {
    public NullableArrayOfNullableBinariesValue1(
            final byte[][] nullableArrayOfNullableBinaries) {
        setNullableArrayOfNullableBinaries(nullableArrayOfNullableBinaries);
    }

    public NullableArrayOfNullableBinariesValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 872162283;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableBinariesValue1))
            return false;
        final NullableArrayOfNullableBinariesValue1 other = (NullableArrayOfNullableBinariesValue1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.nullableArrayOfNullableBinaries,
                other.nullableArrayOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableBinariesValue1("
                + nullableArrayOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] nullableArrayOfNullableBinaries;

    @JsonProperty("nullableArrayOfNullableBinaries")
    public byte[][] getNullableArrayOfNullableBinaries() {
        return nullableArrayOfNullableBinaries;
    }

    public NullableArrayOfNullableBinariesValue1 setNullableArrayOfNullableBinaries(
            final byte[][] value) {
        this.nullableArrayOfNullableBinaries = value;

        return this;
    }
}
