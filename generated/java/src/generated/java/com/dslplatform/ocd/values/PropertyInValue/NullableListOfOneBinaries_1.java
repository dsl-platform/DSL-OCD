package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneBinaries_1 implements java.io.Serializable {
    public NullableListOfOneBinaries_1(
            final java.util.List<byte[]> nullableListOfOneBinaries) {
        setNullableListOfOneBinaries(nullableListOfOneBinaries);
    }

    public NullableListOfOneBinaries_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1880347035;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneBinaries_1)) return false;
        final NullableListOfOneBinaries_1 other = (NullableListOfOneBinaries_1) obj;

        if (!(com.dslplatform.ocd.values.Guards
                .compareBinary(this.nullableListOfOneBinaries,
                        other.nullableListOfOneBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneBinaries_1(" + nullableListOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> nullableListOfOneBinaries;

    @JsonProperty("nullableListOfOneBinaries")
    public java.util.List<byte[]> getNullableListOfOneBinaries() {
        return nullableListOfOneBinaries;
    }

    public NullableListOfOneBinaries_1 setNullableListOfOneBinaries(
            final java.util.List<byte[]> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneBinaries = value;

        return this;
    }
}
