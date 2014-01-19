package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneUrls_4 implements java.io.Serializable {
    public NullableArrayOfOneUrls_4(
            final java.net.URI[] nullableArrayOfOneUrls,
            final java.net.URI[] calculatedNullableArrayOfOneUrls,
            final java.net.URI[] persistedNullableArrayOfOneUrls) {
        setNullableArrayOfOneUrls(nullableArrayOfOneUrls);
        this.calculatedNullableArrayOfOneUrls = calculatedNullableArrayOfOneUrls;
        this.persistedNullableArrayOfOneUrls = persistedNullableArrayOfOneUrls;
    }

    public NullableArrayOfOneUrls_4() {
        this.calculatedNullableArrayOfOneUrls = null;
        this.persistedNullableArrayOfOneUrls = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1204912602;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneUrls_4)) return false;
        final NullableArrayOfOneUrls_4 other = (NullableArrayOfOneUrls_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneUrls,
                other.nullableArrayOfOneUrls))) return false;
        if (!(this.calculatedNullableArrayOfOneUrls == other.calculatedNullableArrayOfOneUrls || this.calculatedNullableArrayOfOneUrls != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneUrls,
                        other.calculatedNullableArrayOfOneUrls))) return false;
        if (!(this.persistedNullableArrayOfOneUrls == other.persistedNullableArrayOfOneUrls || this.persistedNullableArrayOfOneUrls != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneUrls,
                        other.persistedNullableArrayOfOneUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneUrls_4(" + nullableArrayOfOneUrls + ','
                + calculatedNullableArrayOfOneUrls + ','
                + persistedNullableArrayOfOneUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URI[] nullableArrayOfOneUrls;

    @JsonProperty("nullableArrayOfOneUrls")
    public java.net.URI[] getNullableArrayOfOneUrls() {
        return nullableArrayOfOneUrls;
    }

    public NullableArrayOfOneUrls_4 setNullableArrayOfOneUrls(
            final java.net.URI[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneUrls = value;

        return this;
    }

    private final java.net.URI[] calculatedNullableArrayOfOneUrls;

    public java.net.URI[] getCalculatedNullableArrayOfOneUrls() {
        return this.calculatedNullableArrayOfOneUrls;
    }

    private final java.net.URI[] persistedNullableArrayOfOneUrls;

    public java.net.URI[] getPersistedNullableArrayOfOneUrls() {
        return this.persistedNullableArrayOfOneUrls;
    }
}
