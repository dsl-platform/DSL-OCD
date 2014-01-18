package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableBinaries_1 implements
        java.io.Serializable {
    public NullableListOfNullableBinaries_1(
            final java.util.List<byte[]> nullableListOfNullableBinaries) {
        setNullableListOfNullableBinaries(nullableListOfNullableBinaries);
    }

    public NullableListOfNullableBinaries_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1401167742;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableBinaries_1)) return false;
        final NullableListOfNullableBinaries_1 other = (NullableListOfNullableBinaries_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.nullableListOfNullableBinaries,
                other.nullableListOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableBinaries_1("
                + nullableListOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> nullableListOfNullableBinaries;

    @JsonProperty("nullableListOfNullableBinaries")
    public java.util.List<byte[]> getNullableListOfNullableBinaries() {
        return nullableListOfNullableBinaries;
    }

    public NullableListOfNullableBinaries_1 setNullableListOfNullableBinaries(
            final java.util.List<byte[]> value) {
        this.nullableListOfNullableBinaries = value;

        return this;
    }
}
