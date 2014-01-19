package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneText_5 implements java.io.Serializable {
    public OneText_5(
            final String oneText,
            final String calculatedOneText,
            final String persistedOneText) {
        setOneText(oneText);
        this.calculatedOneText = calculatedOneText;
        this.persistedOneText = persistedOneText;
    }

    public OneText_5() {
        this.oneText = "";
        this.calculatedOneText = "";
        this.persistedOneText = "";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 852108611;
        result = prime * result
                + (this.oneText != null ? this.oneText.hashCode() : 0);
        result = prime
                * result
                + (this.calculatedOneText != null ? this.calculatedOneText
                        .hashCode() : 0);
        result = prime
                * result
                + (this.persistedOneText != null ? this.persistedOneText
                        .hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneText_5)) return false;
        final OneText_5 other = (OneText_5) obj;

        if (!(this.oneText.equals(other.oneText))) return false;
        if (!(this.calculatedOneText.equals(other.calculatedOneText)))
            return false;
        if (!(this.persistedOneText.equals(other.persistedOneText)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneText_5(" + oneText + ',' + calculatedOneText + ','
                + persistedOneText + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String oneText;

    @JsonProperty("oneText")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String getOneText() {
        return oneText;
    }

    public OneText_5 setOneText(final String value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneText\" cannot be null!");
        this.oneText = value;

        return this;
    }

    private final String calculatedOneText;

    public String getCalculatedOneText() {
        return this.calculatedOneText;
    }

    private final String persistedOneText;

    public String getPersistedOneText() {
        return this.persistedOneText;
    }
}
