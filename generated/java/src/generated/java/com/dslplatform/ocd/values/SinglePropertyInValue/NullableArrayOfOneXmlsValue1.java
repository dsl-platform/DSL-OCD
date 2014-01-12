package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneXmlsValue1 implements java.io.Serializable {
    public NullableArrayOfOneXmlsValue1(
            final org.w3c.dom.Element[] nullableArrayOfOneXmls) {
        setNullableArrayOfOneXmls(nullableArrayOfOneXmls);
    }

    public NullableArrayOfOneXmlsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 990962959;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneXmlsValue1)) return false;
        final NullableArrayOfOneXmlsValue1 other = (NullableArrayOfOneXmlsValue1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneXmls,
                other.nullableArrayOfOneXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneXmlsValue1(" + nullableArrayOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element[] nullableArrayOfOneXmls;

    @JsonProperty("nullableArrayOfOneXmls")
    public org.w3c.dom.Element[] getNullableArrayOfOneXmls() {
        return nullableArrayOfOneXmls;
    }

    public NullableArrayOfOneXmlsValue1 setNullableArrayOfOneXmls(
            final org.w3c.dom.Element[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneXmls = value;

        return this;
    }
}
