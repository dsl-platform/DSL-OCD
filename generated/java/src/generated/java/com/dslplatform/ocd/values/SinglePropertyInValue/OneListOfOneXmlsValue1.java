package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneXmlsValue1 implements java.io.Serializable {
    public OneListOfOneXmlsValue1(
            final java.util.List<org.w3c.dom.Element> oneListOfOneXmls) {
        setOneListOfOneXmls(oneListOfOneXmls);
    }

    public OneListOfOneXmlsValue1() {
        this.oneListOfOneXmls = new java.util.ArrayList<org.w3c.dom.Element>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1492550493;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneXmlsValue1)) return false;
        final OneListOfOneXmlsValue1 other = (OneListOfOneXmlsValue1) obj;

        if (!(this.oneListOfOneXmls.equals(other.oneListOfOneXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneXmlsValue1(" + oneListOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> oneListOfOneXmls;

    @JsonProperty("oneListOfOneXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.w3c.dom.Element> getOneListOfOneXmls() {
        return oneListOfOneXmls;
    }

    public OneListOfOneXmlsValue1 setOneListOfOneXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneXmls\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneXmls = value;

        return this;
    }
}
