package com.dslplatform.ocd.values.SetOptBinaryInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptBinaryValue implements java.io.Serializable {
    public SetOptBinaryValue(
            final java.util.Set<byte[]> setOptBinary) {
        setSetOptBinary(setOptBinary);
    }

    public SetOptBinaryValue() {
        this.setOptBinary = new java.util.HashSet<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1617431543;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptBinaryValue)) return false;
        final SetOptBinaryValue other = (SetOptBinaryValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(
                this.setOptBinary, other.setOptBinary))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptBinaryValue(" + setOptBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> setOptBinary;

    @JsonProperty("setOptBinary")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<byte[]> getSetOptBinary() {
        return setOptBinary;
    }

    public SetOptBinaryValue setSetOptBinary(final java.util.Set<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptBinary\" cannot be null!");
        this.setOptBinary = value;

        return this;
    }
}
