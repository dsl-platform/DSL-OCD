package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableXmls_4 implements java.io.Serializable {
    public NullableSetOfNullableXmls_4(
            final java.util.Set<org.w3c.dom.Element> nullableSetOfNullableXmls,
            final java.util.Set<org.w3c.dom.Element> calculatedNullableSetOfNullableXmls,
            final java.util.Set<org.w3c.dom.Element> persistedNullableSetOfNullableXmls) {
        setNullableSetOfNullableXmls(nullableSetOfNullableXmls);
        this.calculatedNullableSetOfNullableXmls = calculatedNullableSetOfNullableXmls;
        this.persistedNullableSetOfNullableXmls = persistedNullableSetOfNullableXmls;
    }

    public NullableSetOfNullableXmls_4() {
        this.calculatedNullableSetOfNullableXmls = null;
        this.persistedNullableSetOfNullableXmls = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1453234712;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableXmls_4)) return false;
        final NullableSetOfNullableXmls_4 other = (NullableSetOfNullableXmls_4) obj;

        if (!(this.nullableSetOfNullableXmls == other.nullableSetOfNullableXmls || this.nullableSetOfNullableXmls != null
                && this.nullableSetOfNullableXmls
                        .equals(other.nullableSetOfNullableXmls)))
            return false;
        if (!(this.calculatedNullableSetOfNullableXmls == other.calculatedNullableSetOfNullableXmls || this.calculatedNullableSetOfNullableXmls != null
                && this.calculatedNullableSetOfNullableXmls
                        .equals(other.calculatedNullableSetOfNullableXmls)))
            return false;
        if (!(this.persistedNullableSetOfNullableXmls == other.persistedNullableSetOfNullableXmls || this.persistedNullableSetOfNullableXmls != null
                && this.persistedNullableSetOfNullableXmls
                        .equals(other.persistedNullableSetOfNullableXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableXmls_4(" + nullableSetOfNullableXmls + ','
                + calculatedNullableSetOfNullableXmls + ','
                + persistedNullableSetOfNullableXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> nullableSetOfNullableXmls;

    @JsonProperty("nullableSetOfNullableXmls")
    public java.util.Set<org.w3c.dom.Element> getNullableSetOfNullableXmls() {
        return nullableSetOfNullableXmls;
    }

    public NullableSetOfNullableXmls_4 setNullableSetOfNullableXmls(
            final java.util.Set<org.w3c.dom.Element> value) {
        this.nullableSetOfNullableXmls = value;

        return this;
    }

    private final java.util.Set<org.w3c.dom.Element> calculatedNullableSetOfNullableXmls;

    public java.util.Set<org.w3c.dom.Element> getCalculatedNullableSetOfNullableXmls() {
        return this.calculatedNullableSetOfNullableXmls;
    }

    private final java.util.Set<org.w3c.dom.Element> persistedNullableSetOfNullableXmls;

    public java.util.Set<org.w3c.dom.Element> getPersistedNullableSetOfNullableXmls() {
        return this.persistedNullableSetOfNullableXmls;
    }
}
