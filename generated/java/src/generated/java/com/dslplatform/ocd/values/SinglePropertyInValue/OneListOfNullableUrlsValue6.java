package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableUrlsValue6 implements java.io.Serializable {
    public OneListOfNullableUrlsValue6(
            final java.util.List<java.net.URL> oneListOfNullableUrls) {
        setOneListOfNullableUrls(oneListOfNullableUrls);
    }

    public OneListOfNullableUrlsValue6() {
        this.oneListOfNullableUrls = new java.util.ArrayList<java.net.URL>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 612723933;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableUrlsValue6)) return false;
        final OneListOfNullableUrlsValue6 other = (OneListOfNullableUrlsValue6) obj;

        if (!(this.oneListOfNullableUrls.equals(other.oneListOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableUrlsValue6(" + oneListOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.URL> oneListOfNullableUrls;

    @JsonProperty("oneListOfNullableUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.net.URL> getOneListOfNullableUrls() {
        return oneListOfNullableUrls;
    }

    public OneListOfNullableUrlsValue6 setOneListOfNullableUrls(
            final java.util.List<java.net.URL> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableUrls\" cannot be null!");
        this.oneListOfNullableUrls = value;

        return this;
    }
}
