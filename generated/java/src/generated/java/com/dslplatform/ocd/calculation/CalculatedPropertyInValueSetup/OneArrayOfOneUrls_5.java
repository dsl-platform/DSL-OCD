package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneUrls_5 implements java.io.Serializable {
    public OneArrayOfOneUrls_5(
            final java.net.URI[] oneArrayOfOneUrls,
            final java.net.URI[] calculatedOneArrayOfOneUrls,
            final java.net.URI[] persistedOneArrayOfOneUrls) {
        setOneArrayOfOneUrls(oneArrayOfOneUrls);
        this.calculatedOneArrayOfOneUrls = calculatedOneArrayOfOneUrls;
        this.persistedOneArrayOfOneUrls = persistedOneArrayOfOneUrls;
    }

    public OneArrayOfOneUrls_5() {
        this.oneArrayOfOneUrls = new java.net.URI[] {};
        this.calculatedOneArrayOfOneUrls = new java.net.URI[] {};
        this.persistedOneArrayOfOneUrls = new java.net.URI[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 305826872;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneUrls_5)) return false;
        final OneArrayOfOneUrls_5 other = (OneArrayOfOneUrls_5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneUrls,
                other.oneArrayOfOneUrls))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneUrls,
                other.calculatedOneArrayOfOneUrls))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneUrls,
                other.persistedOneArrayOfOneUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneUrls_5(" + oneArrayOfOneUrls + ','
                + calculatedOneArrayOfOneUrls + ','
                + persistedOneArrayOfOneUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.URI[] oneArrayOfOneUrls;

    @JsonProperty("oneArrayOfOneUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.URI[] getOneArrayOfOneUrls() {
        return oneArrayOfOneUrls;
    }

    public OneArrayOfOneUrls_5 setOneArrayOfOneUrls(final java.net.URI[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneUrls\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneUrls = value;

        return this;
    }

    private final java.net.URI[] calculatedOneArrayOfOneUrls;

    public java.net.URI[] getCalculatedOneArrayOfOneUrls() {
        return this.calculatedOneArrayOfOneUrls;
    }

    private final java.net.URI[] persistedOneArrayOfOneUrls;

    public java.net.URI[] getPersistedOneArrayOfOneUrls() {
        return this.persistedOneArrayOfOneUrls;
    }
}
