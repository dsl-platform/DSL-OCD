package com.dslplatform.ocd.values.OptSetBinaryInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetBinaryValue implements java.io.Serializable {
    public OptSetBinaryValue(
            final java.util.Set<byte[]> optSetBinary) {
        setOptSetBinary(optSetBinary);
    }

    public OptSetBinaryValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 130236461;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetBinaryValue)) return false;
        final OptSetBinaryValue other = (OptSetBinaryValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.optSetBinary, other.optSetBinary))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetBinaryValue(" + optSetBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> optSetBinary;

    @JsonProperty("optSetBinary")
    public java.util.Set<byte[]> getOptSetBinary() {
        return optSetBinary;
    }

    public OptSetBinaryValue setOptSetBinary(final java.util.Set<byte[]> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetBinary = value;

        return this;
    }
}
