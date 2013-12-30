package com.dslplatform.ocd.values.SetXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetXMLValue implements java.io.Serializable {
    public SetXMLValue(
            final java.util.Set<org.w3c.dom.Element> setXML) {
        setSetXML(setXML);
    }

    public SetXMLValue() {
        this.setXML = new java.util.HashSet<org.w3c.dom.Element>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1297012208;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetXMLValue)) return false;
        final SetXMLValue other = (SetXMLValue) obj;

        if (!(this.setXML.equals(other.setXML))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetXMLValue(" + setXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> setXML;

    @JsonProperty("setXML")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.w3c.dom.Element> getSetXML() {
        return setXML;
    }

    public SetXMLValue setSetXML(final java.util.Set<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setXML\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setXML = value;

        return this;
    }
}
