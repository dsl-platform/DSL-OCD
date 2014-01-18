package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneUrls_1 implements java.io.Serializable {
    public NullableListOfOneUrls_1(
            final java.util.List<java.net.URI> nullableListOfOneUrls) {
        setNullableListOfOneUrls(nullableListOfOneUrls);
    }

    public NullableListOfOneUrls_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 644991432;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneUrls_1)) return false;
        final NullableListOfOneUrls_1 other = (NullableListOfOneUrls_1) obj;

        if (!(this.nullableListOfOneUrls == other.nullableListOfOneUrls || this.nullableListOfOneUrls != null
                && this.nullableListOfOneUrls
                        .equals(other.nullableListOfOneUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneUrls_1(" + nullableListOfOneUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.URI> nullableListOfOneUrls;

    @JsonProperty("nullableListOfOneUrls")
    public java.util.List<java.net.URI> getNullableListOfOneUrls() {
        return nullableListOfOneUrls;
    }

    public NullableListOfOneUrls_1 setNullableListOfOneUrls(
            final java.util.List<java.net.URI> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneUrls = value;

        return this;
    }
}
