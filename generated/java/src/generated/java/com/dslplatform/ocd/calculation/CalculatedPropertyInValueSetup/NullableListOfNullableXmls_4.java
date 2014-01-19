package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableXmls_4 implements java.io.Serializable {
    public NullableListOfNullableXmls_4(
            final java.util.List<org.w3c.dom.Element> nullableListOfNullableXmls,
            final java.util.List<org.w3c.dom.Element> calculatedNullableListOfNullableXmls,
            final java.util.List<org.w3c.dom.Element> persistedNullableListOfNullableXmls) {
        setNullableListOfNullableXmls(nullableListOfNullableXmls);
        this.calculatedNullableListOfNullableXmls = calculatedNullableListOfNullableXmls;
        this.persistedNullableListOfNullableXmls = persistedNullableListOfNullableXmls;
    }

    public NullableListOfNullableXmls_4() {
        this.calculatedNullableListOfNullableXmls = null;
        this.persistedNullableListOfNullableXmls = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1947867582;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableXmls_4)) return false;
        final NullableListOfNullableXmls_4 other = (NullableListOfNullableXmls_4) obj;

        if (!(this.nullableListOfNullableXmls == other.nullableListOfNullableXmls || this.nullableListOfNullableXmls != null
                && this.nullableListOfNullableXmls
                        .equals(other.nullableListOfNullableXmls)))
            return false;
        if (!(this.calculatedNullableListOfNullableXmls == other.calculatedNullableListOfNullableXmls || this.calculatedNullableListOfNullableXmls != null
                && this.calculatedNullableListOfNullableXmls
                        .equals(other.calculatedNullableListOfNullableXmls)))
            return false;
        if (!(this.persistedNullableListOfNullableXmls == other.persistedNullableListOfNullableXmls || this.persistedNullableListOfNullableXmls != null
                && this.persistedNullableListOfNullableXmls
                        .equals(other.persistedNullableListOfNullableXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableXmls_4(" + nullableListOfNullableXmls
                + ',' + calculatedNullableListOfNullableXmls + ','
                + persistedNullableListOfNullableXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> nullableListOfNullableXmls;

    @JsonProperty("nullableListOfNullableXmls")
    public java.util.List<org.w3c.dom.Element> getNullableListOfNullableXmls() {
        return nullableListOfNullableXmls;
    }

    public NullableListOfNullableXmls_4 setNullableListOfNullableXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        this.nullableListOfNullableXmls = value;

        return this;
    }

    private final java.util.List<org.w3c.dom.Element> calculatedNullableListOfNullableXmls;

    public java.util.List<org.w3c.dom.Element> getCalculatedNullableListOfNullableXmls() {
        return this.calculatedNullableListOfNullableXmls;
    }

    private final java.util.List<org.w3c.dom.Element> persistedNullableListOfNullableXmls;

    public java.util.List<org.w3c.dom.Element> getPersistedNullableListOfNullableXmls() {
        return this.persistedNullableListOfNullableXmls;
    }
}
