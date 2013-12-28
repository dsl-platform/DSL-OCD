package com.dslplatform.ocd.values.OptArrayOptBinaryInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptBinaryValue implements java.io.Serializable {
    public OptArrayOptBinaryValue(
            final byte[][] optArrayOptBinary) {
        setOptArrayOptBinary(optArrayOptBinary);
    }

    public OptArrayOptBinaryValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1663531751;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptBinaryValue)) return false;
        final OptArrayOptBinaryValue other = (OptArrayOptBinaryValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.optArrayOptBinary, other.optArrayOptBinary)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptBinaryValue(" + optArrayOptBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[][] optArrayOptBinary;

    @JsonProperty("optArrayOptBinary")
    public byte[][] getOptArrayOptBinary() {
        return optArrayOptBinary;
    }

    public OptArrayOptBinaryValue setOptArrayOptBinary(final byte[][] value) {
        this.optArrayOptBinary = value;

        return this;
    }
}
