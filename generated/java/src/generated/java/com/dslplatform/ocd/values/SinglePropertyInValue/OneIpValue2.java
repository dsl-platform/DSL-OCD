package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneIpValue2 implements java.io.Serializable {
    public OneIpValue2(
            final java.net.InetAddress oneIp) {
        setOneIp(oneIp);
    }

    public OneIpValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1691870282;
        result = prime * result
                + (this.oneIp != null ? this.oneIp.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneIpValue2)) return false;
        final OneIpValue2 other = (OneIpValue2) obj;

        if (!(this.oneIp.equals(other.oneIp))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneIpValue2(" + oneIp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress oneIp;

    @JsonProperty("oneIp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.InetAddress getOneIp() {
        return oneIp;
    }

    public OneIpValue2 setOneIp(final java.net.InetAddress value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneIp\" cannot be null!");
        this.oneIp = value;

        return this;
    }
}
