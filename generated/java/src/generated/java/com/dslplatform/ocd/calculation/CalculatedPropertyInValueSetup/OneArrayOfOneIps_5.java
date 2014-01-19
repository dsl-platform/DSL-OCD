package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneIps_5 implements java.io.Serializable {
    public OneArrayOfOneIps_5(
            final java.net.InetAddress[] oneArrayOfOneIps,
            final java.net.InetAddress[] calculatedOneArrayOfOneIps,
            final java.net.InetAddress[] persistedOneArrayOfOneIps) {
        setOneArrayOfOneIps(oneArrayOfOneIps);
        this.calculatedOneArrayOfOneIps = calculatedOneArrayOfOneIps;
        this.persistedOneArrayOfOneIps = persistedOneArrayOfOneIps;
    }

    public OneArrayOfOneIps_5() {
        this.oneArrayOfOneIps = new java.net.InetAddress[] {};
        this.calculatedOneArrayOfOneIps = new java.net.InetAddress[] {};
        this.persistedOneArrayOfOneIps = new java.net.InetAddress[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 813568436;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneIps_5)) return false;
        final OneArrayOfOneIps_5 other = (OneArrayOfOneIps_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneIps,
                other.oneArrayOfOneIps))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneIps,
                other.calculatedOneArrayOfOneIps))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneIps,
                other.persistedOneArrayOfOneIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneIps_5(" + oneArrayOfOneIps + ','
                + calculatedOneArrayOfOneIps + ',' + persistedOneArrayOfOneIps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress[] oneArrayOfOneIps;

    @JsonProperty("oneArrayOfOneIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.InetAddress[] getOneArrayOfOneIps() {
        return oneArrayOfOneIps;
    }

    public OneArrayOfOneIps_5 setOneArrayOfOneIps(
            final java.net.InetAddress[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneIps\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneIps = value;

        return this;
    }

    private final java.net.InetAddress[] calculatedOneArrayOfOneIps;

    public java.net.InetAddress[] getCalculatedOneArrayOfOneIps() {
        return this.calculatedOneArrayOfOneIps;
    }

    private final java.net.InetAddress[] persistedOneArrayOfOneIps;

    public java.net.InetAddress[] getPersistedOneArrayOfOneIps() {
        return this.persistedOneArrayOfOneIps;
    }
}
