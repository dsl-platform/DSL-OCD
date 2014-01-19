package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneXmls_4 implements java.io.Serializable {
    public NullableSetOfOneXmls_4(
            final java.util.Set<org.w3c.dom.Element> nullableSetOfOneXmls,
            final java.util.Set<org.w3c.dom.Element> calculatedNullableSetOfOneXmls,
            final java.util.Set<org.w3c.dom.Element> persistedNullableSetOfOneXmls) {
        setNullableSetOfOneXmls(nullableSetOfOneXmls);
        this.calculatedNullableSetOfOneXmls = calculatedNullableSetOfOneXmls;
        this.persistedNullableSetOfOneXmls = persistedNullableSetOfOneXmls;
    }

    public NullableSetOfOneXmls_4() {
        this.calculatedNullableSetOfOneXmls = null;
        this.persistedNullableSetOfOneXmls = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1886077443;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneXmls_4)) return false;
        final NullableSetOfOneXmls_4 other = (NullableSetOfOneXmls_4) obj;

        if (!(this.nullableSetOfOneXmls == other.nullableSetOfOneXmls || this.nullableSetOfOneXmls != null
                && this.nullableSetOfOneXmls.equals(other.nullableSetOfOneXmls)))
            return false;
        if (!(this.calculatedNullableSetOfOneXmls == other.calculatedNullableSetOfOneXmls || this.calculatedNullableSetOfOneXmls != null
                && this.calculatedNullableSetOfOneXmls
                        .equals(other.calculatedNullableSetOfOneXmls)))
            return false;
        if (!(this.persistedNullableSetOfOneXmls == other.persistedNullableSetOfOneXmls || this.persistedNullableSetOfOneXmls != null
                && this.persistedNullableSetOfOneXmls
                        .equals(other.persistedNullableSetOfOneXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneXmls_4(" + nullableSetOfOneXmls + ','
                + calculatedNullableSetOfOneXmls + ','
                + persistedNullableSetOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> nullableSetOfOneXmls;

    @JsonProperty("nullableSetOfOneXmls")
    public java.util.Set<org.w3c.dom.Element> getNullableSetOfOneXmls() {
        return nullableSetOfOneXmls;
    }

    public NullableSetOfOneXmls_4 setNullableSetOfOneXmls(
            final java.util.Set<org.w3c.dom.Element> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableSetOfOneXmls = value;

        return this;
    }

    private final java.util.Set<org.w3c.dom.Element> calculatedNullableSetOfOneXmls;

    public java.util.Set<org.w3c.dom.Element> getCalculatedNullableSetOfOneXmls() {
        return this.calculatedNullableSetOfOneXmls;
    }

    private final java.util.Set<org.w3c.dom.Element> persistedNullableSetOfOneXmls;

    public java.util.Set<org.w3c.dom.Element> getPersistedNullableSetOfOneXmls() {
        return this.persistedNullableSetOfOneXmls;
    }
}
