package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneUrls_1 implements java.io.Serializable {
    public OneSetOfOneUrls_1(
            final java.util.Set<java.net.URI> oneSetOfOneUrls) {
        setOneSetOfOneUrls(oneSetOfOneUrls);
    }

    public OneSetOfOneUrls_1() {
        this.oneSetOfOneUrls = new java.util.HashSet<java.net.URI>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1903920553;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneUrls_1)) return false;
        final OneSetOfOneUrls_1 other = (OneSetOfOneUrls_1) obj;

        if (!(this.oneSetOfOneUrls.equals(other.oneSetOfOneUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneUrls_1(" + oneSetOfOneUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.URI> oneSetOfOneUrls;

    @JsonProperty("oneSetOfOneUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.URI> getOneSetOfOneUrls() {
        return oneSetOfOneUrls;
    }

    public OneSetOfOneUrls_1 setOneSetOfOneUrls(
            final java.util.Set<java.net.URI> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneUrls\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneUrls = value;

        return this;
    }
}
