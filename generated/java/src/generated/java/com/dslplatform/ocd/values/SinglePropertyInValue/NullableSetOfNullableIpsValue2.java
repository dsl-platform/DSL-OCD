package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableIpsValue2 implements
        java.io.Serializable {
    public NullableSetOfNullableIpsValue2(
            final java.util.Set<java.net.InetAddress> nullableSetOfNullableIps) {
        setNullableSetOfNullableIps(nullableSetOfNullableIps);
    }

    public NullableSetOfNullableIpsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 246802244;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableIpsValue2)) return false;
        final NullableSetOfNullableIpsValue2 other = (NullableSetOfNullableIpsValue2) obj;

        if (!(this.nullableSetOfNullableIps == other.nullableSetOfNullableIps || this.nullableSetOfNullableIps != null
                && this.nullableSetOfNullableIps
                        .equals(other.nullableSetOfNullableIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableIpsValue2(" + nullableSetOfNullableIps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.InetAddress> nullableSetOfNullableIps;

    @JsonProperty("nullableSetOfNullableIps")
    public java.util.Set<java.net.InetAddress> getNullableSetOfNullableIps() {
        return nullableSetOfNullableIps;
    }

    public NullableSetOfNullableIpsValue2 setNullableSetOfNullableIps(
            final java.util.Set<java.net.InetAddress> value) {
        this.nullableSetOfNullableIps = value;

        return this;
    }
}
