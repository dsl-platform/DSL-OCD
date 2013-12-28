package com.dslplatform.ocd.values.OptArrayBinaryInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayBinaryValue implements java.io.Serializable {
    public OptArrayBinaryValue(
            final byte[][] optArrayBinary) {
        setOptArrayBinary(optArrayBinary);
    }

    public OptArrayBinaryValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 719798674;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayBinaryValue)) return false;
        final OptArrayBinaryValue other = (OptArrayBinaryValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.optArrayBinary, other.optArrayBinary))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayBinaryValue(" + optArrayBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] optArrayBinary;

    @JsonProperty("optArrayBinary")
    public byte[][] getOptArrayBinary() {
        return optArrayBinary;
    }

    public OptArrayBinaryValue setOptArrayBinary(final byte[][] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optArrayBinary = value;

        return this;
    }
}
