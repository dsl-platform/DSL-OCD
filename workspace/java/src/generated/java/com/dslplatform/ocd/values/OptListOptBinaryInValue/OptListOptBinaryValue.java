package com.dslplatform.ocd.values.OptListOptBinaryInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptBinaryValue implements java.io.Serializable {
    public OptListOptBinaryValue(
            final java.util.List<byte[]> optListOptBinary) {
        setOptListOptBinary(optListOptBinary);
    }

    public OptListOptBinaryValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1951587850;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptBinaryValue)) return false;
        final OptListOptBinaryValue other = (OptListOptBinaryValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.optListOptBinary, other.optListOptBinary))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptBinaryValue(" + optListOptBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> optListOptBinary;

    @JsonProperty("optListOptBinary")
    public java.util.List<byte[]> getOptListOptBinary() {
        return optListOptBinary;
    }

    public OptListOptBinaryValue setOptListOptBinary(
            final java.util.List<byte[]> value) {
        this.optListOptBinary = value;

        return this;
    }
}
