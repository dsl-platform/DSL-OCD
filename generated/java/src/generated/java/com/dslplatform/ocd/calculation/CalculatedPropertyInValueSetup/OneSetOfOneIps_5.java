package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneIps_5 implements java.io.Serializable {
    public OneSetOfOneIps_5(
            final java.util.Set<java.net.InetAddress> oneSetOfOneIps,
            final java.util.Set<java.net.InetAddress> calculatedOneSetOfOneIps,
            final java.util.Set<java.net.InetAddress> persistedOneSetOfOneIps) {
        setOneSetOfOneIps(oneSetOfOneIps);
        this.calculatedOneSetOfOneIps = calculatedOneSetOfOneIps;
        this.persistedOneSetOfOneIps = persistedOneSetOfOneIps;
    }

    public OneSetOfOneIps_5() {
        this.oneSetOfOneIps = new java.util.HashSet<java.net.InetAddress>();
        this.calculatedOneSetOfOneIps = new java.util.HashSet<java.net.InetAddress>();
        this.persistedOneSetOfOneIps = new java.util.HashSet<java.net.InetAddress>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1665994217;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneIps_5)) return false;
        final OneSetOfOneIps_5 other = (OneSetOfOneIps_5) obj;

        if (!(this.oneSetOfOneIps.equals(other.oneSetOfOneIps))) return false;
        if (!(this.calculatedOneSetOfOneIps
                .equals(other.calculatedOneSetOfOneIps))) return false;
        if (!(this.persistedOneSetOfOneIps
                .equals(other.persistedOneSetOfOneIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneIps_5(" + oneSetOfOneIps + ','
                + calculatedOneSetOfOneIps + ',' + persistedOneSetOfOneIps
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.InetAddress> oneSetOfOneIps;

    @JsonProperty("oneSetOfOneIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.InetAddress> getOneSetOfOneIps() {
        return oneSetOfOneIps;
    }

    public OneSetOfOneIps_5 setOneSetOfOneIps(
            final java.util.Set<java.net.InetAddress> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneIps\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneIps = value;

        return this;
    }

    private final java.util.Set<java.net.InetAddress> calculatedOneSetOfOneIps;

    public java.util.Set<java.net.InetAddress> getCalculatedOneSetOfOneIps() {
        return this.calculatedOneSetOfOneIps;
    }

    private final java.util.Set<java.net.InetAddress> persistedOneSetOfOneIps;

    public java.util.Set<java.net.InetAddress> getPersistedOneSetOfOneIps() {
        return this.persistedOneSetOfOneIps;
    }
}
