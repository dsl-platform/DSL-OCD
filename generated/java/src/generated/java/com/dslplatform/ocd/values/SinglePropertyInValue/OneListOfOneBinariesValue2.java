package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneBinariesValue2 implements java.io.Serializable {
    public OneListOfOneBinariesValue2(
            final java.util.List<byte[]> oneListOfOneBinaries) {
        setOneListOfOneBinaries(oneListOfOneBinaries);
    }

    public OneListOfOneBinariesValue2() {
        this.oneListOfOneBinaries = new java.util.ArrayList<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1462856567;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneBinariesValue2)) return false;
        final OneListOfOneBinariesValue2 other = (OneListOfOneBinariesValue2) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.oneListOfOneBinaries, other.oneListOfOneBinaries)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneBinariesValue2(" + oneListOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> oneListOfOneBinaries;

    @JsonProperty("oneListOfOneBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<byte[]> getOneListOfOneBinaries() {
        return oneListOfOneBinaries;
    }

    public OneListOfOneBinariesValue2 setOneListOfOneBinaries(
            final java.util.List<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneBinaries\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneBinaries = value;

        return this;
    }
}
