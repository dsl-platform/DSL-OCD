package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneUrlValue5 implements java.io.Serializable {
    public OneUrlValue5(
            final java.net.URL oneUrl) {
        setOneUrl(oneUrl);
    }

    public OneUrlValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1614836895;
        result = prime * result
                + (this.oneUrl != null ? this.oneUrl.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneUrlValue5)) return false;
        final OneUrlValue5 other = (OneUrlValue5) obj;

        if (!(this.oneUrl.equals(other.oneUrl))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneUrlValue5(" + oneUrl + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URL oneUrl;

    @JsonProperty("oneUrl")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.URL getOneUrl() {
        return oneUrl;
    }

    public OneUrlValue5 setOneUrl(final java.net.URL value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneUrl\" cannot be null!");
        this.oneUrl = value;

        return this;
    }
}
