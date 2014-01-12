package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneIpsValue3 implements java.io.Serializable {
    public NullableSetOfOneIpsValue3(
            final java.util.Set<java.net.InetAddress> nullableSetOfOneIps) {
        setNullableSetOfOneIps(nullableSetOfOneIps);
    }

    public NullableSetOfOneIpsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1168341596;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneIpsValue3)) return false;
        final NullableSetOfOneIpsValue3 other = (NullableSetOfOneIpsValue3) obj;

        if (!(this.nullableSetOfOneIps == other.nullableSetOfOneIps || this.nullableSetOfOneIps != null
                && this.nullableSetOfOneIps.equals(other.nullableSetOfOneIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneIpsValue3(" + nullableSetOfOneIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.InetAddress> nullableSetOfOneIps;

    @JsonProperty("nullableSetOfOneIps")
    public java.util.Set<java.net.InetAddress> getNullableSetOfOneIps() {
        return nullableSetOfOneIps;
    }

    public NullableSetOfOneIpsValue3 setNullableSetOfOneIps(
            final java.util.Set<java.net.InetAddress> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneIps = value;

        return this;
    }
}
