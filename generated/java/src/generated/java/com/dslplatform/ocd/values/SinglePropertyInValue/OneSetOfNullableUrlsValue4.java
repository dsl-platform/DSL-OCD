package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableUrlsValue4 implements java.io.Serializable {
    public OneSetOfNullableUrlsValue4(
            final java.util.Set<java.net.URL> oneSetOfNullableUrls) {
        setOneSetOfNullableUrls(oneSetOfNullableUrls);
    }

    public OneSetOfNullableUrlsValue4() {
        this.oneSetOfNullableUrls = new java.util.HashSet<java.net.URL>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 458949269;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableUrlsValue4)) return false;
        final OneSetOfNullableUrlsValue4 other = (OneSetOfNullableUrlsValue4) obj;

        if (!(this.oneSetOfNullableUrls.equals(other.oneSetOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableUrlsValue4(" + oneSetOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.URL> oneSetOfNullableUrls;

    @JsonProperty("oneSetOfNullableUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.URL> getOneSetOfNullableUrls() {
        return oneSetOfNullableUrls;
    }

    public OneSetOfNullableUrlsValue4 setOneSetOfNullableUrls(
            final java.util.Set<java.net.URL> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableUrls\" cannot be null!");
        this.oneSetOfNullableUrls = value;

        return this;
    }
}
