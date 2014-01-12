package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableUrlValue2 implements java.io.Serializable {
    public NullableUrlValue2(
            final java.net.URL nullableUrl) {
        setNullableUrl(nullableUrl);
    }

    public NullableUrlValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 826120029;
        result = prime * result
                + (this.nullableUrl != null ? this.nullableUrl.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableUrlValue2)) return false;
        final NullableUrlValue2 other = (NullableUrlValue2) obj;

        if (!(this.nullableUrl == other.nullableUrl || this.nullableUrl != null
                && this.nullableUrl.equals(other.nullableUrl))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableUrlValue2(" + nullableUrl + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URL nullableUrl;

    @JsonProperty("nullableUrl")
    public java.net.URL getNullableUrl() {
        return nullableUrl;
    }

    public NullableUrlValue2 setNullableUrl(final java.net.URL value) {
        this.nullableUrl = value;

        return this;
    }
}
