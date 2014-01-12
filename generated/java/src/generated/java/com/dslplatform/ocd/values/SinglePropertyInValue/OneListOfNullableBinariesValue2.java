package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableBinariesValue2 implements
        java.io.Serializable {
    public OneListOfNullableBinariesValue2(
            final java.util.List<byte[]> oneListOfNullableBinaries) {
        setOneListOfNullableBinaries(oneListOfNullableBinaries);
    }

    public OneListOfNullableBinariesValue2() {
        this.oneListOfNullableBinaries = new java.util.ArrayList<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1577956114;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableBinariesValue2)) return false;
        final OneListOfNullableBinariesValue2 other = (OneListOfNullableBinariesValue2) obj;

        if (!(com.dslplatform.ocd.values.Guards
                .compareBinary(this.oneListOfNullableBinaries,
                        other.oneListOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableBinariesValue2(" + oneListOfNullableBinaries
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> oneListOfNullableBinaries;

    @JsonProperty("oneListOfNullableBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<byte[]> getOneListOfNullableBinaries() {
        return oneListOfNullableBinaries;
    }

    public OneListOfNullableBinariesValue2 setOneListOfNullableBinaries(
            final java.util.List<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableBinaries\" cannot be null!");
        this.oneListOfNullableBinaries = value;

        return this;
    }
}
