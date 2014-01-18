package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableIps_1 implements java.io.Serializable {
    public NullableArrayOfNullableIps_1(
            final java.net.InetAddress[] nullableArrayOfNullableIps) {
        setNullableArrayOfNullableIps(nullableArrayOfNullableIps);
    }

    public NullableArrayOfNullableIps_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1076298278;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableIps_1)) return false;
        final NullableArrayOfNullableIps_1 other = (NullableArrayOfNullableIps_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableIps,
                other.nullableArrayOfNullableIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableIps_1(" + nullableArrayOfNullableIps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress[] nullableArrayOfNullableIps;

    @JsonProperty("nullableArrayOfNullableIps")
    public java.net.InetAddress[] getNullableArrayOfNullableIps() {
        return nullableArrayOfNullableIps;
    }

    public NullableArrayOfNullableIps_1 setNullableArrayOfNullableIps(
            final java.net.InetAddress[] value) {
        this.nullableArrayOfNullableIps = value;

        return this;
    }
}
