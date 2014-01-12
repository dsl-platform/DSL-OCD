package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableXmlsValue3 implements
        java.io.Serializable {
    public NullableListOfNullableXmlsValue3(
            final java.util.List<org.w3c.dom.Element> nullableListOfNullableXmls) {
        setNullableListOfNullableXmls(nullableListOfNullableXmls);
    }

    public NullableListOfNullableXmlsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1365170625;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableXmlsValue3)) return false;
        final NullableListOfNullableXmlsValue3 other = (NullableListOfNullableXmlsValue3) obj;

        if (!(this.nullableListOfNullableXmls == other.nullableListOfNullableXmls || this.nullableListOfNullableXmls != null
                && this.nullableListOfNullableXmls
                        .equals(other.nullableListOfNullableXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableXmlsValue3(" + nullableListOfNullableXmls
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> nullableListOfNullableXmls;

    @JsonProperty("nullableListOfNullableXmls")
    public java.util.List<org.w3c.dom.Element> getNullableListOfNullableXmls() {
        return nullableListOfNullableXmls;
    }

    public NullableListOfNullableXmlsValue3 setNullableListOfNullableXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        this.nullableListOfNullableXmls = value;

        return this;
    }
}
