package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableUrls_5 implements java.io.Serializable {
    public OneListOfNullableUrls_5(
            final java.util.List<java.net.URI> oneListOfNullableUrls,
            final java.util.List<java.net.URI> calculatedOneListOfNullableUrls,
            final java.util.List<java.net.URI> persistedOneListOfNullableUrls) {
        setOneListOfNullableUrls(oneListOfNullableUrls);
        this.calculatedOneListOfNullableUrls = calculatedOneListOfNullableUrls;
        this.persistedOneListOfNullableUrls = persistedOneListOfNullableUrls;
    }

    public OneListOfNullableUrls_5() {
        this.oneListOfNullableUrls = new java.util.ArrayList<java.net.URI>();
        this.calculatedOneListOfNullableUrls = new java.util.ArrayList<java.net.URI>();
        this.persistedOneListOfNullableUrls = new java.util.ArrayList<java.net.URI>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1826881112;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableUrls_5)) return false;
        final OneListOfNullableUrls_5 other = (OneListOfNullableUrls_5) obj;

        if (!(this.oneListOfNullableUrls.equals(other.oneListOfNullableUrls)))
            return false;
        if (!(this.calculatedOneListOfNullableUrls
                .equals(other.calculatedOneListOfNullableUrls))) return false;
        if (!(this.persistedOneListOfNullableUrls
                .equals(other.persistedOneListOfNullableUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableUrls_5(" + oneListOfNullableUrls + ','
                + calculatedOneListOfNullableUrls + ','
                + persistedOneListOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.URI> oneListOfNullableUrls;

    @JsonProperty("oneListOfNullableUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.net.URI> getOneListOfNullableUrls() {
        return oneListOfNullableUrls;
    }

    public OneListOfNullableUrls_5 setOneListOfNullableUrls(
            final java.util.List<java.net.URI> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableUrls\" cannot be null!");
        this.oneListOfNullableUrls = value;

        return this;
    }

    private final java.util.List<java.net.URI> calculatedOneListOfNullableUrls;

    public java.util.List<java.net.URI> getCalculatedOneListOfNullableUrls() {
        return this.calculatedOneListOfNullableUrls;
    }

    private final java.util.List<java.net.URI> persistedOneListOfNullableUrls;

    public java.util.List<java.net.URI> getPersistedOneListOfNullableUrls() {
        return this.persistedOneListOfNullableUrls;
    }
}
