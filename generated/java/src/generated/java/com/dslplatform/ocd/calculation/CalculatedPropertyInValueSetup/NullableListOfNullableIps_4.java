package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableIps_4 implements java.io.Serializable {
    public NullableListOfNullableIps_4(
            final java.util.List<java.net.InetAddress> nullableListOfNullableIps,
            final java.util.List<java.net.InetAddress> calculatedNullableListOfNullableIps,
            final java.util.List<java.net.InetAddress> persistedNullableListOfNullableIps) {
        setNullableListOfNullableIps(nullableListOfNullableIps);
        this.calculatedNullableListOfNullableIps = calculatedNullableListOfNullableIps;
        this.persistedNullableListOfNullableIps = persistedNullableListOfNullableIps;
    }

    public NullableListOfNullableIps_4() {
        this.calculatedNullableListOfNullableIps = null;
        this.persistedNullableListOfNullableIps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 791353840;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableIps_4)) return false;
        final NullableListOfNullableIps_4 other = (NullableListOfNullableIps_4) obj;

        if (!(this.nullableListOfNullableIps == other.nullableListOfNullableIps || this.nullableListOfNullableIps != null
                && this.nullableListOfNullableIps
                        .equals(other.nullableListOfNullableIps)))
            return false;
        if (!(this.calculatedNullableListOfNullableIps == other.calculatedNullableListOfNullableIps || this.calculatedNullableListOfNullableIps != null
                && this.calculatedNullableListOfNullableIps
                        .equals(other.calculatedNullableListOfNullableIps)))
            return false;
        if (!(this.persistedNullableListOfNullableIps == other.persistedNullableListOfNullableIps || this.persistedNullableListOfNullableIps != null
                && this.persistedNullableListOfNullableIps
                        .equals(other.persistedNullableListOfNullableIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableIps_4(" + nullableListOfNullableIps + ','
                + calculatedNullableListOfNullableIps + ','
                + persistedNullableListOfNullableIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.InetAddress> nullableListOfNullableIps;

    @JsonProperty("nullableListOfNullableIps")
    public java.util.List<java.net.InetAddress> getNullableListOfNullableIps() {
        return nullableListOfNullableIps;
    }

    public NullableListOfNullableIps_4 setNullableListOfNullableIps(
            final java.util.List<java.net.InetAddress> value) {
        this.nullableListOfNullableIps = value;

        return this;
    }

    private final java.util.List<java.net.InetAddress> calculatedNullableListOfNullableIps;

    public java.util.List<java.net.InetAddress> getCalculatedNullableListOfNullableIps() {
        return this.calculatedNullableListOfNullableIps;
    }

    private final java.util.List<java.net.InetAddress> persistedNullableListOfNullableIps;

    public java.util.List<java.net.InetAddress> getPersistedNullableListOfNullableIps() {
        return this.persistedNullableListOfNullableIps;
    }
}
