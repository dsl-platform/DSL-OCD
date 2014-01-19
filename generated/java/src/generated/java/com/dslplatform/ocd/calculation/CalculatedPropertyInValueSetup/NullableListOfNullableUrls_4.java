package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableUrls_4 implements java.io.Serializable {
    public NullableListOfNullableUrls_4(
            final java.util.List<java.net.URI> nullableListOfNullableUrls,
            final java.util.List<java.net.URI> calculatedNullableListOfNullableUrls,
            final java.util.List<java.net.URI> persistedNullableListOfNullableUrls) {
        setNullableListOfNullableUrls(nullableListOfNullableUrls);
        this.calculatedNullableListOfNullableUrls = calculatedNullableListOfNullableUrls;
        this.persistedNullableListOfNullableUrls = persistedNullableListOfNullableUrls;
    }

    public NullableListOfNullableUrls_4() {
        this.calculatedNullableListOfNullableUrls = null;
        this.persistedNullableListOfNullableUrls = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2085759894;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableUrls_4)) return false;
        final NullableListOfNullableUrls_4 other = (NullableListOfNullableUrls_4) obj;

        if (!(this.nullableListOfNullableUrls == other.nullableListOfNullableUrls || this.nullableListOfNullableUrls != null
                && this.nullableListOfNullableUrls
                        .equals(other.nullableListOfNullableUrls)))
            return false;
        if (!(this.calculatedNullableListOfNullableUrls == other.calculatedNullableListOfNullableUrls || this.calculatedNullableListOfNullableUrls != null
                && this.calculatedNullableListOfNullableUrls
                        .equals(other.calculatedNullableListOfNullableUrls)))
            return false;
        if (!(this.persistedNullableListOfNullableUrls == other.persistedNullableListOfNullableUrls || this.persistedNullableListOfNullableUrls != null
                && this.persistedNullableListOfNullableUrls
                        .equals(other.persistedNullableListOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableUrls_4(" + nullableListOfNullableUrls
                + ',' + calculatedNullableListOfNullableUrls + ','
                + persistedNullableListOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.URI> nullableListOfNullableUrls;

    @JsonProperty("nullableListOfNullableUrls")
    public java.util.List<java.net.URI> getNullableListOfNullableUrls() {
        return nullableListOfNullableUrls;
    }

    public NullableListOfNullableUrls_4 setNullableListOfNullableUrls(
            final java.util.List<java.net.URI> value) {
        this.nullableListOfNullableUrls = value;

        return this;
    }

    private final java.util.List<java.net.URI> calculatedNullableListOfNullableUrls;

    public java.util.List<java.net.URI> getCalculatedNullableListOfNullableUrls() {
        return this.calculatedNullableListOfNullableUrls;
    }

    private final java.util.List<java.net.URI> persistedNullableListOfNullableUrls;

    public java.util.List<java.net.URI> getPersistedNullableListOfNullableUrls() {
        return this.persistedNullableListOfNullableUrls;
    }
}
