package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneXml_4 implements java.io.Serializable {
    public OneXml_4(
            final org.w3c.dom.Element oneXml,
            final org.w3c.dom.Element calculatedOneXml,
            final org.w3c.dom.Element persistedOneXml) {
        setOneXml(oneXml);
        this.calculatedOneXml = calculatedOneXml;
        this.persistedOneXml = persistedOneXml;
    }

    public OneXml_4() {
        this.calculatedOneXml = null;
        this.persistedOneXml = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1535710380;
        result = prime * result
                + (this.oneXml != null ? this.oneXml.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedOneXml != null ? this.calculatedOneXml
                        .hashCode() : 0);
        result = prime
                * result
                + (this.persistedOneXml != null ? this.persistedOneXml
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneXml_4)) return false;
        final OneXml_4 other = (OneXml_4) obj;

        if (!(this.oneXml.equals(other.oneXml))) return false;
        if (!(this.calculatedOneXml.equals(other.calculatedOneXml)))
            return false;
        if (!(this.persistedOneXml.equals(other.persistedOneXml)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneXml_4(" + oneXml + ',' + calculatedOneXml + ','
                + persistedOneXml + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element oneXml;

    @JsonProperty("oneXml")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.w3c.dom.Element getOneXml() {
        return oneXml;
    }

    public OneXml_4 setOneXml(final org.w3c.dom.Element value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneXml\" cannot be null!");
        this.oneXml = value;

        return this;
    }

    private final org.w3c.dom.Element calculatedOneXml;

    public org.w3c.dom.Element getCalculatedOneXml() {
        return this.calculatedOneXml;
    }

    private final org.w3c.dom.Element persistedOneXml;

    public org.w3c.dom.Element getPersistedOneXml() {
        return this.persistedOneXml;
    }
}
