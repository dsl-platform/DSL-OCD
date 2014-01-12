package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneUrlsValue1 implements java.io.Serializable {
    public NullableSetOfOneUrlsValue1(
            final java.util.Set<java.net.URL> nullableSetOfOneUrls) {
        setNullableSetOfOneUrls(nullableSetOfOneUrls);
    }

    public NullableSetOfOneUrlsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 11203934;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneUrlsValue1)) return false;
        final NullableSetOfOneUrlsValue1 other = (NullableSetOfOneUrlsValue1) obj;

        if (!(this.nullableSetOfOneUrls == other.nullableSetOfOneUrls || this.nullableSetOfOneUrls != null
                && this.nullableSetOfOneUrls.equals(other.nullableSetOfOneUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneUrlsValue1(" + nullableSetOfOneUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.URL> nullableSetOfOneUrls;

    @JsonProperty("nullableSetOfOneUrls")
    public java.util.Set<java.net.URL> getNullableSetOfOneUrls() {
        return nullableSetOfOneUrls;
    }

    public NullableSetOfOneUrlsValue1 setNullableSetOfOneUrls(
            final java.util.Set<java.net.URL> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneUrls = value;

        return this;
    }
}
