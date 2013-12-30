package com.dslplatform.ocd.values.ListXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListXMLValue implements java.io.Serializable {
    public ListXMLValue(
            final java.util.List<org.w3c.dom.Element> listXML) {
        setListXML(listXML);
    }

    public ListXMLValue() {
        this.listXML = new java.util.ArrayList<org.w3c.dom.Element>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1245571060;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListXMLValue)) return false;
        final ListXMLValue other = (ListXMLValue) obj;

        if (!(this.listXML.equals(other.listXML))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListXMLValue(" + listXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> listXML;

    @JsonProperty("listXML")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.w3c.dom.Element> getListXML() {
        return listXML;
    }

    public ListXMLValue setListXML(
            final java.util.List<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listXML\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listXML = value;

        return this;
    }
}
