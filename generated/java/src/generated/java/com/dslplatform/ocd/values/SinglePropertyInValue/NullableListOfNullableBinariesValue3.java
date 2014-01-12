package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableBinariesValue3 implements
        java.io.Serializable {
    public NullableListOfNullableBinariesValue3(
            final java.util.List<byte[]> nullableListOfNullableBinaries) {
        setNullableListOfNullableBinaries(nullableListOfNullableBinaries);
    }

    public NullableListOfNullableBinariesValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 429989240;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableBinariesValue3))
            return false;
        final NullableListOfNullableBinariesValue3 other = (NullableListOfNullableBinariesValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.nullableListOfNullableBinaries,
                other.nullableListOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableBinariesValue3("
                + nullableListOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> nullableListOfNullableBinaries;

    @JsonProperty("nullableListOfNullableBinaries")
    public java.util.List<byte[]> getNullableListOfNullableBinaries() {
        return nullableListOfNullableBinaries;
    }

    public NullableListOfNullableBinariesValue3 setNullableListOfNullableBinaries(
            final java.util.List<byte[]> value) {
        this.nullableListOfNullableBinaries = value;

        return this;
    }
}
