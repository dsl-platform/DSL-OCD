package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableBinaries_1 implements
        java.io.Serializable {
    public NullableSetOfNullableBinaries_1(
            final java.util.Set<byte[]> nullableSetOfNullableBinaries) {
        setNullableSetOfNullableBinaries(nullableSetOfNullableBinaries);
    }

    public NullableSetOfNullableBinaries_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 29428712;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableBinaries_1)) return false;
        final NullableSetOfNullableBinaries_1 other = (NullableSetOfNullableBinaries_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.nullableSetOfNullableBinaries,
                other.nullableSetOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableBinaries_1("
                + nullableSetOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> nullableSetOfNullableBinaries;

    @JsonProperty("nullableSetOfNullableBinaries")
    public java.util.Set<byte[]> getNullableSetOfNullableBinaries() {
        return nullableSetOfNullableBinaries;
    }

    public NullableSetOfNullableBinaries_1 setNullableSetOfNullableBinaries(
            final java.util.Set<byte[]> value) {
        this.nullableSetOfNullableBinaries = value;

        return this;
    }
}
