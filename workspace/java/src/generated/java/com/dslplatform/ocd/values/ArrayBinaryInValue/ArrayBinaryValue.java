package com.dslplatform.ocd.values.ArrayBinaryInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayBinaryValue implements java.io.Serializable {
    public ArrayBinaryValue(
            final byte[][] arrayBinary) {
        setArrayBinary(arrayBinary);
    }

    public ArrayBinaryValue() {
        this.arrayBinary = new byte[][] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 866445699;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayBinaryValue)) return false;
        final ArrayBinaryValue other = (ArrayBinaryValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(this.arrayBinary,
                other.arrayBinary))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayBinaryValue(" + arrayBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] arrayBinary;

    @JsonProperty("arrayBinary")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public byte[][] getArrayBinary() {
        return arrayBinary;
    }

    public ArrayBinaryValue setArrayBinary(final byte[][] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayBinary\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.arrayBinary = value;

        return this;
    }
}
