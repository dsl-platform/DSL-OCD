package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableXmls_1 implements java.io.Serializable {
    public OneListOfNullableXmls_1(
            final java.util.List<org.w3c.dom.Element> oneListOfNullableXmls) {
        setOneListOfNullableXmls(oneListOfNullableXmls);
    }

    public OneListOfNullableXmls_1() {
        this.oneListOfNullableXmls = new java.util.ArrayList<org.w3c.dom.Element>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 649288096;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableXmls_1)) return false;
        final OneListOfNullableXmls_1 other = (OneListOfNullableXmls_1) obj;

        if (!(this.oneListOfNullableXmls.equals(other.oneListOfNullableXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableXmls_1(" + oneListOfNullableXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> oneListOfNullableXmls;

    @JsonProperty("oneListOfNullableXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.w3c.dom.Element> getOneListOfNullableXmls() {
        return oneListOfNullableXmls;
    }

    public OneListOfNullableXmls_1 setOneListOfNullableXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableXmls\" cannot be null!");
        this.oneListOfNullableXmls = value;

        return this;
    }
}
