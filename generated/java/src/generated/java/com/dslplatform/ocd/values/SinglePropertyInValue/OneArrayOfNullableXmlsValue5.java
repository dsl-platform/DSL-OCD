package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableXmlsValue5 implements java.io.Serializable {
    public OneArrayOfNullableXmlsValue5(
            final org.w3c.dom.Element[] oneArrayOfNullableXmls) {
        setOneArrayOfNullableXmls(oneArrayOfNullableXmls);
    }

    public OneArrayOfNullableXmlsValue5() {
        this.oneArrayOfNullableXmls = new org.w3c.dom.Element[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1284064811;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableXmlsValue5)) return false;
        final OneArrayOfNullableXmlsValue5 other = (OneArrayOfNullableXmlsValue5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableXmls,
                other.oneArrayOfNullableXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableXmlsValue5(" + oneArrayOfNullableXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element[] oneArrayOfNullableXmls;

    @JsonProperty("oneArrayOfNullableXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.w3c.dom.Element[] getOneArrayOfNullableXmls() {
        return oneArrayOfNullableXmls;
    }

    public OneArrayOfNullableXmlsValue5 setOneArrayOfNullableXmls(
            final org.w3c.dom.Element[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableXmls\" cannot be null!");
        this.oneArrayOfNullableXmls = value;

        return this;
    }
}
