package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableXml_1 implements java.io.Serializable {
    public NullableXml_1(
            final org.w3c.dom.Element nullableXml) {
        setNullableXml(nullableXml);
    }

    public NullableXml_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1067239740;
        result = prime * result
                + (this.nullableXml != null ? this.nullableXml.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableXml_1)) return false;
        final NullableXml_1 other = (NullableXml_1) obj;

        if (!(this.nullableXml == other.nullableXml || this.nullableXml != null
                && this.nullableXml.equals(other.nullableXml))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableXml_1(" + nullableXml + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element nullableXml;

    @JsonProperty("nullableXml")
    public org.w3c.dom.Element getNullableXml() {
        return nullableXml;
    }

    public NullableXml_1 setNullableXml(final org.w3c.dom.Element value) {
        this.nullableXml = value;

        return this;
    }
}
