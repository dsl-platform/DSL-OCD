package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneUrlsValue1 implements java.io.Serializable {
    public NullableListOfOneUrlsValue1(
            final java.util.List<java.net.URL> nullableListOfOneUrls) {
        setNullableListOfOneUrls(nullableListOfOneUrls);
    }

    public NullableListOfOneUrlsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1382417092;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneUrlsValue1)) return false;
        final NullableListOfOneUrlsValue1 other = (NullableListOfOneUrlsValue1) obj;

        if (!(this.nullableListOfOneUrls == other.nullableListOfOneUrls || this.nullableListOfOneUrls != null
                && this.nullableListOfOneUrls
                        .equals(other.nullableListOfOneUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneUrlsValue1(" + nullableListOfOneUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.URL> nullableListOfOneUrls;

    @JsonProperty("nullableListOfOneUrls")
    public java.util.List<java.net.URL> getNullableListOfOneUrls() {
        return nullableListOfOneUrls;
    }

    public NullableListOfOneUrlsValue1 setNullableListOfOneUrls(
            final java.util.List<java.net.URL> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneUrls = value;

        return this;
    }
}
