package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableIps_5 implements java.io.Serializable {
    public OneSetOfNullableIps_5(
            final java.util.Set<java.net.InetAddress> oneSetOfNullableIps,
            final java.util.Set<java.net.InetAddress> calculatedOneSetOfNullableIps,
            final java.util.Set<java.net.InetAddress> persistedOneSetOfNullableIps) {
        setOneSetOfNullableIps(oneSetOfNullableIps);
        this.calculatedOneSetOfNullableIps = calculatedOneSetOfNullableIps;
        this.persistedOneSetOfNullableIps = persistedOneSetOfNullableIps;
    }

    public OneSetOfNullableIps_5() {
        this.oneSetOfNullableIps = new java.util.HashSet<java.net.InetAddress>();
        this.calculatedOneSetOfNullableIps = new java.util.HashSet<java.net.InetAddress>();
        this.persistedOneSetOfNullableIps = new java.util.HashSet<java.net.InetAddress>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1590638612;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableIps_5)) return false;
        final OneSetOfNullableIps_5 other = (OneSetOfNullableIps_5) obj;

        if (!(this.oneSetOfNullableIps.equals(other.oneSetOfNullableIps)))
            return false;
        if (!(this.calculatedOneSetOfNullableIps
                .equals(other.calculatedOneSetOfNullableIps))) return false;
        if (!(this.persistedOneSetOfNullableIps
                .equals(other.persistedOneSetOfNullableIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableIps_5(" + oneSetOfNullableIps + ','
                + calculatedOneSetOfNullableIps + ','
                + persistedOneSetOfNullableIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.InetAddress> oneSetOfNullableIps;

    @JsonProperty("oneSetOfNullableIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.InetAddress> getOneSetOfNullableIps() {
        return oneSetOfNullableIps;
    }

    public OneSetOfNullableIps_5 setOneSetOfNullableIps(
            final java.util.Set<java.net.InetAddress> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableIps\" cannot be null!");
        this.oneSetOfNullableIps = value;

        return this;
    }

    private final java.util.Set<java.net.InetAddress> calculatedOneSetOfNullableIps;

    public java.util.Set<java.net.InetAddress> getCalculatedOneSetOfNullableIps() {
        return this.calculatedOneSetOfNullableIps;
    }

    private final java.util.Set<java.net.InetAddress> persistedOneSetOfNullableIps;

    public java.util.Set<java.net.InetAddress> getPersistedOneSetOfNullableIps() {
        return this.persistedOneSetOfNullableIps;
    }
}
