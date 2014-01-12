package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneXmlsValue2 implements java.io.Serializable {
    public NullableListOfOneXmlsValue2(
            final java.util.List<org.w3c.dom.Element> nullableListOfOneXmls) {
        setNullableListOfOneXmls(nullableListOfOneXmls);
    }

    public NullableListOfOneXmlsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1044282369;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneXmlsValue2)) return false;
        final NullableListOfOneXmlsValue2 other = (NullableListOfOneXmlsValue2) obj;

        if (!(this.nullableListOfOneXmls == other.nullableListOfOneXmls || this.nullableListOfOneXmls != null
                && this.nullableListOfOneXmls
                        .equals(other.nullableListOfOneXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneXmlsValue2(" + nullableListOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> nullableListOfOneXmls;

    @JsonProperty("nullableListOfOneXmls")
    public java.util.List<org.w3c.dom.Element> getNullableListOfOneXmls() {
        return nullableListOfOneXmls;
    }

    public NullableListOfOneXmlsValue2 setNullableListOfOneXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneXmls = value;

        return this;
    }
}
