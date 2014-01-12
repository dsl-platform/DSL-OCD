package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneUrlsValue6 implements java.io.Serializable {
    public OneSetOfOneUrlsValue6(
            final java.util.Set<java.net.URL> oneSetOfOneUrls) {
        setOneSetOfOneUrls(oneSetOfOneUrls);
    }

    public OneSetOfOneUrlsValue6() {
        this.oneSetOfOneUrls = new java.util.HashSet<java.net.URL>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 162404150;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneUrlsValue6)) return false;
        final OneSetOfOneUrlsValue6 other = (OneSetOfOneUrlsValue6) obj;

        if (!(this.oneSetOfOneUrls.equals(other.oneSetOfOneUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneUrlsValue6(" + oneSetOfOneUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.URL> oneSetOfOneUrls;

    @JsonProperty("oneSetOfOneUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.URL> getOneSetOfOneUrls() {
        return oneSetOfOneUrls;
    }

    public OneSetOfOneUrlsValue6 setOneSetOfOneUrls(
            final java.util.Set<java.net.URL> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneUrls\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneUrls = value;

        return this;
    }
}
