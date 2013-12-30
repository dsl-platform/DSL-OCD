package com.dslplatform.ocd.values.OptXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptXMLValue implements java.io.Serializable {
    public OptXMLValue(
            final org.w3c.dom.Element optXML) {
        setOptXML(optXML);
    }

    public OptXMLValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 141599701;
        result = prime * result
                + (this.optXML != null ? this.optXML.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptXMLValue)) return false;
        final OptXMLValue other = (OptXMLValue) obj;

        if (!(this.optXML == other.optXML || this.optXML != null
                && this.optXML.equals(other.optXML))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptXMLValue(" + optXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element optXML;

    @JsonProperty("optXML")
    public org.w3c.dom.Element getOptXML() {
        return optXML;
    }

    public OptXMLValue setOptXML(final org.w3c.dom.Element value) {
        this.optXML = value;

        return this;
    }
}
