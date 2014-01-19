package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneXmls_4 implements java.io.Serializable {
    public OneListOfOneXmls_4(
            final java.util.List<org.w3c.dom.Element> oneListOfOneXmls,
            final java.util.List<org.w3c.dom.Element> calculatedOneListOfOneXmls,
            final java.util.List<org.w3c.dom.Element> persistedOneListOfOneXmls) {
        setOneListOfOneXmls(oneListOfOneXmls);
        this.calculatedOneListOfOneXmls = calculatedOneListOfOneXmls;
        this.persistedOneListOfOneXmls = persistedOneListOfOneXmls;
    }

    public OneListOfOneXmls_4() {
        this.oneListOfOneXmls = new java.util.ArrayList<org.w3c.dom.Element>();
        this.calculatedOneListOfOneXmls = new java.util.ArrayList<org.w3c.dom.Element>();
        this.persistedOneListOfOneXmls = new java.util.ArrayList<org.w3c.dom.Element>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 285236344;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneXmls_4)) return false;
        final OneListOfOneXmls_4 other = (OneListOfOneXmls_4) obj;

        if (!(this.oneListOfOneXmls.equals(other.oneListOfOneXmls)))
            return false;
        if (!(this.calculatedOneListOfOneXmls
                .equals(other.calculatedOneListOfOneXmls))) return false;
        if (!(this.persistedOneListOfOneXmls
                .equals(other.persistedOneListOfOneXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneXmls_4(" + oneListOfOneXmls + ','
                + calculatedOneListOfOneXmls + ',' + persistedOneListOfOneXmls
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> oneListOfOneXmls;

    @JsonProperty("oneListOfOneXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.w3c.dom.Element> getOneListOfOneXmls() {
        return oneListOfOneXmls;
    }

    public OneListOfOneXmls_4 setOneListOfOneXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneXmls\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneListOfOneXmls = value;

        return this;
    }

    private final java.util.List<org.w3c.dom.Element> calculatedOneListOfOneXmls;

    public java.util.List<org.w3c.dom.Element> getCalculatedOneListOfOneXmls() {
        return this.calculatedOneListOfOneXmls;
    }

    private final java.util.List<org.w3c.dom.Element> persistedOneListOfOneXmls;

    public java.util.List<org.w3c.dom.Element> getPersistedOneListOfOneXmls() {
        return this.persistedOneListOfOneXmls;
    }
}
