package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableBinariesValue3 implements
        java.io.Serializable {
    public OneArrayOfNullableBinariesValue3(
            final byte[][] oneArrayOfNullableBinaries) {
        setOneArrayOfNullableBinaries(oneArrayOfNullableBinaries);
    }

    public OneArrayOfNullableBinariesValue3() {
        this.oneArrayOfNullableBinaries = new byte[][] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1998387060;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableBinariesValue3)) return false;
        final OneArrayOfNullableBinariesValue3 other = (OneArrayOfNullableBinariesValue3) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.oneArrayOfNullableBinaries,
                other.oneArrayOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableBinariesValue3(" + oneArrayOfNullableBinaries
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] oneArrayOfNullableBinaries;

    @JsonProperty("oneArrayOfNullableBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public byte[][] getOneArrayOfNullableBinaries() {
        return oneArrayOfNullableBinaries;
    }

    public OneArrayOfNullableBinariesValue3 setOneArrayOfNullableBinaries(
            final byte[][] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableBinaries\" cannot be null!");
        this.oneArrayOfNullableBinaries = value;

        return this;
    }
}
