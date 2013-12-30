package com.dslplatform.ocd.values.OptListOptXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptXMLValue implements java.io.Serializable {
    public OptListOptXMLValue(
            final java.util.List<org.w3c.dom.Element> optListOptXML) {
        setOptListOptXML(optListOptXML);
    }

    public OptListOptXMLValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1817068098;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptXMLValue)) return false;
        final OptListOptXMLValue other = (OptListOptXMLValue) obj;

        if (!(this.optListOptXML == other.optListOptXML || this.optListOptXML != null
                && this.optListOptXML.equals(other.optListOptXML)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptXMLValue(" + optListOptXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> optListOptXML;

    @JsonProperty("optListOptXML")
    public java.util.List<org.w3c.dom.Element> getOptListOptXML() {
        return optListOptXML;
    }

    public OptListOptXMLValue setOptListOptXML(
            final java.util.List<org.w3c.dom.Element> value) {
        this.optListOptXML = value;

        return this;
    }
}
