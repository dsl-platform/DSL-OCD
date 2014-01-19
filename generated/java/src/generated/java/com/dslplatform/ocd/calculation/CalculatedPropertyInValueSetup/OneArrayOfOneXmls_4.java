package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneXmls_4 implements java.io.Serializable {
    public OneArrayOfOneXmls_4(
            final org.w3c.dom.Element[] oneArrayOfOneXmls,
            final org.w3c.dom.Element[] calculatedOneArrayOfOneXmls,
            final org.w3c.dom.Element[] persistedOneArrayOfOneXmls) {
        setOneArrayOfOneXmls(oneArrayOfOneXmls);
        this.calculatedOneArrayOfOneXmls = calculatedOneArrayOfOneXmls;
        this.persistedOneArrayOfOneXmls = persistedOneArrayOfOneXmls;
    }

    public OneArrayOfOneXmls_4() {
        this.oneArrayOfOneXmls = new org.w3c.dom.Element[] {};
        this.calculatedOneArrayOfOneXmls = new org.w3c.dom.Element[] {};
        this.persistedOneArrayOfOneXmls = new org.w3c.dom.Element[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1483411165;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneXmls_4)) return false;
        final OneArrayOfOneXmls_4 other = (OneArrayOfOneXmls_4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneXmls,
                other.oneArrayOfOneXmls))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfOneXmls,
                other.calculatedOneArrayOfOneXmls))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfOneXmls,
                other.persistedOneArrayOfOneXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneXmls_4(" + oneArrayOfOneXmls + ','
                + calculatedOneArrayOfOneXmls + ','
                + persistedOneArrayOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element[] oneArrayOfOneXmls;

    @JsonProperty("oneArrayOfOneXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.w3c.dom.Element[] getOneArrayOfOneXmls() {
        return oneArrayOfOneXmls;
    }

    public OneArrayOfOneXmls_4 setOneArrayOfOneXmls(
            final org.w3c.dom.Element[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneXmls\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.oneArrayOfOneXmls = value;

        return this;
    }

    private final org.w3c.dom.Element[] calculatedOneArrayOfOneXmls;

    public org.w3c.dom.Element[] getCalculatedOneArrayOfOneXmls() {
        return this.calculatedOneArrayOfOneXmls;
    }

    private final org.w3c.dom.Element[] persistedOneArrayOfOneXmls;

    public org.w3c.dom.Element[] getPersistedOneArrayOfOneXmls() {
        return this.persistedOneArrayOfOneXmls;
    }
}
