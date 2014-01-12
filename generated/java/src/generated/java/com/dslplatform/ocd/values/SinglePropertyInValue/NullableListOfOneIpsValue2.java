package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneIpsValue2 implements java.io.Serializable {
    public NullableListOfOneIpsValue2(
            final java.util.List<java.net.InetAddress> nullableListOfOneIps) {
        setNullableListOfOneIps(nullableListOfOneIps);
    }

    public NullableListOfOneIpsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 380102055;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneIpsValue2)) return false;
        final NullableListOfOneIpsValue2 other = (NullableListOfOneIpsValue2) obj;

        if (!(this.nullableListOfOneIps == other.nullableListOfOneIps || this.nullableListOfOneIps != null
                && this.nullableListOfOneIps.equals(other.nullableListOfOneIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneIpsValue2(" + nullableListOfOneIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.InetAddress> nullableListOfOneIps;

    @JsonProperty("nullableListOfOneIps")
    public java.util.List<java.net.InetAddress> getNullableListOfOneIps() {
        return nullableListOfOneIps;
    }

    public NullableListOfOneIpsValue2 setNullableListOfOneIps(
            final java.util.List<java.net.InetAddress> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneIps = value;

        return this;
    }
}
