package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneXmls_4 implements java.io.Serializable {
    public NullableListOfOneXmls_4(
            final java.util.List<org.w3c.dom.Element> nullableListOfOneXmls,
            final java.util.List<org.w3c.dom.Element> calculatedNullableListOfOneXmls,
            final java.util.List<org.w3c.dom.Element> persistedNullableListOfOneXmls) {
        setNullableListOfOneXmls(nullableListOfOneXmls);
        this.calculatedNullableListOfOneXmls = calculatedNullableListOfOneXmls;
        this.persistedNullableListOfOneXmls = persistedNullableListOfOneXmls;
    }

    public NullableListOfOneXmls_4() {
        this.calculatedNullableListOfOneXmls = null;
        this.persistedNullableListOfOneXmls = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 404757773;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneXmls_4)) return false;
        final NullableListOfOneXmls_4 other = (NullableListOfOneXmls_4) obj;

        if (!(this.nullableListOfOneXmls == other.nullableListOfOneXmls || this.nullableListOfOneXmls != null
                && this.nullableListOfOneXmls
                        .equals(other.nullableListOfOneXmls))) return false;
        if (!(this.calculatedNullableListOfOneXmls == other.calculatedNullableListOfOneXmls || this.calculatedNullableListOfOneXmls != null
                && this.calculatedNullableListOfOneXmls
                        .equals(other.calculatedNullableListOfOneXmls)))
            return false;
        if (!(this.persistedNullableListOfOneXmls == other.persistedNullableListOfOneXmls || this.persistedNullableListOfOneXmls != null
                && this.persistedNullableListOfOneXmls
                        .equals(other.persistedNullableListOfOneXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneXmls_4(" + nullableListOfOneXmls + ','
                + calculatedNullableListOfOneXmls + ','
                + persistedNullableListOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> nullableListOfOneXmls;

    @JsonProperty("nullableListOfOneXmls")
    public java.util.List<org.w3c.dom.Element> getNullableListOfOneXmls() {
        return nullableListOfOneXmls;
    }

    public NullableListOfOneXmls_4 setNullableListOfOneXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableListOfOneXmls = value;

        return this;
    }

    private final java.util.List<org.w3c.dom.Element> calculatedNullableListOfOneXmls;

    public java.util.List<org.w3c.dom.Element> getCalculatedNullableListOfOneXmls() {
        return this.calculatedNullableListOfOneXmls;
    }

    private final java.util.List<org.w3c.dom.Element> persistedNullableListOfOneXmls;

    public java.util.List<org.w3c.dom.Element> getPersistedNullableListOfOneXmls() {
        return this.persistedNullableListOfOneXmls;
    }
}
