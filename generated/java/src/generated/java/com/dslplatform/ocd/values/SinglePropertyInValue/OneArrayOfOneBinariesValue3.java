package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneBinariesValue3 implements java.io.Serializable {
    public OneArrayOfOneBinariesValue3(
            final byte[][] oneArrayOfOneBinaries) {
        setOneArrayOfOneBinaries(oneArrayOfOneBinaries);
    }

    public OneArrayOfOneBinariesValue3() {
        this.oneArrayOfOneBinaries = new byte[][] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 7790195;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneBinariesValue3)) return false;
        final OneArrayOfOneBinariesValue3 other = (OneArrayOfOneBinariesValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.oneArrayOfOneBinaries, other.oneArrayOfOneBinaries)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneBinariesValue3(" + oneArrayOfOneBinaries + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] oneArrayOfOneBinaries;

    @JsonProperty("oneArrayOfOneBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public byte[][] getOneArrayOfOneBinaries() {
        return oneArrayOfOneBinaries;
    }

    public OneArrayOfOneBinariesValue3 setOneArrayOfOneBinaries(
            final byte[][] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneBinaries\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneBinaries = value;

        return this;
    }
}
