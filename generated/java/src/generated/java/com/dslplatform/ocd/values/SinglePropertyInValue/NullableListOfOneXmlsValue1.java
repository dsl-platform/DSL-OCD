package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneXmlsValue1 implements java.io.Serializable {
    public NullableListOfOneXmlsValue1(
            final java.util.List<org.w3c.dom.Element> nullableListOfOneXmls) {
        setNullableListOfOneXmls(nullableListOfOneXmls);
    }

    public NullableListOfOneXmlsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1044282372;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneXmlsValue1)) return false;
        final NullableListOfOneXmlsValue1 other = (NullableListOfOneXmlsValue1) obj;

        if (!(this.nullableListOfOneXmls == other.nullableListOfOneXmls || this.nullableListOfOneXmls != null
                && this.nullableListOfOneXmls
                        .equals(other.nullableListOfOneXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneXmlsValue1(" + nullableListOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> nullableListOfOneXmls;

    @JsonProperty("nullableListOfOneXmls")
    public java.util.List<org.w3c.dom.Element> getNullableListOfOneXmls() {
        return nullableListOfOneXmls;
    }

    public NullableListOfOneXmlsValue1 setNullableListOfOneXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneXmls = value;

        return this;
    }
}
