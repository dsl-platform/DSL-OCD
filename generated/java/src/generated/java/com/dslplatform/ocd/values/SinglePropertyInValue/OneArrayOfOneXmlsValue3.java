package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneXmlsValue3 implements java.io.Serializable {
    public OneArrayOfOneXmlsValue3(
            final org.w3c.dom.Element[] oneArrayOfOneXmls) {
        setOneArrayOfOneXmls(oneArrayOfOneXmls);
    }

    public OneArrayOfOneXmlsValue3() {
        this.oneArrayOfOneXmls = new org.w3c.dom.Element[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 504462678;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneXmlsValue3)) return false;
        final OneArrayOfOneXmlsValue3 other = (OneArrayOfOneXmlsValue3) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneXmls,
                other.oneArrayOfOneXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneXmlsValue3(" + oneArrayOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element[] oneArrayOfOneXmls;

    @JsonProperty("oneArrayOfOneXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.w3c.dom.Element[] getOneArrayOfOneXmls() {
        return oneArrayOfOneXmls;
    }

    public OneArrayOfOneXmlsValue3 setOneArrayOfOneXmls(
            final org.w3c.dom.Element[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneXmls\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneXmls = value;

        return this;
    }
}
