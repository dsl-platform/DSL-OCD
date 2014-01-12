package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableBinariesValue1 implements
        java.io.Serializable {
    public OneSetOfNullableBinariesValue1(
            final java.util.Set<byte[]> oneSetOfNullableBinaries) {
        setOneSetOfNullableBinaries(oneSetOfNullableBinaries);
    }

    public OneSetOfNullableBinariesValue1() {
        this.oneSetOfNullableBinaries = new java.util.HashSet<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 584566659;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableBinariesValue1)) return false;
        final OneSetOfNullableBinariesValue1 other = (OneSetOfNullableBinariesValue1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.oneSetOfNullableBinaries, other.oneSetOfNullableBinaries)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableBinariesValue1(" + oneSetOfNullableBinaries
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> oneSetOfNullableBinaries;

    @JsonProperty("oneSetOfNullableBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<byte[]> getOneSetOfNullableBinaries() {
        return oneSetOfNullableBinaries;
    }

    public OneSetOfNullableBinariesValue1 setOneSetOfNullableBinaries(
            final java.util.Set<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableBinaries\" cannot be null!");
        this.oneSetOfNullableBinaries = value;

        return this;
    }
}
