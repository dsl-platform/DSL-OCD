package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableUrls_1 implements
        java.io.Serializable {
    public NullableArrayOfNullableUrls_1(
            final java.net.URI[] nullableArrayOfNullableUrls) {
        setNullableArrayOfNullableUrls(nullableArrayOfNullableUrls);
    }

    public NullableArrayOfNullableUrls_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 695954610;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableUrls_1)) return false;
        final NullableArrayOfNullableUrls_1 other = (NullableArrayOfNullableUrls_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableUrls,
                other.nullableArrayOfNullableUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableUrls_1(" + nullableArrayOfNullableUrls
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URI[] nullableArrayOfNullableUrls;

    @JsonProperty("nullableArrayOfNullableUrls")
    public java.net.URI[] getNullableArrayOfNullableUrls() {
        return nullableArrayOfNullableUrls;
    }

    public NullableArrayOfNullableUrls_1 setNullableArrayOfNullableUrls(
            final java.net.URI[] value) {
        this.nullableArrayOfNullableUrls = value;

        return this;
    }
}
