package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableXmlsValue2 implements
        java.io.Serializable {
    public NullableSetOfNullableXmlsValue2(
            final java.util.Set<org.w3c.dom.Element> nullableSetOfNullableXmls) {
        setNullableSetOfNullableXmls(nullableSetOfNullableXmls);
    }

    public NullableSetOfNullableXmlsValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1287788746;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableXmlsValue2)) return false;
        final NullableSetOfNullableXmlsValue2 other = (NullableSetOfNullableXmlsValue2) obj;

        if (!(this.nullableSetOfNullableXmls == other.nullableSetOfNullableXmls || this.nullableSetOfNullableXmls != null
                && this.nullableSetOfNullableXmls
                        .equals(other.nullableSetOfNullableXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableXmlsValue2(" + nullableSetOfNullableXmls
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> nullableSetOfNullableXmls;

    @JsonProperty("nullableSetOfNullableXmls")
    public java.util.Set<org.w3c.dom.Element> getNullableSetOfNullableXmls() {
        return nullableSetOfNullableXmls;
    }

    public NullableSetOfNullableXmlsValue2 setNullableSetOfNullableXmls(
            final java.util.Set<org.w3c.dom.Element> value) {
        this.nullableSetOfNullableXmls = value;

        return this;
    }
}
