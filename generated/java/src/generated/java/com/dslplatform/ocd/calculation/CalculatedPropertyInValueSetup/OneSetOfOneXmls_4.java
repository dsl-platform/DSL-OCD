package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneXmls_4 implements java.io.Serializable {
    public OneSetOfOneXmls_4(
            final java.util.Set<org.w3c.dom.Element> oneSetOfOneXmls,
            final java.util.Set<org.w3c.dom.Element> calculatedOneSetOfOneXmls,
            final java.util.Set<org.w3c.dom.Element> persistedOneSetOfOneXmls) {
        setOneSetOfOneXmls(oneSetOfOneXmls);
        this.calculatedOneSetOfOneXmls = calculatedOneSetOfOneXmls;
        this.persistedOneSetOfOneXmls = persistedOneSetOfOneXmls;
    }

    public OneSetOfOneXmls_4() {
        this.oneSetOfOneXmls = new java.util.HashSet<org.w3c.dom.Element>();
        this.calculatedOneSetOfOneXmls = new java.util.HashSet<org.w3c.dom.Element>();
        this.persistedOneSetOfOneXmls = new java.util.HashSet<org.w3c.dom.Element>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 726312560;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneXmls_4)) return false;
        final OneSetOfOneXmls_4 other = (OneSetOfOneXmls_4) obj;

        if (!(this.oneSetOfOneXmls.equals(other.oneSetOfOneXmls)))
            return false;
        if (!(this.calculatedOneSetOfOneXmls
                .equals(other.calculatedOneSetOfOneXmls))) return false;
        if (!(this.persistedOneSetOfOneXmls
                .equals(other.persistedOneSetOfOneXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneXmls_4(" + oneSetOfOneXmls + ','
                + calculatedOneSetOfOneXmls + ',' + persistedOneSetOfOneXmls
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> oneSetOfOneXmls;

    @JsonProperty("oneSetOfOneXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.w3c.dom.Element> getOneSetOfOneXmls() {
        return oneSetOfOneXmls;
    }

    public OneSetOfOneXmls_4 setOneSetOfOneXmls(
            final java.util.Set<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneXmls\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneSetOfOneXmls = value;

        return this;
    }

    private final java.util.Set<org.w3c.dom.Element> calculatedOneSetOfOneXmls;

    public java.util.Set<org.w3c.dom.Element> getCalculatedOneSetOfOneXmls() {
        return this.calculatedOneSetOfOneXmls;
    }

    private final java.util.Set<org.w3c.dom.Element> persistedOneSetOfOneXmls;

    public java.util.Set<org.w3c.dom.Element> getPersistedOneSetOfOneXmls() {
        return this.persistedOneSetOfOneXmls;
    }
}
