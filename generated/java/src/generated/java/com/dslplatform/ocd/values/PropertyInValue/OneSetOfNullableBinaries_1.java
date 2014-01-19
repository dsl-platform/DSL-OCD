package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableBinaries_1 implements java.io.Serializable {
    public OneSetOfNullableBinaries_1(
            final java.util.Set<byte[]> oneSetOfNullableBinaries) {
        setOneSetOfNullableBinaries(oneSetOfNullableBinaries);
    }

    public OneSetOfNullableBinaries_1() {
        this.oneSetOfNullableBinaries = new java.util.HashSet<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1007165631;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableBinaries_1)) return false;
        final OneSetOfNullableBinaries_1 other = (OneSetOfNullableBinaries_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.oneSetOfNullableBinaries, other.oneSetOfNullableBinaries)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableBinaries_1(" + oneSetOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> oneSetOfNullableBinaries;

    @JsonProperty("oneSetOfNullableBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<byte[]> getOneSetOfNullableBinaries() {
        return oneSetOfNullableBinaries;
    }

    public OneSetOfNullableBinaries_1 setOneSetOfNullableBinaries(
            final java.util.Set<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableBinaries\" cannot be null!");
        this.oneSetOfNullableBinaries = value;

        return this;
    }
}