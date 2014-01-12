package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneBinariesValue3 implements
        java.io.Serializable {
    public NullableArrayOfOneBinariesValue3(
            final byte[][] nullableArrayOfOneBinaries) {
        setNullableArrayOfOneBinaries(nullableArrayOfOneBinaries);
    }

    public NullableArrayOfOneBinariesValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 457452156;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneBinariesValue3)) return false;
        final NullableArrayOfOneBinariesValue3 other = (NullableArrayOfOneBinariesValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.nullableArrayOfOneBinaries,
                other.nullableArrayOfOneBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneBinariesValue3(" + nullableArrayOfOneBinaries
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] nullableArrayOfOneBinaries;

    @JsonProperty("nullableArrayOfOneBinaries")
    public byte[][] getNullableArrayOfOneBinaries() {
        return nullableArrayOfOneBinaries;
    }

    public NullableArrayOfOneBinariesValue3 setNullableArrayOfOneBinaries(
            final byte[][] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneBinaries = value;

        return this;
    }
}
