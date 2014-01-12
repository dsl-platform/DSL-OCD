package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneBinariesValue6 implements java.io.Serializable {
    public OneArrayOfOneBinariesValue6(
            final byte[][] oneArrayOfOneBinaries) {
        setOneArrayOfOneBinaries(oneArrayOfOneBinaries);
    }

    public OneArrayOfOneBinariesValue6() {
        this.oneArrayOfOneBinaries = new byte[][] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 7790198;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneBinariesValue6)) return false;
        final OneArrayOfOneBinariesValue6 other = (OneArrayOfOneBinariesValue6) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.oneArrayOfOneBinaries, other.oneArrayOfOneBinaries)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneBinariesValue6(" + oneArrayOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] oneArrayOfOneBinaries;

    @JsonProperty("oneArrayOfOneBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public byte[][] getOneArrayOfOneBinaries() {
        return oneArrayOfOneBinaries;
    }

    public OneArrayOfOneBinariesValue6 setOneArrayOfOneBinaries(
            final byte[][] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneBinaries\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneBinaries = value;

        return this;
    }
}
