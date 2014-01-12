package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableIpsValue1 implements
        java.io.Serializable {
    public NullableListOfNullableIpsValue1(
            final java.util.List<java.net.InetAddress> nullableListOfNullableIps) {
        setNullableListOfNullableIps(nullableListOfNullableIps);
    }

    public NullableListOfNullableIpsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 574842305;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableIpsValue1)) return false;
        final NullableListOfNullableIpsValue1 other = (NullableListOfNullableIpsValue1) obj;

        if (!(this.nullableListOfNullableIps == other.nullableListOfNullableIps || this.nullableListOfNullableIps != null
                && this.nullableListOfNullableIps
                        .equals(other.nullableListOfNullableIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableIpsValue1(" + nullableListOfNullableIps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.InetAddress> nullableListOfNullableIps;

    @JsonProperty("nullableListOfNullableIps")
    public java.util.List<java.net.InetAddress> getNullableListOfNullableIps() {
        return nullableListOfNullableIps;
    }

    public NullableListOfNullableIpsValue1 setNullableListOfNullableIps(
            final java.util.List<java.net.InetAddress> value) {
        this.nullableListOfNullableIps = value;

        return this;
    }
}
