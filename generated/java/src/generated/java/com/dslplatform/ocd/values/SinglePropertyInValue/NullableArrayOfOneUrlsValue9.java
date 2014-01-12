package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneUrlsValue9 implements java.io.Serializable {
    public NullableArrayOfOneUrlsValue9(
            final java.net.URL[] nullableArrayOfOneUrls) {
        setNullableArrayOfOneUrls(nullableArrayOfOneUrls);
    }

    public NullableArrayOfOneUrlsValue9() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1991218611;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneUrlsValue9)) return false;
        final NullableArrayOfOneUrlsValue9 other = (NullableArrayOfOneUrlsValue9) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneUrls,
                other.nullableArrayOfOneUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneUrlsValue9(" + nullableArrayOfOneUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URL[] nullableArrayOfOneUrls;

    @JsonProperty("nullableArrayOfOneUrls")
    public java.net.URL[] getNullableArrayOfOneUrls() {
        return nullableArrayOfOneUrls;
    }

    public NullableArrayOfOneUrlsValue9 setNullableArrayOfOneUrls(
            final java.net.URL[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneUrls = value;

        return this;
    }
}
