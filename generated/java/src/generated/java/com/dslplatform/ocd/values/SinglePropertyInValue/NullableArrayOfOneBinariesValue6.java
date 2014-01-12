package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneBinariesValue6 implements
        java.io.Serializable {
    public NullableArrayOfOneBinariesValue6(
            final byte[][] nullableArrayOfOneBinaries) {
        setNullableArrayOfOneBinaries(nullableArrayOfOneBinaries);
    }

    public NullableArrayOfOneBinariesValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1216967043;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneBinariesValue6)) return false;
        final NullableArrayOfOneBinariesValue6 other = (NullableArrayOfOneBinariesValue6) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.nullableArrayOfOneBinaries,
                other.nullableArrayOfOneBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneBinariesValue6(" + nullableArrayOfOneBinaries
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] nullableArrayOfOneBinaries;

    @JsonProperty("nullableArrayOfOneBinaries")
    public byte[][] getNullableArrayOfOneBinaries() {
        return nullableArrayOfOneBinaries;
    }

    public NullableArrayOfOneBinariesValue6 setNullableArrayOfOneBinaries(
            final byte[][] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneBinaries = value;

        return this;
    }
}
