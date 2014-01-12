package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableUrlsValue5 implements java.io.Serializable {
    public OneSetOfNullableUrlsValue5(
            final java.util.Set<java.net.URL> oneSetOfNullableUrls) {
        setOneSetOfNullableUrls(oneSetOfNullableUrls);
    }

    public OneSetOfNullableUrlsValue5() {
        this.oneSetOfNullableUrls = new java.util.HashSet<java.net.URL>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1107134672;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableUrlsValue5)) return false;
        final OneSetOfNullableUrlsValue5 other = (OneSetOfNullableUrlsValue5) obj;

        if (!(this.oneSetOfNullableUrls.equals(other.oneSetOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableUrlsValue5(" + oneSetOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.URL> oneSetOfNullableUrls;

    @JsonProperty("oneSetOfNullableUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.URL> getOneSetOfNullableUrls() {
        return oneSetOfNullableUrls;
    }

    public OneSetOfNullableUrlsValue5 setOneSetOfNullableUrls(
            final java.util.Set<java.net.URL> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableUrls\" cannot be null!");
        this.oneSetOfNullableUrls = value;

        return this;
    }
}
