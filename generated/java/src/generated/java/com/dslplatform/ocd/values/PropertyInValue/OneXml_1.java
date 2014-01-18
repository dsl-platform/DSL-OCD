package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneXml_1 implements java.io.Serializable {
    public OneXml_1(
            final org.w3c.dom.Element oneXml) {
        setOneXml(oneXml);
    }

    public OneXml_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1132425853;
        result = prime * result
                + (this.oneXml != null ? this.oneXml.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneXml_1)) return false;
        final OneXml_1 other = (OneXml_1) obj;

        if (!(this.oneXml.equals(other.oneXml))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneXml_1(" + oneXml + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element oneXml;

    @JsonProperty("oneXml")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.w3c.dom.Element getOneXml() {
        return oneXml;
    }

    public OneXml_1 setOneXml(final org.w3c.dom.Element value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneXml\" cannot be null!");
        this.oneXml = value;

        return this;
    }
}
