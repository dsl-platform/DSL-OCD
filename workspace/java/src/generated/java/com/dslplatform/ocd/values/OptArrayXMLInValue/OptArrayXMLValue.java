package com.dslplatform.ocd.values.OptArrayXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptArrayXMLValue implements java.io.Serializable {
    public OptArrayXMLValue(
            final org.w3c.dom.Element[] optArrayXML) {
        setOptArrayXML(optArrayXML);
    }

    public OptArrayXMLValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1484174706;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptArrayXMLValue)) return false;
        final OptArrayXMLValue other = (OptArrayXMLValue) obj;

        if (!(java.util.Arrays.equals(this.optArrayXML, other.optArrayXML)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptArrayXMLValue(" + optArrayXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element[] optArrayXML;

    @JsonProperty("optArrayXML")
    public org.w3c.dom.Element[] getOptArrayXML() {
        return optArrayXML;
    }

    public OptArrayXMLValue setOptArrayXML(final org.w3c.dom.Element[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optArrayXML = value;

        return this;
    }
}
