package com.dslplatform.ocd.values.OptListBinaryInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListBinaryValue implements java.io.Serializable {
    public OptListBinaryValue(
            final java.util.List<byte[]> optListBinary) {
        setOptListBinary(optListBinary);
    }

    public OptListBinaryValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1781818013;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListBinaryValue)) return false;
        final OptListBinaryValue other = (OptListBinaryValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.optListBinary, other.optListBinary))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListBinaryValue(" + optListBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<byte[]> optListBinary;

    @JsonProperty("optListBinary")
    public java.util.List<byte[]> getOptListBinary() {
        return optListBinary;
    }

    public OptListBinaryValue setOptListBinary(
            final java.util.List<byte[]> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListBinary = value;

        return this;
    }
}
