package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneIps_5 implements java.io.Serializable {
    public OneListOfOneIps_5(
            final java.util.List<java.net.InetAddress> oneListOfOneIps,
            final java.util.List<java.net.InetAddress> calculatedOneListOfOneIps,
            final java.util.List<java.net.InetAddress> persistedOneListOfOneIps) {
        setOneListOfOneIps(oneListOfOneIps);
        this.calculatedOneListOfOneIps = calculatedOneListOfOneIps;
        this.persistedOneListOfOneIps = persistedOneListOfOneIps;
    }

    public OneListOfOneIps_5() {
        this.oneListOfOneIps = new java.util.ArrayList<java.net.InetAddress>();
        this.calculatedOneListOfOneIps = new java.util.ArrayList<java.net.InetAddress>();
        this.persistedOneListOfOneIps = new java.util.ArrayList<java.net.InetAddress>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1502771861;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneIps_5)) return false;
        final OneListOfOneIps_5 other = (OneListOfOneIps_5) obj;

        if (!(this.oneListOfOneIps.equals(other.oneListOfOneIps)))
            return false;
        if (!(this.calculatedOneListOfOneIps
                .equals(other.calculatedOneListOfOneIps))) return false;
        if (!(this.persistedOneListOfOneIps
                .equals(other.persistedOneListOfOneIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneIps_5(" + oneListOfOneIps + ','
                + calculatedOneListOfOneIps + ',' + persistedOneListOfOneIps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.InetAddress> oneListOfOneIps;

    @JsonProperty("oneListOfOneIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.net.InetAddress> getOneListOfOneIps() {
        return oneListOfOneIps;
    }

    public OneListOfOneIps_5 setOneListOfOneIps(
            final java.util.List<java.net.InetAddress> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneIps\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneIps = value;

        return this;
    }

    private final java.util.List<java.net.InetAddress> calculatedOneListOfOneIps;

    public java.util.List<java.net.InetAddress> getCalculatedOneListOfOneIps() {
        return this.calculatedOneListOfOneIps;
    }

    private final java.util.List<java.net.InetAddress> persistedOneListOfOneIps;

    public java.util.List<java.net.InetAddress> getPersistedOneListOfOneIps() {
        return this.persistedOneListOfOneIps;
    }
}
