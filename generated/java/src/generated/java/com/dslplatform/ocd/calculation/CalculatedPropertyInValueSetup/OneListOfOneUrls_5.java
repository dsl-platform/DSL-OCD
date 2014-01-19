package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneUrls_5 implements java.io.Serializable {
    public OneListOfOneUrls_5(
            final java.util.List<java.net.URI> oneListOfOneUrls,
            final java.util.List<java.net.URI> calculatedOneListOfOneUrls,
            final java.util.List<java.net.URI> persistedOneListOfOneUrls) {
        setOneListOfOneUrls(oneListOfOneUrls);
        this.calculatedOneListOfOneUrls = calculatedOneListOfOneUrls;
        this.persistedOneListOfOneUrls = persistedOneListOfOneUrls;
    }

    public OneListOfOneUrls_5() {
        this.oneListOfOneUrls = new java.util.ArrayList<java.net.URI>();
        this.calculatedOneListOfOneUrls = new java.util.ArrayList<java.net.URI>();
        this.persistedOneListOfOneUrls = new java.util.ArrayList<java.net.URI>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2050159339;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneUrls_5)) return false;
        final OneListOfOneUrls_5 other = (OneListOfOneUrls_5) obj;

        if (!(this.oneListOfOneUrls.equals(other.oneListOfOneUrls)))
            return false;
        if (!(this.calculatedOneListOfOneUrls
                .equals(other.calculatedOneListOfOneUrls))) return false;
        if (!(this.persistedOneListOfOneUrls
                .equals(other.persistedOneListOfOneUrls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneUrls_5(" + oneListOfOneUrls + ','
                + calculatedOneListOfOneUrls + ',' + persistedOneListOfOneUrls
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.URI> oneListOfOneUrls;

    @JsonProperty("oneListOfOneUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<java.net.URI> getOneListOfOneUrls() {
        return oneListOfOneUrls;
    }

    public OneListOfOneUrls_5 setOneListOfOneUrls(
            final java.util.List<java.net.URI> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneUrls\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneUrls = value;

        return this;
    }

    private final java.util.List<java.net.URI> calculatedOneListOfOneUrls;

    public java.util.List<java.net.URI> getCalculatedOneListOfOneUrls() {
        return this.calculatedOneListOfOneUrls;
    }

    private final java.util.List<java.net.URI> persistedOneListOfOneUrls;

    public java.util.List<java.net.URI> getPersistedOneListOfOneUrls() {
        return this.persistedOneListOfOneUrls;
    }
}
