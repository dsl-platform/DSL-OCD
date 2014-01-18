package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableUrls_1 implements java.io.Serializable {
    public NullableListOfNullableUrls_1(
            final java.util.List<java.net.URI> nullableListOfNullableUrls) {
        setNullableListOfNullableUrls(nullableListOfNullableUrls);
    }

    public NullableListOfNullableUrls_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1682475367;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableUrls_1)) return false;
        final NullableListOfNullableUrls_1 other = (NullableListOfNullableUrls_1) obj;

        if (!(this.nullableListOfNullableUrls == other.nullableListOfNullableUrls || this.nullableListOfNullableUrls != null
                && this.nullableListOfNullableUrls
                        .equals(other.nullableListOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableUrls_1(" + nullableListOfNullableUrls
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.URI> nullableListOfNullableUrls;

    @JsonProperty("nullableListOfNullableUrls")
    public java.util.List<java.net.URI> getNullableListOfNullableUrls() {
        return nullableListOfNullableUrls;
    }

    public NullableListOfNullableUrls_1 setNullableListOfNullableUrls(
            final java.util.List<java.net.URI> value) {
        this.nullableListOfNullableUrls = value;

        return this;
    }
}
