package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneBinariesValue1 implements
        java.io.Serializable {
    public NullableListOfOneBinariesValue1(
            final java.util.List<byte[]> nullableListOfOneBinaries) {
        setNullableListOfOneBinaries(nullableListOfOneBinaries);
    }

    public NullableListOfOneBinariesValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 291459591;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneBinariesValue1)) return false;
        final NullableListOfOneBinariesValue1 other = (NullableListOfOneBinariesValue1) obj;

        if (!(com.dslplatform.ocd.values.Guards
                .compareBinary(this.nullableListOfOneBinaries,
                        other.nullableListOfOneBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneBinariesValue1(" + nullableListOfOneBinaries
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> nullableListOfOneBinaries;

    @JsonProperty("nullableListOfOneBinaries")
    public java.util.List<byte[]> getNullableListOfOneBinaries() {
        return nullableListOfOneBinaries;
    }

    public NullableListOfOneBinariesValue1 setNullableListOfOneBinaries(
            final java.util.List<byte[]> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneBinaries = value;

        return this;
    }
}
