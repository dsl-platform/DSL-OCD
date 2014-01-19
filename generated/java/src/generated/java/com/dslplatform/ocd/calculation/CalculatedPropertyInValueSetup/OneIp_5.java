package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneIp_5 implements java.io.Serializable {
    public OneIp_5(
            final java.net.InetAddress oneIp,
            final java.net.InetAddress calculatedOneIp,
            final java.net.InetAddress persistedOneIp) {
        setOneIp(oneIp);
        this.calculatedOneIp = calculatedOneIp;
        this.persistedOneIp = persistedOneIp;
    }

    public OneIp_5() {
        this.calculatedOneIp = null;
        this.persistedOneIp = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 265630427;
        result = prime * result
                + (this.oneIp != null ? this.oneIp.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedOneIp != null ? this.calculatedOneIp
                        .hashCode() : 0);
        result = prime
                * result
                + (this.persistedOneIp != null
                        ? this.persistedOneIp.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneIp_5)) return false;
        final OneIp_5 other = (OneIp_5) obj;

        if (!(this.oneIp.equals(other.oneIp))) return false;
        if (!(this.calculatedOneIp.equals(other.calculatedOneIp)))
            return false;
        if (!(this.persistedOneIp.equals(other.persistedOneIp))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneIp_5(" + oneIp + ',' + calculatedOneIp + ','
                + persistedOneIp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress oneIp;

    @JsonProperty("oneIp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.InetAddress getOneIp() {
        return oneIp;
    }

    public OneIp_5 setOneIp(final java.net.InetAddress value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneIp\" cannot be null!");
        this.oneIp = value;

        return this;
    }

    private final java.net.InetAddress calculatedOneIp;

    public java.net.InetAddress getCalculatedOneIp() {
        return this.calculatedOneIp;
    }

    private final java.net.InetAddress persistedOneIp;

    public java.net.InetAddress getPersistedOneIp() {
        return this.persistedOneIp;
    }
}
