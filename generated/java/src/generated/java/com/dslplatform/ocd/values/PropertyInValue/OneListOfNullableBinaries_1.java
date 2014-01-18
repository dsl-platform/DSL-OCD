package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableBinaries_1 implements java.io.Serializable {
    public OneListOfNullableBinaries_1(
            final java.util.List<byte[]> oneListOfNullableBinaries) {
        setOneListOfNullableBinaries(oneListOfNullableBinaries);
    }

    public OneListOfNullableBinaries_1() {
        this.oneListOfNullableBinaries = new java.util.ArrayList<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1595983801;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableBinaries_1)) return false;
        final OneListOfNullableBinaries_1 other = (OneListOfNullableBinaries_1) obj;

        if (!(com.dslplatform.ocd.values.Guards
                .compareBinary(this.oneListOfNullableBinaries,
                        other.oneListOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableBinaries_1(" + oneListOfNullableBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> oneListOfNullableBinaries;

    @JsonProperty("oneListOfNullableBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<byte[]> getOneListOfNullableBinaries() {
        return oneListOfNullableBinaries;
    }

    public OneListOfNullableBinaries_1 setOneListOfNullableBinaries(
            final java.util.List<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableBinaries\" cannot be null!");
        this.oneListOfNullableBinaries = value;

        return this;
    }
}
