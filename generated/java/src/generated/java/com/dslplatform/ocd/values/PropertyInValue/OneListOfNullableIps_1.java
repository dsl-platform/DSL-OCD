package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableIps_1 implements java.io.Serializable {
    public OneListOfNullableIps_1(
            final java.util.List<java.net.InetAddress> oneListOfNullableIps) {
        setOneListOfNullableIps(oneListOfNullableIps);
    }

    public OneListOfNullableIps_1() {
        this.oneListOfNullableIps = new java.util.ArrayList<java.net.InetAddress>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 498276416;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableIps_1)) return false;
        final OneListOfNullableIps_1 other = (OneListOfNullableIps_1) obj;

        if (!(this.oneListOfNullableIps.equals(other.oneListOfNullableIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableIps_1(" + oneListOfNullableIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.InetAddress> oneListOfNullableIps;

    @JsonProperty("oneListOfNullableIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.net.InetAddress> getOneListOfNullableIps() {
        return oneListOfNullableIps;
    }

    public OneListOfNullableIps_1 setOneListOfNullableIps(
            final java.util.List<java.net.InetAddress> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableIps\" cannot be null!");
        this.oneListOfNullableIps = value;

        return this;
    }
}
