package com.dslplatform.ocd.values.ArrayOptBinaryInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptBinaryValue implements java.io.Serializable {
    public ArrayOptBinaryValue(
            final byte[][] arrayOptBinary) {
        setArrayOptBinary(arrayOptBinary);
    }

    public ArrayOptBinaryValue() {
        this.arrayOptBinary = new byte[][] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 677538406;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptBinaryValue)) return false;
        final ArrayOptBinaryValue other = (ArrayOptBinaryValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.arrayOptBinary, other.arrayOptBinary))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptBinaryValue(" + arrayOptBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] arrayOptBinary;

    @JsonProperty("arrayOptBinary")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public byte[][] getArrayOptBinary() {
        return arrayOptBinary;
    }

    public ArrayOptBinaryValue setArrayOptBinary(final byte[][] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptBinary\" cannot be null!");
        this.arrayOptBinary = value;

        return this;
    }
}
