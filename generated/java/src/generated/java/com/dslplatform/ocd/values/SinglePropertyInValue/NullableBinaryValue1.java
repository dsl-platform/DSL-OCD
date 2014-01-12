package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableBinaryValue1 implements java.io.Serializable {
    public NullableBinaryValue1(
            final byte[] nullableBinary) {
        setNullableBinary(nullableBinary);
    }

    public NullableBinaryValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 523905738;
        result = prime * result
                + (java.util.Arrays.hashCode(this.nullableBinary));
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableBinaryValue1)) return false;
        final NullableBinaryValue1 other = (NullableBinaryValue1) obj;

        if (!(java.util.Arrays
                .equals(this.nullableBinary, other.nullableBinary)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableBinaryValue1(" + nullableBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[] nullableBinary;

    @JsonProperty("nullableBinary")
    public byte[] getNullableBinary() {
        return nullableBinary;
    }

    public NullableBinaryValue1 setNullableBinary(final byte[] value) {
        this.nullableBinary = value;

        return this;
    }
}
