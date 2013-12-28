package com.dslplatform.ocd.values.SetBinaryInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetBinaryValue implements java.io.Serializable {
    public SetBinaryValue(
            final java.util.Set<byte[]> setBinary) {
        setSetBinary(setBinary);
    }

    public SetBinaryValue() {
        this.setBinary = new java.util.HashSet<byte[]>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1223448884;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetBinaryValue)) return false;
        final SetBinaryValue other = (SetBinaryValue) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBinary(this.setBinary,
                other.setBinary))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetBinaryValue(" + setBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<byte[]> setBinary;

    @JsonProperty("setBinary")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<byte[]> getSetBinary() {
        return setBinary;
    }

    public SetBinaryValue setSetBinary(final java.util.Set<byte[]> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setBinary\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setBinary = value;

        return this;
    }
}
