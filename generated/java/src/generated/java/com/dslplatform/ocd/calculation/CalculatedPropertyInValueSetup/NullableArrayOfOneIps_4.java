package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneIps_4 implements java.io.Serializable {
    public NullableArrayOfOneIps_4(
            final java.net.InetAddress[] nullableArrayOfOneIps,
            final java.net.InetAddress[] calculatedNullableArrayOfOneIps,
            final java.net.InetAddress[] persistedNullableArrayOfOneIps) {
        setNullableArrayOfOneIps(nullableArrayOfOneIps);
        this.calculatedNullableArrayOfOneIps = calculatedNullableArrayOfOneIps;
        this.persistedNullableArrayOfOneIps = persistedNullableArrayOfOneIps;
    }

    public NullableArrayOfOneIps_4() {
        this.calculatedNullableArrayOfOneIps = null;
        this.persistedNullableArrayOfOneIps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1949766096;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneIps_4)) return false;
        final NullableArrayOfOneIps_4 other = (NullableArrayOfOneIps_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneIps,
                other.nullableArrayOfOneIps))) return false;
        if (!(this.calculatedNullableArrayOfOneIps == other.calculatedNullableArrayOfOneIps || this.calculatedNullableArrayOfOneIps != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneIps,
                        other.calculatedNullableArrayOfOneIps))) return false;
        if (!(this.persistedNullableArrayOfOneIps == other.persistedNullableArrayOfOneIps || this.persistedNullableArrayOfOneIps != null
                && java.util.Arrays.equals(this.persistedNullableArrayOfOneIps,
                        other.persistedNullableArrayOfOneIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneIps_4(" + nullableArrayOfOneIps + ','
                + calculatedNullableArrayOfOneIps + ','
                + persistedNullableArrayOfOneIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress[] nullableArrayOfOneIps;

    @JsonProperty("nullableArrayOfOneIps")
    public java.net.InetAddress[] getNullableArrayOfOneIps() {
        return nullableArrayOfOneIps;
    }

    public NullableArrayOfOneIps_4 setNullableArrayOfOneIps(
            final java.net.InetAddress[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneIps = value;

        return this;
    }

    private final java.net.InetAddress[] calculatedNullableArrayOfOneIps;

    public java.net.InetAddress[] getCalculatedNullableArrayOfOneIps() {
        return this.calculatedNullableArrayOfOneIps;
    }

    private final java.net.InetAddress[] persistedNullableArrayOfOneIps;

    public java.net.InetAddress[] getPersistedNullableArrayOfOneIps() {
        return this.persistedNullableArrayOfOneIps;
    }
}
