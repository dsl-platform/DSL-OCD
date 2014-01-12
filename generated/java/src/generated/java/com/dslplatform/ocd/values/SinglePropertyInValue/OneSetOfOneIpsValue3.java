package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneIpsValue3 implements java.io.Serializable {
    public OneSetOfOneIpsValue3(
            final java.util.Set<java.net.InetAddress> oneSetOfOneIps) {
        setOneSetOfOneIps(oneSetOfOneIps);
    }

    public OneSetOfOneIpsValue3() {
        this.oneSetOfOneIps = new java.util.HashSet<java.net.InetAddress>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1076367171;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneIpsValue3)) return false;
        final OneSetOfOneIpsValue3 other = (OneSetOfOneIpsValue3) obj;

        if (!(this.oneSetOfOneIps.equals(other.oneSetOfOneIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneIpsValue3(" + oneSetOfOneIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.InetAddress> oneSetOfOneIps;

    @JsonProperty("oneSetOfOneIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.InetAddress> getOneSetOfOneIps() {
        return oneSetOfOneIps;
    }

    public OneSetOfOneIpsValue3 setOneSetOfOneIps(
            final java.util.Set<java.net.InetAddress> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneIps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneIps = value;

        return this;
    }
}
