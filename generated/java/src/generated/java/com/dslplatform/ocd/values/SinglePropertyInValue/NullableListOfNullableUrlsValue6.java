package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableUrlsValue6 implements
        java.io.Serializable {
    public NullableListOfNullableUrlsValue6(
            final java.util.List<java.net.URL> nullableListOfNullableUrls) {
        setNullableListOfNullableUrls(nullableListOfNullableUrls);
    }

    public NullableListOfNullableUrlsValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 437265308;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableUrlsValue6)) return false;
        final NullableListOfNullableUrlsValue6 other = (NullableListOfNullableUrlsValue6) obj;

        if (!(this.nullableListOfNullableUrls == other.nullableListOfNullableUrls || this.nullableListOfNullableUrls != null
                && this.nullableListOfNullableUrls
                        .equals(other.nullableListOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableUrlsValue6(" + nullableListOfNullableUrls
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.URL> nullableListOfNullableUrls;

    @JsonProperty("nullableListOfNullableUrls")
    public java.util.List<java.net.URL> getNullableListOfNullableUrls() {
        return nullableListOfNullableUrls;
    }

    public NullableListOfNullableUrlsValue6 setNullableListOfNullableUrls(
            final java.util.List<java.net.URL> value) {
        this.nullableListOfNullableUrls = value;

        return this;
    }
}
