package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneIpValue1 implements java.io.Serializable {
    public OneIpValue1(
            final java.net.InetAddress oneIp) {
        setOneIp(oneIp);
    }

    public OneIpValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1691870283;
        result = prime * result
                + (this.oneIp != null ? this.oneIp.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneIpValue1)) return false;
        final OneIpValue1 other = (OneIpValue1) obj;

        if (!(this.oneIp.equals(other.oneIp))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneIpValue1(" + oneIp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress oneIp;

    @JsonProperty("oneIp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.InetAddress getOneIp() {
        return oneIp;
    }

    public OneIpValue1 setOneIp(final java.net.InetAddress value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneIp\" cannot be null!");
        this.oneIp = value;

        return this;
    }
}
