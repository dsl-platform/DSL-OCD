package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneIps_1 implements java.io.Serializable {
    public NullableSetOfOneIps_1(
            final java.util.Set<java.net.InetAddress> nullableSetOfOneIps) {
        setNullableSetOfOneIps(nullableSetOfOneIps);
    }

    public NullableSetOfOneIps_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 783916274;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneIps_1)) return false;
        final NullableSetOfOneIps_1 other = (NullableSetOfOneIps_1) obj;

        if (!(this.nullableSetOfOneIps == other.nullableSetOfOneIps || this.nullableSetOfOneIps != null
                && this.nullableSetOfOneIps.equals(other.nullableSetOfOneIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneIps_1(" + nullableSetOfOneIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.InetAddress> nullableSetOfOneIps;

    @JsonProperty("nullableSetOfOneIps")
    public java.util.Set<java.net.InetAddress> getNullableSetOfOneIps() {
        return nullableSetOfOneIps;
    }

    public NullableSetOfOneIps_1 setNullableSetOfOneIps(
            final java.util.Set<java.net.InetAddress> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneIps = value;

        return this;
    }
}
