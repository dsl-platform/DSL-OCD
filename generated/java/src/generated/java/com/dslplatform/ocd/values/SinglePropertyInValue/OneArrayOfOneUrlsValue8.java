package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneUrlsValue8 implements java.io.Serializable {
    public OneArrayOfOneUrlsValue8(
            final java.net.URL[] oneArrayOfOneUrls) {
        setOneArrayOfOneUrls(oneArrayOfOneUrls);
    }

    public OneArrayOfOneUrlsValue8() {
        this.oneArrayOfOneUrls = new java.net.URL[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 890062625;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneUrlsValue8)) return false;
        final OneArrayOfOneUrlsValue8 other = (OneArrayOfOneUrlsValue8) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneUrls,
                other.oneArrayOfOneUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneUrlsValue8(" + oneArrayOfOneUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URL[] oneArrayOfOneUrls;

    @JsonProperty("oneArrayOfOneUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.URL[] getOneArrayOfOneUrls() {
        return oneArrayOfOneUrls;
    }

    public OneArrayOfOneUrlsValue8 setOneArrayOfOneUrls(
            final java.net.URL[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneUrls\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneUrls = value;

        return this;
    }
}
