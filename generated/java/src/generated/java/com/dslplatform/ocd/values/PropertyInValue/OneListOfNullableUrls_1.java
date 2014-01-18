package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableUrls_1 implements java.io.Serializable {
    public OneListOfNullableUrls_1(
            final java.util.List<java.net.URI> oneListOfNullableUrls) {
        setOneListOfNullableUrls(oneListOfNullableUrls);
    }

    public OneListOfNullableUrls_1() {
        this.oneListOfNullableUrls = new java.util.ArrayList<java.net.URI>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1826881108;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableUrls_1)) return false;
        final OneListOfNullableUrls_1 other = (OneListOfNullableUrls_1) obj;

        if (!(this.oneListOfNullableUrls.equals(other.oneListOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableUrls_1(" + oneListOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.URI> oneListOfNullableUrls;

    @JsonProperty("oneListOfNullableUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.net.URI> getOneListOfNullableUrls() {
        return oneListOfNullableUrls;
    }

    public OneListOfNullableUrls_1 setOneListOfNullableUrls(
            final java.util.List<java.net.URI> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableUrls\" cannot be null!");
        this.oneListOfNullableUrls = value;

        return this;
    }
}
