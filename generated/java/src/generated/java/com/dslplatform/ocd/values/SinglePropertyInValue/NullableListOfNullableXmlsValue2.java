package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableXmlsValue2 implements
        java.io.Serializable {
    public NullableListOfNullableXmlsValue2(
            final java.util.List<org.w3c.dom.Element> nullableListOfNullableXmls) {
        setNullableListOfNullableXmls(nullableListOfNullableXmls);
    }

    public NullableListOfNullableXmlsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 200913316;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableXmlsValue2)) return false;
        final NullableListOfNullableXmlsValue2 other = (NullableListOfNullableXmlsValue2) obj;

        if (!(this.nullableListOfNullableXmls == other.nullableListOfNullableXmls || this.nullableListOfNullableXmls != null
                && this.nullableListOfNullableXmls
                        .equals(other.nullableListOfNullableXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableXmlsValue2(" + nullableListOfNullableXmls
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> nullableListOfNullableXmls;

    @JsonProperty("nullableListOfNullableXmls")
    public java.util.List<org.w3c.dom.Element> getNullableListOfNullableXmls() {
        return nullableListOfNullableXmls;
    }

    public NullableListOfNullableXmlsValue2 setNullableListOfNullableXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        this.nullableListOfNullableXmls = value;

        return this;
    }
}
