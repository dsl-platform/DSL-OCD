package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneIps_4 implements java.io.Serializable {
    public NullableSetOfOneIps_4(
            final java.util.Set<java.net.InetAddress> nullableSetOfOneIps,
            final java.util.Set<java.net.InetAddress> calculatedNullableSetOfOneIps,
            final java.util.Set<java.net.InetAddress> persistedNullableSetOfOneIps) {
        setNullableSetOfOneIps(nullableSetOfOneIps);
        this.calculatedNullableSetOfOneIps = calculatedNullableSetOfOneIps;
        this.persistedNullableSetOfOneIps = persistedNullableSetOfOneIps;
    }

    public NullableSetOfOneIps_4() {
        this.calculatedNullableSetOfOneIps = null;
        this.persistedNullableSetOfOneIps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 783916271;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneIps_4)) return false;
        final NullableSetOfOneIps_4 other = (NullableSetOfOneIps_4) obj;

        if (!(this.nullableSetOfOneIps == other.nullableSetOfOneIps || this.nullableSetOfOneIps != null
                && this.nullableSetOfOneIps.equals(other.nullableSetOfOneIps)))
            return false;
        if (!(this.calculatedNullableSetOfOneIps == other.calculatedNullableSetOfOneIps || this.calculatedNullableSetOfOneIps != null
                && this.calculatedNullableSetOfOneIps
                        .equals(other.calculatedNullableSetOfOneIps)))
            return false;
        if (!(this.persistedNullableSetOfOneIps == other.persistedNullableSetOfOneIps || this.persistedNullableSetOfOneIps != null
                && this.persistedNullableSetOfOneIps
                        .equals(other.persistedNullableSetOfOneIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneIps_4(" + nullableSetOfOneIps + ','
                + calculatedNullableSetOfOneIps + ','
                + persistedNullableSetOfOneIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.InetAddress> nullableSetOfOneIps;

    @JsonProperty("nullableSetOfOneIps")
    public java.util.Set<java.net.InetAddress> getNullableSetOfOneIps() {
        return nullableSetOfOneIps;
    }

    public NullableSetOfOneIps_4 setNullableSetOfOneIps(
            final java.util.Set<java.net.InetAddress> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneIps = value;

        return this;
    }

    private final java.util.Set<java.net.InetAddress> calculatedNullableSetOfOneIps;

    public java.util.Set<java.net.InetAddress> getCalculatedNullableSetOfOneIps() {
        return this.calculatedNullableSetOfOneIps;
    }

    private final java.util.Set<java.net.InetAddress> persistedNullableSetOfOneIps;

    public java.util.Set<java.net.InetAddress> getPersistedNullableSetOfOneIps() {
        return this.persistedNullableSetOfOneIps;
    }
}
