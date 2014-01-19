package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneIps_4 implements java.io.Serializable {
    public NullableListOfOneIps_4(
            final java.util.List<java.net.InetAddress> nullableListOfOneIps,
            final java.util.List<java.net.InetAddress> calculatedNullableListOfOneIps,
            final java.util.List<java.net.InetAddress> persistedNullableListOfOneIps) {
        setNullableListOfOneIps(nullableListOfOneIps);
        this.calculatedNullableListOfOneIps = calculatedNullableListOfOneIps;
        this.persistedNullableListOfOneIps = persistedNullableListOfOneIps;
    }

    public NullableListOfOneIps_4() {
        this.calculatedNullableListOfOneIps = null;
        this.persistedNullableListOfOneIps = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1654897377;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneIps_4)) return false;
        final NullableListOfOneIps_4 other = (NullableListOfOneIps_4) obj;

        if (!(this.nullableListOfOneIps == other.nullableListOfOneIps || this.nullableListOfOneIps != null
                && this.nullableListOfOneIps.equals(other.nullableListOfOneIps)))
            return false;
        if (!(this.calculatedNullableListOfOneIps == other.calculatedNullableListOfOneIps || this.calculatedNullableListOfOneIps != null
                && this.calculatedNullableListOfOneIps
                        .equals(other.calculatedNullableListOfOneIps)))
            return false;
        if (!(this.persistedNullableListOfOneIps == other.persistedNullableListOfOneIps || this.persistedNullableListOfOneIps != null
                && this.persistedNullableListOfOneIps
                        .equals(other.persistedNullableListOfOneIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneIps_4(" + nullableListOfOneIps + ','
                + calculatedNullableListOfOneIps + ','
                + persistedNullableListOfOneIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.InetAddress> nullableListOfOneIps;

    @JsonProperty("nullableListOfOneIps")
    public java.util.List<java.net.InetAddress> getNullableListOfOneIps() {
        return nullableListOfOneIps;
    }

    public NullableListOfOneIps_4 setNullableListOfOneIps(
            final java.util.List<java.net.InetAddress> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneIps = value;

        return this;
    }

    private final java.util.List<java.net.InetAddress> calculatedNullableListOfOneIps;

    public java.util.List<java.net.InetAddress> getCalculatedNullableListOfOneIps() {
        return this.calculatedNullableListOfOneIps;
    }

    private final java.util.List<java.net.InetAddress> persistedNullableListOfOneIps;

    public java.util.List<java.net.InetAddress> getPersistedNullableListOfOneIps() {
        return this.persistedNullableListOfOneIps;
    }
}
