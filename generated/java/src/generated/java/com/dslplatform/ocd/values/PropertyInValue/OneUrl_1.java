package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneUrl_1 implements java.io.Serializable {
    public OneUrl_1(
            final java.net.URI oneUrl) {
        setOneUrl(oneUrl);
    }

    public OneUrl_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1241311503;
        result = prime * result
                + (this.oneUrl != null ? this.oneUrl.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneUrl_1)) return false;
        final OneUrl_1 other = (OneUrl_1) obj;

        if (!(this.oneUrl.equals(other.oneUrl))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneUrl_1(" + oneUrl + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URI oneUrl;

    @JsonProperty("oneUrl")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.URI getOneUrl() {
        return oneUrl;
    }

    public OneUrl_1 setOneUrl(final java.net.URI value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneUrl\" cannot be null!");
        this.oneUrl = value;

        return this;
    }
}
