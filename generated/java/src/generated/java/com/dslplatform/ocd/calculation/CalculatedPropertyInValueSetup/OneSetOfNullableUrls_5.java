package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableUrls_5 implements java.io.Serializable {
    public OneSetOfNullableUrls_5(
            final java.util.Set<java.net.URI> oneSetOfNullableUrls,
            final java.util.Set<java.net.URI> calculatedOneSetOfNullableUrls,
            final java.util.Set<java.net.URI> persistedOneSetOfNullableUrls) {
        setOneSetOfNullableUrls(oneSetOfNullableUrls);
        this.calculatedOneSetOfNullableUrls = calculatedOneSetOfNullableUrls;
        this.persistedOneSetOfNullableUrls = persistedOneSetOfNullableUrls;
    }

    public OneSetOfNullableUrls_5() {
        this.oneSetOfNullableUrls = new java.util.HashSet<java.net.URI>();
        this.calculatedOneSetOfNullableUrls = new java.util.HashSet<java.net.URI>();
        this.persistedOneSetOfNullableUrls = new java.util.HashSet<java.net.URI>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 813788012;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableUrls_5)) return false;
        final OneSetOfNullableUrls_5 other = (OneSetOfNullableUrls_5) obj;

        if (!(this.oneSetOfNullableUrls.equals(other.oneSetOfNullableUrls)))
            return false;
        if (!(this.calculatedOneSetOfNullableUrls
                .equals(other.calculatedOneSetOfNullableUrls))) return false;
        if (!(this.persistedOneSetOfNullableUrls
                .equals(other.persistedOneSetOfNullableUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableUrls_5(" + oneSetOfNullableUrls + ','
                + calculatedOneSetOfNullableUrls + ','
                + persistedOneSetOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.URI> oneSetOfNullableUrls;

    @JsonProperty("oneSetOfNullableUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.URI> getOneSetOfNullableUrls() {
        return oneSetOfNullableUrls;
    }

    public OneSetOfNullableUrls_5 setOneSetOfNullableUrls(
            final java.util.Set<java.net.URI> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableUrls\" cannot be null!");
        this.oneSetOfNullableUrls = value;

        return this;
    }

    private final java.util.Set<java.net.URI> calculatedOneSetOfNullableUrls;

    public java.util.Set<java.net.URI> getCalculatedOneSetOfNullableUrls() {
        return this.calculatedOneSetOfNullableUrls;
    }

    private final java.util.Set<java.net.URI> persistedOneSetOfNullableUrls;

    public java.util.Set<java.net.URI> getPersistedOneSetOfNullableUrls() {
        return this.persistedOneSetOfNullableUrls;
    }
}
