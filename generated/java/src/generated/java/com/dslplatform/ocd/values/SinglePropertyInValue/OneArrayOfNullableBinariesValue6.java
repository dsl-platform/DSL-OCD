package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableBinariesValue6 implements
        java.io.Serializable {
    public OneArrayOfNullableBinariesValue6(
            final byte[][] oneArrayOfNullableBinaries) {
        setOneArrayOfNullableBinaries(oneArrayOfNullableBinaries);
    }

    public OneArrayOfNullableBinariesValue6() {
        this.oneArrayOfNullableBinaries = new byte[][] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1595102533;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableBinariesValue6)) return false;
        final OneArrayOfNullableBinariesValue6 other = (OneArrayOfNullableBinariesValue6) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.oneArrayOfNullableBinaries,
                other.oneArrayOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableBinariesValue6(" + oneArrayOfNullableBinaries
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] oneArrayOfNullableBinaries;

    @JsonProperty("oneArrayOfNullableBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public byte[][] getOneArrayOfNullableBinaries() {
        return oneArrayOfNullableBinaries;
    }

    public OneArrayOfNullableBinariesValue6 setOneArrayOfNullableBinaries(
            final byte[][] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableBinaries\" cannot be null!");
        this.oneArrayOfNullableBinaries = value;

        return this;
    }
}
