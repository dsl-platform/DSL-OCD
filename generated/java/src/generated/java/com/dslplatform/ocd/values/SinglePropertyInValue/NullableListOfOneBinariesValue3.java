package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneBinariesValue3 implements
        java.io.Serializable {
    public NullableListOfOneBinariesValue3(
            final java.util.List<byte[]> nullableListOfOneBinaries) {
        setNullableListOfOneBinaries(nullableListOfOneBinaries);
    }

    public NullableListOfOneBinariesValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 291459593;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneBinariesValue3)) return false;
        final NullableListOfOneBinariesValue3 other = (NullableListOfOneBinariesValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards
                .compareBinary(this.nullableListOfOneBinaries,
                        other.nullableListOfOneBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneBinariesValue3(" + nullableListOfOneBinaries
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> nullableListOfOneBinaries;

    @JsonProperty("nullableListOfOneBinaries")
    public java.util.List<byte[]> getNullableListOfOneBinaries() {
        return nullableListOfOneBinaries;
    }

    public NullableListOfOneBinariesValue3 setNullableListOfOneBinaries(
            final java.util.List<byte[]> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneBinaries = value;

        return this;
    }
}
