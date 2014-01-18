package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableBinary_1 implements java.io.Serializable {
    public NullableBinary_1(
            final byte[] nullableBinary) {
        setNullableBinary(nullableBinary);
    }

    public NullableBinary_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 114355758;
        result = prime * result
                + (java.util.Arrays.hashCode(this.nullableBinary));
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableBinary_1)) return false;
        final NullableBinary_1 other = (NullableBinary_1) obj;

        if (!(java.util.Arrays
                .equals(this.nullableBinary, other.nullableBinary)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableBinary_1(" + nullableBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[] nullableBinary;

    @JsonProperty("nullableBinary")
    public byte[] getNullableBinary() {
        return nullableBinary;
    }

    public NullableBinary_1 setNullableBinary(final byte[] value) {
        this.nullableBinary = value;

        return this;
    }
}
