package com.dslplatform.ocd.values.ArrayOptXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptXMLValue implements java.io.Serializable {
    public ArrayOptXMLValue(
            final org.w3c.dom.Element[] arrayOptXML) {
        setArrayOptXML(arrayOptXML);
    }

    public ArrayOptXMLValue() {
        this.arrayOptXML = new org.w3c.dom.Element[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 666374074;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptXMLValue)) return false;
        final ArrayOptXMLValue other = (ArrayOptXMLValue) obj;

        if (!(java.util.Arrays.equals(this.arrayOptXML, other.arrayOptXML)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptXMLValue(" + arrayOptXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element[] arrayOptXML;

    @JsonProperty("arrayOptXML")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.w3c.dom.Element[] getArrayOptXML() {
        return arrayOptXML;
    }

    public ArrayOptXMLValue setArrayOptXML(final org.w3c.dom.Element[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptXML\" cannot be null!");
        this.arrayOptXML = value;

        return this;
    }
}
