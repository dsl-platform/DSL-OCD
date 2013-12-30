package com.dslplatform.ocd.values.ListOptXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptXMLValue implements java.io.Serializable {
    public ListOptXMLValue(
            final java.util.List<org.w3c.dom.Element> listOptXML) {
        setListOptXML(listOptXML);
    }

    public ListOptXMLValue() {
        this.listOptXML = new java.util.ArrayList<org.w3c.dom.Element>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 396537051;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptXMLValue)) return false;
        final ListOptXMLValue other = (ListOptXMLValue) obj;

        if (!(this.listOptXML.equals(other.listOptXML))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptXMLValue(" + listOptXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> listOptXML;

    @JsonProperty("listOptXML")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.w3c.dom.Element> getListOptXML() {
        return listOptXML;
    }

    public ListOptXMLValue setListOptXML(
            final java.util.List<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptXML\" cannot be null!");
        this.listOptXML = value;

        return this;
    }
}
