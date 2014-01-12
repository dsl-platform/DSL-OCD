package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneXmlsValue3 implements java.io.Serializable {
    public NullableListOfOneXmlsValue3(
            final java.util.List<org.w3c.dom.Element> nullableListOfOneXmls) {
        setNullableListOfOneXmls(nullableListOfOneXmls);
    }

    public NullableListOfOneXmlsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1044282370;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneXmlsValue3)) return false;
        final NullableListOfOneXmlsValue3 other = (NullableListOfOneXmlsValue3) obj;

        if (!(this.nullableListOfOneXmls == other.nullableListOfOneXmls || this.nullableListOfOneXmls != null
                && this.nullableListOfOneXmls
                        .equals(other.nullableListOfOneXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneXmlsValue3(" + nullableListOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> nullableListOfOneXmls;

    @JsonProperty("nullableListOfOneXmls")
    public java.util.List<org.w3c.dom.Element> getNullableListOfOneXmls() {
        return nullableListOfOneXmls;
    }

    public NullableListOfOneXmlsValue3 setNullableListOfOneXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneXmls = value;

        return this;
    }
}
