package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableIpsValue3 implements java.io.Serializable {
    public OneListOfNullableIpsValue3(
            final java.util.List<java.net.InetAddress> oneListOfNullableIps) {
        setOneListOfNullableIps(oneListOfNullableIps);
    }

    public OneListOfNullableIpsValue3() {
        this.oneListOfNullableIps = new java.util.ArrayList<java.net.InetAddress>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1057840690;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableIpsValue3)) return false;
        final OneListOfNullableIpsValue3 other = (OneListOfNullableIpsValue3) obj;

        if (!(this.oneListOfNullableIps.equals(other.oneListOfNullableIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableIpsValue3(" + oneListOfNullableIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.InetAddress> oneListOfNullableIps;

    @JsonProperty("oneListOfNullableIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.net.InetAddress> getOneListOfNullableIps() {
        return oneListOfNullableIps;
    }

    public OneListOfNullableIpsValue3 setOneListOfNullableIps(
            final java.util.List<java.net.InetAddress> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableIps\" cannot be null!");
        this.oneListOfNullableIps = value;

        return this;
    }
}
