package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableUrl_1 implements java.io.Serializable {
    public NullableUrl_1(
            final java.net.URI nullableUrl) {
        setNullableUrl(nullableUrl);
    }

    public NullableUrl_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1295615280;
        result = prime * result
                + (this.nullableUrl != null ? this.nullableUrl.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableUrl_1)) return false;
        final NullableUrl_1 other = (NullableUrl_1) obj;

        if (!(this.nullableUrl == other.nullableUrl || this.nullableUrl != null
                && this.nullableUrl.equals(other.nullableUrl))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableUrl_1(" + nullableUrl + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URI nullableUrl;

    @JsonProperty("nullableUrl")
    public java.net.URI getNullableUrl() {
        return nullableUrl;
    }

    public NullableUrl_1 setNullableUrl(final java.net.URI value) {
        this.nullableUrl = value;

        return this;
    }
}
