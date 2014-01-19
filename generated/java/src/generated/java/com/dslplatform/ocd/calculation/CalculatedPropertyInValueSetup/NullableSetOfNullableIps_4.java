package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableIps_4 implements java.io.Serializable {
    public NullableSetOfNullableIps_4(
            final java.util.Set<java.net.InetAddress> nullableSetOfNullableIps,
            final java.util.Set<java.net.InetAddress> calculatedNullableSetOfNullableIps,
            final java.util.Set<java.net.InetAddress> persistedNullableSetOfNullableIps) {
        setNullableSetOfNullableIps(nullableSetOfNullableIps);
        this.calculatedNullableSetOfNullableIps = calculatedNullableSetOfNullableIps;
        this.persistedNullableSetOfNullableIps = persistedNullableSetOfNullableIps;
    }

    public NullableSetOfNullableIps_4() {
        this.calculatedNullableSetOfNullableIps = null;
        this.persistedNullableSetOfNullableIps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 566247382;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableIps_4)) return false;
        final NullableSetOfNullableIps_4 other = (NullableSetOfNullableIps_4) obj;

        if (!(this.nullableSetOfNullableIps == other.nullableSetOfNullableIps || this.nullableSetOfNullableIps != null
                && this.nullableSetOfNullableIps
                        .equals(other.nullableSetOfNullableIps))) return false;
        if (!(this.calculatedNullableSetOfNullableIps == other.calculatedNullableSetOfNullableIps || this.calculatedNullableSetOfNullableIps != null
                && this.calculatedNullableSetOfNullableIps
                        .equals(other.calculatedNullableSetOfNullableIps)))
            return false;
        if (!(this.persistedNullableSetOfNullableIps == other.persistedNullableSetOfNullableIps || this.persistedNullableSetOfNullableIps != null
                && this.persistedNullableSetOfNullableIps
                        .equals(other.persistedNullableSetOfNullableIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableIps_4(" + nullableSetOfNullableIps + ','
                + calculatedNullableSetOfNullableIps + ','
                + persistedNullableSetOfNullableIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.InetAddress> nullableSetOfNullableIps;

    @JsonProperty("nullableSetOfNullableIps")
    public java.util.Set<java.net.InetAddress> getNullableSetOfNullableIps() {
        return nullableSetOfNullableIps;
    }

    public NullableSetOfNullableIps_4 setNullableSetOfNullableIps(
            final java.util.Set<java.net.InetAddress> value) {
        this.nullableSetOfNullableIps = value;

        return this;
    }

    private final java.util.Set<java.net.InetAddress> calculatedNullableSetOfNullableIps;

    public java.util.Set<java.net.InetAddress> getCalculatedNullableSetOfNullableIps() {
        return this.calculatedNullableSetOfNullableIps;
    }

    private final java.util.Set<java.net.InetAddress> persistedNullableSetOfNullableIps;

    public java.util.Set<java.net.InetAddress> getPersistedNullableSetOfNullableIps() {
        return this.persistedNullableSetOfNullableIps;
    }
}
