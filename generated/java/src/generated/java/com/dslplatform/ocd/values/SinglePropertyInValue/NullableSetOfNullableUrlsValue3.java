package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableUrlsValue3 implements
        java.io.Serializable {
    public NullableSetOfNullableUrlsValue3(
            final java.util.Set<java.net.URL> nullableSetOfNullableUrls) {
        setNullableSetOfNullableUrls(nullableSetOfNullableUrls);
    }

    public NullableSetOfNullableUrlsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2119722389;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableUrlsValue3)) return false;
        final NullableSetOfNullableUrlsValue3 other = (NullableSetOfNullableUrlsValue3) obj;

        if (!(this.nullableSetOfNullableUrls == other.nullableSetOfNullableUrls || this.nullableSetOfNullableUrls != null
                && this.nullableSetOfNullableUrls
                        .equals(other.nullableSetOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableUrlsValue3(" + nullableSetOfNullableUrls
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.URL> nullableSetOfNullableUrls;

    @JsonProperty("nullableSetOfNullableUrls")
    public java.util.Set<java.net.URL> getNullableSetOfNullableUrls() {
        return nullableSetOfNullableUrls;
    }

    public NullableSetOfNullableUrlsValue3 setNullableSetOfNullableUrls(
            final java.util.Set<java.net.URL> value) {
        this.nullableSetOfNullableUrls = value;

        return this;
    }
}
