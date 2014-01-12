package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneIpsValue2 implements java.io.Serializable {
    public NullableArrayOfOneIpsValue2(
            final java.net.InetAddress[] nullableArrayOfOneIps) {
        setNullableArrayOfOneIps(nullableArrayOfOneIps);
    }

    public NullableArrayOfOneIpsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 681381342;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneIpsValue2)) return false;
        final NullableArrayOfOneIpsValue2 other = (NullableArrayOfOneIpsValue2) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneIps,
                other.nullableArrayOfOneIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneIpsValue2(" + nullableArrayOfOneIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress[] nullableArrayOfOneIps;

    @JsonProperty("nullableArrayOfOneIps")
    public java.net.InetAddress[] getNullableArrayOfOneIps() {
        return nullableArrayOfOneIps;
    }

    public NullableArrayOfOneIpsValue2 setNullableArrayOfOneIps(
            final java.net.InetAddress[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneIps = value;

        return this;
    }
}
