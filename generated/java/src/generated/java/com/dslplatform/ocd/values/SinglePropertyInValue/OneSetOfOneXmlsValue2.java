package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneXmlsValue2 implements java.io.Serializable {
    public OneSetOfOneXmlsValue2(
            final java.util.Set<org.w3c.dom.Element> oneSetOfOneXmls) {
        setOneSetOfOneXmls(oneSetOfOneXmls);
    }

    public OneSetOfOneXmlsValue2() {
        this.oneSetOfOneXmls = new java.util.HashSet<org.w3c.dom.Element>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2026860446;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneXmlsValue2)) return false;
        final OneSetOfOneXmlsValue2 other = (OneSetOfOneXmlsValue2) obj;

        if (!(this.oneSetOfOneXmls.equals(other.oneSetOfOneXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneXmlsValue2(" + oneSetOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> oneSetOfOneXmls;

    @JsonProperty("oneSetOfOneXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.w3c.dom.Element> getOneSetOfOneXmls() {
        return oneSetOfOneXmls;
    }

    public OneSetOfOneXmlsValue2 setOneSetOfOneXmls(
            final java.util.Set<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneXmls\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneXmls = value;

        return this;
    }
}
