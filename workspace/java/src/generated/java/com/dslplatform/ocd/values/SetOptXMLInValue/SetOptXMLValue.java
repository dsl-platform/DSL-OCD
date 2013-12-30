package com.dslplatform.ocd.values.SetOptXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptXMLValue implements java.io.Serializable {
    public SetOptXMLValue(
            final java.util.Set<org.w3c.dom.Element> setOptXML) {
        setSetOptXML(setOptXML);
    }

    public SetOptXMLValue() {
        this.setOptXML = new java.util.HashSet<org.w3c.dom.Element>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 963743871;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptXMLValue)) return false;
        final SetOptXMLValue other = (SetOptXMLValue) obj;

        if (!(this.setOptXML.equals(other.setOptXML))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptXMLValue(" + setOptXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> setOptXML;

    @JsonProperty("setOptXML")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.w3c.dom.Element> getSetOptXML() {
        return setOptXML;
    }

    public SetOptXMLValue setSetOptXML(
            final java.util.Set<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptXML\" cannot be null!");
        this.setOptXML = value;

        return this;
    }
}
