package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableXmlValue3 implements java.io.Serializable {
    public NullableXmlValue3(
            final org.w3c.dom.Element nullableXml) {
        setNullableXml(nullableXml);
    }

    public NullableXmlValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2044710298;
        result = prime * result
                + (this.nullableXml != null ? this.nullableXml.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableXmlValue3)) return false;
        final NullableXmlValue3 other = (NullableXmlValue3) obj;

        if (!(this.nullableXml == other.nullableXml || this.nullableXml != null
                && this.nullableXml.equals(other.nullableXml))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableXmlValue3(" + nullableXml + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element nullableXml;

    @JsonProperty("nullableXml")
    public org.w3c.dom.Element getNullableXml() {
        return nullableXml;
    }

    public NullableXmlValue3 setNullableXml(final org.w3c.dom.Element value) {
        this.nullableXml = value;

        return this;
    }
}
