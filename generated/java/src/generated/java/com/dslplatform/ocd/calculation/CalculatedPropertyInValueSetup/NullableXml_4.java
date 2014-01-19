package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableXml_4 implements java.io.Serializable {
    public NullableXml_4(
            final org.w3c.dom.Element nullableXml,
            final org.w3c.dom.Element calculatedNullableXml,
            final org.w3c.dom.Element persistedNullableXml) {
        setNullableXml(nullableXml);
        this.calculatedNullableXml = calculatedNullableXml;
        this.persistedNullableXml = persistedNullableXml;
    }

    public NullableXml_4() {
        this.calculatedNullableXml = null;
        this.persistedNullableXml = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1067239735;
        result = prime * result
                + (this.nullableXml != null ? this.nullableXml.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedNullableXml != null
                        ? this.calculatedNullableXml.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedNullableXml != null
                        ? this.persistedNullableXml.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableXml_4)) return false;
        final NullableXml_4 other = (NullableXml_4) obj;

        if (!(this.nullableXml == other.nullableXml || this.nullableXml != null
                && this.nullableXml.equals(other.nullableXml))) return false;
        if (!(this.calculatedNullableXml == other.calculatedNullableXml || this.calculatedNullableXml != null
                && this.calculatedNullableXml
                        .equals(other.calculatedNullableXml))) return false;
        if (!(this.persistedNullableXml == other.persistedNullableXml || this.persistedNullableXml != null
                && this.persistedNullableXml.equals(other.persistedNullableXml)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableXml_4(" + nullableXml + ',' + calculatedNullableXml
                + ',' + persistedNullableXml + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element nullableXml;

    @JsonProperty("nullableXml")
    public org.w3c.dom.Element getNullableXml() {
        return nullableXml;
    }

    public NullableXml_4 setNullableXml(final org.w3c.dom.Element value) {
        this.nullableXml = value;

        return this;
    }

    private final org.w3c.dom.Element calculatedNullableXml;

    public org.w3c.dom.Element getCalculatedNullableXml() {
        return this.calculatedNullableXml;
    }

    private final org.w3c.dom.Element persistedNullableXml;

    public org.w3c.dom.Element getPersistedNullableXml() {
        return this.persistedNullableXml;
    }
}
