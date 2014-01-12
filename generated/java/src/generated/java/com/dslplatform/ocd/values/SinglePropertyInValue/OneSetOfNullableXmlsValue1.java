package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableXmlsValue1 implements java.io.Serializable {
    public OneSetOfNullableXmlsValue1(
            final java.util.Set<org.w3c.dom.Element> oneSetOfNullableXmls) {
        setOneSetOfNullableXmls(oneSetOfNullableXmls);
    }

    public OneSetOfNullableXmlsValue1() {
        this.oneSetOfNullableXmls = new java.util.HashSet<org.w3c.dom.Element>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 320483884;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableXmlsValue1)) return false;
        final OneSetOfNullableXmlsValue1 other = (OneSetOfNullableXmlsValue1) obj;

        if (!(this.oneSetOfNullableXmls.equals(other.oneSetOfNullableXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableXmlsValue1(" + oneSetOfNullableXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> oneSetOfNullableXmls;

    @JsonProperty("oneSetOfNullableXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.w3c.dom.Element> getOneSetOfNullableXmls() {
        return oneSetOfNullableXmls;
    }

    public OneSetOfNullableXmlsValue1 setOneSetOfNullableXmls(
            final java.util.Set<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableXmls\" cannot be null!");
        this.oneSetOfNullableXmls = value;

        return this;
    }
}
