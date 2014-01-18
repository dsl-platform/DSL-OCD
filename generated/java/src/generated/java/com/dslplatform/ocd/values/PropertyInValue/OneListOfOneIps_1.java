package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneIps_1 implements java.io.Serializable {
    public OneListOfOneIps_1(
            final java.util.List<java.net.InetAddress> oneListOfOneIps) {
        setOneListOfOneIps(oneListOfOneIps);
    }

    public OneListOfOneIps_1() {
        this.oneListOfOneIps = new java.util.ArrayList<java.net.InetAddress>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1502771865;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneIps_1)) return false;
        final OneListOfOneIps_1 other = (OneListOfOneIps_1) obj;

        if (!(this.oneListOfOneIps.equals(other.oneListOfOneIps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneIps_1(" + oneListOfOneIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.InetAddress> oneListOfOneIps;

    @JsonProperty("oneListOfOneIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.net.InetAddress> getOneListOfOneIps() {
        return oneListOfOneIps;
    }

    public OneListOfOneIps_1 setOneListOfOneIps(
            final java.util.List<java.net.InetAddress> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneIps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneIps = value;

        return this;
    }
}
