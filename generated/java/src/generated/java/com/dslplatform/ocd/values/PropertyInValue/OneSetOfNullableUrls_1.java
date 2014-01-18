package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableUrls_1 implements java.io.Serializable {
    public OneSetOfNullableUrls_1(
            final java.util.Set<java.net.URI> oneSetOfNullableUrls) {
        setOneSetOfNullableUrls(oneSetOfNullableUrls);
    }

    public OneSetOfNullableUrls_1() {
        this.oneSetOfNullableUrls = new java.util.HashSet<java.net.URI>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1511810816;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableUrls_1)) return false;
        final OneSetOfNullableUrls_1 other = (OneSetOfNullableUrls_1) obj;

        if (!(this.oneSetOfNullableUrls.equals(other.oneSetOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableUrls_1(" + oneSetOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.URI> oneSetOfNullableUrls;

    @JsonProperty("oneSetOfNullableUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.URI> getOneSetOfNullableUrls() {
        return oneSetOfNullableUrls;
    }

    public OneSetOfNullableUrls_1 setOneSetOfNullableUrls(
            final java.util.Set<java.net.URI> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableUrls\" cannot be null!");
        this.oneSetOfNullableUrls = value;

        return this;
    }
}
