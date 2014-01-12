package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableIpsValue3 implements java.io.Serializable {
    public OneSetOfNullableIpsValue3(
            final java.util.Set<java.net.InetAddress> oneSetOfNullableIps) {
        setOneSetOfNullableIps(oneSetOfNullableIps);
    }

    public OneSetOfNullableIpsValue3() {
        this.oneSetOfNullableIps = new java.util.HashSet<java.net.InetAddress>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1739756190;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableIpsValue3)) return false;
        final OneSetOfNullableIpsValue3 other = (OneSetOfNullableIpsValue3) obj;

        if (!(this.oneSetOfNullableIps.equals(other.oneSetOfNullableIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableIpsValue3(" + oneSetOfNullableIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.InetAddress> oneSetOfNullableIps;

    @JsonProperty("oneSetOfNullableIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.InetAddress> getOneSetOfNullableIps() {
        return oneSetOfNullableIps;
    }

    public OneSetOfNullableIpsValue3 setOneSetOfNullableIps(
            final java.util.Set<java.net.InetAddress> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableIps\" cannot be null!");
        this.oneSetOfNullableIps = value;

        return this;
    }
}
