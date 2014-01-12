package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableIpsValue1 implements java.io.Serializable {
    public OneSetOfNullableIpsValue1(
            final java.util.Set<java.net.InetAddress> oneSetOfNullableIps) {
        setOneSetOfNullableIps(oneSetOfNullableIps);
    }

    public OneSetOfNullableIpsValue1() {
        this.oneSetOfNullableIps = new java.util.HashSet<java.net.InetAddress>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1739756188;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableIpsValue1)) return false;
        final OneSetOfNullableIpsValue1 other = (OneSetOfNullableIpsValue1) obj;

        if (!(this.oneSetOfNullableIps.equals(other.oneSetOfNullableIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableIpsValue1(" + oneSetOfNullableIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.InetAddress> oneSetOfNullableIps;

    @JsonProperty("oneSetOfNullableIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.InetAddress> getOneSetOfNullableIps() {
        return oneSetOfNullableIps;
    }

    public OneSetOfNullableIpsValue1 setOneSetOfNullableIps(
            final java.util.Set<java.net.InetAddress> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableIps\" cannot be null!");
        this.oneSetOfNullableIps = value;

        return this;
    }
}
