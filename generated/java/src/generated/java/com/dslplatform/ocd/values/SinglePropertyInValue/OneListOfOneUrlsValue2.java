package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneUrlsValue2 implements java.io.Serializable {
    public OneListOfOneUrlsValue2(
            final java.util.List<java.net.URL> oneListOfOneUrls) {
        setOneListOfOneUrls(oneListOfOneUrls);
    }

    public OneListOfOneUrlsValue2() {
        this.oneListOfOneUrls = new java.util.ArrayList<java.net.URL>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1100676458;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneUrlsValue2)) return false;
        final OneListOfOneUrlsValue2 other = (OneListOfOneUrlsValue2) obj;

        if (!(this.oneListOfOneUrls.equals(other.oneListOfOneUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneUrlsValue2(" + oneListOfOneUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.URL> oneListOfOneUrls;

    @JsonProperty("oneListOfOneUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.net.URL> getOneListOfOneUrls() {
        return oneListOfOneUrls;
    }

    public OneListOfOneUrlsValue2 setOneListOfOneUrls(
            final java.util.List<java.net.URL> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneUrls\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneUrls = value;

        return this;
    }
}
