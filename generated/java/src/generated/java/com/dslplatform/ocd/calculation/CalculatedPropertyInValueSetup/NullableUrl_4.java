package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableUrl_4 implements java.io.Serializable {
    public NullableUrl_4(
            final java.net.URI nullableUrl,
            final java.net.URI calculatedNullableUrl,
            final java.net.URI persistedNullableUrl) {
        setNullableUrl(nullableUrl);
        this.calculatedNullableUrl = calculatedNullableUrl;
        this.persistedNullableUrl = persistedNullableUrl;
    }

    public NullableUrl_4() {
        this.calculatedNullableUrl = null;
        this.persistedNullableUrl = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1295615285;
        result = prime * result
                + (this.nullableUrl != null ? this.nullableUrl.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedNullableUrl != null
                        ? this.calculatedNullableUrl.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableUrl != null
                        ? this.persistedNullableUrl.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableUrl_4)) return false;
        final NullableUrl_4 other = (NullableUrl_4) obj;

        if (!(this.nullableUrl == other.nullableUrl || this.nullableUrl != null
                && this.nullableUrl.equals(other.nullableUrl))) return false;
        if (!(this.calculatedNullableUrl == other.calculatedNullableUrl || this.calculatedNullableUrl != null
                && this.calculatedNullableUrl
                        .equals(other.calculatedNullableUrl))) return false;
        if (!(this.persistedNullableUrl == other.persistedNullableUrl || this.persistedNullableUrl != null
                && this.persistedNullableUrl.equals(other.persistedNullableUrl)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableUrl_4(" + nullableUrl + ',' + calculatedNullableUrl
                + ',' + persistedNullableUrl + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URI nullableUrl;

    @JsonProperty("nullableUrl")
    public java.net.URI getNullableUrl() {
        return nullableUrl;
    }

    public NullableUrl_4 setNullableUrl(final java.net.URI value) {
        this.nullableUrl = value;

        return this;
    }

    private final java.net.URI calculatedNullableUrl;

    public java.net.URI getCalculatedNullableUrl() {
        return this.calculatedNullableUrl;
    }

    private final java.net.URI persistedNullableUrl;

    public java.net.URI getPersistedNullableUrl() {
        return this.persistedNullableUrl;
    }
}
