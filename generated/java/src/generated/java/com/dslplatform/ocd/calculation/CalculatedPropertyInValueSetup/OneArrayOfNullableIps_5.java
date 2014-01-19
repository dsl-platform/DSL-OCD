package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableIps_5 implements java.io.Serializable {
    public OneArrayOfNullableIps_5(
            final java.net.InetAddress[] oneArrayOfNullableIps,
            final java.net.InetAddress[] calculatedOneArrayOfNullableIps,
            final java.net.InetAddress[] persistedOneArrayOfNullableIps) {
        setOneArrayOfNullableIps(oneArrayOfNullableIps);
        this.calculatedOneArrayOfNullableIps = calculatedOneArrayOfNullableIps;
        this.persistedOneArrayOfNullableIps = persistedOneArrayOfNullableIps;
    }

    public OneArrayOfNullableIps_5() {
        this.oneArrayOfNullableIps = new java.net.InetAddress[] {};
        this.calculatedOneArrayOfNullableIps = new java.net.InetAddress[] {};
        this.persistedOneArrayOfNullableIps = new java.net.InetAddress[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 574802369;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableIps_5)) return false;
        final OneArrayOfNullableIps_5 other = (OneArrayOfNullableIps_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableIps,
                other.oneArrayOfNullableIps))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfNullableIps,
                other.calculatedOneArrayOfNullableIps))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableIps,
                other.persistedOneArrayOfNullableIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableIps_5(" + oneArrayOfNullableIps + ','
                + calculatedOneArrayOfNullableIps + ','
                + persistedOneArrayOfNullableIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress[] oneArrayOfNullableIps;

    @JsonProperty("oneArrayOfNullableIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.InetAddress[] getOneArrayOfNullableIps() {
        return oneArrayOfNullableIps;
    }

    public OneArrayOfNullableIps_5 setOneArrayOfNullableIps(
            final java.net.InetAddress[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableIps\" cannot be null!");
        this.oneArrayOfNullableIps = value;

        return this;
    }

    private final java.net.InetAddress[] calculatedOneArrayOfNullableIps;

    public java.net.InetAddress[] getCalculatedOneArrayOfNullableIps() {
        return this.calculatedOneArrayOfNullableIps;
    }

    private final java.net.InetAddress[] persistedOneArrayOfNullableIps;

    public java.net.InetAddress[] getPersistedOneArrayOfNullableIps() {
        return this.persistedOneArrayOfNullableIps;
    }
}
