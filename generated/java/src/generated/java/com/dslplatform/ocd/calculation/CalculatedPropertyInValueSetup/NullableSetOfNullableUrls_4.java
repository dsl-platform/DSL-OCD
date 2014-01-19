package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableUrls_4 implements java.io.Serializable {
    public NullableSetOfNullableUrls_4(
            final java.util.Set<java.net.URI> nullableSetOfNullableUrls,
            final java.util.Set<java.net.URI> calculatedNullableSetOfNullableUrls,
            final java.util.Set<java.net.URI> persistedNullableSetOfNullableUrls) {
        setNullableSetOfNullableUrls(nullableSetOfNullableUrls);
        this.calculatedNullableSetOfNullableUrls = calculatedNullableSetOfNullableUrls;
        this.persistedNullableSetOfNullableUrls = persistedNullableSetOfNullableUrls;
    }

    public NullableSetOfNullableUrls_4() {
        this.calculatedNullableSetOfNullableUrls = null;
        this.persistedNullableSetOfNullableUrls = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1374391352;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableUrls_4)) return false;
        final NullableSetOfNullableUrls_4 other = (NullableSetOfNullableUrls_4) obj;

        if (!(this.nullableSetOfNullableUrls == other.nullableSetOfNullableUrls || this.nullableSetOfNullableUrls != null
                && this.nullableSetOfNullableUrls
                        .equals(other.nullableSetOfNullableUrls)))
            return false;
        if (!(this.calculatedNullableSetOfNullableUrls == other.calculatedNullableSetOfNullableUrls || this.calculatedNullableSetOfNullableUrls != null
                && this.calculatedNullableSetOfNullableUrls
                        .equals(other.calculatedNullableSetOfNullableUrls)))
            return false;
        if (!(this.persistedNullableSetOfNullableUrls == other.persistedNullableSetOfNullableUrls || this.persistedNullableSetOfNullableUrls != null
                && this.persistedNullableSetOfNullableUrls
                        .equals(other.persistedNullableSetOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableUrls_4(" + nullableSetOfNullableUrls + ','
                + calculatedNullableSetOfNullableUrls + ','
                + persistedNullableSetOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.URI> nullableSetOfNullableUrls;

    @JsonProperty("nullableSetOfNullableUrls")
    public java.util.Set<java.net.URI> getNullableSetOfNullableUrls() {
        return nullableSetOfNullableUrls;
    }

    public NullableSetOfNullableUrls_4 setNullableSetOfNullableUrls(
            final java.util.Set<java.net.URI> value) {
        this.nullableSetOfNullableUrls = value;

        return this;
    }

    private final java.util.Set<java.net.URI> calculatedNullableSetOfNullableUrls;

    public java.util.Set<java.net.URI> getCalculatedNullableSetOfNullableUrls() {
        return this.calculatedNullableSetOfNullableUrls;
    }

    private final java.util.Set<java.net.URI> persistedNullableSetOfNullableUrls;

    public java.util.Set<java.net.URI> getPersistedNullableSetOfNullableUrls() {
        return this.persistedNullableSetOfNullableUrls;
    }
}
