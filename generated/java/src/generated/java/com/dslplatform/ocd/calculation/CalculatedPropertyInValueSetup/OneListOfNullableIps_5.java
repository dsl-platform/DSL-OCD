package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableIps_5 implements java.io.Serializable {
    public OneListOfNullableIps_5(
            final java.util.List<java.net.InetAddress> oneListOfNullableIps,
            final java.util.List<java.net.InetAddress> calculatedOneListOfNullableIps,
            final java.util.List<java.net.InetAddress> persistedOneListOfNullableIps) {
        setOneListOfNullableIps(oneListOfNullableIps);
        this.calculatedOneListOfNullableIps = calculatedOneListOfNullableIps;
        this.persistedOneListOfNullableIps = persistedOneListOfNullableIps;
    }

    public OneListOfNullableIps_5() {
        this.oneListOfNullableIps = new java.util.ArrayList<java.net.InetAddress>();
        this.calculatedOneListOfNullableIps = new java.util.ArrayList<java.net.InetAddress>();
        this.persistedOneListOfNullableIps = new java.util.ArrayList<java.net.InetAddress>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1471092052;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableIps_5)) return false;
        final OneListOfNullableIps_5 other = (OneListOfNullableIps_5) obj;

        if (!(this.oneListOfNullableIps.equals(other.oneListOfNullableIps)))
            return false;
        if (!(this.calculatedOneListOfNullableIps
                .equals(other.calculatedOneListOfNullableIps))) return false;
        if (!(this.persistedOneListOfNullableIps
                .equals(other.persistedOneListOfNullableIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableIps_5(" + oneListOfNullableIps + ','
                + calculatedOneListOfNullableIps + ','
                + persistedOneListOfNullableIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.InetAddress> oneListOfNullableIps;

    @JsonProperty("oneListOfNullableIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.net.InetAddress> getOneListOfNullableIps() {
        return oneListOfNullableIps;
    }

    public OneListOfNullableIps_5 setOneListOfNullableIps(
            final java.util.List<java.net.InetAddress> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableIps\" cannot be null!");
        this.oneListOfNullableIps = value;

        return this;
    }

    private final java.util.List<java.net.InetAddress> calculatedOneListOfNullableIps;

    public java.util.List<java.net.InetAddress> getCalculatedOneListOfNullableIps() {
        return this.calculatedOneListOfNullableIps;
    }

    private final java.util.List<java.net.InetAddress> persistedOneListOfNullableIps;

    public java.util.List<java.net.InetAddress> getPersistedOneListOfNullableIps() {
        return this.persistedOneListOfNullableIps;
    }
}
