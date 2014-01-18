package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableUrls_1 implements java.io.Serializable {
    public NullableSetOfNullableUrls_1(
            final java.util.Set<java.net.URI> nullableSetOfNullableUrls) {
        setNullableSetOfNullableUrls(nullableSetOfNullableUrls);
    }

    public NullableSetOfNullableUrls_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1374391357;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableUrls_1)) return false;
        final NullableSetOfNullableUrls_1 other = (NullableSetOfNullableUrls_1) obj;

        if (!(this.nullableSetOfNullableUrls == other.nullableSetOfNullableUrls || this.nullableSetOfNullableUrls != null
                && this.nullableSetOfNullableUrls
                        .equals(other.nullableSetOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableUrls_1(" + nullableSetOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.URI> nullableSetOfNullableUrls;

    @JsonProperty("nullableSetOfNullableUrls")
    public java.util.Set<java.net.URI> getNullableSetOfNullableUrls() {
        return nullableSetOfNullableUrls;
    }

    public NullableSetOfNullableUrls_1 setNullableSetOfNullableUrls(
            final java.util.Set<java.net.URI> value) {
        this.nullableSetOfNullableUrls = value;

        return this;
    }
}
