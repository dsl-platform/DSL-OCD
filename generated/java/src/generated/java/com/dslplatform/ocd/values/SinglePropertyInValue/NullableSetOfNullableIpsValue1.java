package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableIpsValue1 implements
        java.io.Serializable {
    public NullableSetOfNullableIpsValue1(
            final java.util.Set<java.net.InetAddress> nullableSetOfNullableIps) {
        setNullableSetOfNullableIps(nullableSetOfNullableIps);
    }

    public NullableSetOfNullableIpsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1319281697;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableIpsValue1)) return false;
        final NullableSetOfNullableIpsValue1 other = (NullableSetOfNullableIpsValue1) obj;

        if (!(this.nullableSetOfNullableIps == other.nullableSetOfNullableIps || this.nullableSetOfNullableIps != null
                && this.nullableSetOfNullableIps
                        .equals(other.nullableSetOfNullableIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableIpsValue1(" + nullableSetOfNullableIps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.InetAddress> nullableSetOfNullableIps;

    @JsonProperty("nullableSetOfNullableIps")
    public java.util.Set<java.net.InetAddress> getNullableSetOfNullableIps() {
        return nullableSetOfNullableIps;
    }

    public NullableSetOfNullableIpsValue1 setNullableSetOfNullableIps(
            final java.util.Set<java.net.InetAddress> value) {
        this.nullableSetOfNullableIps = value;

        return this;
    }
}
