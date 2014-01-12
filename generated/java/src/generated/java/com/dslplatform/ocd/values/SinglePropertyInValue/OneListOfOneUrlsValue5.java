package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneUrlsValue5 implements java.io.Serializable {
    public OneListOfOneUrlsValue5(
            final java.util.List<java.net.URL> oneListOfOneUrls) {
        setOneListOfOneUrls(oneListOfOneUrls);
    }

    public OneListOfOneUrlsValue5() {
        this.oneListOfOneUrls = new java.util.ArrayList<java.net.URL>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1860191345;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneUrlsValue5)) return false;
        final OneListOfOneUrlsValue5 other = (OneListOfOneUrlsValue5) obj;

        if (!(this.oneListOfOneUrls.equals(other.oneListOfOneUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneUrlsValue5(" + oneListOfOneUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.URL> oneListOfOneUrls;

    @JsonProperty("oneListOfOneUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.net.URL> getOneListOfOneUrls() {
        return oneListOfOneUrls;
    }

    public OneListOfOneUrlsValue5 setOneListOfOneUrls(
            final java.util.List<java.net.URL> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneUrls\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneUrls = value;

        return this;
    }
}
