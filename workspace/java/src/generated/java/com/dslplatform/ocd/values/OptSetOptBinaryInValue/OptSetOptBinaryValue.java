package com.dslplatform.ocd.values.OptSetOptBinaryInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetOptBinaryValue implements java.io.Serializable {
    public OptSetOptBinaryValue(
            final java.util.Set<byte[]> optSetOptBinary) {
        setOptSetOptBinary(optSetOptBinary);
    }

    public OptSetOptBinaryValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 267609492;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptBinaryValue)) return false;
        final OptSetOptBinaryValue other = (OptSetOptBinaryValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.optSetOptBinary, other.optSetOptBinary))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptBinaryValue(" + optSetOptBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> optSetOptBinary;

    @JsonProperty("optSetOptBinary")
    public java.util.Set<byte[]> getOptSetOptBinary() {
        return optSetOptBinary;
    }

    public OptSetOptBinaryValue setOptSetOptBinary(
            final java.util.Set<byte[]> value) {
        this.optSetOptBinary = value;

        return this;
    }
}
