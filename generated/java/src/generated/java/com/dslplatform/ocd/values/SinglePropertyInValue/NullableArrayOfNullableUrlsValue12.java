package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableUrlsValue12 implements
        java.io.Serializable {
    public NullableArrayOfNullableUrlsValue12(
            final java.net.URL[] nullableArrayOfNullableUrls) {
        setNullableArrayOfNullableUrls(nullableArrayOfNullableUrls);
    }

    public NullableArrayOfNullableUrlsValue12() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1310062760;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableUrlsValue12)) return false;
        final NullableArrayOfNullableUrlsValue12 other = (NullableArrayOfNullableUrlsValue12) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableUrls,
                other.nullableArrayOfNullableUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableUrlsValue12("
                + nullableArrayOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URL[] nullableArrayOfNullableUrls;

    @JsonProperty("nullableArrayOfNullableUrls")
    public java.net.URL[] getNullableArrayOfNullableUrls() {
        return nullableArrayOfNullableUrls;
    }

    public NullableArrayOfNullableUrlsValue12 setNullableArrayOfNullableUrls(
            final java.net.URL[] value) {
        this.nullableArrayOfNullableUrls = value;

        return this;
    }
}
