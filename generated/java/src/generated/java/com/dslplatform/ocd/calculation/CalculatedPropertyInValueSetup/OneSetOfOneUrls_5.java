package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneUrls_5 implements java.io.Serializable {
    public OneSetOfOneUrls_5(
            final java.util.Set<java.net.URI> oneSetOfOneUrls,
            final java.util.Set<java.net.URI> calculatedOneSetOfOneUrls,
            final java.util.Set<java.net.URI> persistedOneSetOfOneUrls) {
        setOneSetOfOneUrls(oneSetOfOneUrls);
        this.calculatedOneSetOfOneUrls = calculatedOneSetOfOneUrls;
        this.persistedOneSetOfOneUrls = persistedOneSetOfOneUrls;
    }

    public OneSetOfOneUrls_5() {
        this.oneSetOfOneUrls = new java.util.HashSet<java.net.URI>();
        this.calculatedOneSetOfOneUrls = new java.util.HashSet<java.net.URI>();
        this.persistedOneSetOfOneUrls = new java.util.HashSet<java.net.URI>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1903920549;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneUrls_5)) return false;
        final OneSetOfOneUrls_5 other = (OneSetOfOneUrls_5) obj;

        if (!(this.oneSetOfOneUrls.equals(other.oneSetOfOneUrls)))
            return false;
        if (!(this.calculatedOneSetOfOneUrls
                .equals(other.calculatedOneSetOfOneUrls))) return false;
        if (!(this.persistedOneSetOfOneUrls
                .equals(other.persistedOneSetOfOneUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneUrls_5(" + oneSetOfOneUrls + ','
                + calculatedOneSetOfOneUrls + ',' + persistedOneSetOfOneUrls
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.URI> oneSetOfOneUrls;

    @JsonProperty("oneSetOfOneUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.URI> getOneSetOfOneUrls() {
        return oneSetOfOneUrls;
    }

    public OneSetOfOneUrls_5 setOneSetOfOneUrls(
            final java.util.Set<java.net.URI> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneUrls\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneUrls = value;

        return this;
    }

    private final java.util.Set<java.net.URI> calculatedOneSetOfOneUrls;

    public java.util.Set<java.net.URI> getCalculatedOneSetOfOneUrls() {
        return this.calculatedOneSetOfOneUrls;
    }

    private final java.util.Set<java.net.URI> persistedOneSetOfOneUrls;

    public java.util.Set<java.net.URI> getPersistedOneSetOfOneUrls() {
        return this.persistedOneSetOfOneUrls;
    }
}
