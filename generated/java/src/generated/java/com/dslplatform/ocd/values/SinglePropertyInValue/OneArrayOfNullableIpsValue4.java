package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableIpsValue4 implements java.io.Serializable {
    public OneArrayOfNullableIpsValue4(
            final java.net.InetAddress[] oneArrayOfNullableIps) {
        setOneArrayOfNullableIps(oneArrayOfNullableIps);
    }

    public OneArrayOfNullableIpsValue4() {
        this.oneArrayOfNullableIps = new java.net.InetAddress[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1328980652;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableIpsValue4)) return false;
        final OneArrayOfNullableIpsValue4 other = (OneArrayOfNullableIpsValue4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableIps,
                other.oneArrayOfNullableIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableIpsValue4(" + oneArrayOfNullableIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress[] oneArrayOfNullableIps;

    @JsonProperty("oneArrayOfNullableIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.InetAddress[] getOneArrayOfNullableIps() {
        return oneArrayOfNullableIps;
    }

    public OneArrayOfNullableIpsValue4 setOneArrayOfNullableIps(
            final java.net.InetAddress[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableIps\" cannot be null!");
        this.oneArrayOfNullableIps = value;

        return this;
    }
}
