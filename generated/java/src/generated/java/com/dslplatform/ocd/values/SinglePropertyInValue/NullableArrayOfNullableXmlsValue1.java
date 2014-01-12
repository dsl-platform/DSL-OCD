package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableXmlsValue1 implements
        java.io.Serializable {
    public NullableArrayOfNullableXmlsValue1(
            final org.w3c.dom.Element[] nullableArrayOfNullableXmls) {
        setNullableArrayOfNullableXmls(nullableArrayOfNullableXmls);
    }

    public NullableArrayOfNullableXmlsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 515068846;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableXmlsValue1)) return false;
        final NullableArrayOfNullableXmlsValue1 other = (NullableArrayOfNullableXmlsValue1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableXmls,
                other.nullableArrayOfNullableXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableXmlsValue1("
                + nullableArrayOfNullableXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element[] nullableArrayOfNullableXmls;

    @JsonProperty("nullableArrayOfNullableXmls")
    public org.w3c.dom.Element[] getNullableArrayOfNullableXmls() {
        return nullableArrayOfNullableXmls;
    }

    public NullableArrayOfNullableXmlsValue1 setNullableArrayOfNullableXmls(
            final org.w3c.dom.Element[] value) {
        this.nullableArrayOfNullableXmls = value;

        return this;
    }
}
