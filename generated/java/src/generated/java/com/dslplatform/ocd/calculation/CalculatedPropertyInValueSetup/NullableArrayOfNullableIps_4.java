package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableIps_4 implements java.io.Serializable {
    public NullableArrayOfNullableIps_4(
            final java.net.InetAddress[] nullableArrayOfNullableIps,
            final java.net.InetAddress[] calculatedNullableArrayOfNullableIps,
            final java.net.InetAddress[] persistedNullableArrayOfNullableIps) {
        setNullableArrayOfNullableIps(nullableArrayOfNullableIps);
        this.calculatedNullableArrayOfNullableIps = calculatedNullableArrayOfNullableIps;
        this.persistedNullableArrayOfNullableIps = persistedNullableArrayOfNullableIps;
    }

    public NullableArrayOfNullableIps_4() {
        this.calculatedNullableArrayOfNullableIps = null;
        this.persistedNullableArrayOfNullableIps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1479582805;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableIps_4)) return false;
        final NullableArrayOfNullableIps_4 other = (NullableArrayOfNullableIps_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableIps,
                other.nullableArrayOfNullableIps))) return false;
        if (!(this.calculatedNullableArrayOfNullableIps == other.calculatedNullableArrayOfNullableIps || this.calculatedNullableArrayOfNullableIps != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableIps,
                        other.calculatedNullableArrayOfNullableIps)))
            return false;
        if (!(this.persistedNullableArrayOfNullableIps == other.persistedNullableArrayOfNullableIps || this.persistedNullableArrayOfNullableIps != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableIps,
                        other.persistedNullableArrayOfNullableIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableIps_4(" + nullableArrayOfNullableIps
                + ',' + calculatedNullableArrayOfNullableIps + ','
                + persistedNullableArrayOfNullableIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress[] nullableArrayOfNullableIps;

    @JsonProperty("nullableArrayOfNullableIps")
    public java.net.InetAddress[] getNullableArrayOfNullableIps() {
        return nullableArrayOfNullableIps;
    }

    public NullableArrayOfNullableIps_4 setNullableArrayOfNullableIps(
            final java.net.InetAddress[] value) {
        this.nullableArrayOfNullableIps = value;

        return this;
    }

    private final java.net.InetAddress[] calculatedNullableArrayOfNullableIps;

    public java.net.InetAddress[] getCalculatedNullableArrayOfNullableIps() {
        return this.calculatedNullableArrayOfNullableIps;
    }

    private final java.net.InetAddress[] persistedNullableArrayOfNullableIps;

    public java.net.InetAddress[] getPersistedNullableArrayOfNullableIps() {
        return this.persistedNullableArrayOfNullableIps;
    }
}
