package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneBinaries_1 implements java.io.Serializable {
    public OneListOfOneBinaries_1(
            final java.util.List<byte[]> oneListOfOneBinaries) {
        setOneListOfOneBinaries(oneListOfOneBinaries);
    }

    public OneListOfOneBinaries_1() {
        this.oneListOfOneBinaries = new java.util.ArrayList<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 673505336;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneBinaries_1)) return false;
        final OneListOfOneBinaries_1 other = (OneListOfOneBinaries_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.oneListOfOneBinaries, other.oneListOfOneBinaries)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneBinaries_1(" + oneListOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> oneListOfOneBinaries;

    @JsonProperty("oneListOfOneBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<byte[]> getOneListOfOneBinaries() {
        return oneListOfOneBinaries;
    }

    public OneListOfOneBinaries_1 setOneListOfOneBinaries(
            final java.util.List<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneBinaries\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneBinaries = value;

        return this;
    }
}
