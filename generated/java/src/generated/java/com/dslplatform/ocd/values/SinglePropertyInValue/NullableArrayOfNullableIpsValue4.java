package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableIpsValue4 implements
        java.io.Serializable {
    public NullableArrayOfNullableIpsValue4(
            final java.net.InetAddress[] nullableArrayOfNullableIps) {
        setNullableArrayOfNullableIps(nullableArrayOfNullableIps);
    }

    public NullableArrayOfNullableIpsValue4() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1281028017;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableIpsValue4)) return false;
        final NullableArrayOfNullableIpsValue4 other = (NullableArrayOfNullableIpsValue4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableIps,
                other.nullableArrayOfNullableIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableIpsValue4(" + nullableArrayOfNullableIps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress[] nullableArrayOfNullableIps;

    @JsonProperty("nullableArrayOfNullableIps")
    public java.net.InetAddress[] getNullableArrayOfNullableIps() {
        return nullableArrayOfNullableIps;
    }

    public NullableArrayOfNullableIpsValue4 setNullableArrayOfNullableIps(
            final java.net.InetAddress[] value) {
        this.nullableArrayOfNullableIps = value;

        return this;
    }
}
