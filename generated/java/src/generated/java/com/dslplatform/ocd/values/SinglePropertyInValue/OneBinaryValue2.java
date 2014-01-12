package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneBinaryValue2 implements java.io.Serializable {
    public OneBinaryValue2(
            final byte[] oneBinary) {
        setOneBinary(oneBinary);
    }

    public OneBinaryValue2() {
        this.oneBinary = new byte[0];
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1213679850;
        result = prime * result + (java.util.Arrays.hashCode(this.oneBinary));
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneBinaryValue2)) return false;
        final OneBinaryValue2 other = (OneBinaryValue2) obj;

        if (!(java.util.Arrays.equals(this.oneBinary, other.oneBinary)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneBinaryValue2(" + oneBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[] oneBinary;

    @JsonProperty("oneBinary")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public byte[] getOneBinary() {
        return oneBinary;
    }

    public OneBinaryValue2 setOneBinary(final byte[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneBinary\" cannot be null!");
        this.oneBinary = value;

        return this;
    }
}
