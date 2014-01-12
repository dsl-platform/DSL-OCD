package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableBinariesValue3 implements
        java.io.Serializable {
    public NullableArrayOfNullableBinariesValue3(
            final byte[][] nullableArrayOfNullableBinaries) {
        setNullableArrayOfNullableBinaries(nullableArrayOfNullableBinaries);
    }

    public NullableArrayOfNullableBinariesValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 872162281;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableBinariesValue3))
            return false;
        final NullableArrayOfNullableBinariesValue3 other = (NullableArrayOfNullableBinariesValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.nullableArrayOfNullableBinaries,
                other.nullableArrayOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableBinariesValue3("
                + nullableArrayOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] nullableArrayOfNullableBinaries;

    @JsonProperty("nullableArrayOfNullableBinaries")
    public byte[][] getNullableArrayOfNullableBinaries() {
        return nullableArrayOfNullableBinaries;
    }

    public NullableArrayOfNullableBinariesValue3 setNullableArrayOfNullableBinaries(
            final byte[][] value) {
        this.nullableArrayOfNullableBinaries = value;

        return this;
    }
}
