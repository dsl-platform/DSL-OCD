package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableUrlsValue10 implements
        java.io.Serializable {
    public OneArrayOfNullableUrlsValue10(
            final java.net.URL[] oneArrayOfNullableUrls) {
        setOneArrayOfNullableUrls(oneArrayOfNullableUrls);
    }

    public OneArrayOfNullableUrlsValue10() {
        this.oneArrayOfNullableUrls = new java.net.URL[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 651196667;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableUrlsValue10)) return false;
        final OneArrayOfNullableUrlsValue10 other = (OneArrayOfNullableUrlsValue10) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableUrls,
                other.oneArrayOfNullableUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableUrlsValue10(" + oneArrayOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URL[] oneArrayOfNullableUrls;

    @JsonProperty("oneArrayOfNullableUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.URL[] getOneArrayOfNullableUrls() {
        return oneArrayOfNullableUrls;
    }

    public OneArrayOfNullableUrlsValue10 setOneArrayOfNullableUrls(
            final java.net.URL[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableUrls\" cannot be null!");
        this.oneArrayOfNullableUrls = value;

        return this;
    }
}
