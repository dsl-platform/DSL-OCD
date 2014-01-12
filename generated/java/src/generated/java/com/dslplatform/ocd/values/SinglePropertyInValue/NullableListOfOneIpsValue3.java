package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneIpsValue3 implements java.io.Serializable {
    public NullableListOfOneIpsValue3(
            final java.util.List<java.net.InetAddress> nullableListOfOneIps) {
        setNullableListOfOneIps(nullableListOfOneIps);
    }

    public NullableListOfOneIpsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1185981886;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneIpsValue3)) return false;
        final NullableListOfOneIpsValue3 other = (NullableListOfOneIpsValue3) obj;

        if (!(this.nullableListOfOneIps == other.nullableListOfOneIps || this.nullableListOfOneIps != null
                && this.nullableListOfOneIps.equals(other.nullableListOfOneIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneIpsValue3(" + nullableListOfOneIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.InetAddress> nullableListOfOneIps;

    @JsonProperty("nullableListOfOneIps")
    public java.util.List<java.net.InetAddress> getNullableListOfOneIps() {
        return nullableListOfOneIps;
    }

    public NullableListOfOneIpsValue3 setNullableListOfOneIps(
            final java.util.List<java.net.InetAddress> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneIps = value;

        return this;
    }
}
