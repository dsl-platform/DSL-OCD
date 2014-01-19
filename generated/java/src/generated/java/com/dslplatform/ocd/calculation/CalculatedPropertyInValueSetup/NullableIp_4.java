package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableIp_4 implements java.io.Serializable {
    public NullableIp_4(
            final java.net.InetAddress nullableIp,
            final java.net.InetAddress calculatedNullableIp,
            final java.net.InetAddress persistedNullableIp) {
        setNullableIp(nullableIp);
        this.calculatedNullableIp = calculatedNullableIp;
        this.persistedNullableIp = persistedNullableIp;
    }

    public NullableIp_4() {
        this.calculatedNullableIp = null;
        this.persistedNullableIp = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 763351721;
        result = prime * result
                + (this.nullableIp != null ? this.nullableIp.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedNullableIp != null
                        ? this.calculatedNullableIp.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableIp != null ? this.persistedNullableIp
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableIp_4)) return false;
        final NullableIp_4 other = (NullableIp_4) obj;

        if (!(this.nullableIp == other.nullableIp || this.nullableIp != null
                && this.nullableIp.equals(other.nullableIp))) return false;
        if (!(this.calculatedNullableIp == other.calculatedNullableIp || this.calculatedNullableIp != null
                && this.calculatedNullableIp.equals(other.calculatedNullableIp)))
            return false;
        if (!(this.persistedNullableIp == other.persistedNullableIp || this.persistedNullableIp != null
                && this.persistedNullableIp.equals(other.persistedNullableIp)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableIp_4(" + nullableIp + ',' + calculatedNullableIp + ','
                + persistedNullableIp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress nullableIp;

    @JsonProperty("nullableIp")
    public java.net.InetAddress getNullableIp() {
        return nullableIp;
    }

    public NullableIp_4 setNullableIp(final java.net.InetAddress value) {
        this.nullableIp = value;

        return this;
    }

    private final java.net.InetAddress calculatedNullableIp;

    public java.net.InetAddress getCalculatedNullableIp() {
        return this.calculatedNullableIp;
    }

    private final java.net.InetAddress persistedNullableIp;

    public java.net.InetAddress getPersistedNullableIp() {
        return this.persistedNullableIp;
    }
}
