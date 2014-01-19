package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneUrls_4 implements java.io.Serializable {
    public NullableListOfOneUrls_4(
            final java.util.List<java.net.URI> nullableListOfOneUrls,
            final java.util.List<java.net.URI> calculatedNullableListOfOneUrls,
            final java.util.List<java.net.URI> persistedNullableListOfOneUrls) {
        setNullableListOfOneUrls(nullableListOfOneUrls);
        this.calculatedNullableListOfOneUrls = calculatedNullableListOfOneUrls;
        this.persistedNullableListOfOneUrls = persistedNullableListOfOneUrls;
    }

    public NullableListOfOneUrls_4() {
        this.calculatedNullableListOfOneUrls = null;
        this.persistedNullableListOfOneUrls = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 644991437;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneUrls_4)) return false;
        final NullableListOfOneUrls_4 other = (NullableListOfOneUrls_4) obj;

        if (!(this.nullableListOfOneUrls == other.nullableListOfOneUrls || this.nullableListOfOneUrls != null
                && this.nullableListOfOneUrls
                        .equals(other.nullableListOfOneUrls))) return false;
        if (!(this.calculatedNullableListOfOneUrls == other.calculatedNullableListOfOneUrls || this.calculatedNullableListOfOneUrls != null
                && this.calculatedNullableListOfOneUrls
                        .equals(other.calculatedNullableListOfOneUrls)))
            return false;
        if (!(this.persistedNullableListOfOneUrls == other.persistedNullableListOfOneUrls || this.persistedNullableListOfOneUrls != null
                && this.persistedNullableListOfOneUrls
                        .equals(other.persistedNullableListOfOneUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneUrls_4(" + nullableListOfOneUrls + ','
                + calculatedNullableListOfOneUrls + ','
                + persistedNullableListOfOneUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<java.net.URI> nullableListOfOneUrls;

    @JsonProperty("nullableListOfOneUrls")
    public java.util.List<java.net.URI> getNullableListOfOneUrls() {
        return nullableListOfOneUrls;
    }

    public NullableListOfOneUrls_4 setNullableListOfOneUrls(
            final java.util.List<java.net.URI> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneUrls = value;

        return this;
    }

    private final java.util.List<java.net.URI> calculatedNullableListOfOneUrls;

    public java.util.List<java.net.URI> getCalculatedNullableListOfOneUrls() {
        return this.calculatedNullableListOfOneUrls;
    }

    private final java.util.List<java.net.URI> persistedNullableListOfOneUrls;

    public java.util.List<java.net.URI> getPersistedNullableListOfOneUrls() {
        return this.persistedNullableListOfOneUrls;
    }
}
