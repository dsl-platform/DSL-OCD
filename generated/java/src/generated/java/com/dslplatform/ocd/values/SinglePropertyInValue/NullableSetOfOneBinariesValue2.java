package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneBinariesValue2 implements
        java.io.Serializable {
    public NullableSetOfOneBinariesValue2(
            final java.util.Set<byte[]> nullableSetOfOneBinaries) {
        setNullableSetOfOneBinaries(nullableSetOfOneBinaries);
    }

    public NullableSetOfOneBinariesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 928157044;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneBinariesValue2)) return false;
        final NullableSetOfOneBinariesValue2 other = (NullableSetOfOneBinariesValue2) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.nullableSetOfOneBinaries, other.nullableSetOfOneBinaries)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneBinariesValue2(" + nullableSetOfOneBinaries
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> nullableSetOfOneBinaries;

    @JsonProperty("nullableSetOfOneBinaries")
    public java.util.Set<byte[]> getNullableSetOfOneBinaries() {
        return nullableSetOfOneBinaries;
    }

    public NullableSetOfOneBinariesValue2 setNullableSetOfOneBinaries(
            final java.util.Set<byte[]> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneBinaries = value;

        return this;
    }
}
