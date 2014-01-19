package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableUrls_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableUrls_4(
            final java.net.URI[] nullableArrayOfNullableUrls,
            final java.net.URI[] calculatedNullableArrayOfNullableUrls,
            final java.net.URI[] persistedNullableArrayOfNullableUrls) {
        setNullableArrayOfNullableUrls(nullableArrayOfNullableUrls);
        this.calculatedNullableArrayOfNullableUrls = calculatedNullableArrayOfNullableUrls;
        this.persistedNullableArrayOfNullableUrls = persistedNullableArrayOfNullableUrls;
    }

    public NullableArrayOfNullableUrls_4() {
        this.calculatedNullableArrayOfNullableUrls = null;
        this.persistedNullableArrayOfNullableUrls = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 695954605;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableUrls_4)) return false;
        final NullableArrayOfNullableUrls_4 other = (NullableArrayOfNullableUrls_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableUrls,
                other.nullableArrayOfNullableUrls))) return false;
        if (!(this.calculatedNullableArrayOfNullableUrls == other.calculatedNullableArrayOfNullableUrls || this.calculatedNullableArrayOfNullableUrls != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableUrls,
                        other.calculatedNullableArrayOfNullableUrls)))
            return false;
        if (!(this.persistedNullableArrayOfNullableUrls == other.persistedNullableArrayOfNullableUrls || this.persistedNullableArrayOfNullableUrls != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableUrls,
                        other.persistedNullableArrayOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableUrls_4(" + nullableArrayOfNullableUrls
                + ',' + calculatedNullableArrayOfNullableUrls + ','
                + persistedNullableArrayOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URI[] nullableArrayOfNullableUrls;

    @JsonProperty("nullableArrayOfNullableUrls")
    public java.net.URI[] getNullableArrayOfNullableUrls() {
        return nullableArrayOfNullableUrls;
    }

    public NullableArrayOfNullableUrls_4 setNullableArrayOfNullableUrls(
            final java.net.URI[] value) {
        this.nullableArrayOfNullableUrls = value;

        return this;
    }

    private final java.net.URI[] calculatedNullableArrayOfNullableUrls;

    public java.net.URI[] getCalculatedNullableArrayOfNullableUrls() {
        return this.calculatedNullableArrayOfNullableUrls;
    }

    private final java.net.URI[] persistedNullableArrayOfNullableUrls;

    public java.net.URI[] getPersistedNullableArrayOfNullableUrls() {
        return this.persistedNullableArrayOfNullableUrls;
    }
}
