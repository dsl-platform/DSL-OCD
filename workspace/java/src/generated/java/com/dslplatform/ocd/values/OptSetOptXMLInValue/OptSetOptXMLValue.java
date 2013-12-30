package com.dslplatform.ocd.values.OptSetOptXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetOptXMLValue implements java.io.Serializable {
    public OptSetOptXMLValue(
            final java.util.Set<org.w3c.dom.Element> optSetOptXML) {
        setOptSetOptXML(optSetOptXML);
    }

    public OptSetOptXMLValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1776676004;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptXMLValue)) return false;
        final OptSetOptXMLValue other = (OptSetOptXMLValue) obj;

        if (!(this.optSetOptXML == other.optSetOptXML || this.optSetOptXML != null
                && this.optSetOptXML.equals(other.optSetOptXML))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptXMLValue(" + optSetOptXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> optSetOptXML;

    @JsonProperty("optSetOptXML")
    public java.util.Set<org.w3c.dom.Element> getOptSetOptXML() {
        return optSetOptXML;
    }

    public OptSetOptXMLValue setOptSetOptXML(
            final java.util.Set<org.w3c.dom.Element> value) {
        this.optSetOptXML = value;

        return this;
    }
}
