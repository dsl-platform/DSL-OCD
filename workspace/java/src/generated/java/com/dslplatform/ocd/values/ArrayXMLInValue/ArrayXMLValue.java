package com.dslplatform.ocd.values.ArrayXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayXMLValue implements java.io.Serializable {
    public ArrayXMLValue(
            final org.w3c.dom.Element[] arrayXML) {
        setArrayXML(arrayXML);
    }

    public ArrayXMLValue() {
        this.arrayXML = new org.w3c.dom.Element[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 666218325;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayXMLValue)) return false;
        final ArrayXMLValue other = (ArrayXMLValue) obj;

        if (!(java.util.Arrays.equals(this.arrayXML, other.arrayXML)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayXMLValue(" + arrayXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element[] arrayXML;

    @JsonProperty("arrayXML")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.w3c.dom.Element[] getArrayXML() {
        return arrayXML;
    }

    public ArrayXMLValue setArrayXML(final org.w3c.dom.Element[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayXML\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.arrayXML = value;

        return this;
    }
}
