package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneXmls_1 implements java.io.Serializable {
    public OneSetOfOneXmls_1(
            final java.util.Set<org.w3c.dom.Element> oneSetOfOneXmls) {
        setOneSetOfOneXmls(oneSetOfOneXmls);
    }

    public OneSetOfOneXmls_1() {
        this.oneSetOfOneXmls = new java.util.HashSet<org.w3c.dom.Element>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 726312555;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneXmls_1)) return false;
        final OneSetOfOneXmls_1 other = (OneSetOfOneXmls_1) obj;

        if (!(this.oneSetOfOneXmls.equals(other.oneSetOfOneXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneXmls_1(" + oneSetOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> oneSetOfOneXmls;

    @JsonProperty("oneSetOfOneXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.w3c.dom.Element> getOneSetOfOneXmls() {
        return oneSetOfOneXmls;
    }

    public OneSetOfOneXmls_1 setOneSetOfOneXmls(
            final java.util.Set<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneXmls\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneXmls = value;

        return this;
    }
}
