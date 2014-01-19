package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneUrl_5 implements java.io.Serializable {
    public OneUrl_5(
            final java.net.URI oneUrl,
            final java.net.URI calculatedOneUrl,
            final java.net.URI persistedOneUrl) {
        setOneUrl(oneUrl);
        this.calculatedOneUrl = calculatedOneUrl;
        this.persistedOneUrl = persistedOneUrl;
    }

    public OneUrl_5() {
        this.calculatedOneUrl = null;
        this.persistedOneUrl = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 728056965;
        result = prime * result
                + (this.oneUrl != null ? this.oneUrl.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedOneUrl != null ? this.calculatedOneUrl
                        .hashCode() : 0);
        result = prime
                * result
                + (this.persistedOneUrl != null ? this.persistedOneUrl
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneUrl_5)) return false;
        final OneUrl_5 other = (OneUrl_5) obj;

        if (!(this.oneUrl.equals(other.oneUrl))) return false;
        if (!(this.calculatedOneUrl.equals(other.calculatedOneUrl)))
            return false;
        if (!(this.persistedOneUrl.equals(other.persistedOneUrl)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneUrl_5(" + oneUrl + ',' + calculatedOneUrl + ','
                + persistedOneUrl + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URI oneUrl;

    @JsonProperty("oneUrl")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.URI getOneUrl() {
        return oneUrl;
    }

    public OneUrl_5 setOneUrl(final java.net.URI value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneUrl\" cannot be null!");
        this.oneUrl = value;

        return this;
    }

    private final java.net.URI calculatedOneUrl;

    public java.net.URI getCalculatedOneUrl() {
        return this.calculatedOneUrl;
    }

    private final java.net.URI persistedOneUrl;

    public java.net.URI getPersistedOneUrl() {
        return this.persistedOneUrl;
    }
}
