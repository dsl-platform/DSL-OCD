package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableXmls_4 implements java.io.Serializable {
    public OneSetOfNullableXmls_4(
            final java.util.Set<org.w3c.dom.Element> oneSetOfNullableXmls,
            final java.util.Set<org.w3c.dom.Element> calculatedOneSetOfNullableXmls,
            final java.util.Set<org.w3c.dom.Element> persistedOneSetOfNullableXmls) {
        setOneSetOfNullableXmls(oneSetOfNullableXmls);
        this.calculatedOneSetOfNullableXmls = calculatedOneSetOfNullableXmls;
        this.persistedOneSetOfNullableXmls = persistedOneSetOfNullableXmls;
    }

    public OneSetOfNullableXmls_4() {
        this.oneSetOfNullableXmls = new java.util.HashSet<org.w3c.dom.Element>();
        this.calculatedOneSetOfNullableXmls = new java.util.HashSet<org.w3c.dom.Element>();
        this.persistedOneSetOfNullableXmls = new java.util.HashSet<org.w3c.dom.Element>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 582158473;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableXmls_4)) return false;
        final OneSetOfNullableXmls_4 other = (OneSetOfNullableXmls_4) obj;

        if (!(this.oneSetOfNullableXmls.equals(other.oneSetOfNullableXmls)))
            return false;
        if (!(this.calculatedOneSetOfNullableXmls
                .equals(other.calculatedOneSetOfNullableXmls))) return false;
        if (!(this.persistedOneSetOfNullableXmls
                .equals(other.persistedOneSetOfNullableXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableXmls_4(" + oneSetOfNullableXmls + ','
                + calculatedOneSetOfNullableXmls + ','
                + persistedOneSetOfNullableXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> oneSetOfNullableXmls;

    @JsonProperty("oneSetOfNullableXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.w3c.dom.Element> getOneSetOfNullableXmls() {
        return oneSetOfNullableXmls;
    }

    public OneSetOfNullableXmls_4 setOneSetOfNullableXmls(
            final java.util.Set<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableXmls\" cannot be null!");
        this.oneSetOfNullableXmls = value;

        return this;
    }

    private final java.util.Set<org.w3c.dom.Element> calculatedOneSetOfNullableXmls;

    public java.util.Set<org.w3c.dom.Element> getCalculatedOneSetOfNullableXmls() {
        return this.calculatedOneSetOfNullableXmls;
    }

    private final java.util.Set<org.w3c.dom.Element> persistedOneSetOfNullableXmls;

    public java.util.Set<org.w3c.dom.Element> getPersistedOneSetOfNullableXmls() {
        return this.persistedOneSetOfNullableXmls;
    }
}
