package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneUrls_4 implements java.io.Serializable {
    public NullableSetOfOneUrls_4(
            final java.util.Set<java.net.URI> nullableSetOfOneUrls,
            final java.util.Set<java.net.URI> calculatedNullableSetOfOneUrls,
            final java.util.Set<java.net.URI> persistedNullableSetOfOneUrls) {
        setNullableSetOfOneUrls(nullableSetOfOneUrls);
        this.calculatedNullableSetOfOneUrls = calculatedNullableSetOfOneUrls;
        this.persistedNullableSetOfOneUrls = persistedNullableSetOfOneUrls;
    }

    public NullableSetOfOneUrls_4() {
        this.calculatedNullableSetOfOneUrls = null;
        this.persistedNullableSetOfOneUrls = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 820357623;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneUrls_4)) return false;
        final NullableSetOfOneUrls_4 other = (NullableSetOfOneUrls_4) obj;

        if (!(this.nullableSetOfOneUrls == other.nullableSetOfOneUrls || this.nullableSetOfOneUrls != null
                && this.nullableSetOfOneUrls.equals(other.nullableSetOfOneUrls)))
            return false;
        if (!(this.calculatedNullableSetOfOneUrls == other.calculatedNullableSetOfOneUrls || this.calculatedNullableSetOfOneUrls != null
                && this.calculatedNullableSetOfOneUrls
                        .equals(other.calculatedNullableSetOfOneUrls)))
            return false;
        if (!(this.persistedNullableSetOfOneUrls == other.persistedNullableSetOfOneUrls || this.persistedNullableSetOfOneUrls != null
                && this.persistedNullableSetOfOneUrls
                        .equals(other.persistedNullableSetOfOneUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneUrls_4(" + nullableSetOfOneUrls + ','
                + calculatedNullableSetOfOneUrls + ','
                + persistedNullableSetOfOneUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.URI> nullableSetOfOneUrls;

    @JsonProperty("nullableSetOfOneUrls")
    public java.util.Set<java.net.URI> getNullableSetOfOneUrls() {
        return nullableSetOfOneUrls;
    }

    public NullableSetOfOneUrls_4 setNullableSetOfOneUrls(
            final java.util.Set<java.net.URI> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneUrls = value;

        return this;
    }

    private final java.util.Set<java.net.URI> calculatedNullableSetOfOneUrls;

    public java.util.Set<java.net.URI> getCalculatedNullableSetOfOneUrls() {
        return this.calculatedNullableSetOfOneUrls;
    }

    private final java.util.Set<java.net.URI> persistedNullableSetOfOneUrls;

    public java.util.Set<java.net.URI> getPersistedNullableSetOfOneUrls() {
        return this.persistedNullableSetOfOneUrls;
    }
}
