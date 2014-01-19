package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableUrls_5 implements java.io.Serializable {
    public OneArrayOfNullableUrls_5(
            final java.net.URI[] oneArrayOfNullableUrls,
            final java.net.URI[] calculatedOneArrayOfNullableUrls,
            final java.net.URI[] persistedOneArrayOfNullableUrls) {
        setOneArrayOfNullableUrls(oneArrayOfNullableUrls);
        this.calculatedOneArrayOfNullableUrls = calculatedOneArrayOfNullableUrls;
        this.persistedOneArrayOfNullableUrls = persistedOneArrayOfNullableUrls;
    }

    public OneArrayOfNullableUrls_5() {
        this.oneArrayOfNullableUrls = new java.net.URI[] {};
        this.calculatedOneArrayOfNullableUrls = new java.net.URI[] {};
        this.persistedOneArrayOfNullableUrls = new java.net.URI[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 617614213;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableUrls_5)) return false;
        final OneArrayOfNullableUrls_5 other = (OneArrayOfNullableUrls_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableUrls,
                other.oneArrayOfNullableUrls))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfNullableUrls,
                other.calculatedOneArrayOfNullableUrls))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableUrls,
                other.persistedOneArrayOfNullableUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableUrls_5(" + oneArrayOfNullableUrls + ','
                + calculatedOneArrayOfNullableUrls + ','
                + persistedOneArrayOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URI[] oneArrayOfNullableUrls;

    @JsonProperty("oneArrayOfNullableUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.URI[] getOneArrayOfNullableUrls() {
        return oneArrayOfNullableUrls;
    }

    public OneArrayOfNullableUrls_5 setOneArrayOfNullableUrls(
            final java.net.URI[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableUrls\" cannot be null!");
        this.oneArrayOfNullableUrls = value;

        return this;
    }

    private final java.net.URI[] calculatedOneArrayOfNullableUrls;

    public java.net.URI[] getCalculatedOneArrayOfNullableUrls() {
        return this.calculatedOneArrayOfNullableUrls;
    }

    private final java.net.URI[] persistedOneArrayOfNullableUrls;

    public java.net.URI[] getPersistedOneArrayOfNullableUrls() {
        return this.persistedOneArrayOfNullableUrls;
    }
}
