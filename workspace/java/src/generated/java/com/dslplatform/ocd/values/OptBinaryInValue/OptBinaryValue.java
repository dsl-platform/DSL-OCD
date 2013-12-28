package com.dslplatform.ocd.values.OptBinaryInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptBinaryValue implements java.io.Serializable {
    public OptBinaryValue(
            final byte[] optBinary) {
        setOptBinary(optBinary);
    }

    public OptBinaryValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2110741729;
        result = prime * result + (java.util.Arrays.hashCode(this.optBinary));
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptBinaryValue)) return false;
        final OptBinaryValue other = (OptBinaryValue) obj;

        if (!(java.util.Arrays.equals(this.optBinary, other.optBinary)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptBinaryValue(" + optBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[] optBinary;

    @JsonProperty("optBinary")
    public byte[] getOptBinary() {
        return optBinary;
    }

    public OptBinaryValue setOptBinary(final byte[] value) {
        this.optBinary = value;

        return this;
    }
}
