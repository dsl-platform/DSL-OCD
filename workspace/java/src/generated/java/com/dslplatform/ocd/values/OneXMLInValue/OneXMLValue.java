package com.dslplatform.ocd.values.OneXMLInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneXMLValue implements java.io.Serializable {
    public OneXMLValue(
            final org.w3c.dom.Element oneXML) {
        setOneXML(oneXML);
    }

    public OneXMLValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 284398604;
        result = prime * result
                + (this.oneXML != null ? this.oneXML.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneXMLValue)) return false;
        final OneXMLValue other = (OneXMLValue) obj;

        if (!(this.oneXML.equals(other.oneXML))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneXMLValue(" + oneXML + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element oneXML;

    @JsonProperty("oneXML")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.w3c.dom.Element getOneXML() {
        return oneXML;
    }

    public OneXMLValue setOneXML(final org.w3c.dom.Element value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneXML\" cannot be null!");
        this.oneXML = value;

        return this;
    }
}
