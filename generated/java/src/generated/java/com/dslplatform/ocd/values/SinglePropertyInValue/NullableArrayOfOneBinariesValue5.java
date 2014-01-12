package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneBinariesValue5 implements
        java.io.Serializable {
    public NullableArrayOfOneBinariesValue5(
            final byte[][] nullableArrayOfOneBinaries) {
        setNullableArrayOfOneBinaries(nullableArrayOfOneBinaries);
    }

    public NullableArrayOfOneBinariesValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 349116898;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneBinariesValue5)) return false;
        final NullableArrayOfOneBinariesValue5 other = (NullableArrayOfOneBinariesValue5) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.nullableArrayOfOneBinaries,
                other.nullableArrayOfOneBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneBinariesValue5(" + nullableArrayOfOneBinaries
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] nullableArrayOfOneBinaries;

    @JsonProperty("nullableArrayOfOneBinaries")
    public byte[][] getNullableArrayOfOneBinaries() {
        return nullableArrayOfOneBinaries;
    }

    public NullableArrayOfOneBinariesValue5 setNullableArrayOfOneBinaries(
            final byte[][] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneBinaries = value;

        return this;
    }
}
