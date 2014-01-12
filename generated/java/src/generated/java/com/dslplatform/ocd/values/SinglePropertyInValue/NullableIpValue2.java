package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableIpValue2 implements java.io.Serializable {
    public NullableIpValue2(
            final java.net.InetAddress nullableIp) {
        setNullableIp(nullableIp);
    }

    public NullableIpValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1723354723;
        result = prime * result
                + (this.nullableIp != null ? this.nullableIp.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableIpValue2)) return false;
        final NullableIpValue2 other = (NullableIpValue2) obj;

        if (!(this.nullableIp == other.nullableIp || this.nullableIp != null
                && this.nullableIp.equals(other.nullableIp))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableIpValue2(" + nullableIp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress nullableIp;

    @JsonProperty("nullableIp")
    public java.net.InetAddress getNullableIp() {
        return nullableIp;
    }

    public NullableIpValue2 setNullableIp(final java.net.InetAddress value) {
        this.nullableIp = value;

        return this;
    }
}
