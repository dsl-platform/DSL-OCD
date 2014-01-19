package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableXmls_4 implements java.io.Serializable {
    public OneArrayOfNullableXmls_4(
            final org.w3c.dom.Element[] oneArrayOfNullableXmls,
            final org.w3c.dom.Element[] calculatedOneArrayOfNullableXmls,
            final org.w3c.dom.Element[] persistedOneArrayOfNullableXmls) {
        setOneArrayOfNullableXmls(oneArrayOfNullableXmls);
        this.calculatedOneArrayOfNullableXmls = calculatedOneArrayOfNullableXmls;
        this.persistedOneArrayOfNullableXmls = persistedOneArrayOfNullableXmls;
    }

    public OneArrayOfNullableXmls_4() {
        this.oneArrayOfNullableXmls = new org.w3c.dom.Element[] {};
        this.calculatedOneArrayOfNullableXmls = new org.w3c.dom.Element[] {};
        this.persistedOneArrayOfNullableXmls = new org.w3c.dom.Element[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 198441622;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableXmls_4)) return false;
        final OneArrayOfNullableXmls_4 other = (OneArrayOfNullableXmls_4) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableXmls,
                other.oneArrayOfNullableXmls))) return false;
        if (!(java.util.Arrays.equals(this.calculatedOneArrayOfNullableXmls,
                other.calculatedOneArrayOfNullableXmls))) return false;
        if (!(java.util.Arrays.equals(this.persistedOneArrayOfNullableXmls,
                other.persistedOneArrayOfNullableXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableXmls_4(" + oneArrayOfNullableXmls + ','
                + calculatedOneArrayOfNullableXmls + ','
                + persistedOneArrayOfNullableXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element[] oneArrayOfNullableXmls;

    @JsonProperty("oneArrayOfNullableXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.w3c.dom.Element[] getOneArrayOfNullableXmls() {
        return oneArrayOfNullableXmls;
    }

    public OneArrayOfNullableXmls_4 setOneArrayOfNullableXmls(
            final org.w3c.dom.Element[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableXmls\" cannot be null!");
        this.oneArrayOfNullableXmls = value;

        return this;
    }

    private final org.w3c.dom.Element[] calculatedOneArrayOfNullableXmls;

    public org.w3c.dom.Element[] getCalculatedOneArrayOfNullableXmls() {
        return this.calculatedOneArrayOfNullableXmls;
    }

    private final org.w3c.dom.Element[] persistedOneArrayOfNullableXmls;

    public org.w3c.dom.Element[] getPersistedOneArrayOfNullableXmls() {
        return this.persistedOneArrayOfNullableXmls;
    }
}
