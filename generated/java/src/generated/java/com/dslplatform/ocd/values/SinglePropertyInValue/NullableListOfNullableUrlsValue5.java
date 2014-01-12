package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableUrlsValue5 implements
        java.io.Serializable {
    public NullableListOfNullableUrlsValue5(
            final java.util.List<java.net.URL> nullableListOfNullableUrls) {
        setNullableListOfNullableUrls(nullableListOfNullableUrls);
    }

    public NullableListOfNullableUrlsValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1128818633;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableUrlsValue5)) return false;
        final NullableListOfNullableUrlsValue5 other = (NullableListOfNullableUrlsValue5) obj;

        if (!(this.nullableListOfNullableUrls == other.nullableListOfNullableUrls || this.nullableListOfNullableUrls != null
                && this.nullableListOfNullableUrls
                        .equals(other.nullableListOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableUrlsValue5(" + nullableListOfNullableUrls
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.URL> nullableListOfNullableUrls;

    @JsonProperty("nullableListOfNullableUrls")
    public java.util.List<java.net.URL> getNullableListOfNullableUrls() {
        return nullableListOfNullableUrls;
    }

    public NullableListOfNullableUrlsValue5 setNullableListOfNullableUrls(
            final java.util.List<java.net.URL> value) {
        this.nullableListOfNullableUrls = value;

        return this;
    }
}
