package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableIpsValue3 implements
        java.io.Serializable {
    public NullableSetOfNullableIpsValue3(
            final java.util.Set<java.net.InetAddress> nullableSetOfNullableIps) {
        setNullableSetOfNullableIps(nullableSetOfNullableIps);
    }

    public NullableSetOfNullableIpsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1812886185;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableIpsValue3)) return false;
        final NullableSetOfNullableIpsValue3 other = (NullableSetOfNullableIpsValue3) obj;

        if (!(this.nullableSetOfNullableIps == other.nullableSetOfNullableIps || this.nullableSetOfNullableIps != null
                && this.nullableSetOfNullableIps
                        .equals(other.nullableSetOfNullableIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableIpsValue3(" + nullableSetOfNullableIps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.InetAddress> nullableSetOfNullableIps;

    @JsonProperty("nullableSetOfNullableIps")
    public java.util.Set<java.net.InetAddress> getNullableSetOfNullableIps() {
        return nullableSetOfNullableIps;
    }

    public NullableSetOfNullableIpsValue3 setNullableSetOfNullableIps(
            final java.util.Set<java.net.InetAddress> value) {
        this.nullableSetOfNullableIps = value;

        return this;
    }
}
