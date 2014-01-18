package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableBinaries_1 implements
        java.io.Serializable {
    public NullableArrayOfNullableBinaries_1(
            final byte[][] nullableArrayOfNullableBinaries) {
        setNullableArrayOfNullableBinaries(nullableArrayOfNullableBinaries);
    }

    public NullableArrayOfNullableBinaries_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 25990569;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableBinaries_1)) return false;
        final NullableArrayOfNullableBinaries_1 other = (NullableArrayOfNullableBinaries_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.nullableArrayOfNullableBinaries,
                other.nullableArrayOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableBinaries_1("
                + nullableArrayOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] nullableArrayOfNullableBinaries;

    @JsonProperty("nullableArrayOfNullableBinaries")
    public byte[][] getNullableArrayOfNullableBinaries() {
        return nullableArrayOfNullableBinaries;
    }

    public NullableArrayOfNullableBinaries_1 setNullableArrayOfNullableBinaries(
            final byte[][] value) {
        this.nullableArrayOfNullableBinaries = value;

        return this;
    }
}
