package com.dslplatform.ocd.values.OptListXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListXMLValue implements java.io.Serializable {
    public OptListXMLValue(
            final java.util.List<org.w3c.dom.Element> optListXML) {
        setOptListXML(optListXML);
    }

    public OptListXMLValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1927717187;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListXMLValue)) return false;
        final OptListXMLValue other = (OptListXMLValue) obj;

        if (!(this.optListXML == other.optListXML || this.optListXML != null
                && this.optListXML.equals(other.optListXML))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListXMLValue(" + optListXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> optListXML;

    @JsonProperty("optListXML")
    public java.util.List<org.w3c.dom.Element> getOptListXML() {
        return optListXML;
    }

    public OptListXMLValue setOptListXML(
            final java.util.List<org.w3c.dom.Element> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListXML = value;

        return this;
    }
}
