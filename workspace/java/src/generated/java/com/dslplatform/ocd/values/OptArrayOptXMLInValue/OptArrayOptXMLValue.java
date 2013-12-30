package com.dslplatform.ocd.values.OptArrayOptXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayOptXMLValue implements java.io.Serializable {
    public OptArrayOptXMLValue(
            final org.w3c.dom.Element[] optArrayOptXML) {
        setOptArrayOptXML(optArrayOptXML);
    }

    public OptArrayOptXMLValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1774917169;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayOptXMLValue)) return false;
        final OptArrayOptXMLValue other = (OptArrayOptXMLValue) obj;

        if (!(java.util.Arrays
                .equals(this.optArrayOptXML, other.optArrayOptXML)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayOptXMLValue(" + optArrayOptXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element[] optArrayOptXML;

    @JsonProperty("optArrayOptXML")
    public org.w3c.dom.Element[] getOptArrayOptXML() {
        return optArrayOptXML;
    }

    public OptArrayOptXMLValue setOptArrayOptXML(
            final org.w3c.dom.Element[] value) {
        this.optArrayOptXML = value;

        return this;
    }
}
