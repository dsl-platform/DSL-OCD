package com.dslplatform.ocd.values.OptSetXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetXMLValue implements java.io.Serializable {
    public OptSetXMLValue(
            final java.util.Set<org.w3c.dom.Element> optSetXML) {
        setOptSetXML(optSetXML);
    }

    public OptSetXMLValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2076664059;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetXMLValue)) return false;
        final OptSetXMLValue other = (OptSetXMLValue) obj;

        if (!(this.optSetXML == other.optSetXML || this.optSetXML != null
                && this.optSetXML.equals(other.optSetXML))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetXMLValue(" + optSetXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> optSetXML;

    @JsonProperty("optSetXML")
    public java.util.Set<org.w3c.dom.Element> getOptSetXML() {
        return optSetXML;
    }

    public OptSetXMLValue setOptSetXML(
            final java.util.Set<org.w3c.dom.Element> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetXML = value;

        return this;
    }
}
