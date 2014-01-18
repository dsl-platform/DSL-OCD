package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneIps_1 implements java.io.Serializable {
    public NullableArrayOfOneIps_1(
            final java.net.InetAddress[] nullableArrayOfOneIps) {
        setNullableArrayOfOneIps(nullableArrayOfOneIps);
    }

    public NullableArrayOfOneIps_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1949766099;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneIps_1)) return false;
        final NullableArrayOfOneIps_1 other = (NullableArrayOfOneIps_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneIps,
                other.nullableArrayOfOneIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneIps_1(" + nullableArrayOfOneIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress[] nullableArrayOfOneIps;

    @JsonProperty("nullableArrayOfOneIps")
    public java.net.InetAddress[] getNullableArrayOfOneIps() {
        return nullableArrayOfOneIps;
    }

    public NullableArrayOfOneIps_1 setNullableArrayOfOneIps(
            final java.net.InetAddress[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneIps = value;

        return this;
    }
}
