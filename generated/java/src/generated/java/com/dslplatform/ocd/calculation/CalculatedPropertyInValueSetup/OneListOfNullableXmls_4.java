package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableXmls_4 implements java.io.Serializable {
    public OneListOfNullableXmls_4(
            final java.util.List<org.w3c.dom.Element> oneListOfNullableXmls,
            final java.util.List<org.w3c.dom.Element> calculatedOneListOfNullableXmls,
            final java.util.List<org.w3c.dom.Element> persistedOneListOfNullableXmls) {
        setOneListOfNullableXmls(oneListOfNullableXmls);
        this.calculatedOneListOfNullableXmls = calculatedOneListOfNullableXmls;
        this.persistedOneListOfNullableXmls = persistedOneListOfNullableXmls;
    }

    public OneListOfNullableXmls_4() {
        this.oneListOfNullableXmls = new java.util.ArrayList<org.w3c.dom.Element>();
        this.calculatedOneListOfNullableXmls = new java.util.ArrayList<org.w3c.dom.Element>();
        this.persistedOneListOfNullableXmls = new java.util.ArrayList<org.w3c.dom.Element>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 649288091;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableXmls_4)) return false;
        final OneListOfNullableXmls_4 other = (OneListOfNullableXmls_4) obj;

        if (!(this.oneListOfNullableXmls.equals(other.oneListOfNullableXmls)))
            return false;
        if (!(this.calculatedOneListOfNullableXmls
                .equals(other.calculatedOneListOfNullableXmls))) return false;
        if (!(this.persistedOneListOfNullableXmls
                .equals(other.persistedOneListOfNullableXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableXmls_4(" + oneListOfNullableXmls + ','
                + calculatedOneListOfNullableXmls + ','
                + persistedOneListOfNullableXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> oneListOfNullableXmls;

    @JsonProperty("oneListOfNullableXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.w3c.dom.Element> getOneListOfNullableXmls() {
        return oneListOfNullableXmls;
    }

    public OneListOfNullableXmls_4 setOneListOfNullableXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableXmls\" cannot be null!");
        this.oneListOfNullableXmls = value;

        return this;
    }

    private final java.util.List<org.w3c.dom.Element> calculatedOneListOfNullableXmls;

    public java.util.List<org.w3c.dom.Element> getCalculatedOneListOfNullableXmls() {
        return this.calculatedOneListOfNullableXmls;
    }

    private final java.util.List<org.w3c.dom.Element> persistedOneListOfNullableXmls;

    public java.util.List<org.w3c.dom.Element> getPersistedOneListOfNullableXmls() {
        return this.persistedOneListOfNullableXmls;
    }
}
