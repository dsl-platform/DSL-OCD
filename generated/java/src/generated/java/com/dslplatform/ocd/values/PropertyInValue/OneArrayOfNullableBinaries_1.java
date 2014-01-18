package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableBinaries_1 implements java.io.Serializable {
    public OneArrayOfNullableBinaries_1(
            final byte[][] oneArrayOfNullableBinaries) {
        setOneArrayOfNullableBinaries(oneArrayOfNullableBinaries);
    }

    public OneArrayOfNullableBinaries_1() {
        this.oneArrayOfNullableBinaries = new byte[][] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1896326170;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableBinaries_1)) return false;
        final OneArrayOfNullableBinaries_1 other = (OneArrayOfNullableBinaries_1) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.oneArrayOfNullableBinaries,
                other.oneArrayOfNullableBinaries))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableBinaries_1(" + oneArrayOfNullableBinaries
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] oneArrayOfNullableBinaries;

    @JsonProperty("oneArrayOfNullableBinaries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public byte[][] getOneArrayOfNullableBinaries() {
        return oneArrayOfNullableBinaries;
    }

    public OneArrayOfNullableBinaries_1 setOneArrayOfNullableBinaries(
            final byte[][] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableBinaries\" cannot be null!");
        this.oneArrayOfNullableBinaries = value;

        return this;
    }
}
