package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableIps_1 implements java.io.Serializable {
    public NullableListOfNullableIps_1(
            final java.util.List<java.net.InetAddress> nullableListOfNullableIps) {
        setNullableListOfNullableIps(nullableListOfNullableIps);
    }

    public NullableListOfNullableIps_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 791353843;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableIps_1)) return false;
        final NullableListOfNullableIps_1 other = (NullableListOfNullableIps_1) obj;

        if (!(this.nullableListOfNullableIps == other.nullableListOfNullableIps || this.nullableListOfNullableIps != null
                && this.nullableListOfNullableIps
                        .equals(other.nullableListOfNullableIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableIps_1(" + nullableListOfNullableIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.InetAddress> nullableListOfNullableIps;

    @JsonProperty("nullableListOfNullableIps")
    public java.util.List<java.net.InetAddress> getNullableListOfNullableIps() {
        return nullableListOfNullableIps;
    }

    public NullableListOfNullableIps_1 setNullableListOfNullableIps(
            final java.util.List<java.net.InetAddress> value) {
        this.nullableListOfNullableIps = value;

        return this;
    }
}
