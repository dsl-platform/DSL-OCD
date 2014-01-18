package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneBinaries_1 implements java.io.Serializable {
    public NullableSetOfOneBinaries_1(
            final java.util.Set<byte[]> nullableSetOfOneBinaries) {
        setNullableSetOfOneBinaries(nullableSetOfOneBinaries);
    }

    public NullableSetOfOneBinaries_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1546185287;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneBinaries_1)) return false;
        final NullableSetOfOneBinaries_1 other = (NullableSetOfOneBinaries_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.nullableSetOfOneBinaries, other.nullableSetOfOneBinaries)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneBinaries_1(" + nullableSetOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> nullableSetOfOneBinaries;

    @JsonProperty("nullableSetOfOneBinaries")
    public java.util.Set<byte[]> getNullableSetOfOneBinaries() {
        return nullableSetOfOneBinaries;
    }

    public NullableSetOfOneBinaries_1 setNullableSetOfOneBinaries(
            final java.util.Set<byte[]> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneBinaries = value;

        return this;
    }
}
